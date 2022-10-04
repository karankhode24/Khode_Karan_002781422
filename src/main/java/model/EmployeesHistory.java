/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Karan
 */
public class EmployeesHistory {
    private ArrayList<EmployeeDetails> history;
    
    public EmployeesHistory(){
        this.history = new ArrayList</*EmployeeDetails*/>();
    }

    public ArrayList<EmployeeDetails> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<EmployeeDetails> history) {
        this.history = history;
    }
    
    public EmployeeDetails addNewDetails(){
        
        EmployeeDetails newDetails = new EmployeeDetails();
        history.add(newDetails);
        return newDetails;
    }
    
    public void deleteDetails(EmployeeDetails ed){
        history.remove(ed);
    }
    
}