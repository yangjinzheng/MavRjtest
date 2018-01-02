package Controller;

import Service.UserService;
import Vo.ShowTselect;
import Vo.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by pc on 2017/10/22.
 */
@Controller
public class Tselectcl {
    @Autowired
    UserService userService;
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public static void sortIntMethod(List list){
        Collections.sort(list, new Comparator(){
            @Override
            public int compare(Object o1, Object o2) {
                ShowTselect stu1=(ShowTselect)o1;
                ShowTselect stu2=(ShowTselect)o2;
                if(stu1.getSscore()<stu2.getSscore()){
                    return 1;
                }else if(stu1.getSscore()==stu2.getSscore()){
                    return 0;
                }else{
                    return -1;
                }
            }
        });}
        @RequestMapping(value="/Tselectcl",method={RequestMethod.GET})
    public String Tselectcl(HttpServletRequest req, ModelMap map){
        int temp = Integer.parseInt(req.getParameter("select"));
        List<ShowTselect> list1 = new ArrayList<ShowTselect>();
        if(temp==1){
            list1 = userService.listchin();
            sortIntMethod(list1);
            map.addAttribute("showname","语文成绩");
            map.addAttribute("showselect",list1);
        }
        else if(temp==2){
            list1 = userService.listmath();
            sortIntMethod(list1);
            map.addAttribute("showname","数学成绩");
            map.addAttribute("showselect",list1);

        }
        else{
            list1 = userService.listeng();
            sortIntMethod(list1);
            map.addAttribute("showname","英语成绩");
            map.addAttribute("showselect",list1);

        }
        return "/Showselect";
    }
}
