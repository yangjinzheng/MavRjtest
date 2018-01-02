package Dao.Impl;

import Dao.SecondDao;
import Vo.Secondclass;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by pc on 2017/10/23.
 */
public class SeconddaoImpl extends SqlSessionDaoSupport implements SecondDao {
    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
    @Override
    public List<Secondclass> list() {
        return getSqlSession().selectList("Vo.SecondMapper.list");
    }

    @Override
    public void add(Secondclass secondclass) {
        getSqlSession().insert("Vo.SecondMapper.add",secondclass);
    }

    @Override
    public void del(String testname) {
        getSqlSession().delete("Vo.SecondMapper.del",testname);
    }


}
