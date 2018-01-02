package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pc on 2017/10/22.
 */
@Controller
public class Totselect {
    @RequestMapping("/Tselect")
    public String select(){
        return "/Tselect";
    }
}
