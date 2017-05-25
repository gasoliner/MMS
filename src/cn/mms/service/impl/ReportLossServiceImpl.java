package cn.mms.service.impl;

import cn.mms.mapper.ReportlossMapper;
import cn.mms.po.*;
import cn.mms.service.InventoryService;
import cn.mms.service.ReportLossService;
import cn.mms.util.PageUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class ReportLossServiceImpl implements ReportLossService {

    InventoryService inventoryService = new InventoryServiceImpl();

    @Override
    public List<Reportloss> getList(Page page) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        ReportlossMapper reportlossMapper = sqlSession.getMapper(ReportlossMapper.class);
        page.setStart((page.getPage()-1)*page.getSize());
        List<Reportloss> reportlossList = reportlossMapper.selectAll(page);
        sqlSession.close();
        return reportlossList;
    }

    @Override
    public boolean insert(Reportloss record) {

        Inventory inventory = inventoryService.getObjectByPrimaryKey(record.getMid());
        if (inventory.getCount()-record.getCount() >= 0){
            inventory.setCount(inventory.getCount()-record.getCount());
            inventoryService.update(inventory);

            record.setMaterial(inventory.getMaterial());
            SqlSession sqlSession = PageUtil.openSqlSession();
            ReportlossMapper reportlossMapper = sqlSession.getMapper(ReportlossMapper.class);
            reportlossMapper.insertSelective(record);
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
        ReportlossMapper reportlossMapper = sqlSession.getMapper(ReportlossMapper.class);
        reportlossMapper.deleteByPrimaryKey(id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public boolean update(Reportloss record) {

        Inventory inventory = inventoryService.getObjectByPrimaryKey(record.getMid());
        if (inventory.getCount()-record.getCount() >= 0) {
            inventory.setCount(inventory.getCount() - record.getCount());
            inventoryService.update(inventory);

            record.setMaterial(inventory.getMaterial());
            SqlSession sqlSession = PageUtil.openSqlSession();
            ReportlossMapper reportlossMapper = sqlSession.getMapper(ReportlossMapper.class);
            reportlossMapper.updateByPrimaryKeySelective(record);
            sqlSession.commit();
            sqlSession.close();
            return true;
        }else {
            return false;
        }
    }

    @Override
    public long count() {
        SqlSession sqlSession = PageUtil.openSqlSession();
        ReportlossMapper reportlossMapper = sqlSession.getMapper(ReportlossMapper.class);
        long count = reportlossMapper.countByExample(new ReportlossExample());
        sqlSession.close();
        return count;
    }
}
