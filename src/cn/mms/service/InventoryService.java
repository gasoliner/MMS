package cn.mms.service;

import cn.mms.po.Inventory;
import cn.mms.po.Page;
import cn.mms.po.Systemddl;

import java.util.List;

public interface InventoryService {

    public List<Inventory> getList(Page page);

    public void insert(Inventory record);

    public void delete(int id);

    public void update(Inventory record);

    public long count();

    public Inventory getObjectByPrimaryKey(int id);

}
