package Controller;

import Service.Impl.UserserviceImpl;
import Service.UserService;
import Vo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by pc on 2017/10/21.
 */
@Controller
public class Tupdatemk {
    @Autowired
    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value="/Tupdatemk",method={RequestMethod.GET})
    public String make(HttpServletRequest req, ModelMap map){
        Test test = new Test();
        int id = Integer.parseInt(req.getParameter("stuId"));
        String chinscore = req.getParameter("Chinscore");
        String mathscore = req.getParameter("Mathscore");
        String engscore = req.getParameter("Engscore");
        if(chinscore.equals("")){
            chinscore = "0";
        }
        if(mathscore.equals("")){
            mathscore = "0";
        }
        if(engscore.equals("")){
            engscore = "0";
        }
        double chsc = Double.parseDouble(chinscore);
        double masc = Double.parseDouble(mathscore);
        double ensc = Double.parseDouble(engscore);
        test.setStuid(id);
        test.setChinscore(chsc);
        test.setMathscore(masc);
        test.setEngscore(ensc);
        userService.updatebyid(test);
        return "redirect:/TShscore";
    }

}
