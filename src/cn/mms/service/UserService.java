package cn.mms.service;

import cn.mms.po.Page;
import cn.mms.po.Systemddl;
import cn.mms.po.User;

import java.util.List;

public interface UserService {

    public List<User> getList(Page page);

    public void insert(User record);

    public void delete(int id);

    public void update(User record);

    public long count();

    User getObjectByUsername(String username);
}
