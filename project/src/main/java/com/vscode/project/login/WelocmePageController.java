package com.vscode.project.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelocmePageController {
    @RequestMapping("welcome-page")
    
    public String welcome(){
        return "login";
    }
}
