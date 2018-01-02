package Controller;

import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by pc on 2017/10/26.
 */
@Controller
public class Stuselect {
    @Autowired
    UserService userService;
    @RequestMapping("/Stuselect")
    public String stu(HttpServletRequest req, ModelMap map){
        int id = Integer.parseInt(req.getParameter("stuid"));
        map.addAttribute("select",userService.listbyid(id));
        return "/Stulist";
    }
}
