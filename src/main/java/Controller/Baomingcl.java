package Controller;

import Dao.StuDao;
import Service.StuService;
import Vo.Stusecond;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by pc on 2017/10/26.
 */
@Controller
public class Baomingcl {
    @RequestMapping(value = "/baomingcl",method = {RequestMethod.GET})
    public String baoming(HttpServletRequest req, ModelMap map){
        Stusecond stusecond = new Stusecond();
        stusecond.setCouse(req.getParameter("testname"));
        stusecond.setTestaddre(req.getParameter("testaddre"));
        stusecond.setTesttime(req.getParameter("testtime"));
        map.addAttribute("stu",stusecond);

        return "/Baomingcl";
    }
}
