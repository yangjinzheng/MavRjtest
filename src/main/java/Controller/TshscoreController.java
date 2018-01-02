package Controller;

import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pc on 2017/10/21.
 */
@Controller
public class TshscoreController {
    @Autowired
    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/TShscore")
    public String list(ModelMap map){
        map.addAttribute("stud",userService.list());
        return "/TShscore";
    }
}
