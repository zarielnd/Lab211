/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileReader;

/**
 *
 * @author phuon
 */
public class Manager {

    public boolean userExists(String username) throws IOException {
        File file=new File("user.dat");
        if(!file.exists())
            return false;
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while((line=reader.readLine())!=null){
            String[] temp=line.split(";");
            if(temp[0].equals(username))
                return true;
        }
        return false;
    }

    public void addUser(String username, String password) throws IOException {
        File file=new File("user.dat");
        if(!file.exists()){
            file.createNewFile();
        }
        FileWriter writer = new FileWriter(file);
        String line=username+";"+password;
        writer.write(line);
        writer.close();
    }

    public boolean findUser(String username, String password) throws FileNotFoundException, IOException {
        File file=new File("user.dat");
        if(!file.exists())
            return false;
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String line;
        while((line=reader.readLine())!=null){
            String[] temp=line.split(";");
            if(temp[0].equals(username)&&temp[1].equals(password))
                return true;
        }
        return false;
    }
    
}
