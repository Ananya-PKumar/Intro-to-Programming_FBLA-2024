/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gpacalculator;

public class Instructions extends javax.swing.JFrame {

    public Instructions() {
        initComponents();
        setLocation(100, 85);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        InstructionsBkg = new javax.swing.JPanel();
        instructionsTitle = new javax.swing.JLabel();
        overviewSubTitle = new javax.swing.JLabel();
        overviewInfo1 = new javax.swing.JLabel();
        overviewInfo2 = new javax.swing.JLabel();
        overviewInfo3 = new javax.swing.JLabel();
        overviewInfo4 = new javax.swing.JLabel();
        overviewInfo5 = new javax.swing.JLabel();
        overviewInfo6 = new javax.swing.JLabel();
        overviewInfo7 = new javax.swing.JLabel();
        overviewInfo8 = new javax.swing.JLabel();
        overviewInfo9 = new javax.swing.JLabel();
        finalNotesSubTitle = new javax.swing.JLabel();
        finalNotesInfo1 = new javax.swing.JLabel();
        finalNotesInfo2 = new javax.swing.JLabel();
        finalNotesInfo3 = new javax.swing.JLabel();

        InstructionsBkg.setBackground(new java.awt.Color(107, 153, 214));

        instructionsTitle.setFont(new java.awt.Font("HP Simplified Jpan Light", 1, 36)); // NOI18N
        instructionsTitle.setForeground(new java.awt.Color(255, 255, 255));
        instructionsTitle.setText("Welcome to the GPA Calculator!");

        overviewSubTitle.setFont(new java.awt.Font("HP Simplified Jpan Light", 1, 30)); // NOI18N
        overviewSubTitle.setForeground(new java.awt.Color(255, 255, 255));
        overviewSubTitle.setText("Overview");

        overviewInfo1.setFont(new java.awt.Font("HP Simplified Jpan", 0, 20)); // NOI18N
        overviewInfo1.setForeground(new java.awt.Color(255, 255, 255));
        overviewInfo1.setText("Under the \"Course Names\" header, notice how the course names are already provided for you; however, you can modify them at any time.");

        overviewInfo2.setFont(new java.awt.Font("HP Simplified Jpan", 0, 20)); // NOI18N
        overviewInfo2.setForeground(new java.awt.Color(255, 255, 255));
        overviewInfo2.setText("*Just delete the provided course names in the text box and type-in your desired name. ");

        overviewInfo3.setFont(new java.awt.Font("HP Simplified Jpan", 0, 20)); // NOI18N
        overviewInfo3.setForeground(new java.awt.Color(255, 255, 255));
        overviewInfo3.setText("*Please note that course names have no affect on your GPA.");

        overviewInfo4.setFont(new java.awt.Font("HP Simplified Jpan", 0, 20)); // NOI18N
        overviewInfo4.setForeground(new java.awt.Color(255, 255, 255));
        overviewInfo4.setText("To calculate your GPA, select the letter grade you received for a class in each of the seven dropdown menus below the header \"Course Name\" (Ex: A+, B).");

        overviewInfo5.setFont(new java.awt.Font("HP Simplified Jpan", 0, 20)); // NOI18N
        overviewInfo5.setForeground(new java.awt.Color(255, 255, 255));
        overviewInfo5.setText(" *You must select a grade for all seven of your courses before hitting the \"Calculate GPA\" button, or you GPA will be incorrectly calculated.");

        overviewInfo6.setFont(new java.awt.Font("HP Simplified Jpan", 0, 20)); // NOI18N
        overviewInfo6.setForeground(new java.awt.Color(255, 255, 255));
        overviewInfo6.setText(" Once you click, the \"Calculate GPA\" button, your unweighted and weighted GPA will shift from the preset value of '0.00'.  ");

        overviewInfo7.setFont(new java.awt.Font("HP Simplified Jpan", 0, 20)); // NOI18N
        overviewInfo7.setForeground(new java.awt.Color(255, 255, 255));
        overviewInfo7.setText("*These are located to the right of your screen.");

        overviewInfo8.setFont(new java.awt.Font("HP Simplified Jpan", 0, 20)); // NOI18N
        overviewInfo8.setForeground(new java.awt.Color(255, 255, 255));
        overviewInfo8.setText("Furthermore, under the header  \"Course Type\", you can select the course type of your classes (Ex: Regular, AP, Honors).");

        overviewInfo9.setFont(new java.awt.Font("HP Simplified Jpan", 0, 20)); // NOI18N
        overviewInfo9.setForeground(new java.awt.Color(255, 255, 255));
        overviewInfo9.setText("*Note that the course type for all seven of your classes are preset to \"Regular\".");

        finalNotesSubTitle.setFont(new java.awt.Font("HP Simplified Jpan Light", 1, 30)); // NOI18N
        finalNotesSubTitle.setForeground(new java.awt.Color(255, 255, 255));
        finalNotesSubTitle.setText("Final Notes");

        finalNotesInfo1.setFont(new java.awt.Font("HP Simplified Jpan", 0, 20)); // NOI18N
        finalNotesInfo1.setForeground(new java.awt.Color(255, 255, 255));
        finalNotesInfo1.setText("- Note, if you are taking all regular courses, your weighted and unweighted GPA will be the exact same.");

        finalNotesInfo2.setFont(new java.awt.Font("HP Simplified Jpan", 0, 20)); // NOI18N
        finalNotesInfo2.setForeground(new java.awt.Color(255, 255, 255));
        finalNotesInfo2.setText("-Remember: Unweighted GPA does not take into account of what your course type is, and it is graded on a 0-4.5 scale.");

        finalNotesInfo3.setFont(new java.awt.Font("HP Simplified Jpan", 0, 20)); // NOI18N
        finalNotesInfo3.setForeground(new java.awt.Color(255, 255, 255));
        finalNotesInfo3.setText("Weighted GPA includes your course type and is scaled from 0-5.5. ");

        javax.swing.GroupLayout InstructionsBkgLayout = new javax.swing.GroupLayout(InstructionsBkg);
        InstructionsBkg.setLayout(InstructionsBkgLayout);
        InstructionsBkgLayout.setHorizontalGroup(
            InstructionsBkgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InstructionsBkgLayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(InstructionsBkgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(finalNotesSubTitle)
                    .addComponent(overviewInfo1)
                    .addComponent(overviewInfo8)
                    .addComponent(overviewInfo3)
                    .addComponent(overviewInfo2)
                    .addComponent(overviewInfo4)
                    .addComponent(overviewInfo6)
                    .addComponent(overviewInfo9)
                    .addComponent(overviewInfo7)
                    .addComponent(finalNotesInfo1)
                    .addComponent(finalNotesInfo2)
                    .addGroup(InstructionsBkgLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(finalNotesInfo3))
                    .addComponent(overviewSubTitle)
                    .addComponent(overviewInfo5, javax.swing.GroupLayout.PREFERRED_SIZE, 1209, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
            .addGroup(InstructionsBkgLayout.createSequentialGroup()
                .addGap(427, 427, 427)
                .addComponent(instructionsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InstructionsBkgLayout.setVerticalGroup(
            InstructionsBkgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InstructionsBkgLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(instructionsTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(overviewSubTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(overviewInfo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(overviewInfo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(overviewInfo3)
                .addGap(27, 27, 27)
                .addComponent(overviewInfo4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(overviewInfo5)
                .addGap(28, 28, 28)
                .addComponent(overviewInfo6)
                .addGap(27, 27, 27)
                .addComponent(overviewInfo7)
                .addGap(26, 26, 26)
                .addComponent(overviewInfo8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(overviewInfo9)
                .addGap(49, 49, 49)
                .addComponent(finalNotesSubTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finalNotesInfo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finalNotesInfo2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(finalNotesInfo3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InstructionsBkg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(InstructionsBkg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
            java.util.logging.Logger.getLogger(Instructions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Instructions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Instructions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Instructions.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Instructions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel InstructionsBkg;
    private javax.swing.JLabel finalNotesInfo1;
    private javax.swing.JLabel finalNotesInfo2;
    private javax.swing.JLabel finalNotesInfo3;
    private javax.swing.JLabel finalNotesSubTitle;
    private javax.swing.JLabel instructionsTitle;
    private javax.swing.JLabel overviewInfo1;
    private javax.swing.JLabel overviewInfo2;
    private javax.swing.JLabel overviewInfo3;
    private javax.swing.JLabel overviewInfo4;
    private javax.swing.JLabel overviewInfo5;
    private javax.swing.JLabel overviewInfo6;
    private javax.swing.JLabel overviewInfo7;
    private javax.swing.JLabel overviewInfo8;
    private javax.swing.JLabel overviewInfo9;
    private javax.swing.JLabel overviewSubTitle;
    // End of variables declaration//GEN-END:variables
}
