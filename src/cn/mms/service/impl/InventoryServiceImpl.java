package cn.mms.service.impl;

import cn.mms.mapper.InventoryMapper;
import cn.mms.po.Inventory;
import cn.mms.po.Page;
import cn.mms.po.Inventory;
import cn.mms.po.InventoryExample;
import cn.mms.service.InventoryService;
import cn.mms.service.InventoryService;
import cn.mms.util.PageUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class InventoryServiceImpl implements InventoryService {


    @Override
    public List<Inventory> getList(Page page) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        InventoryMapper inventoryMapper = sqlSession.getMapper(InventoryMapper.class);
        page.setStart((page.getPage()-1)*page.getSize());
        List<Inventory> inventoryList = inventoryMapper.selectAll(page);
        sqlSession.close();
        return inventoryList;
    }

    @Override
    public void insert(Inventory record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        InventoryMapper inventoryMapper = sqlSession.getMapper(InventoryMapper.class);
        inventoryMapper.insertSelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void delete(int id) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        InventoryMapper inventoryMapper = sqlSession.getMapper(InventoryMapper.class);
        inventoryMapper.deleteByPrimaryKey(id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(Inventory record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        InventoryMapper inventoryMapper = sqlSession.getMapper(InventoryMapper.class);
        inventoryMapper.updateByPrimaryKeySelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public long count() {
        SqlSession sqlSession = PageUtil.openSqlSession();
        InventoryMapper inventoryMapper = sqlSession.getMapper(InventoryMapper.class);
        long count = inventoryMapper.countByExample(new InventoryExample());
        sqlSession.close();
        return count;
    }

    @Override
    public Inventory getObjectByPrimaryKey(int id) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        InventoryMapper inventoryMapper = sqlSession.getMapper(InventoryMapper.class);
        Inventory inventory = inventoryMapper.selectByPrimaryKey(id);
        sqlSession.close();
        return inventory;
    }
}
