package cn.mms.service.impl;

import cn.mms.mapper.OutstoreMapper;
import cn.mms.po.Inventory;
import cn.mms.po.Outstore;
import cn.mms.po.OutstoreExample;
import cn.mms.po.Page;
import cn.mms.service.InventoryService;
import cn.mms.service.OutstoreService;
import cn.mms.util.PageUtil;
import cn.mms.po.VoOutstore;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;


public class OutstoreServiceImpl implements OutstoreService {

    InventoryService inventoryService = new InventoryServiceImpl();

    @Override
    public List<Outstore> getList(Page page) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        OutstoreMapper outstoreMapper = sqlSession.getMapper(OutstoreMapper.class);
        page.setStart((page.getPage()-1)*page.getSize());
        List<Outstore> outstoreList = outstoreMapper.selectAll(page);
        sqlSession.close();
        return outstoreList;
    }

    @Override
    public boolean insert(Outstore record) {

        Inventory inventory = inventoryService.getObjectByPrimaryKey(record.getMid());
        if (inventory.getCount()-record.getCount() >= 0){
            inventory.setCount(inventory.getCount()-record.getCount());
            inventoryService.update(inventory);

//            record.setLiable();
            record.setMaterial(inventory.getMaterial());
            SqlSession sqlSession = PageUtil.openSqlSession();
            OutstoreMapper outstoreMapper = sqlSession.getMapper(OutstoreMapper.class);
            outstoreMapper.insertSelective(record);
            sqlSession.commit();
            sqlSession.close();
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void delete(int id) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        OutstoreMapper outstoreMapper = sqlSession.getMapper(OutstoreMapper.class);
        outstoreMapper.deleteByPrimaryKey(id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public boolean update(Outstore record) {
        Inventory inventory = inventoryService.getObjectByPrimaryKey(record.getMid());
        if (inventory.getCount()-record.getCount() >= 0) {
            inventory.setCount(inventory.getCount() - record.getCount());
            inventoryService.update(inventory);

            SqlSession sqlSession = PageUtil.openSqlSession();
            OutstoreMapper outstoreMapper = sqlSession.getMapper(OutstoreMapper.class);
            outstoreMapper.updateByPrimaryKeySelective(record);
            sqlSession.commit();
            sqlSession.close();
            return true;
        }else {
            return false;
        }
    }

    @Override
    public void updateByPrimaryKey(Outstore outstore) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        OutstoreMapper outstoreMapper = sqlSession.getMapper(OutstoreMapper.class);
        outstoreMapper.updateByPrimaryKeySelective(outstore);
        sqlSession.commit();
        sqlSession.close();
        return;
    }

    @Override
    public long count() {
        SqlSession sqlSession = PageUtil.openSqlSession();
        OutstoreMapper outstoreMapper = sqlSession.getMapper(OutstoreMapper.class);
        long count = outstoreMapper.countByExample(new OutstoreExample());
        sqlSession.close();
        return count;
    }

    @Override
    public Outstore getObjectByPrimaryKey(int id) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        OutstoreMapper outstoreMapper = sqlSession.getMapper(OutstoreMapper.class);
        Outstore outstore = outstoreMapper.selectByPrimaryKey(id);
        sqlSession.close();
        return outstore;
    }

    @Override
    public List<VoOutstore> getBorrowList(Page page) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        OutstoreMapper outstoreMapper = sqlSession.getMapper(OutstoreMapper.class);
        page.setStart((page.getPage()-1)*page.getSize());
        List<VoOutstore> voOutstoresList = outstoreMapper.selectBorrow(page);
        sqlSession.close();
        for (VoOutstore voOutstore:
                voOutstoresList){
            if (voOutstore.getIsreturn() == 0){
                voOutstore.setVoIsreturn("未还");
            }else {
                voOutstore.setVoIsreturn("已还");
            }
        }
        return voOutstoresList;
    }

    @Override
    public Long count_borrow() {
        SqlSession sqlSession = PageUtil.openSqlSession();
        OutstoreMapper outstoreMapper = sqlSession.getMapper(OutstoreMapper.class);
        OutstoreExample outstoreExample = new OutstoreExample();
        OutstoreExample.Criteria criteria = outstoreExample.createCriteria();
        List<String> stringList = new ArrayList<>();
        stringList.add("3");
        stringList.add("4");
        criteria.andOutwayIn(stringList);
        long count = outstoreMapper.countByExample(outstoreExample);
        sqlSession.close();
        return count;
    }
}
