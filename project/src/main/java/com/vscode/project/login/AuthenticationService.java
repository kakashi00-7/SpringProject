package com.vscode.project.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String username,String password){
        boolean isvalidusername = username.equalsIgnoreCase("anil") ;
        boolean isValidPassword = password.equalsIgnoreCase("anil");
        return isValidPassword && isvalidusername;
    }
}
