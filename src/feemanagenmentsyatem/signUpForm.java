/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package feemanagenmentsyatem;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Sakar
 */
public class signUpForm extends javax.swing.JFrame {

    /**
     * Creates new form signUpForm
     */
    public signUpForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        labelSignup = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelFirstName = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelLastName = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        labelConfirmPassword = new javax.swing.JLabel();
        labelDOB = new javax.swing.JLabel();
        labelContactNo = new javax.swing.JLabel();
        btnSignup = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        textFieldFirstName = new javax.swing.JTextField();
        textFieldEmail = new javax.swing.JTextField();
        textFiledContactNo = new javax.swing.JTextField();
        textFieldLastName = new javax.swing.JTextField();
        dateChooserDOB = new com.toedter.calendar.JDateChooser();
        textFieldConfirmPassword = new javax.swing.JPasswordField();
        textFieldPassword = new javax.swing.JPasswordField();
        errorMessageConfirmPassword = new javax.swing.JLabel();
        errorMessagePassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Fee Managenment Syatem");
        setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 51, 102));

        labelSignup.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        labelSignup.setForeground(new java.awt.Color(255, 255, 255));
        labelSignup.setText("Signup");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(labelSignup)
                .addContainerGap(517, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelSignup)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, -1));

        jPanel2.setBackground(new java.awt.Color(255, 153, 153));

        labelFirstName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelFirstName.setForeground(new java.awt.Color(255, 255, 255));
        labelFirstName.setText("Firstname :");

        labelEmail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelEmail.setForeground(new java.awt.Color(255, 255, 255));
        labelEmail.setText("Email :");

        labelLastName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelLastName.setForeground(new java.awt.Color(255, 255, 255));
        labelLastName.setText("Lastname :");

        labelPassword.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelPassword.setText("Password :");

        labelConfirmPassword.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelConfirmPassword.setForeground(new java.awt.Color(255, 255, 255));
        labelConfirmPassword.setText("Confirm Password :");

        labelDOB.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelDOB.setForeground(new java.awt.Color(255, 255, 255));
        labelDOB.setText("D.O.B :");

        labelContactNo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        labelContactNo.setForeground(new java.awt.Color(255, 255, 255));
        labelContactNo.setText("Contact no :");

        btnSignup.setBackground(new java.awt.Color(255, 0, 0));
        btnSignup.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSignup.setText("Signup");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(255, 0, 0));
        btnLogin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnLogin.setText("Login");

        textFieldFirstName.setCaretColor(new java.awt.Color(0, 0, 153));

        textFieldEmail.setCaretColor(new java.awt.Color(0, 0, 153));

        textFiledContactNo.setCaretColor(new java.awt.Color(0, 0, 153));

        textFieldLastName.setCaretColor(new java.awt.Color(0, 0, 153));

        textFieldPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                textFieldPasswordKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textFieldPasswordKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textFieldPasswordKeyTyped(evt);
            }
        });

        errorMessageConfirmPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        errorMessageConfirmPassword.setForeground(new java.awt.Color(255, 0, 0));

        errorMessagePassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        errorMessagePassword.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(labelLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(labelConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelContactNo)
                            .addComponent(btnSignup))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textFiledContactNo, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                                    .addComponent(dateChooserDOB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(btnLogin)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(textFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(textFieldPassword))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(errorMessageConfirmPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(errorMessagePassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelFirstName)
                    .addComponent(textFieldFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLastName)
                    .addComponent(textFieldLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFieldEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPassword)
                            .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(labelConfirmPassword)
                                .addComponent(textFieldConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(errorMessageConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelDOB)
                            .addComponent(dateChooserDOB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelContactNo)
                            .addComponent(textFiledContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSignup)
                            .addComponent(btnLogin)))
                    .addComponent(errorMessagePassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 960, 390));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    boolean validation(){
        String firstName;
        String lastName;
        String email;
        String password;
        String confirmPassword;
        Date dateOfBirth;
        String contactNo;
    
        
        firstName = textFieldFirstName.getText();
        lastName = textFieldLastName.getText();
        email = textFieldEmail.getText();
        password = textFieldPassword.getText();
        confirmPassword = textFieldConfirmPassword.getText();
        dateOfBirth = dateChooserDOB.getDate();
        contactNo = textFiledContactNo.getText();
        
        if(firstName.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Enter your Firstname!!!");
            return false;
        }
        if(lastName.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Enter your Lastname!!!");
            return false;
        }
        if(email.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Enter your Email Adddress!!!");
            return false;
        }
        if(password.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Enter your First Password!!!");
            return false;
        }
        if(confirmPassword.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Password doesnot match with your first password!!!");
            return false;
        }
        if(dateOfBirth == null)
        {
            JOptionPane.showMessageDialog(this, "Please Select your Birth Date!!!");
            return false;
        }
        if(contactNo.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Enter your valid Contact Number!!!");
            return false;
        }
        if(!password.contains(confirmPassword)){
            JOptionPane.showMessageDialog(this, "Fisrt password and second is not Matching!!!");
            return false;
        }
        if(!password.equals(confirmPassword)){
            JOptionPane.showMessageDialog(this, "First password and second is not Matching");
            return false;
        }
        return true;
    }
    public void passwordCheck(){
        String password;
        password = textFieldPassword.getText();
        if(password.length()<8)
        {
            errorMessagePassword.setText("Please enter minimum 8 character password");
        }
        else{
            errorMessagePassword.setText("");
        }
    }
    
    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        validation();
        passwordCheck();
    }//GEN-LAST:event_btnSignupActionPerformed

    private void textFieldPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldPasswordKeyPressed
        passwordCheck();
    }//GEN-LAST:event_textFieldPasswordKeyPressed

    private void textFieldPasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldPasswordKeyReleased
        passwordCheck();
    }//GEN-LAST:event_textFieldPasswordKeyReleased

    private void textFieldPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textFieldPasswordKeyTyped
        passwordCheck();
    }//GEN-LAST:event_textFieldPasswordKeyTyped

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
            java.util.logging.Logger.getLogger(signUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(signUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(signUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(signUpForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new signUpForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignup;
    private com.toedter.calendar.JDateChooser dateChooserDOB;
    private javax.swing.JLabel errorMessageConfirmPassword;
    private javax.swing.JLabel errorMessagePassword;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel labelConfirmPassword;
    private javax.swing.JLabel labelContactNo;
    private javax.swing.JLabel labelDOB;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelFirstName;
    private javax.swing.JLabel labelLastName;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelSignup;
    private javax.swing.JPasswordField textFieldConfirmPassword;
    private javax.swing.JTextField textFieldEmail;
    private javax.swing.JTextField textFieldFirstName;
    private javax.swing.JTextField textFieldLastName;
    private javax.swing.JPasswordField textFieldPassword;
    private javax.swing.JTextField textFiledContactNo;
    // End of variables declaration//GEN-END:variables
}
