package Controller;

import Service.StuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pc on 2017/10/26.
 */
@Controller
public class Tostuyb {
    @RequestMapping("/Tostuyb")
    public String stulist(){
        return "/Stuyb";
    }
}
