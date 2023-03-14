/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

import java.io.IOException;
import java.math.BigInteger;

/**
 *
 * @author phuon
 */
public class Converter {
    Validate in = new Validate();
    
    public void binToDecAndHex() throws IOException{
        String finalOutput;
        int outputBase;
        BigInteger decimal;
        System.out.println("Choose the output base system (10 for decimal, 16 for hexadecimal): ");
        do{
            outputBase = in.getInt();
            if(outputBase!=10&&outputBase!=16)
                System.out.println("Input must be 10,16");
        }while(outputBase!=10&&outputBase!=16);
        switch(outputBase){
            case 10:
                System.out.println("Enter binary:");
                finalOutput = in.getBinary();
                decimal = new BigInteger(finalOutput, 2);
                System.out.println("The equivalent value in the chosen base system is: " + decimal);
                break;
            case 16:
                System.out.println("Enter binary:");
                finalOutput = in.getBinary();
                decimal = new BigInteger(finalOutput, 2);
                finalOutput = decimal.toString(16);
                System.out.println("The equivalent value in the chosen base system is: " + finalOutput);
                break;
            default:
                break;
        }
    }

    void decToBinAndHex() throws IOException {
        String finalOutput;
        int outputBase;
        BigInteger decimal;
        
        System.out.println("Choose the output base system (2 for binary, 16 for hexadecimal): ");
        do{
            outputBase = in.getInt();
            if(outputBase!=2&&outputBase!=16)
                System.out.println("Input must be 2,16");
        }while(outputBase!=2&&outputBase!=16);
        switch(outputBase){
            case 2:
                System.out.println("Enter decimal:");
                decimal=new BigInteger(in.getString("^[0-9]+?$","Invalid Base... Please try again"));
                finalOutput = decimal.toString(2);
                System.out.println("The equivalent value in the chosen base system is: " + finalOutput);
                break;
            case 16:
                System.out.println("Enter decimal:");
                decimal=new BigInteger(in.getString("^[0-9]+?$","Invalid Base... Please try again"));
                finalOutput = decimal.toString(16);
                System.out.println("The equivalent value in the chosen base system is: " + finalOutput);
                break;
            default:
                break;
        }
    }

    void hexToDecAndBin() throws IOException {
        String finalOutput;
        int outputBase;
        BigInteger decimal;
        System.out.println("Choose the output base system (2 for binary, 10 for hexadecimal): ");
        do{
            outputBase = in.getInt();
            if(outputBase!=2&&outputBase!=10)
                System.out.println("Input must be 2,10");
        }while(outputBase!=2&&outputBase!=10);
        switch(outputBase){
            case 2:
                System.out.println("Enter hexadecimal:");
                finalOutput = in.getHexadecimal();
                decimal = new BigInteger(finalOutput,16);
                finalOutput=decimal.toString(2);
                System.out.println("The equivalent value in the chosen base system is: " + finalOutput);
                break;
            case 10:
                System.out.println("Enter hexadecimal:");
                finalOutput = in.getHexadecimal();
                decimal = new BigInteger(finalOutput,16);
                System.out.println("The equivalent value in the chosen base system is: " + decimal);
                break;
            default:
                break;
        }
    }
}
