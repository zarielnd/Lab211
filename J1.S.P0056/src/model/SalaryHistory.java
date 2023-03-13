/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author phuon
 */
public class SalaryHistory {
    String id;
    int salary;
    String status;
    Date date;

    public SalaryHistory() {
    }

    public SalaryHistory(String id, int salary, String status, Date date) {
        this.id = id;
        this.salary = salary;
        this.status = status;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SalaryHistory{" + "id=" + id + ", salary=" + salary + ", status=" + status + ", date=" + date + '}';
    }


    
}
