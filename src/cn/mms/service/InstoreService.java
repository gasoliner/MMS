package cn.mms.service;

import cn.mms.po.Instore;
import cn.mms.po.Page;
import cn.mms.po.Systemddl;

import java.util.List;

public interface InstoreService {

    public void insert(Instore record);

    public void delete(int id);

    public void update(Instore record);

    public long count();

    public void returnn(Instore object);
}
