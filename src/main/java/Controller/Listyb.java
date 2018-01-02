package Controller;

import Service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by pc on 2017/10/26.
 */
@Controller
public class Listyb {
    @Autowired
    StuService stuService;
    @RequestMapping("/listyb")
    public String list(HttpServletRequest req, ModelMap map){
        int id = Integer.parseInt(req.getParameter("stuid"));
        map.addAttribute("list",stuService.listbyid(id));
        return "/Listyb";
    }
}
