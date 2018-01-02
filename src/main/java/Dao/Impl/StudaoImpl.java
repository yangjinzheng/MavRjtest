package Dao.Impl;

import Dao.StuDao;
import Vo.Stusecond;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by pc on 2017/10/26.
 */
public class StudaoImpl extends SqlSessionDaoSupport implements StuDao {
    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
    @Override
    public List<Stusecond> listbyid(int id) {
        return getSqlSession().selectList("Vo.StuMapper.listbyid",id);
    }

    @Override
    public void addstu(Stusecond stusecond) {
        getSqlSession().insert("Vo.StuMapper.addstu",stusecond);
    }

    @Override
    public void del(Stusecond stusecond) {
        getSqlSession().delete("Vo.StuMapper.delbyic",stusecond);
    }
}
