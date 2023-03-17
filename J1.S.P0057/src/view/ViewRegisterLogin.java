/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.IOException;
/**
 *
 * @author phuon
 */
public class ViewRegisterLogin {
    Validate in = new Validate();
    Manager user=new Manager();
    
    void register() throws IOException {
        String username,password;
        System.out.println("------Register------");
        System.out.println("Enter username:");
        do{
            username=in.getString().replaceAll("\\n", "");
            if(username.length()<=5)
                System.out.println("Username length cannot be lesser than 5");
            if(user.userExists(username))
                System.out.println("Username already exist");
        }while(username.length()<=5||user.userExists(username));
        System.out.println("Enter password:");
        do{
            password=in.getString().replaceAll("\\n", "");
            if(password.length()<=6)
                System.out.println("Password length cannot be lesser than 6");
        }while(password.length()<=6);
        user.addUser(username,password);
        System.out.println("Register successful!");
        this.login();
    }

    void login() throws IOException {
        String username,password;
        System.out.println("------Login------");
        System.out.println("Enter username:");
        do{
            username=in.getString().replaceAll("\\n", "");
            if(username.length()<=5)
                System.out.println("Username length cannot be lesser than 5");
        }while(username.length()<=5);
        System.out.println("Enter password:");
        do{
            password=in.getString().replaceAll("\\n", "");
            if(password.length()<=6)
                System.out.println("Password length cannot be lesser than 6");
        }while(password.length()<=6);
        if(user.findUser(username,password)){
            System.out.println("Login successfully!");
        }
        else{
            System.out.println("User not found");
        }
    }
    
}
