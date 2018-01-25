package Service.Impl;

import Dao.SecondDao;
import Service.SecondService;
import Vo.Secondclass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by pc on 2017/10/23.
 */
@Service("SecondService")
public class SecondserviceImpl implements SecondService {
    @Autowired
    private SecondDao secondDao;
    @Override
    public List<Secondclass> list() {
        return secondDao.list();
    }

    @Override
    public void add(Secondclass secondclass) {
        secondDao.add(secondclass);
    }

    @Override
    public void del(String testname) {
        secondDao.del(testname);
    }

}
