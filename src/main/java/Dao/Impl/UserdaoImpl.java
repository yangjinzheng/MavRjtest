package Dao.Impl;

import Dao.UserDao;
import Vo.ShowTselect;
import Vo.Test;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by pc on 2017/10/19.
 */
public class UserdaoImpl extends SqlSessionDaoSupport implements UserDao  {
    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }

    @Override
    public List<Test> list() {
        return getSqlSession().selectList("Vo.TestMapper.List");
    }

    @Override
    public void add(Test test) {
        getSqlSession().insert("Vo.TestMapper.addtest",test);
    }

    @Override
    public Test listbyid(int id) {
        return getSqlSession().selectOne("Vo.TestMapper.Listbyid",id);
    }

    @Override
    public void updatebyid(Test test) {
        getSqlSession().update("Vo.TestMapper.updatebyid",test);
    }

    @Override
    public List<ShowTselect> listchin() {
        return getSqlSession().selectList("Vo.TestMapper.selectchin");
    }

    @Override
    public List<ShowTselect> listmath() {
        return getSqlSession().selectList("Vo.TestMapper.selectmath");
    }

    @Override
    public List<ShowTselect> listeng() {
        return getSqlSession().selectList("Vo.TestMapper.selecteng");
    }

    @Override
    public void delete(int id) {
        getSqlSession().delete("Vo.TestMapper.delbyid",id);
    }
}
