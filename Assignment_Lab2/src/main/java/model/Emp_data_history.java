/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *vitalsignsHIstory.java uske video me 
 * @author karan
 */
public class Emp_data_history {//vitalsignhistory.java
    private ArrayList<Emp_data>data_history;//history 
    
    public Emp_data_history(){ // vitalsignhistory(){}
        
   this.data_history= new ArrayList<Emp_data>();
    
    
    } 

    public ArrayList<Emp_data> getData_history() {
        return data_history;
    }

    public void setData_history(ArrayList<Emp_data> data_history) {
        this.data_history = data_history;
    }
    
    public Emp_data addNewEmp(){
     Emp_data newEmp= new Emp_data ();
     data_history.add(newEmp);
     return  newEmp;
    }
        }