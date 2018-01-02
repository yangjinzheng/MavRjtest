package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pc on 2017/10/25.
 */
@Controller
public class Tologin {
    @RequestMapping("/rjtest")
    public String tologin(){
        return "/Login";
    }

}
