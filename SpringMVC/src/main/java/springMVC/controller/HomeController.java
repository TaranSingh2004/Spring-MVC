package springMVC.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model){
        System.out.println("this is home url");
        model.addAttribute("name", "taran singh");
        model.addAttribute("id", 1441);
        List<String> friends = new ArrayList<>();
        friends.add("nitin");
        friends.add("pooja");
        friends.add("vishal");
        model.addAttribute("f",friends);
        return "index";
    }

    @RequestMapping("/about")
    public String about(){
        System.out.println("this is about controller");
        return "about";
    }

    @RequestMapping("/help")
    public ModelAndView help(){
        System.out.println("this is help controller.");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name", "gunit");
        modelAndView.addObject("id", 1234);
        LocalDateTime localDateTime = LocalDateTime.now();
        modelAndView.addObject("time", localDateTime);

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(54);
        list.add(71);

        modelAndView.addObject("marks", list);

        modelAndView.setViewName("help");
        return modelAndView;
    }
}
