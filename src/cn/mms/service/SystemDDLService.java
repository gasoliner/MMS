package cn.mms.service;

import cn.mms.po.Page;
import cn.mms.po.Systemddl;

import java.util.List;

public interface SystemDDLService {

    public List<Systemddl> getList(Page page);

    public void insert(Systemddl record);

    public void delete(int id);

    public void update(Systemddl record);

    public long count();

}
