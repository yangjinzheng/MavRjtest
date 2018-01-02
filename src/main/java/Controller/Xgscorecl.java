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
public class Xgscorecl {
    @Autowired
    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping("/xgscorecl")
    public String xgcl(HttpServletRequest req, ModelMap map){
        String stuid = req.getParameter("stuid");
        if(stuid.equals("")){
            return "/Txgscore";
        }
        int id = Integer.parseInt(stuid);
        map.addAttribute("infor",userService.listbyid(id));
        return "/Txgscorecl";
    }
}
