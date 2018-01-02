package Controller;

import Service.StuService;
import Service.UserService;
import Vo.Stusecond;
import Vo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by pc on 2017/10/26.
 */
@Controller
public class Baomingsub {
    @Autowired
    StuService stuServicel;
    @Autowired
    UserService userService;
    @RequestMapping("/Baomingsub")
    public String sub(HttpServletRequest req, ModelMap map){
        Stusecond stusecond = new Stusecond();
        int id = Integer.parseInt(req.getParameter("stuid"));
        int flag=0;
        List<Test> list = userService.list();
        for(int i=0;i<list.size();i++){
            if(list.get(i).getStuid()==id)
                flag=1;
        }
        if(flag==0){
            return "/Seccuo";
        }
        else {
            Test test = userService.listbyid(id);
            stusecond.setStuid(id);
            stusecond.setStuname(test.getStuname());
            stusecond.setStuclass(test.getStuclass());
            stusecond.setTesttime(req.getParameter("testtime"));
            stusecond.setTestaddre(req.getParameter("testaddre"));
            stusecond.setCouse(req.getParameter("couse"));
            stuServicel.addstu(stusecond);
            System.out.println("bancheng");
            return "/Successful";
        }
    }
}
