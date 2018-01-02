package Controller;

import Service.UserService;
import Vo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by pc on 2017/10/24.
 */
@Controller
public class Tupscore {
    @Autowired
    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/upscore")
    public String upscore(HttpServletRequest req, ModelMap map){
        Test test = new Test();
        int id = Integer.parseInt(req.getParameter("stuid"));
        String chinscore = req.getParameter("chinscore");
        String mathscore = req.getParameter("mathscore");
        String engscore = req.getParameter("engscore");
        if(chinscore.equals("")){
            chinscore = "0";
        }
        if(mathscore.equals("")){
            mathscore = "0";
        }
        if(engscore.equals("")){
            engscore = "0";
        }
        double chin = Double.parseDouble(chinscore);
        double math = Double.parseDouble(mathscore);
        double eng = Double.parseDouble(engscore);
        test.setStuid(id);
        test.setStuname(req.getParameter("stuname"));
        test.setStuclass(req.getParameter("stuclass"));
        test.setChinscore(chin);
        test.setMathscore(math);
        test.setEngscore(eng);
        userService.updatebyid(test);
        map.addAttribute("show",userService.listbyid(id));
        return "/Showscore";
    }

}
