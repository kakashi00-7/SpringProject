package com.vscode.project.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {
    
    @RequestMapping("say-hello")
    @ResponseBody
    public String hello(){
        return "Hello all";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String helloHtml(){
        StringBuffer sb = new StringBuffer();
        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title>webpage</title>");
        
        sb.append("</head>");
        sb.append("<body>");
        sb.append("Hello guys");
        sb.append("</body>");
        sb.append("</html>");
        return sb.toString();
    }


    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp(){
        return "login";
    }
}
