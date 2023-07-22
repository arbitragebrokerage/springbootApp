package com.thymeleaf.ArbitrageThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
@GetMapping("/")
    public String home(Model model){
    model.addAttribute("message","Hello Arbitrage");
    return "home";
}

    @GetMapping("/home")
    public String home(){
        return "home";
    }

@GetMapping("/login")
    public String login(){
    return "login";
}

    @GetMapping("/register")
    public String register(){
        return "register";
    }

    @GetMapping("/admin")
    public String admin(){
        return "admin";
    }

    @GetMapping("/user")
    public String user(){
        return "user";
    }

    @GetMapping("/blog")
    public String blog(){
        return "blog";
    }

    @GetMapping("/services")
    public String services(){
        return "services";
    }

    @GetMapping("/usertransactions")
    public String usertransactions() {return "usertransactions";   }

    @GetMapping("/buybusiness")
    public String buybusiness() {return "buybusiness";   }

    @GetMapping("/sellbusiness")
    public String sellbusiness() {return "sellbusiness";   }

    @GetMapping("/userbusinesses")
    public String userbusinesses() {return "userbusinesses";   }

    @GetMapping("/mybusinesses")
    public String mybusinesses() {return "mybusinesses";   }

    @GetMapping("/useranalytics")
    public String useranalytics() {return "useranalytics";   }

    @GetMapping("/businessdetails")
    public String businessdetails() {return "businessdetails";   }
}
