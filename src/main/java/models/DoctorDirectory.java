/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import java.util.ArrayList;

/**
 *
 * @author karan
 */
public class DoctorDirectory {
    ArrayList<Doctor> doctorList ;
    
    public DoctorDirectory (){
          
        doctorList = new ArrayList();

    }

    public Doctor newDoctor(String about, Hospital hospital) {

        Doctor d = new Doctor(about, hospital);
        doctorList.add(d);
        return d;
    }
    
    public ArrayList<Doctor> getDoctorList() {

        return doctorList;
    }

    public Doctor findDoctorByName(String name) {

        for (Doctor c : doctorList) {

            if (c.isMatch(name)) {
                return c;
            }
        }
            return null; //not found after going through the whole list
         }
}
