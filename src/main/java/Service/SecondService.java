package Service;

import Vo.Secondclass;

import java.util.List;

/**
 * Created by pc on 2017/10/23.
 */
public interface SecondService {
    public List<Secondclass> list();
    public void add(Secondclass secondclass);
    public void del(String testname);
}
