package cn.mms.service;

import cn.mms.po.Page;
import cn.mms.po.Reportloss;
import cn.mms.po.Systemddl;

import java.util.List;

public interface ReportLossService {

    public List<Reportloss> getList(Page page);

    public boolean insert(Reportloss record);

    public void delete(int id);

    public boolean update(Reportloss record);

    public long count();

}
