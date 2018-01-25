package Service.Impl;

import Dao.StuDao;
import Service.StuService;
import Vo.Stusecond;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pc on 2017/10/26.
 */
@Service("stuService")
public class StuserviceImpl implements StuService {
    @Autowired
    private StuDao stuDao;
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
