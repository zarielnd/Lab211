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
public class J1SP0057 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Validate in = new Validate();
        ViewRegisterLogin view = new ViewRegisterLogin();
        
        int userChoice;
        do{
            System.out.println("=====User Management=====");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.println("> Choose:");
            userChoice = in.getInt();
            switch(userChoice){
                case 1:
                    view.register();
                    break;
                case 2:
                    view.login();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Input must be in range 1-3:");
                    break;
            }
        }while(userChoice!=3);
        
    }
    
}
