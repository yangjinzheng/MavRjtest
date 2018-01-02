package Controller;

import Service.SecondService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by pc on 2017/10/30.
 */
@Controller
public class Delsecond {
    @Autowired
    SecondService secondService;
    @RequestMapping("/delsec")
    public String del(HttpServletRequest req, ModelMap map){
        secondService.del(req.getParameter("testname"));
        map.addAttribute("second",secondService.list());
        return "/Secondlist";
    }
}
