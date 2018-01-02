package Service.Impl;

import Dao.StuDao;
import Service.StuService;
import Vo.Stusecond;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by pc on 2017/10/26.
 */
public class StuserviceImpl implements StuService {
    @Autowired
    StuDao stuDao;

    public void setStuDao(StuDao stuDao) {
        this.stuDao = stuDao;
    }

    @Override
    public List<Stusecond> listbyid(int id) {
        return stuDao.listbyid(id);
    }

    @Override
    public void addstu(Stusecond stusecond) {
        stuDao.addstu(stusecond);
    }

    @Override
    public void del(Stusecond stusecond) {
        stuDao.del(stusecond);
    }
}
