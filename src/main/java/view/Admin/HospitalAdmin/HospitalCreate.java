/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.Admin.HospitalAdmin;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import models.City;
import models.Community;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import view.MainJFrame;
import resources.Validations;

/**
 *
 * @author karan
 */
public class HospitalCreate extends javax.swing.JPanel {

    /**
     * Creates new form HospitalCreate
     */
    
    City city;
    Community community;
    Validations validations;
    public HospitalCreate() {
        initComponents();
        validations = new Validations();
        
        AutoCompleteDecorator.decorate(ddCity);
        AutoCompleteDecorator.decorate(ddCommunity);
            
        ddCity.addItem("");
        for (City city: MainJFrame.cityDirectory.getCityList()) {
            ddCity.addItem(city.getName());
        }
        ddCity.setSelectedItem("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAbout = new javax.swing.JTextField();
        valName = new javax.swing.JLabel();
        valCity = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        valCommunity = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        ddCity = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        ddCommunity = new javax.swing.JComboBox<>();
        lblAbout = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        valAbout = new javax.swing.JLabel();
        lblZipCode = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        txtZipCode = new javax.swing.JTextField();
        valAddress = new javax.swing.JLabel();
        valZipCode = new javax.swing.JLabel();

        txtAbout.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAboutKeyReleased(evt);
            }
        });

        valName.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valName.setForeground(new java.awt.Color(255, 0, 0));

        valCity.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valCity.setForeground(new java.awt.Color(255, 0, 0));

        lblCity.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblCity.setText("City : ");

        valCommunity.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valCommunity.setForeground(new java.awt.Color(255, 0, 0));

        lblCommunity.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblCommunity.setText("Community :");

        ddCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddCityActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setText("<- Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        ddCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ddCommunityActionPerformed(evt);
            }
        });

        lblAbout.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblAbout.setText("About :");

        lblName.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblName.setText("Name :");

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        valAbout.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valAbout.setForeground(new java.awt.Color(255, 0, 0));

        lblZipCode.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblZipCode.setText("Zip Code :");

        lblAddress.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblAddress.setText("Address :");

        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAddressKeyReleased(evt);
            }
        });

        txtZipCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtZipCodeKeyReleased(evt);
            }
        });

        valAddress.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valAddress.setForeground(new java.awt.Color(255, 0, 0));

        valZipCode.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valZipCode.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddress)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCity)
                            .addComponent(lblCommunity)
                            .addComponent(lblName)
                            .addComponent(lblAbout)
                            .addComponent(lblZipCode))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(valZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ddCity, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(valCity, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ddCommunity, javax.swing.GroupLayout.Alignment.LEADING, 0, 212, Short.MAX_VALUE))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valName, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(btnBack)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnSave))
                                        .addComponent(txtAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(valAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(valAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valCity, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCity)
                        .addComponent(ddCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCommunity)
                        .addComponent(ddCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(valCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblName)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(valName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAbout)
                        .addComponent(txtAbout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(valAbout, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAddress)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(valAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblZipCode)
                        .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(valZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnSave))
                .addContainerGap(84, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAboutKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAboutKeyReleased
        if (!this.validations.ValidateAbout(txtAbout.getText()) ) {
            valAbout.setText("Details are required");
        }
        else {
            valAbout.setText(null);
        }
    }//GEN-LAST:event_txtAboutKeyReleased

    private void ddCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddCityActionPerformed

        String city_name;
        try {
            city_name = ddCity.getSelectedItem().toString();
        } catch (Exception e) {
            city_name = "";
        }

        if ("".equals(city_name)) {
            valCity.setText("Please Select City");
            ddCommunity.removeAllItems();
            valName.setText(null);
        } else {
            valCity.setText(null);
            ddCommunity.removeAllItems();
            city = MainJFrame.cityDirectory.findCity(city_name);
            ArrayList<Community> communityList = MainJFrame.communityDirectory.searchCommunitiesByCityObject(city);

            ddCommunity.addItem("");
            for (Community c: communityList) {
                ddCommunity.addItem(c.getName());
            }
            ddCommunity.setSelectedItem("");
        }
    }//GEN-LAST:event_ddCityActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

        var valid = true;
        
        if (ddCity.getSelectedItem() == null || ddCity.getSelectedItem().toString().isEmpty()) {
            valCity.setText("Please Select City");
            valid = false;
        }

        if (ddCommunity.getSelectedItem() == null || ddCommunity.getSelectedItem().toString().isEmpty()) {
            valCommunity.setText("Please Select Community");
            valid = false;
        } 
        
        if (!this.validations.ValidateName(txtName.getText()) ) {
            valName.setText("Name is Invalid");
            valid = false;
        } else if (!(city == null) && MainJFrame.hospitalDirectory.isHospitalExistInCity(txtName.getText(), city)) {
            valName.setText("Hospital already Exist");
            valid = false;
        }
        
        if (!this.validations.ValidateAbout(txtAbout.getText()) ) {
            valAbout.setText("Details are required");
            valid = false;
        }
        
        if (!this.validations.ValidateAddress(txtAddress.getText()) ) {
            valAddress.setText("Address is required");
            valid = false;
        }
        
        if (!this.validations.ValidateZip(txtZipCode.getText()) ) {
            valZipCode.setText("Zip Code is invalid");
            valid = false;
        }
       
//
        if (valid) {
            MainJFrame.hospitalDirectory.newHospital(txtName.getText(), txtAbout.getText(), Integer.parseInt(txtZipCode.getText()), txtAddress.getText(), city, community);
            JOptionPane.showMessageDialog(this, "Hospital Added");
            ddCity.setSelectedItem("");
            ddCommunity.setSelectedItem("");
            txtName.setText(null);
            txtAbout.setText(null);
            txtAddress.setText(null);
            txtZipCode.setText(null);
            valCity.setText(null);
            valCommunity.setText(null);
            valName.setText(null);
            valAbout.setText(null);
            valAddress.setText(null);
            valZipCode.setText(null);
                    
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);
        parent.dispose();
        HospitalAdminJFrame adminArea = new HospitalAdminJFrame();
        adminArea.setVisible(true);
    }//GEN-LAST:event_btnBackActionPerformed

    private void ddCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ddCommunityActionPerformed

        String city_name;
        String community_name;
        try {
            city_name = ddCity.getSelectedItem().toString();
        } catch (Exception e) {
            city_name = "";
        }

        try {
            community_name = ddCommunity.getSelectedItem().toString();
        } catch (Exception e) {
            community_name = "";
        }

        if ("".equals(community_name)) {
            valCommunity.setText("Please Select Community");
            valName.setText(null);
        } else {
            valCommunity.setText(null);
            community = MainJFrame.communityDirectory.getCommunity(city_name, community_name);
            valName.setText(null);
        }
    }//GEN-LAST:event_ddCommunityActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        
        if (!this.validations.ValidateName(txtName.getText()) ) {
            valName.setText("Name is Invalid");
        } else if (!(city == null) && MainJFrame.hospitalDirectory.isHospitalExistInCity(txtName.getText(), city)) {
            valName.setText("Hospital already Exist");
        }
        else {
            valName.setText(null);
        }
        
        
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtAddressKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyReleased
        if (!this.validations.ValidateAddress(txtAddress.getText()) ) {
            valAddress.setText("Address is required");
        }
        else {
            valAddress.setText(null);
        }
    }//GEN-LAST:event_txtAddressKeyReleased

    private void txtZipCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipCodeKeyReleased
        if (!this.validations.ValidateZip(txtZipCode.getText()) ) {
            valZipCode.setText("Zip Code is invalid");
        }
        else {
            valZipCode.setText(null);
        }
    }//GEN-LAST:event_txtZipCodeKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> ddCity;
    private javax.swing.JComboBox<String> ddCommunity;
    private javax.swing.JLabel lblAbout;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JTextField txtAbout;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtZipCode;
    private javax.swing.JLabel valAbout;
    private javax.swing.JLabel valAddress;
    private javax.swing.JLabel valCity;
    private javax.swing.JLabel valCommunity;
    private javax.swing.JLabel valName;
    private javax.swing.JLabel valZipCode;
    // End of variables declaration//GEN-END:variables
}
