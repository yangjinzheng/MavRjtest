package Controller;

import Dao.SecondDao;
import Service.SecondService;
import Vo.Secondclass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by pc on 2017/10/23.
 */
@Controller
public class Tsecondcl {
    @Autowired
    SecondService secondService;

    public void setSecondService(SecondService secondService) {
        this.secondService = secondService;
    }
    @RequestMapping(value="/Tsecondcl",method={RequestMethod.GET})
    public String secl(HttpServletRequest req,ModelMap map){
        String testnum = req.getParameter("testnum");
        Secondclass sec = new Secondclass();
        String testname = req.getParameter("testname");
        String testaddre = req.getParameter("testaddre");
        String testtime = req.getParameter("testtime");
        if(testnum.equals("")||testname.equals("")||testaddre.equals("")||testtime.equals("")){
            return "/Tsecond";
        }
        int num = Integer.parseInt(testnum);
        sec.setTestname(testname);
        sec.setTestaddre(testaddre);
        sec.setTesttime(testtime);
        sec.setTestnum(num);
        secondService.add(sec);
        map.addAttribute("second",secondService.list());
        return "/Secondlist";
    }
}
