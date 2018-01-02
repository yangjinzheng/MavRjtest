package Controller;

import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by pc on 2017/10/21.
 */
@Controller
public class Tupdate {
    @Autowired
    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/Tupdate")
    public String upto(HttpServletRequest req, ModelMap map){
        int id = Integer.parseInt(req.getParameter("id"));
        map.addAttribute("studone",userService.listbyid(id));
        return "/Tupdate";
    }

}
