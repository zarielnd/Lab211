/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.List;
import model.Worker;

/**
 *
 * @author phuon
 */
public class ControllerWorker {
    List<Worker> workerList = new ArrayList<>();
    
    public List<Worker> getList(){
        return workerList;
    }

    public boolean isIdExist(String id) {
        if (workerList.stream().anyMatch((wker) -> (wker.getId().equals(id)))) {
            return true;
        }
        return false;
    }

    public void addWorker(String id, String name, int age, int salary, String location) {
        workerList.add(new Worker(id,name,age,salary,location));
    }

    public int getIndexWorker(String id) {
        for(Worker wker: workerList){
            if(wker.getId().equals(id))
                return workerList.indexOf(wker);
        }
        return -1;
    }

    public int getSalary(String id) {
        for(Worker wker: workerList){
            if(wker.getId().equals(id))
                return wker.getSalary();
        }
        return -1;
    }

    public void updateSalary(String id, int i) {
        for(Worker wker: workerList){
            if(wker.getId().equals(id))
                wker.setSalary(i);
        }
    }
    
}
