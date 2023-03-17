/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

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
        while (!temp.matches("^-?[0-9]+$")) { // loop until user input positive integer
            System.out.println("Value of matrix must be number");
            temp = input.readLine();
        }
        return Integer.parseInt(temp);
    }

    public String getString() throws IOException {
        String temp = input.readLine();
        return temp;
    }

    public float getFloat() throws IOException {
        boolean valid = false;
        float fl = 0;
        do {
            try {
                fl = Float.parseFloat(input.readLine()); // This will read the line and try to parse it to a floating value
                valid = true;
            } catch (NumberFormatException e) { // if it was not a valid float, you'll get this exception
                System.out.println("Not a valid float");
            }
        } while (!valid); // The loop ends when a valid float is got from the user
        return fl;
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
