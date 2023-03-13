/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

import java.io.IOException;

/**
 *
 * @author phuon
 */
public class Menu {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Validate in = new Validate();
        Converter convert = new Converter();
        int inputBase;
        String outputValue;
        
        do{
            System.out.println("Choose the input base system (2 for binary, 10 for decimal, 16 for hexadecimal): ");
            inputBase = in.getInt();
            switch(inputBase){
                case 2:
                    convert.binToDecAndHex();
                    break;
                case 10:
                    convert.decToBinAndHex();
                    break;
                case 16:
                    convert.hexToDecAndBin();
                    break;
                default:
                    System.out.println("Input must be 2,10,16");
                    break;
            }
        }while(true);
        
    
    }
}
