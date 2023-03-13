/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.SalaryHistory;

/**
 *
 * @author phuon
 */
public class ControllerHistory {
    List<SalaryHistory> historyList = new ArrayList<>();
    
    public List<SalaryHistory> getList(){
        return historyList;
    }

    public void addHistory(String id, int i, String status, Date currentDate) {
        historyList.add(new SalaryHistory(id,i,status,currentDate));
    }
}
