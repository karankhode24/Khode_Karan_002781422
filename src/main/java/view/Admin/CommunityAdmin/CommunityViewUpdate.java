/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view.Admin.CommunityAdmin;

import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import models.City;
import models.Community;
import view.MainJFrame;

/**
 *
 * @author karan
 */
public class CommunityViewUpdate extends javax.swing.JPanel {

    /**
     * Creates new form CommunityViewUpdate
     */
    City city;
    Vector originalTableModel;
    
    public CommunityViewUpdate() {
        initComponents();
        MainJFrame.defaultSearchText(txtSearch, "Search by city or community");
        
        populateTable();
        originalTableModel = (Vector) ((DefaultTableModel) tblDetails.getModel()).getDataVector().clone();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        lblCommunityRecord = new javax.swing.JLabel();
        btn_create = new javax.swing.JButton();
        lblCity = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        valCommunity = new javax.swing.JLabel();

        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Community", "City", "object"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDetails);
        if (tblDetails.getColumnModel().getColumnCount() > 0) {
            tblDetails.getColumnModel().getColumn(2).setMinWidth(0);
            tblDetails.getColumnModel().getColumn(2).setPreferredWidth(0);
            tblDetails.getColumnModel().getColumn(2).setMaxWidth(0);
        }

        lblCommunityRecord.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 24)); // NOI18N
        lblCommunityRecord.setText("Community record");

        btn_create.setText("Create");
        btn_create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblCity.setText("City : ");

        lblCommunity.setFont(new java.awt.Font("Hiragino Mincho ProN", 1, 18)); // NOI18N
        lblCommunity.setText("Community :");

        txtCity.setEditable(false);

        txtCommunity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCommunityKeyReleased(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });

        valCommunity.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valCommunity.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnUpdate)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCity)
                                .addComponent(lblCommunity))
                            .addGap(49, 49, 49)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                .addComponent(txtCommunity))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCommunityRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(txtSearch))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addComponent(btn_create))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(valCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(109, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCommunityRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_create))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCommunity)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(valCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnUpdate)
                .addContainerGap(150, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btn_createActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createActionPerformed
        
        JFrame parent = (JFrame) SwingUtilities.getWindowAncestor(this);
        parent.dispose();
        CommunityAdmin adminArea = new CommunityAdmin();
        adminArea.setVisible(true);
        adminArea.setCreateView();
        
    }//GEN-LAST:event_btn_createActionPerformed

    private void tblDetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDetailsMouseClicked
        
        DefaultTableModel tblModel = (DefaultTableModel) tblDetails.getModel();
        
                // set data to textfield when raw is selected
        
        String tblCommunity = tblModel.getValueAt(tblDetails.getSelectedRow(),0).toString();
        String tblCity = tblModel.getValueAt(tblDetails.getSelectedRow(),1).toString();

        txtCity.setText(tblCity);
        txtCommunity.setText(tblCommunity);
        
    }//GEN-LAST:event_tblDetailsMouseClicked

    private void txtCommunityKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCommunityKeyReleased
        
        city = MainJFrame.cityDirectory.newCity(txtCity.getText());
        DefaultTableModel tblModel = (DefaultTableModel) tblDetails.getModel();
        String tblCommunity = tblModel.getValueAt(tblDetails.getSelectedRow(),0).toString();
        
        if (txtCommunity.getText().isEmpty()) {
            valCommunity.setText("Community name is required");
        } else if (MainJFrame.communityDirectory.isOtherCommunityByCityExist(city, txtCommunity.getText(), tblCommunity)) {
            valCommunity.setText("Community name already exist for this city");
        } else {
            valCommunity.setText(null);
        }
    }//GEN-LAST:event_txtCommunityKeyReleased

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        DefaultTableModel model = (DefaultTableModel)tblDetails.getModel();
        
        model.setRowCount(0);
        for (Object rows : originalTableModel) {
            Vector rowVector = (Vector) rows;
            for (Object column : rowVector) {
                if (column.toString().toLowerCase().contains(txtSearch.getText())) {
                    //content found so adding to table
                    model.addRow(rowVector);
                    break;
                }
            }

        }
    }//GEN-LAST:event_txtSearchKeyReleased

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        int selectRowIndex = tblDetails.getSelectedRow();
        if (selectRowIndex<0){
             JOptionPane.showMessageDialog(this, "Please select a row to update");
             return;
         }
        DefaultTableModel model = (DefaultTableModel)tblDetails.getModel();
        Community selectedDetails = (Community) model.getValueAt(selectRowIndex, 2);
        
        // Validation
        var valid = true;
        
        // Validations
        if (txtCommunity.getText().isEmpty()) {
            valCommunity.setText("Community name is required");
            valid = false;
        }
        
        if (MainJFrame.communityDirectory.isOtherCommunityByCityExist(city, txtCommunity.getText(), selectedDetails.getName())){
            valCommunity.setText("Community name already exist for this city");
            valid = false;
        } 
        
        
        // Validations ended
        
        if (valid) {

            // Set value
            selectedDetails.setName(txtCommunity.getText());
            
            JOptionPane.showMessageDialog(this, "Updated the details successfully");
            
            populateTable();
            originalTableModel = (Vector) ((DefaultTableModel) tblDetails.getModel()).getDataVector().clone();
            valCommunity.setText(null);
            txtCity.setText(null);
            txtCommunity.setText(null);
            
        }
    }//GEN-LAST:event_btnUpdateActionPerformed
    
    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblDetails.getModel();
        model.setRowCount(0);
        
        for (Community c : MainJFrame.communityDirectory.getDirectory()){
            Object[] row = new Object[3];
            row[2] = c;
            row[0] = c.getName();
            row[1] = c.getCity().getName();
            
            model.addRow(row);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btn_create;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblCommunityRecord;
    private javax.swing.JTable tblDetails;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel valCommunity;
    // End of variables declaration//GEN-END:variables
}
