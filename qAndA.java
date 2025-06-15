/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package gpacalculator;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import java.util.Date;

public class qAndA extends javax.swing.JFrame {

    public qAndA() {
        initComponents();
        setLocation(240, 95);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        titleQandA = new javax.swing.JLabel();
        qAndAOptions = new javax.swing.JComboBox<>();
        qAndAoutput = new javax.swing.JPanel();
        qAndATextArea = new javax.swing.JLabel();
        generatePDFBtn = new javax.swing.JButton();
        qAndATextArea3rd = new javax.swing.JLabel();
        qAndATextArea2nd = new javax.swing.JLabel();
        getAnswerButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusable(false);
        setResizable(false);

        titleQandA.setFont(new java.awt.Font("HP Simplified Jpan", 1, 60)); // NOI18N
        titleQandA.setForeground(new java.awt.Color(107, 153, 214));
        titleQandA.setText("Question and Answer");

        qAndAOptions.setFont(new java.awt.Font("HP Simplified Jpan", 0, 24)); // NOI18N
        qAndAOptions.setForeground(new java.awt.Color(107, 153, 214));
        qAndAOptions.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Q & A", "What does GPA stand for?", "How can I improve my GPA?", "How do I generate a PDF report of my grades?" }));
        qAndAOptions.setToolTipText("");
        qAndAOptions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qAndAOptionsActionPerformed(evt);
            }
        });

        qAndAoutput.setBackground(new java.awt.Color(107, 153, 214));
        qAndAoutput.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        qAndATextArea.setFont(new java.awt.Font("HP Simplified Jpan", 0, 20)); // NOI18N
        qAndATextArea.setForeground(new java.awt.Color(255, 255, 255));

        generatePDFBtn.setFont(new java.awt.Font("HP Simplified Jpan", 1, 20)); // NOI18N
        generatePDFBtn.setForeground(new java.awt.Color(107, 153, 214));
        generatePDFBtn.setText("Generate PDF");
        generatePDFBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generatePDFBtnActionPerformed(evt);
            }
        });

        qAndATextArea3rd.setFont(new java.awt.Font("HP Simplified Jpan", 0, 20)); // NOI18N
        qAndATextArea3rd.setForeground(new java.awt.Color(255, 255, 255));

        qAndATextArea2nd.setFont(new java.awt.Font("HP Simplified Jpan", 0, 20)); // NOI18N
        qAndATextArea2nd.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout qAndAoutputLayout = new javax.swing.GroupLayout(qAndAoutput);
        qAndAoutput.setLayout(qAndAoutputLayout);
        qAndAoutputLayout.setHorizontalGroup(
            qAndAoutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qAndAoutputLayout.createSequentialGroup()
                .addGap(318, 318, 318)
                .addComponent(generatePDFBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, qAndAoutputLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(qAndAoutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(qAndATextArea3rd, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(qAndAoutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(qAndATextArea2nd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(qAndATextArea, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        qAndAoutputLayout.setVerticalGroup(
            qAndAoutputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(qAndAoutputLayout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(qAndATextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qAndATextArea2nd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(qAndATextArea3rd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72)
                .addComponent(generatePDFBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getAnswerButton.setFont(new java.awt.Font("HP Simplified Jpan", 1, 20)); // NOI18N
        getAnswerButton.setForeground(new java.awt.Color(107, 153, 214));
        getAnswerButton.setText("Get Answer");
        getAnswerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getAnswerButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(qAndAOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(getAnswerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(qAndAoutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(titleQandA)
                .addGap(471, 471, 471))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(286, 286, 286)
                        .addComponent(qAndAOptions, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(getAnswerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(titleQandA)
                        .addGap(56, 56, 56)
                        .addComponent(qAndAoutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void qAndAOptionsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qAndAOptionsActionPerformed
        //
    }//GEN-LAST:event_qAndAOptionsActionPerformed

    private void getAnswerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getAnswerButtonActionPerformed
        if (qAndAOptions.getSelectedItem().equals("What does GPA stand for?")) {
            qAndATextArea.setText("GPA stands for Grade Point Average.");
            qAndATextArea2nd.setText("Basically, it translates all of your letter grades in to a certain value, and then divides it");
            qAndATextArea3rd.setText("by the total number of courses you have to yield your GPA.");

        }
        if (qAndAOptions.getSelectedItem().equals("How can I improve my GPA?")) {
            qAndATextArea.setText("1. Ask for extra help in the subjects you are struggling on.");
            qAndATextArea2nd.setText("2. Revise your notes and practice everyday.");
            qAndATextArea3rd.setText("3. Attend all of your classes so you are aware of assignments and expectations.");
        }

        if (qAndAOptions.getSelectedItem().equals("How do I generate a PDF report of my grades?")) {
            qAndATextArea.setText(" ");
            qAndATextArea2nd.setText("Please click on the Generate PDF Button below!");
            qAndATextArea3rd.setText("Afterwards, a PDF of your inputted grades will download.");
            //Please note that this feature does not work at the moment, but it will be in one to two weeks time.
        }
    }//GEN-LAST:event_getAnswerButtonActionPerformed

    private void generatePDFBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generatePDFBtnActionPerformed
        try {
            // Create a new document
            PDDocument document = new PDDocument();

            // Add a page to the document
            PDPage page = new PDPage();
            document.addPage(page);

            // Start a new content stream which will "hold" the PDF content
            PDPageContentStream contentStream = new PDPageContentStream(document, page);

            // Set font and font size
            contentStream.setFont(PDType1Font.HELVETICA, 12);

            // Begin the text block
            contentStream.beginText();

            // Set the position for the line of text
            contentStream.newLineAtOffset(100, 700);

            // Add text to the page
            String input = "";
            contentStream.showText(Integer.toString(Users.indexUser)); // this will output the index of the use id, make it the user id
            contentStream.showText("GPA Report");
            contentStream.setLeading(12); // measured in pt
            contentStream.newLine();
            contentStream.setFont(PDType1Font.HELVETICA, 12);
            contentStream.showText(input);
            contentStream.setLeading(12); // measured in pt
            contentStream.newLine();
            //new line on a pdf (both setLeading and newLine are needed)
            double gpa = 3.5;
            contentStream.showText("Your GPA: " + Double.toString(gpa));
            /*
            make if statemenets that if the username at indexUser equals the username in the sequlite grades, output that letter, weight, and class
             */

            // End the text block
            contentStream.endText();

            // Close the content stream
            contentStream.close();
            
            // Save the results to the local drive
            String folderPath = "./downloads/"+LocalDateTime.now().toString().replaceAll(":", "");
            String fileName = "gpa-report.pdf";
            File folderFile = new File(folderPath);
            folderFile.mkdirs();
            
            File docFile = new File(folderFile+"/"+fileName);
            //file.set z
            document.save(docFile);

            // Close the document
            document.close();

            System.out.println("PDF created successfully.");
        } catch (IOException e) {
            System.err.println("Error creating PDF: " + e.getMessage());
        }

    }//GEN-LAST:event_generatePDFBtnActionPerformed

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
                new qAndA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton generatePDFBtn;
    private javax.swing.JButton getAnswerButton;
    private javax.swing.JComboBox<String> qAndAOptions;
    private javax.swing.JLabel qAndATextArea;
    private javax.swing.JLabel qAndATextArea2nd;
    private javax.swing.JLabel qAndATextArea3rd;
    private javax.swing.JPanel qAndAoutput;
    private javax.swing.JLabel titleQandA;
    // End of variables declaration//GEN-END:variables
}
