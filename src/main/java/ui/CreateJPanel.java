package ui;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import model.EmployeesHistory;
import javax.swing.JOptionPane;
import model.EmployeeDetails;
        


/**
 *
 * @author Karan
 */
public class CreateJPanel extends javax.swing.JPanel { 

    /**
     * Creates new form CreateJPanel
     */
    EmployeesHistory history;
    Validations validations = new Validations();
    File file = new File("src/main/java/images/default002781422.jpg");
    
    public CreateJPanel(EmployeesHistory history) {
        initComponents();
        showProfilePic(file);
        
        this.history = history;
        
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGender = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblEmployeeId = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblTeamInfo = new javax.swing.JLabel();
        lblPositionTitle = new javax.swing.JLabel();
        lblPhoneNumber = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtEmployeeId = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtTeamInfo = new javax.swing.JTextField();
        txtPositionTitle = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnMale = new javax.swing.JRadioButton();
        btnFemale = new javax.swing.JRadioButton();
        btnUpload = new java.awt.Button();
        btnOther = new javax.swing.JRadioButton();
        valName = new javax.swing.JLabel();
        valEmpid = new javax.swing.JLabel();
        valAge = new javax.swing.JLabel();
        valGender = new javax.swing.JLabel();
        valTeaminfo = new javax.swing.JLabel();
        valPosition = new javax.swing.JLabel();
        valPhone = new javax.swing.JLabel();
        valEmail = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblPhoto = new javax.swing.JLabel();
        lblShowPhoto = new javax.swing.JLabel();
        lblLevel = new javax.swing.JLabel();
        txtLevel = new javax.swing.JTextField();
        lblDoj = new javax.swing.JLabel();
        valLevel = new javax.swing.JLabel();
        valDoj = new javax.swing.JLabel();
        txtDoj = new com.github.lgooddatepicker.components.DatePicker();

        setBackground(new java.awt.Color(153, 255, 255));

        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Enter Employee Details");
        lblTitle.setFont(new java.awt.Font("Cochin", 1, 24)); // NOI18N

        lblName.setText("Name:");
        lblName.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        lblEmployeeId.setText("Employee ID:");
        lblEmployeeId.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        lblAge.setText("Age:");
        lblAge.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        lblGender.setText("Gender:");
        lblGender.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        lblTeamInfo.setText("Team Info:");
        lblTeamInfo.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        lblPositionTitle.setText("Position Title:");
        lblPositionTitle.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        lblPhoneNumber.setText("Phone Number:");
        lblPhoneNumber.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNameKeyReleased(evt);
            }
        });

        txtEmployeeId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmployeeIdKeyReleased(evt);
            }
        });

        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtAgeKeyReleased(evt);
            }
        });

        txtTeamInfo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTeamInfoKeyReleased(evt);
            }
        });

        txtPositionTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPositionTitleKeyReleased(evt);
            }
        });

        txtPhoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPhoneNumberKeyReleased(evt);
            }
        });

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEmailKeyReleased(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnGender.add(btnMale);
        btnMale.setText("Male");
        btnMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaleActionPerformed(evt);
            }
        });

        btnGender.add(btnFemale);
        btnFemale.setText("Female");
        btnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFemaleActionPerformed(evt);
            }
        });

        btnUpload.setActionCommand("Upload");
        btnUpload.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUpload.setFont(new java.awt.Font("Arial Unicode MS", 1, 14)); // NOI18N
        btnUpload.setLabel("Upload");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        btnGender.add(btnOther);
        btnOther.setText("Other");
        btnOther.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOtherActionPerformed(evt);
            }
        });

        valName.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valName.setForeground(new java.awt.Color(255, 0, 0));

        valEmpid.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valEmpid.setForeground(new java.awt.Color(255, 0, 0));

        valAge.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valAge.setForeground(new java.awt.Color(255, 0, 0));

        valGender.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valGender.setForeground(new java.awt.Color(255, 0, 0));

        valTeaminfo.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valTeaminfo.setForeground(new java.awt.Color(255, 0, 0));

        valPosition.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valPosition.setForeground(new java.awt.Color(255, 0, 0));

        valPhone.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valPhone.setForeground(new java.awt.Color(255, 0, 0));

        valEmail.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valEmail.setForeground(new java.awt.Color(255, 0, 0));

        lblEmail.setText("Email:");
        lblEmail.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        lblPhoto.setText("Profile Picture:");
        lblPhoto.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        lblShowPhoto.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));

        lblLevel.setText("Level:");
        lblLevel.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        txtLevel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLevelKeyReleased(evt);
            }
        });

        lblDoj.setText("Date of Joining:");
        lblDoj.setFont(new java.awt.Font("Cambria", 0, 18)); // NOI18N

        valLevel.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valLevel.setForeground(new java.awt.Color(255, 0, 0));

        valDoj.setFont(new java.awt.Font("Helvetica Neue", 2, 13)); // NOI18N
        valDoj.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(lblName))
                    .addComponent(lblEmployeeId)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(lblAge)))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(valName, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valEmpid, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valAge, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addComponent(lblShowPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(lblGender)
                .addGap(99, 99, 99)
                .addComponent(btnMale)
                .addGap(12, 12, 12)
                .addComponent(btnFemale)
                .addGap(12, 12, 12)
                .addComponent(btnOther)
                .addGap(52, 52, 52)
                .addComponent(valGender, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(lblPhoto)
                .addGap(10, 10, 10)
                .addComponent(btnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(lblTeamInfo)
                .addGap(99, 99, 99)
                .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(valTeaminfo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblPositionTitle)
                .addGap(99, 99, 99)
                .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(valPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lblPhoneNumber)
                .addGap(99, 99, 99)
                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(valPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(lblEmail)
                .addGap(99, 99, 99)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(valEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(btnSave))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(lblLevel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(lblDoj)))
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtDoj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(valDoj, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(valLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addGap(21, 21, 21)
                        .addComponent(lblEmployeeId)
                        .addGap(18, 18, 18)
                        .addComponent(lblAge))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(txtEmployeeId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(valName, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(valEmpid, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(valAge, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblShowPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(lblGender))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnMale))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnFemale))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnOther))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(valGender, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPhoto)
                    .addComponent(btnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTeamInfo)
                    .addComponent(txtTeamInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(valTeaminfo, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPositionTitle)
                    .addComponent(txtPositionTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(valPosition, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPhoneNumber)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(valPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(valEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblLevel))
                    .addComponent(txtLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(valLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDoj, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtDoj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(valDoj, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(btnSave))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        
        var valid = true;
             
        // Validations
        
        if (!this.validations.ValidateName(txtName.getText()) ) {
            valName.setText("Name is Invalid");
            valid = false;
        }
        
        if (!this.validations.ValidateEmail(txtEmail.getText()) ) {
            valEmail.setText("Email address is Invalid");
            valid = false;
        }
        
        for (EmployeeDetails ed : history.getHistory()){
            System.out.println("ed.getEmail()");
            if (txtEmail.getText().equals(ed.getEmail())) {
                valEmail.setText("Email address already exist");
                valid = false;
            }
            
        }
        
        if (!this.validations.ValidatePhoneNumber(txtPhoneNumber.getText()) ) {
            valPhone.setText("Phone Number is Invalid");
            valid = false;
        }
        
        if (!this.validations.ValidateAge(txtAge.getText()) ) {
            valAge.setText("Age is Invalid");
            valid = false;
        }
        
        if (!this.validations.ValidateEmployeeId(txtEmployeeId.getText()) ) {
            valEmpid.setText("Employee ID is required in integer");
            valid = false;
        }
        
        if (!this.validations.ValidateLevel(txtLevel.getText()) ) {
            valLevel.setText("Level is required in integer");
            valid = false;
        }
        
        if (!this.validations.ValidateDate(txtDoj.getDateStringOrEmptyString()) ) {
            valDoj.setText("Date of joining is required");
            valid = false;
        }
        
        if (!this.validations.ValidatePositionTitle(txtPositionTitle.getText()) ) {
            valPosition.setText("Position Title is required");
            valid = false;
        }
        
        if (!this.validations.ValidateTeamInfo(txtTeamInfo.getText()) ) {
            valTeaminfo.setText("Team Info is required");
            valid = false;
        }
        
        if (btnGender.getSelection() == null) {
            valGender.setText("Gender is required");
            valid = false;
        }
        
        // Validations ended
        
        if (valid) {
            
            String profilePic;
            if (!"default002781422.jpg".equals(file.getName())) {
                String nameExt = file.getName().substring(file.getName().lastIndexOf("."));
                profilePic = "src/main/java/images/" + txtEmail.getText() + nameExt;
                String ext = file.getName().substring(file.getName().lastIndexOf(".") + 1);
                BufferedImage data = null;
                try {
                    data = ImageIO.read(file);
                } catch (IOException ex) {
                    Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
                File outputfile = new File(profilePic);
                try {
                    ImageIO.write(data, ext, outputfile);
                 } catch(IOException e) {
                  System.out.println("Write error for " + file.getPath() +
                                                ": " + e.getMessage());
                   }
            }
            else {
                profilePic = "src/main/java/images/default002781422.jpg";
            }
            
            String gender;
            if (btnMale.isSelected()) {
                gender = "Male";
            }
            else if (btnFemale.isSelected()) {
                gender = "Female";
            }
            else {
                gender = "Other";
            }
            
            // Get variables
            String name = txtName.getText();
            int employeeId = Integer.parseInt(txtEmployeeId.getText());
            int age = Integer.parseInt(txtAge.getText());
            String teamInfo = txtTeamInfo.getText();
            String positionTitle = txtPositionTitle.getText();
            String phoneNumber = txtPhoneNumber.getText();
            String email = txtEmail.getText();
            int level = Integer.parseInt(txtLevel.getText());
            Date date;
            
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-M-dd");
            
            try {
                date = formatter.parse(txtDoj.getDateStringOrEmptyString());
            } catch (ParseException ex) {
                date = new Date(10, 10, 1970);
                Logger.getLogger(CreateJPanel.class.getName()).log(Level.SEVERE, null, ex);
            }

            // Create Object
            EmployeeDetails ed = history.addNewDetails();

            // Set value
            ed.setName(name);
            ed.setEmployeeId(employeeId);
            ed.setAge(age);
            ed.setGender(gender);
            ed.setTeamInfo(teamInfo);
            ed.setPositionTitle(positionTitle);
            ed.setPhoneNumber(phoneNumber);
            ed.setEmail(email);
            ed.setLevel(level);
            ed.setDate(date);
            ed.setProfilePic(profilePic);
            

            JOptionPane.showMessageDialog(this, "New Employee Details Added");

            txtName.setText(null);
            txtEmployeeId.setText(null);
            txtAge.setText(null);
            btnGender.clearSelection();
            txtTeamInfo.setText(null);
            txtPositionTitle.setText(null);
            txtPhoneNumber.setText(null);
            txtEmail.setText(null);
            txtLevel.setText(null);
            txtDoj.setDate(null);
            valAge.setText(null);
            valEmail.setText(null);
            valEmpid.setText(null);
            valGender.setText(null);
            valName.setText(null);
            valPhone.setText(null);
            valPosition.setText(null);
            valTeaminfo.setText(null);
            valDoj.setText(null);
            valLevel.setText(null);
            
            File setFile = new File("src/main/java/images/default002781422.jpg");
            showProfilePic(setFile);
        }  
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaleActionPerformed
        valGender.setText(null);
    }//GEN-LAST:event_btnMaleActionPerformed

    private void btnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFemaleActionPerformed
        valGender.setText(null);
    }//GEN-LAST:event_btnFemaleActionPerformed

    private void btnOtherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOtherActionPerformed
        valGender.setText(null);
    }//GEN-LAST:event_btnOtherActionPerformed

    private void txtNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyReleased
        
        if (!this.validations.ValidateName(txtName.getText()) ) {
            valName.setText("Name is Invalid");
        }
        else {
            valName.setText(null);
        }
    }//GEN-LAST:event_txtNameKeyReleased

    private void txtEmailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyReleased
        // TODO add your handling code here:
        if (!this.validations.ValidateEmail(txtEmail.getText()) ) {
            valEmail.setText("Email address is Invalid");
        }
        else {
            valEmail.setText(null);
        }
        for (EmployeeDetails ed : history.getHistory()){
            if (txtEmail.getText().equals(ed.getEmail())) {
                valEmail.setText("Email address already exist");
            }
        }
    }//GEN-LAST:event_txtEmailKeyReleased

    private void txtPhoneNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNumberKeyReleased
        
        if (!this.validations.ValidatePhoneNumber(txtPhoneNumber.getText()) ) {
            valPhone.setText("Phone Number is Invalid");
        }
        else {
            valPhone.setText(null);
        }
    }//GEN-LAST:event_txtPhoneNumberKeyReleased

    private void txtAgeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyReleased

        if (!this.validations.ValidateAge(txtAge.getText()) ) {
            valAge.setText("Age is Invalid");
        }
        else {
            valAge.setText(null);
        }
    }//GEN-LAST:event_txtAgeKeyReleased

    private void txtEmployeeIdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmployeeIdKeyReleased

        if (!this.validations.ValidateEmployeeId(txtEmployeeId.getText()) ) {
            valEmpid.setText("Employee ID is required in integer");
        }
        else {
            valEmpid.setText(null);
        }
    }//GEN-LAST:event_txtEmployeeIdKeyReleased

    private void txtTeamInfoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTeamInfoKeyReleased
        if (!this.validations.ValidateTeamInfo(txtTeamInfo.getText()) ) {
            valTeaminfo.setText("Team Info is required");
        }
        else {
            valTeaminfo.setText(null);
        }
    }//GEN-LAST:event_txtTeamInfoKeyReleased

    private void txtPositionTitleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPositionTitleKeyReleased
        if (!this.validations.ValidatePositionTitle(txtPositionTitle.getText()) ) {
            valPosition.setText("Position Title is required");
        }
        else {
            valPosition.setText(null);
        }
    }//GEN-LAST:event_txtPositionTitleKeyReleased

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        JFileChooser filechooser = new JFileChooser();
        filechooser.setDialogTitle("Choose Your File");
        filechooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnval = filechooser.showOpenDialog(this);
        if (returnval == JFileChooser.APPROVE_OPTION)
        {
            file = filechooser.getSelectedFile();
            showProfilePic(file);
        }
    }//GEN-LAST:event_btnUploadActionPerformed

    private void txtLevelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLevelKeyReleased
        if (!this.validations.ValidateLevel(txtLevel.getText()) ) {
            valLevel.setText("Level is required in integer");
        }
        else {
            valLevel.setText(null);
        }
    }//GEN-LAST:event_txtLevelKeyReleased

    private void txtDojKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDojKeyReleased
        if (!this.validations.ValidateDate(txtDoj.getDateStringOrEmptyString()) ) {
            valDoj.setText("Date of joining is required");
        }
        else {
            valDoj.setText(null);
        }
    }//GEN-LAST:event_txtDojKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton btnFemale;
    private javax.swing.ButtonGroup btnGender;
    private javax.swing.JRadioButton btnMale;
    private javax.swing.JRadioButton btnOther;
    private javax.swing.JButton btnSave;
    private java.awt.Button btnUpload;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblDoj;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmployeeId;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblLevel;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblPhoto;
    private javax.swing.JLabel lblPositionTitle;
    private javax.swing.JLabel lblShowPhoto;
    private javax.swing.JLabel lblTeamInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtAge;
    private com.github.lgooddatepicker.components.DatePicker txtDoj;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtEmployeeId;
    private javax.swing.JTextField txtLevel;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtPositionTitle;
    private javax.swing.JTextField txtTeamInfo;
    private javax.swing.JLabel valAge;
    private javax.swing.JLabel valDoj;
    private javax.swing.JLabel valEmail;
    private javax.swing.JLabel valEmpid;
    private javax.swing.JLabel valGender;
    private javax.swing.JLabel valLevel;
    private javax.swing.JLabel valName;
    private javax.swing.JLabel valPhone;
    private javax.swing.JLabel valPosition;
    private javax.swing.JLabel valTeaminfo;
    // End of variables declaration//GEN-END:variables

    private void showProfilePic(File file) {
        BufferedImage bi;
        try {
            // display the image in a Jlabel
            
            bi = ImageIO.read(file);
            BufferedImage tempImg = new BufferedImage(95, 95, BufferedImage.TYPE_INT_ARGB);
            Graphics2D gr = tempImg.createGraphics();

            gr.drawImage(bi, 0, 0, 95, 95, null);
            gr.dispose();
            lblShowPhoto.setIcon(new ImageIcon(tempImg));
        } catch(IOException e) {
            System.out.println(e);

        }
    }
}