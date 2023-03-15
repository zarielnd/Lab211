/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0074;

import java.io.IOException;

/**
 *
 * @author phuon
 */
public class J1SP0074 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Validate in = new Validate();
        MatrixCalculator matrixCalc = new MatrixCalculator();
        int userChoice;
        
        do{
            System.out.println("======Calculator Program======");
            System.out.println("1. Addition matrix");
            System.out.println("2. Subtraction matrix");
            System.out.println("3. Multiplication matrix");
            System.out.println("4. Exit");
            System.out.println("Enter choice:");
            userChoice=in.getInt();
            switch(userChoice){
                case 1:
                    matrixCalc.addition();
                    break;
                case 2:
                    matrixCalc.subtraction();
                    break;
                case 3:
                    matrixCalc.multiplication();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Input must be in range 1-4");
                    break;
            }
        }while(userChoice!=4);
        
    }
    
}
