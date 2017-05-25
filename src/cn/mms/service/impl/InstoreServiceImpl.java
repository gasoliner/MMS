package cn.mms.service.impl;

import cn.mms.mapper.InstoreMapper;
import cn.mms.mapper.InventoryMapper;
import cn.mms.po.*;
import cn.mms.po.Instore;
import cn.mms.service.InstoreService;
import cn.mms.service.InstoreService;
import cn.mms.service.InventoryService;
import cn.mms.service.OutstoreService;
import cn.mms.util.PageUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class InstoreServiceImpl implements InstoreService {

    InventoryService inventoryService = new InventoryServiceImpl();
    OutstoreService outstoreService = new OutstoreServiceImpl();

    @Override
    public void insert(Instore record) {
        Inventory inventory = inventoryService.getObjectByPrimaryKey(record.getMid());
        inventory.setPrice(record.getPrice());
        inventory.setCount(inventory.getCount()+record.getCount());
        inventoryService.update(inventory);

        record.setMaterial(inventory.getMaterial());
        SqlSession sqlSession = PageUtil.openSqlSession();
        InstoreMapper instoreMapper = sqlSession.getMapper(InstoreMapper.class);
        instoreMapper.insertSelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void delete(int id) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        InstoreMapper instoreMapper = sqlSession.getMapper(InstoreMapper.class);
        instoreMapper.deleteByPrimaryKey(id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(Instore record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        InstoreMapper instoreMapper = sqlSession.getMapper(InstoreMapper.class);
        instoreMapper.updateByPrimaryKeySelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public long count() {
        SqlSession sqlSession = PageUtil.openSqlSession();
        InstoreMapper instoreMapper = sqlSession.getMapper(InstoreMapper.class);
        long count = instoreMapper.countByExample(new InstoreExample());
        sqlSession.close();
        return count;
    }

//    操作了三张表outstore, instore, inventory
    @Override
    public void returnn(Instore object) {
        Outstore outstore = outstoreService.getObjectByPrimaryKey(object.getBorrowid());
        outstore.setIsreturn(1);
        outstore.setReturntime(object.getReturndate());
        outstoreService.updateByPrimaryKey(outstore);

        Inventory inventory = inventoryService.getObjectByPrimaryKey(object.getMid());
        inventory.setCount(inventory.getCount()+outstore.getCount());
        inventoryService.update(inventory);

        object.setMaterial(inventory.getMaterial());
        object.setIsreturn(1);
        object.setCount(outstore.getCount());
        SqlSession sqlSession = PageUtil.openSqlSession();
        InstoreMapper instoreMapper = sqlSession.getMapper(InstoreMapper.class);
        instoreMapper.insertSelective(object);
        sqlSession.commit();
        sqlSession.close();
    }
}
