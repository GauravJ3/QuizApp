/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myquizapp.gui;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import myquizapp.dao.UserDAO;
import myquizapp.dbutil.DBConnection;
import myquizapp.pojo.User;
import myquizapp.pojo.UserProfile;

/**
 *
 * @author Windows
 */
public class UserLoginScreen extends javax.swing.JFrame {
private String username;
private String password;
    /**
     * Creates new form UserLoginScreen
     */
    public UserLoginScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        btnQuit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jrAdmin = new javax.swing.JRadioButton();
        jrStudent = new javax.swing.JRadioButton();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 0));
        jLabel1.setText("User Login Screen");

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 0));
        jLabel2.setText("UserName:");

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 0));
        jLabel3.setText("Password:");

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 0, 0));
        btnLogin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 0, 51));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnQuit.setBackground(new java.awt.Color(0, 0, 0));
        btnQuit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnQuit.setForeground(new java.awt.Color(255, 0, 51));
        btnQuit.setText("Quit");
        btnQuit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitActionPerformed(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 0));
        jLabel4.setText("User Type");

        jrAdmin.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrAdmin);
        jrAdmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrAdmin.setForeground(new java.awt.Color(255, 51, 51));
        jrAdmin.setText("Admin");
        jrAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrAdminActionPerformed(evt);
            }
        });

        jrStudent.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroup1.add(jrStudent);
        jrStudent.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jrStudent.setForeground(new java.awt.Color(255, 51, 51));
        jrStudent.setText("Student");
        jrStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrAdmin)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(btnLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsername)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrStudent)
                                    .addComponent(btnQuit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnQuit))
                .addGap(53, 53, 53)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrAdmin)
                    .addComponent(jrStudent))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnQuitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitActionPerformed

        int ans;
        ans=JOptionPane.showConfirmDialog(null,"Are you sure want to quit?","Quitting",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(ans==JOptionPane.YES_OPTION)
        {
            DBConnection.closeConnection();
            System.exit(0);
        }
    }//GEN-LAST:event_btnQuitActionPerformed

    private void jrAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrAdminActionPerformed
        
    }//GEN-LAST:event_jrAdminActionPerformed

    private void jrStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jrStudentActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        boolean isValidInput=validateInput();
        if(validateInput()==false){
            JOptionPane.showMessageDialog(null,"Please Input UserName or Password","Empty Fields!",JOptionPane.ERROR_MESSAGE);
            return;
        }
            String userType=getUserType();
            if(userType==null)
                {
                    JOptionPane.showMessageDialog(null,"Please Choose userType","Error",JOptionPane.ERROR_MESSAGE);
                    return;
                }
                try{
                    User user=new User();
                    user.setUSERID(username);                   
                    user.setPASSWORD(password);
                    user.setUSERTYPE(userType);
                    boolean isValidUser=UserDAO.validateUser(user);
                    if(isValidUser)
                    {
                   JOptionPane.showMessageDialog(null,"Login Accepted","Welcome "+username,JOptionPane.INFORMATION_MESSAGE);
                   UserProfile.setUsername(username);
                   UserProfile.setUsertype(userType);
                   if(user.getUSERTYPE().equalsIgnoreCase("Admin"))
                    {
                    AdminOptions admin=new AdminOptions();
                   
                   admin.setVisible(true);
                    }
                    else{
                       
                   StudentOptions student=new StudentOptions();
                   student.setVisible(true);
                   
                     }
                    this.dispose();
                    } 
                    else
                        JOptionPane.showMessageDialog(null,"InValid username/Password","login denied",JOptionPane.ERROR_MESSAGE);
                    }
                catch(SQLException e){
                    JOptionPane.showMessageDialog(null, "Error Connecting DataBase"+e,"ERROR!",JOptionPane.ERROR_MESSAGE);
                    e.printStackTrace();
                }
  
               
    }//GEN-LAST:event_btnLoginActionPerformed

    //private String getUserType(){}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserLoginScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnQuit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jrAdmin;
    private javax.swing.JRadioButton jrStudent;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
private boolean validateInput()
{
username=txtUsername.getText();
char []pwd=txtPassword.getPassword();
if(username.isEmpty()||pwd.length==0)
    return false;
else{
    password=String.valueOf(pwd);
    return true;
    }
}

private String getUserType(){
if(jrAdmin.isSelected())
    return jrAdmin.getText();
else if(jrStudent.isSelected())
    return jrStudent.getText();
else
    return null;
}

}