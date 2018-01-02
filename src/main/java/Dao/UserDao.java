package Dao;

import Vo.ShowTselect;
import Vo.Test;

import java.util.List;

/**
 * Created by pc on 2017/10/19.
 */
public interface UserDao {
    public List<Test> list();
    public void add(Test test);
    public Test listbyid(int id);
    public void updatebyid(Test test);
    public List<ShowTselect> listchin();
    public List<ShowTselect> listmath();
    public List<ShowTselect> listeng();
    public void delete(int id);
}
