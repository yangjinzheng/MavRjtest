package Controller;

import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pc on 2017/10/25.
 */
@Controller
public class Toadmin {
    @Autowired
    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping("/admin")
    public String list(ModelMap map){
        map.addAttribute("showlist",userService.list());
        return "/admin";
    }
}
