package Service.Impl;

import Dao.UserDao;
import Service.UserService;
import Vo.ShowTselect;
import Vo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pc on 2017/10/19.
 */
@Service("UserService")
public class UserserviceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<Test> list() {
        return userDao.list();
    }

    @Override
    public void add(Test test) {
        userDao.add(test);
    }

    @Override
    public Test listbyid(int id) {
        return userDao.listbyid(id);
    }

    @Override
    public void updatebyid(Test test) {
        userDao.updatebyid(test);
    }

    @Override
    public List<ShowTselect> listchin() {
        return userDao.listchin();
    }

    @Override
    public List<ShowTselect> listmath() {
        return userDao.listmath();
    }

    @Override
    public List<ShowTselect> listeng() {
        return userDao.listeng();
    }

    @Override
    public void delete(int id) {
        userDao.delete(id);
    }
}
