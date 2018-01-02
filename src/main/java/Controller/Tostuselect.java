package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pc on 2017/10/26.
 */
@Controller
public class Tostuselect {
    @RequestMapping("/Tostuselect")
    public String tostu(){
        return "/Stuselect";
    }
}
