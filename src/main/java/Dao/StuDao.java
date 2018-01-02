package Dao;

import Vo.Stusecond;

import java.util.List;

/**
 * Created by pc on 2017/10/26.
 */
public interface StuDao {
    public List<Stusecond> listbyid(int id);
    public void addstu(Stusecond stusecond);
    public void del(Stusecond stusecond);
}
