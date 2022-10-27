package models;

import java.util.ArrayList;

/**
 *
 * @author karan
 */
public class Patient {
    
    private int patientID;
    
    private String primaryDoctorName;
    private String prefferedPharmacy;
    private ArrayList<Encounter> encounterList = new ArrayList();
    private Person person;
    private House house;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }
    
    
    public int getPatientID() {
        return patientID;
    }
    
    public void setPatientID(int patientID) {
        this.patientID = patientID;
    }
    
    public String getPrimaryDoctorName() {
        return primaryDoctorName;
    }
    
    public void setPrimaryDoctorName(String primaryDoctorName) {
        this.primaryDoctorName = primaryDoctorName;
    }
    
    public String getPrefferedPharmacy() {
        return prefferedPharmacy;
    }
    
    public void setPrefferedPharmacy(String prefferedPharmacy) {
        this.prefferedPharmacy = prefferedPharmacy;
    }
    
}
