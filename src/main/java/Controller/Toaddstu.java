package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pc on 2017/10/25.
 */
@Controller
public class Toaddstu {
    @RequestMapping("/addstu")
    public String add(){
        return "/Addstu";
    }
}
