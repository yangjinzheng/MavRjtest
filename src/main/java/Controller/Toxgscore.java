package Controller;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pc on 2017/10/24.
 */
@Controller
public class Toxgscore {
    @RequestMapping("/Txgscore")
    public String xgsore(){
        return "/Txgscore";
    }
}
