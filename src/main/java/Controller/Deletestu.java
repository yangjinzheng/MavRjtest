package Controller;

import Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by pc on 2017/10/25.
 */
@Controller
public class Deletestu {
    @Autowired
    UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/delete")
    public String delete(HttpServletRequest req){
        int id = Integer.parseInt(req.getParameter("id"));
        userService.delete(id);
        return "redirect:/admin";
    }
}
