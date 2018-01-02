package Controller;

import Service.UserService;
import Vo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by pc on 2017/10/25.
 */
@Controller
public class Taddstu {
    @Autowired
    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping("/Taddstu")
    public String addlist(HttpServletRequest req){
        String stuid = req.getParameter("stuid");
        String stuclass = req.getParameter("stuclass");
        String stuname = req.getParameter("stuname");
        if(stuid.equals("")||stuclass.equals("")||stuname.equals("")){
            return "/Addstu";
        }
        Test test = new Test();
        int id = Integer.parseInt(stuid);
        List<Test> list = new ArrayList<Test>();
        list = userService.list();
        int flag = 1;
        for(int i = 0;i<list.size();i++){
            if (id == list.get(i).getStuid()){
                flag=0;
            }
        }
        if(flag==1){
        test.setStuid(id);
        test.setStuclass(stuclass);
        test.setStuname(stuname);
        userService.add(test);
        return "redirect:/admin";
        }
        else {
            return "/stucuo";

        }

    }
}
