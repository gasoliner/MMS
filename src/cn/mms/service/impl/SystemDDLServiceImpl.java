package cn.mms.service.impl;

import cn.mms.mapper.SystemddlMapper;
import cn.mms.po.Inventory;
import cn.mms.po.Page;
import cn.mms.po.Systemddl;
import cn.mms.po.SystemddlExample;
import cn.mms.service.InventoryService;
import cn.mms.service.SystemDDLService;
import cn.mms.util.PageUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class SystemDDLServiceImpl implements SystemDDLService {

    InventoryService inventoryService = new InventoryServiceImpl();

    @Override
    public List<Systemddl> getList(Page page) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        SystemddlMapper systemddlMapper = sqlSession.getMapper(SystemddlMapper.class);
        page.setStart((page.getPage()-1)*page.getSize());
        List<Systemddl> systemddlList = systemddlMapper.selectAllByKey(page);
        sqlSession.close();
        return systemddlList;
    }

    @Override
    public void insert(Systemddl record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        SystemddlMapper systemddlMapper = sqlSession.getMapper(SystemddlMapper.class);
        systemddlMapper.insertSelective(record);
        sqlSession.commit();
        sqlSession.close();
        if (record.getKeyword().equals("kind")){
            Inventory inventory = new Inventory();
            inventory.setCount(new Float(0));
            inventory.setMaterial(record.getDdlname());
            inventory.setPrice(null);
            inventory.setMid(record.getSysid());
            inventoryService.insert(inventory);
        }
    }

    @Override
    public void delete(int id) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        SystemddlMapper systemddlMapper = sqlSession.getMapper(SystemddlMapper.class);
        systemddlMapper.deleteByPrimaryKey(id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(Systemddl record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        SystemddlMapper systemddlMapper = sqlSession.getMapper(SystemddlMapper.class);
        systemddlMapper.updateByPrimaryKeySelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public long count() {
        SqlSession sqlSession = PageUtil.openSqlSession();
        SystemddlMapper systemddlMapper = sqlSession.getMapper(SystemddlMapper.class);
        long count = systemddlMapper.countByExample(new SystemddlExample());
        sqlSession.close();
        return count;
    }
}
