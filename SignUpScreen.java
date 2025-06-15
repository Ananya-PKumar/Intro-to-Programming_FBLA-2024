/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gpacalculator;

//import java.sql.Connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class SignUpScreen extends javax.swing.JFrame {

    public SignUpScreen() {
        initComponents();
        setSize(1059, 811);
        setLocation(600, 100);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        usernameText = new javax.swing.JTextField();
        idTitle = new javax.swing.JLabel();
        passwordTitle = new javax.swing.JLabel();
        passwordText = new javax.swing.JPasswordField();
        signUpButton = new javax.swing.JButton();
        errorSignUp = new javax.swing.JLabel();
        signUpTitle = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        gpaCalcLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        confirmPassTitle = new javax.swing.JLabel();
        confirmPasswordText = new javax.swing.JPasswordField();
        teacherTitle = new javax.swing.JLabel();
        teacherText = new javax.swing.JTextField();
        idTitle1 = new javax.swing.JLabel();
        idTitle2 = new javax.swing.JLabel();
        idTitle3 = new javax.swing.JLabel();
        idTitle4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(59, 88, 171));
        jPanel1.setForeground(new java.awt.Color(59, 88, 171));

        jLabel2.setText("logo");

        jPanel3.setBackground(new java.awt.Color(107, 153, 214));
        jPanel3.setForeground(new java.awt.Color(59, 88, 171));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setToolTipText("");

        usernameText.setBackground(new java.awt.Color(242, 242, 242));
        usernameText.setFont(new java.awt.Font("HP Simplified Jpan Light", 0, 18)); // NOI18N
        usernameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTextActionPerformed(evt);
            }
        });

        idTitle.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        idTitle.setForeground(new java.awt.Color(59, 88, 171));
        idTitle.setText("Student ID");
        idTitle.setToolTipText("");

        passwordTitle.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        passwordTitle.setForeground(new java.awt.Color(59, 88, 171));
        passwordTitle.setText("Password");
        passwordTitle.setToolTipText("");

        passwordText.setBackground(new java.awt.Color(242, 242, 242));

        signUpButton.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(59, 88, 171));
        signUpButton.setText("Sign Up");
        signUpButton.setToolTipText("");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });

        errorSignUp.setFont(new java.awt.Font("HP Simplified Jpan", 1, 20)); // NOI18N
        errorSignUp.setForeground(new java.awt.Color(255, 51, 51));
        errorSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        signUpTitle.setFont(new java.awt.Font("HP Simplified Jpan", 0, 36)); // NOI18N
        signUpTitle.setForeground(new java.awt.Color(59, 88, 171));
        signUpTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signUpTitle.setText("Sign Up");
        signUpTitle.setToolTipText("");

        loginButton.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        loginButton.setForeground(new java.awt.Color(59, 88, 171));
        loginButton.setText("Login");
        loginButton.setToolTipText("");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        gpaCalcLabel.setFont(new java.awt.Font("HP Simplified Jpan", 1, 60)); // NOI18N
        gpaCalcLabel.setForeground(new java.awt.Color(59, 88, 171));
        gpaCalcLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        gpaCalcLabel.setText("GPA Calculator");
        gpaCalcLabel.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("HP Simplified Jpan", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(59, 88, 171));
        jLabel1.setText("Already have an account?");
        jLabel1.setToolTipText("");

        confirmPassTitle.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        confirmPassTitle.setForeground(new java.awt.Color(59, 88, 171));
        confirmPassTitle.setText("Confirm Password");
        confirmPassTitle.setToolTipText("");

        confirmPasswordText.setBackground(new java.awt.Color(242, 242, 242));
        confirmPasswordText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordTextActionPerformed(evt);
            }
        });

        teacherTitle.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        teacherTitle.setForeground(new java.awt.Color(59, 88, 171));
        teacherTitle.setText("Teacher");
        teacherTitle.setToolTipText("");

        teacherText.setBackground(new java.awt.Color(242, 242, 242));
        teacherText.setFont(new java.awt.Font("HP Simplified Jpan Light", 0, 18)); // NOI18N
        teacherText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teacherTextActionPerformed(evt);
            }
        });

        idTitle1.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        idTitle1.setForeground(new java.awt.Color(255, 51, 51));
        idTitle1.setText("*");
        idTitle1.setToolTipText("");

        idTitle2.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        idTitle2.setForeground(new java.awt.Color(255, 51, 51));
        idTitle2.setText("*");
        idTitle2.setToolTipText("");

        idTitle3.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        idTitle3.setForeground(new java.awt.Color(255, 51, 51));
        idTitle3.setText("*");
        idTitle3.setToolTipText("");

        idTitle4.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        idTitle4.setForeground(new java.awt.Color(255, 51, 51));
        idTitle4.setText("*");
        idTitle4.setToolTipText("");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gpaCalcLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 467, Short.MAX_VALUE)
            .addComponent(signUpTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(signUpButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(178, 178, 178))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(confirmPasswordText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameText, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(teacherText)
                            .addComponent(errorSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(passwordTitle)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idTitle2))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(idTitle)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idTitle1))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(confirmPassTitle)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idTitle3))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(teacherTitle)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(idTitle4)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(loginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(gpaCalcLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(signUpTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idTitle)
                    .addComponent(idTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(usernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passwordTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idTitle2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordText, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmPassTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idTitle3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(teacherTitle)
                    .addComponent(idTitle4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(teacherText, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(signUpButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginButton)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 248, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(269, 269, 269)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTextActionPerformed
        //if user is already in the users ArrayList, disable the sign up button and reveal an error below it.
    }//GEN-LAST:event_usernameTextActionPerformed

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed

        try {
            //Class is used to get the instance of this Class with the specified class name, here we are getting the instance of JDBC Class
            // JDBC - Java Database Connectity    
            Class.forName("org.sqlite.JDBC");
            Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
            Statement statement = connection.createStatement();
            String user = usernameText.getText();
            String pass = passwordText.getText();
            String confirmPass = confirmPasswordText.getText();
            String teach = teacherText.getText();
            LoginScreen l;

            if (usernameText.getText().equals("") || passwordText.getText().equals("") || confirmPasswordText.getText().equals("") || teacherText.getText().equals("")) {
                errorSignUp.setText("Please fill in all required spaces before proceeding.");
            } else {
                if (confirmPass.equals(pass)) 
                {
                    statement.executeUpdate("insert into students values(" + user + ", '" + pass + "','" + teach + "')");
                    l = new LoginScreen();
                    l.setVisible(true);
                    l.getUsersFromDb();
                    this.dispose();
                } else {
                    errorSignUp.setText("Entered passwords do not match!");
                }
            }

            // statement.executeUpdate("delete from students");
            // statement.executeUpdate("delete from studentsgrd");
            //statement.executeUpdate("drop table if exists studsLtrGrd");
            //statement.executeUpdate("drop table if exists newStudents");
        } catch (ClassNotFoundException cne) {
            //if the error message is "out of memory",
            //it probably means no database file is found
            System.out.println(System.err);
        } catch (SQLException e) {
            // if the error message is "out of memory",
            // it probably means no database file is found
            System.out.println(System.err);
        }


    }//GEN-LAST:event_signUpButtonActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        LoginScreen l = new LoginScreen();
        l.setVisible(true);
        l.getUsersFromDb();
        this.dispose();
    }//GEN-LAST:event_loginButtonActionPerformed

    private void confirmPasswordTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordTextActionPerformed

    private void teacherTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teacherTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_teacherTextActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(qAndA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(qAndA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(qAndA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(qAndA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUpScreen().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel confirmPassTitle;
    private javax.swing.JPasswordField confirmPasswordText;
    private javax.swing.JLabel errorSignUp;
    private javax.swing.JLabel gpaCalcLabel;
    private javax.swing.JLabel idTitle;
    private javax.swing.JLabel idTitle1;
    private javax.swing.JLabel idTitle2;
    private javax.swing.JLabel idTitle3;
    private javax.swing.JLabel idTitle4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField passwordText;
    private javax.swing.JLabel passwordTitle;
    private javax.swing.JButton signUpButton;
    private javax.swing.JLabel signUpTitle;
    private javax.swing.JTextField teacherText;
    private javax.swing.JLabel teacherTitle;
    private javax.swing.JTextField usernameText;
    // End of variables declaration//GEN-END:variables
}
