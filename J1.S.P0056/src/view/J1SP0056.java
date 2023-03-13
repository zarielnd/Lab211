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
public class J1SP0056 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Validate in = new Validate();
        ViewWorker worker = new ViewWorker();
        int userChoice;
        
        do{
            System.out.println("=====Worker Management=====");
            System.out.println("1. Add worker");
            System.out.println("2. Up Salary");
            System.out.println("3. Down Salary");
            System.out.println("4. Display information salary");
            System.out.println("5. Exit");
            System.out.println("Enter choice:");
            userChoice = in.getInt();
            switch(userChoice){
                case 1:
                    worker.addWorker();
                    break;
                case 2:
                    worker.upSalary();
                    break;
                case 3:
                    worker.downSalary();
                    break;
                case 4:
                    worker.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Input have to be in range 1-5");
                    break;
            }
        }while(userChoice!=5);
        
    }
    
}
