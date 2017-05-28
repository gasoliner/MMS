package cn.mms.service.impl;

import cn.mms.mapper.UserMapper;
import cn.mms.po.Inventory;
import cn.mms.po.Page;
import cn.mms.po.User;
import cn.mms.po.UserExample;
import cn.mms.service.InventoryService;
import cn.mms.service.UserService;
import cn.mms.service.UserService;
import cn.mms.util.PageUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;


public class UserServiceImpl implements UserService {


    @Override
    public List<User> getList(Page page) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        page.setStart((page.getPage()-1)*page.getSize());
        List<User> userList = userMapper.selectAll(page);
        sqlSession.close();
        return userList;
    }

    @Override
    public void insert(User record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.insertSelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void delete(int id) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.deleteByPrimaryKey(id);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public void update(User record) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        userMapper.updateByPrimaryKeySelective(record);
        sqlSession.commit();
        sqlSession.close();
    }

    @Override
    public long count() {
        SqlSession sqlSession = PageUtil.openSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        long count = userMapper.countByExample(new UserExample());
        sqlSession.close();
        return count;
    }

    @Override
    public User getObjectByUsername(String username) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<User> userList = userMapper.selectByExample(userExample);
        if (userList != null && userList.size() > 0){
            return userList.get(0);
        }else {
            return null;
        }
    }

    @Override
    public boolean updatePassword(String newpass, String newpass_check, String oldpass, Integer uid) {
        SqlSession sqlSession = PageUtil.openSqlSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        if (userMapper.selectByPrimaryKey(uid).getPassword().equals(oldpass)){
            if (newpass.equals(newpass_check)){
                User user = new User();
                user.setPassword(newpass);
                user.setUid(uid);
                userMapper.updateByPrimaryKeySelective(user);
                sqlSession.commit();
                sqlSession.close();
                return true;
            }
        }
        return false;
    }
}
