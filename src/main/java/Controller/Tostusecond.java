package Controller;

import Service.SecondService;
import Vo.ShowTselect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pc on 2017/10/26.
 */
@Controller
public class Tostusecond {
    @Autowired
    SecondService secondService;
    @RequestMapping("/Tostusecond")
    public String tosec(ModelMap map){
        map.addAttribute("seclist",secondService.list());
        return "/Stusecond";
    }
}
