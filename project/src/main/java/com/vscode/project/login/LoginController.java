package com.vscode.project.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.ui.ModelMap;

@Controller
@SessionAttributes("name")
public class LoginController {
    private AuthenticationService authenticationService;
    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }
    @RequestMapping(value="login",method=RequestMethod.GET)
    public String loginpage(){
        
        return "login";
    }
    @RequestMapping(value="login",method=RequestMethod.POST)
    public String welcomepage(@RequestParam String name,@RequestParam String password,ModelMap model){
        if(authenticationService.authenticate(name,password)){
            model.put("name",name);
            model.put("password",password);
            return "welcome";
        }
        model.put("errorMessage","Invalid credentials, Please try again"); 
        return "login";

    }
}
