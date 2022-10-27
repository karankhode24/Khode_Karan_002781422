/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resources;

import models.City;
import models.Community;
import models.Hospital;
import view.MainJFrame;

/**
 *
 * @author karan
 */
public class CreateDefaultData {
    public static void createData() {
        
        // create city
        City boston = MainJFrame.cityDirectory.newCity("Boston");
        City worcester = MainJFrame.cityDirectory.newCity("Worcester");
        City springField = MainJFrame.cityDirectory.newCity("Springfield");
        City lowell = MainJFrame.cityDirectory.newCity("Lowell");
        City cambridge = MainJFrame.cityDirectory.newCity("Cambridge");
        City brockton = MainJFrame.cityDirectory.newCity("Brockton");
        
        // create community
        Community sb = MainJFrame.communityDirectory.newCommunity("South Boston", boston);
        Community jp = MainJFrame.communityDirectory.newCommunity("Jamaica Plain", boston);
        Community rn = MainJFrame.communityDirectory.newCommunity("Ranipura", worcester);
        Community vn = MainJFrame.communityDirectory.newCommunity("Vijay Nagar", worcester);
        Community gb = MainJFrame.communityDirectory.newCommunity("Geeta Bhawan", springField);
        Community ai = MainJFrame.communityDirectory.newCommunity("Airport", lowell);
        Community mr = MainJFrame.communityDirectory.newCommunity("MR10", lowell);
        Community cn = MainJFrame.communityDirectory.newCommunity("Chandan nagar", lowell);
        Community rw = MainJFrame.communityDirectory.newCommunity("Rajwada", cambridge);
        Community sn = MainJFrame.communityDirectory.newCommunity("Sudama nagar", cambridge);
        Community r = MainJFrame.communityDirectory.newCommunity("Rau", brockton);
        
        // create hospital
        Hospital a = MainJFrame.hospitalDirectory.newHospital("apple", "At bhawarkua", 452005, "637 sd", boston, sb);
        Hospital b = MainJFrame.hospitalDirectory.newHospital("gmc", "At bhopal", 452001, "637 sd", worcester, rn);
        Hospital c = MainJFrame.hospitalDirectory.newHospital("mgm", "At indore", 452002, "637 sd", springField, gb);
        Hospital d = MainJFrame.hospitalDirectory.newHospital("gurukripa", "At high court", 452003, "637 sd", lowell, mr);
        Hospital e = MainJFrame.hospitalDirectory.newHospital("mengo", "At nowhere", 452004, "637 sd", lowell, ai);
    }
}
