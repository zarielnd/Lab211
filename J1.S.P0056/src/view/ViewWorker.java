package view;

import controller.ControllerHistory;
import controller.ControllerWorker;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import model.SalaryHistory;
import model.Worker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phuon
 */
public class ViewWorker {
    Validate in = new Validate();
    ControllerWorker controllerWorker = new ControllerWorker();
    ControllerHistory controllerHistory = new ControllerHistory();
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    Date currentDate = new Date();
    
    void addWorker() throws IOException {
        String id, name, location;
        int age, salary;
        System.out.println("--------Add Worker--------");
        System.out.println("Enter Code");
        do{
           id=in.getWorker();
           if(controllerWorker.isIdExist(id))
               System.out.println("Worker ID already existed... Please try again:");
        }while(controllerWorker.isIdExist(id));
        System.out.println("Enter Name");
        name=in.getString();
        System.out.println("Enter Age");
        do{
            age=in.getInt();
            if(age<18||age>50)
                System.out.println("Age must be in range 18-50");
        }while(age<18||age>50);
        System.out.println("Enter Salary");
        do{
            salary=in.getInt();
            if(salary<=0)
                System.out.println("Salary must greater than 0");
        }while(salary<=0);
        System.out.println("Enter Work Location");
        location=in.getString();
        controllerWorker.addWorker(id,name,age,salary,location);
    }
    
    void upSalary() throws IOException {
        if(controllerWorker.getList().isEmpty()){
            System.out.println("You haven't add any worker yet.");
            return;
        }
        String id,status="UP";
        int salary;
        System.out.println("-----Up salary-----");
        System.out.println("Enter ID:");
        do{
            id=in.getWorker();
            if(!controllerWorker.isIdExist(id))
                System.out.println("Worker not found... Please try again");
        }while(!controllerWorker.isIdExist(id));
        System.out.println("Enter Salary");
        do{
            salary=in.getInt();
        }while(salary<=0);
        int currentSalary=controllerWorker.getSalary(id);
        controllerHistory.addHistory(id,currentSalary+salary,status,currentDate);
        controllerWorker.updateSalary(id,currentSalary+salary);
        
    }

    void downSalary() throws IOException {
        if(controllerWorker.getList().isEmpty()){
            System.out.println("You haven't add any worker yet.");
            return;
        }
        String id,status="DOWN";
        int salary;
        System.out.println("-----Down salary-----");
        System.out.println("Enter ID:");
        do{
            id=in.getWorker();
            if(!controllerWorker.isIdExist(id))
                System.out.println("Worker not found... Please try again");
        }while(!controllerWorker.isIdExist(id));
        System.out.println("Enter Salary");
        int currentSalary=controllerWorker.getSalary(id);
        do{
            salary=in.getInt();
            if(salary<=0)
                System.out.println("Salary must be greater than 0");
            if(salary>currentSalary)
                System.out.println("Cutting salary cannot be more than current salary");
        }while(salary<=0||salary>currentSalary);
        controllerHistory.addHistory(id,currentSalary-salary,status,currentDate);
        controllerWorker.updateSalary(id,currentSalary-salary);
        
    }

    void display() {
        List<Worker> temp=controllerWorker.getList();
        System.out.println("------Salary History------");
        System.out.format("%-10s%-20s%-20s%-20s%-20s%-20s\n", "Code","Name","Age","Salary","Status","Date");
        for(SalaryHistory sh: controllerHistory.getList()){
            Worker worker = temp.get(controllerWorker.getIndexWorker(sh.getId()));
            System.out.format("%-10s%-20s%-20s%-20s%-20s%-20s\n",sh.getId(),worker.getName(),worker.getAge(),sh.getSalary(),sh.getStatus(),formatter.format(sh.getDate()));
        }
    }
    
}
