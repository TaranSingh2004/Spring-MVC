package springMVC.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class ReController {

    @RequestMapping("/one")
    public RedirectView one(){
        System.out.println("this is one handler");
        RedirectView redirectView= new RedirectView();
        redirectView.setUrl("enjoy");
        return redirectView;
    }

    //    @RequestMapping("/one")
//    public String one(){
//        System.out.println("this is one handler");
//        return "redirect:/enjoy";
//    }



    //this one is not used as if we have to use use servlet then what is the use of spring mvc
//    @RequestMapping("/one")
//    public String one(HttpServletResponse response) throws IOException {
//        System.out.println("this is one handler");
//        response.sendRedirect("/enjoy");
//        return "";
//    }


    @RequestMapping("/enjoy")
    public String two() {
        System.out.println("this is second handler[enjoy]");
        return "contact";
    }
}
