package cn.mms.service;

import cn.mms.po.Outstore;
import cn.mms.po.Page;
import cn.mms.po.VoOutstore;

import java.util.List;

public interface OutstoreService {

    public List<Outstore> getList(Page page);

    public boolean insert(Outstore record);

    public void delete(int id);

    public boolean update(Outstore record);

    public void updateByPrimaryKey(Outstore outstore);

    public long count();

    public Outstore getObjectByPrimaryKey(int id);

    public List<VoOutstore> getBorrowList(Page page);

    public Long count_borrow();
}
