package springMVC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import springMVC.model.User;
import springMVC.service.UserService;

@Controller
public class ContactController {

    @Autowired
    private UserService userService;


    @ModelAttribute
    public void commonDataforModel(Model m){
        m.addAttribute("Header", "taraan singh Duggal");
        m.addAttribute("Desc","home for programmer");
        System.out.println("adding command data ");
    }


    @RequestMapping("/contact")
    public String showForm(Model m){
        System.out.println("creating forms");
        return "contact";
    }

    @RequestMapping(path="/processform", method= RequestMethod.POST)
    public String handleForm(@ModelAttribute("user") User user, Model model){
        System.out.println(user);
        if(user.getName().isEmpty()){
            System.out.println("name not given");
            return "redirect:/contact";
        }
        int createdUser = this.userService.createUser(user);
        model.addAttribute("msg", "User created with id = "+createdUser);
        System.out.println(user);
        return "success";
    }

//    @RequestMapping(path="/processform", method= RequestMethod.POST)
//    public String handleForm(@RequestParam("email") String email, @RequestParam("name") String name, @RequestParam("password") String password, Model model){
//
//        System.out.println("user email is :" + email);
//        System.out.println("user Username is :" + name);
//        System.out.println("user password is :" + password);
//        User user =new User();
//        user.setEmail(email);
//        user.setName(name);
//        user.setPassword(password);
//        System.out.println(user);
//
////        model.addAttribute("name", name);
////        model.addAttribute("email", email);
////        model.addAttribute("password", password);
//
//        model.addAttribute("user", user);
//        return "success";
//    }
}
