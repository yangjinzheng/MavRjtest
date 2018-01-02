package Controller;

import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by pc on 2017/10/19.
 */
@Controller
public class LoginController {
    @Autowired
    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/login",method = {RequestMethod.GET})
    public String list(HttpServletRequest req,ModelMap map){
        String lname = req.getParameter("loginname");
        String lpass = req.getParameter("loginpass");
        String snum = req.getParameter("radio");
        if(snum.equals("")){
            snum="0";
        }
        int num = Integer.parseInt(snum);
        if(lname.equals("admin")&&lpass.equals("123456")) {
            map.addAttribute("lname", lname);
            if (num == 1) {
                return "/Stumain";
            } else if (num == 2) {
                return "/main";
            } else if (num == 3) {
                return "/Admain";
            }
        }
        else {
            return "/Logincuo";
        }
        return null;
    }

}
