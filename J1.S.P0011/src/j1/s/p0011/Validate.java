/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0011;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author phuon
 */
public class Validate {

    BufferedReader input = new BufferedReader(new InputStreamReader(System.in)); //initiate reader

    public int getInt() throws IOException {
        String temp = input.readLine();
        while (!temp.matches("[1-9]([0-9]+)?$")) { // loop until user input positive integer
            System.out.println("Invalid input... Enter positive integers:");
            temp = input.readLine();
        }
        return Integer.parseInt(temp);
    }

    public String getString(String regex, String alert) throws IOException {
        String temp = input.readLine();
        while (!temp.matches(regex)) { // loop until user input a String
            System.out.println(alert);
            temp = input.readLine();
        }
        return temp;
    }
    public String getBinary() throws IOException {
        String temp = input.readLine();
        while (!temp.matches("^[01]+$")) { // loop until user input a String
            System.out.println("Invalid base... Please try again:");
            temp = input.readLine();
        }
        return temp;
    }
    public String getHexadecimal() throws IOException {
        String temp = input.readLine();
        while (!temp.matches("^[0-9a-fA-F]+$")) { // loop until user input a String
            System.out.println("Invalid base... Please try again:");
            temp = input.readLine();
        }
        return temp;
    }
    public String getDecimal() throws IOException {
        String temp = input.readLine();
        while (!temp.matches("^-?[0-9]+$")) { // loop until user input a String
            System.out.println("Invalid base... Please try again:");
            temp = input.readLine();
        }
        return temp;
    }
    public String getWorker() throws IOException {
        String temp = input.readLine();
        while (!temp.matches("^W\\d{3}$")) { // loop until user input a String
            System.out.println("Wrong ID format (Wxxx)");
            temp = input.readLine();
        }
        return temp;
    }
    

    public float getFloat() throws IOException {
        String temp = input.readLine();
        while (!temp.matches("^[-+]?([0-9]*[.])?[0-9]+$")) { // loop until user input a String
            System.out.println("Input cannot be character.");
            temp = input.readLine();
        }
        return Float.parseFloat(temp);
    }

    public Date getDate() throws IOException, ParseException {
        int day, month, year;
        String date;
        char confirm;
        String regex = "\\d{2}/\\d{2}/\\d{4}";
        do {
            do {
                date = input.readLine().trim();
                if (date.matches(regex)) {
                    break;
                } else {
                    System.out.println("Wrong date format (dd/MM/yyyy). Please try again!");
                }

            } while (true);
            day = Integer.parseInt(date.substring(0, 2));
            month = Integer.parseInt(date.substring(3, 5));
            year = Integer.parseInt(date.substring(6, 10));
            if (this.validateDate(day, month, year)) {
                break;
            } else {
                System.out.println("Invalid date information!");
            }
        } while (true);
        Date d = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        return d;
    }

    public boolean validateDate(int day, int month, int year) {
        if (month > 12) {
            return false;
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day > 31) {
                    return false;
                }
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day > 30) {
                    return false;
                }
                break;
            default:
                if (year % 4 == 0) {
                    if (day > 29) {
                        return false;
                    }
                } else {
                    if (day > 28) {
                        return false;
                    }
                }
                break;
        }
        return true;
    }
}
