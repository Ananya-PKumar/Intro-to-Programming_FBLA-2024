package gpacalculator;

import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.math.RoundingMode;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDFont;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
//Imports the neccessary functions to ensure that program code runs smoothly.

public class CalcWindow extends javax.swing.JFrame {

    public CalcWindow() {
        initComponents();
        setLocation(100, 85);
        setSize(1365, 815);
    }

    String studentId = "";
    String studentName = "";

    //Nonmodifiable code provided by NetBeans via the GUI designer feature
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        headerShadow = new javax.swing.JLabel();
        yearsSelection = new javax.swing.JComboBox<>();
        unweightedGPALabel = new javax.swing.JLabel();
        unweightedVal = new javax.swing.JLabel();
        weightedGPALabel = new javax.swing.JLabel();
        weightedVal = new javax.swing.JLabel();
        calcGPAButton = new javax.swing.JButton();
        header = new javax.swing.JPanel();
        nameLabel = new javax.swing.JLabel();
        letterLabel = new javax.swing.JLabel();
        typeLabel = new javax.swing.JLabel();
        typeLabel1 = new javax.swing.JLabel();
        course1 = new javax.swing.JTextField();
        course2 = new javax.swing.JTextField();
        course4 = new javax.swing.JTextField();
        course3 = new javax.swing.JTextField();
        course5 = new javax.swing.JTextField();
        course6 = new javax.swing.JTextField();
        course7 = new javax.swing.JTextField();
        grade1 = new javax.swing.JComboBox<>();
        grade2 = new javax.swing.JComboBox<>();
        grade3 = new javax.swing.JComboBox<>();
        grade4 = new javax.swing.JComboBox<>();
        grade5 = new javax.swing.JComboBox<>();
        grade6 = new javax.swing.JComboBox<>();
        grade7 = new javax.swing.JComboBox<>();
        type1 = new javax.swing.JComboBox<>();
        type2 = new javax.swing.JComboBox<>();
        type3 = new javax.swing.JComboBox<>();
        type4 = new javax.swing.JComboBox<>();
        type5 = new javax.swing.JComboBox<>();
        type6 = new javax.swing.JComboBox<>();
        type7 = new javax.swing.JComboBox<>();
        navigationPanel = new javax.swing.JPanel();
        instructionsButton = new javax.swing.JButton();
        qaButton = new javax.swing.JButton();
        userIdDisplay = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        selectedYrPdfReportButton = new javax.swing.JButton();
        credits1 = new javax.swing.JComboBox<>();
        credits2 = new javax.swing.JComboBox<>();
        credits3 = new javax.swing.JComboBox<>();
        credits4 = new javax.swing.JComboBox<>();
        credits5 = new javax.swing.JComboBox<>();
        credits6 = new javax.swing.JComboBox<>();
        credits7 = new javax.swing.JComboBox<>();
        headerShadow1 = new javax.swing.JLabel();
        allYearPdfRptButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusable(false);
        setForeground(new java.awt.Color(204, 214, 236));
        setResizable(false);

        headerShadow.setFont(new java.awt.Font("HP Simplified Jpan", 1, 60)); // NOI18N
        headerShadow.setForeground(new java.awt.Color(107, 153, 214));
        headerShadow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerShadow.setText("GPA Calculator");

        yearsSelection.setFont(new java.awt.Font("HP Simplified Jpan", 0, 18)); // NOI18N
        yearsSelection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year 1 (9th)", "Year 2 (10th)", "Year 3 (11th)", "Year 4 (12th)" }));
        yearsSelection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearsSelectionActionPerformed(evt);
            }
        });

        unweightedGPALabel.setFont(new java.awt.Font("HP Simplified Jpan", 1, 30)); // NOI18N
        unweightedGPALabel.setForeground(new java.awt.Color(59, 88, 171));
        unweightedGPALabel.setText("Unweighted GPA");

        unweightedVal.setFont(new java.awt.Font("HP Simplified Jpan", 1, 48)); // NOI18N
        unweightedVal.setForeground(new java.awt.Color(107, 153, 214));
        unweightedVal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        unweightedVal.setText("0.00");
        unweightedVal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        weightedGPALabel.setFont(new java.awt.Font("HP Simplified Jpan", 1, 30)); // NOI18N
        weightedGPALabel.setForeground(new java.awt.Color(59, 88, 171));
        weightedGPALabel.setText("Weighted GPA");

        weightedVal.setFont(new java.awt.Font("HP Simplified Jpan", 1, 48)); // NOI18N
        weightedVal.setForeground(new java.awt.Color(107, 153, 214));
        weightedVal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        weightedVal.setText("0.00");
        weightedVal.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        calcGPAButton.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        calcGPAButton.setForeground(new java.awt.Color(107, 153, 214));
        calcGPAButton.setText("Calculate GPA");
        calcGPAButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcGPAButtonActionPerformed(evt);
            }
        });

        header.setBackground(new java.awt.Color(59, 88, 171));

        nameLabel.setFont(new java.awt.Font("HP Simplified Jpan", 1, 30)); // NOI18N
        nameLabel.setForeground(new java.awt.Color(255, 255, 255));
        nameLabel.setText("Course Name");

        letterLabel.setFont(new java.awt.Font("HP Simplified Jpan", 1, 30)); // NOI18N
        letterLabel.setForeground(new java.awt.Color(255, 255, 255));
        letterLabel.setText("Letter Grade");

        typeLabel.setFont(new java.awt.Font("HP Simplified Jpan", 1, 30)); // NOI18N
        typeLabel.setForeground(new java.awt.Color(255, 255, 255));
        typeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        typeLabel.setText("Credits");

        typeLabel1.setFont(new java.awt.Font("HP Simplified Jpan", 1, 30)); // NOI18N
        typeLabel1.setForeground(new java.awt.Color(255, 255, 255));
        typeLabel1.setText("Course Type");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nameLabel)
                .addGap(25, 25, 25)
                .addComponent(letterLabel)
                .addGap(37, 37, 37)
                .addComponent(typeLabel)
                .addGap(34, 34, 34)
                .addComponent(typeLabel1)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(letterLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(typeLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(typeLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7))
        );

        course1.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        course1.setText("Subject #1");
        course1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course1ActionPerformed(evt);
            }
        });

        course2.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        course2.setText("Subject #2");
        course2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course2ActionPerformed(evt);
            }
        });

        course4.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        course4.setText("Subject #4");
        course4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course4ActionPerformed(evt);
            }
        });

        course3.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        course3.setText("Subject #3");
        course3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course3ActionPerformed(evt);
            }
        });

        course5.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        course5.setText("Health & PE");
        course5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course5ActionPerformed(evt);
            }
        });

        course6.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        course6.setText("Elective #1");
        course6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course6ActionPerformed(evt);
            }
        });

        course7.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        course7.setText("Elective #2");
        course7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                course7ActionPerformed(evt);
            }
        });

        grade1.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        grade1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F" }));
        grade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade1ActionPerformed(evt);
            }
        });

        grade2.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        grade2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F" }));

        grade3.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        grade3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F" }));
        grade3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade3ActionPerformed(evt);
            }
        });

        grade4.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        grade4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F" }));

        grade5.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        grade5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F" }));
        grade5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade5ActionPerformed(evt);
            }
        });

        grade6.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        grade6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F" }));

        grade7.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        grade7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "A+", "A", "B+", "B", "C+", "C", "D+", "D", "F" }));
        grade7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grade7ActionPerformed(evt);
            }
        });

        type1.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        type1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Honors", "AP", "IB", "DE" }));
        type1.setPreferredSize(new java.awt.Dimension(72, 23));
        type1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type1ActionPerformed(evt);
            }
        });

        type2.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        type2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Honors", "AP", "IB", "DE" }));
        type2.setPreferredSize(new java.awt.Dimension(72, 23));

        type3.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        type3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Honors", "AP", "IB", "DE" }));
        type3.setPreferredSize(new java.awt.Dimension(72, 23));

        type4.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        type4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Honors", "AP", "IB", "DE" }));
        type4.setPreferredSize(new java.awt.Dimension(72, 23));

        type5.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        type5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Honors", "AP", "IB", "DE" }));
        type5.setPreferredSize(new java.awt.Dimension(72, 23));

        type6.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        type6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Honors", "AP", "IB", "DE" }));
        type6.setPreferredSize(new java.awt.Dimension(72, 23));

        type7.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        type7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Regular", "Honors", "AP", "IB", "DE" }));
        type7.setPreferredSize(new java.awt.Dimension(72, 23));

        navigationPanel.setBackground(new java.awt.Color(59, 88, 171));
        navigationPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        instructionsButton.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        instructionsButton.setForeground(new java.awt.Color(107, 153, 214));
        instructionsButton.setText("Instructions");
        instructionsButton.setOpaque(true);
        instructionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instructionsButtonActionPerformed(evt);
            }
        });

        qaButton.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        qaButton.setForeground(new java.awt.Color(107, 153, 214));
        qaButton.setText("Q & A");
        qaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qaButtonActionPerformed(evt);
            }
        });

        userIdDisplay.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        userIdDisplay.setForeground(new java.awt.Color(255, 255, 255));
        userIdDisplay.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userIdDisplay.setText("               ");

        logoutButton.setFont(new java.awt.Font("HP Simplified Jpan", 1, 24)); // NOI18N
        logoutButton.setForeground(new java.awt.Color(107, 153, 214));
        logoutButton.setText("Logout");
        logoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navigationPanelLayout = new javax.swing.GroupLayout(navigationPanel);
        navigationPanel.setLayout(navigationPanelLayout);
        navigationPanelLayout.setHorizontalGroup(
            navigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationPanelLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(instructionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(qaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userIdDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        navigationPanelLayout.setVerticalGroup(
            navigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navigationPanelLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(navigationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qaButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(instructionsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userIdDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        selectedYrPdfReportButton.setFont(new java.awt.Font("HP Simplified Jpan", 1, 18)); // NOI18N
        selectedYrPdfReportButton.setForeground(new java.awt.Color(107, 153, 214));
        selectedYrPdfReportButton.setText("Selected Year Report");
        selectedYrPdfReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectedYrPdfReportButtonActionPerformed(evt);
            }
        });

        credits1.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        credits1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.0", "0.5" }));

        credits2.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        credits2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.0", "0.5" }));

        credits3.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        credits3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.0", "0.5" }));

        credits4.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        credits4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.0", "0.5" }));

        credits5.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        credits5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.0", "0.5" }));

        credits6.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        credits6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.0", "0.5" }));

        credits7.setFont(new java.awt.Font("HP Simplified Jpan", 0, 16)); // NOI18N
        credits7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1.0", "0.5" }));

        headerShadow1.setFont(new java.awt.Font("HP Simplified Jpan", 1, 60)); // NOI18N
        headerShadow1.setForeground(new java.awt.Color(59, 88, 171));
        headerShadow1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerShadow1.setText("GPA Calculator");

        allYearPdfRptButton.setFont(new java.awt.Font("HP Simplified Jpan", 1, 18)); // NOI18N
        allYearPdfRptButton.setForeground(new java.awt.Color(107, 153, 214));
        allYearPdfRptButton.setText("All Year Report");
        allYearPdfRptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allYearPdfRptButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navigationPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(yearsSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(selectedYrPdfReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(allYearPdfRptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(header, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(course1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(course3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(course2, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(course4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(course5, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(course6, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                .addComponent(course7)))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(grade2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grade3, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grade4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grade5, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grade6, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grade7, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(credits3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(credits2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(credits4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(credits5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(credits6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(credits7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(grade1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(credits1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(type7, javax.swing.GroupLayout.Alignment.TRAILING, 0, 171, Short.MAX_VALUE)
                            .addComponent(type5, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(type4, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(type3, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(type2, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(type1, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(type6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(calcGPAButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(unweightedGPALabel, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weightedGPALabel)
                            .addComponent(unweightedVal, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightedVal, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(183, 183, 183))
            .addComponent(headerShadow, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(headerShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, 1349, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(navigationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(headerShadow, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearsSelection, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectedYrPdfReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allYearPdfRptButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(course1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(grade1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(credits1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(course2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grade2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(credits2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(course3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grade3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(type3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(credits3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(course4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(grade4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(type4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(credits4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(course5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(grade5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(course6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(grade6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(credits5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(type7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(credits6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(type1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(type2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(96, 96, 96)
                                .addComponent(type5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(course7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(grade7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(type6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(credits7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(calcGPAButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(unweightedGPALabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(unweightedVal, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(weightedGPALabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(weightedVal, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(145, 145, 145)
                    .addComponent(headerShadow1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(673, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>                        

    private void instructionsButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        //Creates a new Instructions JFrame and displays without hindering the calculator
        Instructions i = new Instructions();
        i.setVisible(true);
    }                                                  

    private void course2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
    }                                       

    private void course1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
    }                                       

    private void grade1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
    }                                      

    private void course4ActionPerformed(java.awt.event.ActionEvent evt) {                                        
    }                                       

    private void grade3ActionPerformed(java.awt.event.ActionEvent evt) {                                       
    }                                      

    private void course3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
    }                                       

    private void course5ActionPerformed(java.awt.event.ActionEvent evt) {                                        
    }                                       

    private void grade5ActionPerformed(java.awt.event.ActionEvent evt) {                                       
    }                                      

    private void course6ActionPerformed(java.awt.event.ActionEvent evt) {                                        
    }                                       

    private void course7ActionPerformed(java.awt.event.ActionEvent evt) {                                        
    }                                       

    private void grade7ActionPerformed(java.awt.event.ActionEvent evt) {                                       
    }                                      

    private void calcGPAButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        calculateStudentYearlyGPA();
    }                                             

    private void qaButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
        QuestionAndAnswer q = new QuestionAndAnswer();
        q.setVisible(true);
    }                                        

    private void type1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
    }                                     

    private void selectedYrPdfReportButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          

        String folderPath = "./downloads/" + LocalDateTime.now().toString().replaceAll(":", "");
        String fileName = "gpa-report.pdf";
        File folderFile = new File(folderPath);
        File docFile = new File(folderFile + "/" + fileName);
        int columns = 4;
        int rows = 8;
        String[][] content = new String[rows][columns];
        String gradeYr = String.valueOf(yearsSelection.getSelectedItem());
        calculateStudentYearlyGPA();

        try {
            //Class is used to get the instance of CalcWindow with the specified class name, here we are getting the instance of JDBC Class
            // JDBC - Java Database Connectity    
            Class.forName("org.sqlite.JDBC");

            //Create a database connection
            Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
            Statement statement = connection.createStatement();

            //Prevents exhausting the Database connections (in seconds).
            statement.setQueryTimeout(10);

            ResultSet rs = statement.executeQuery("select * from students_grade where student_id = " + studentId + " AND grade_year = '" + gradeYr + "'");

            // Create a new document
            PDDocument document = new PDDocument();
            // Add a pages to the document
            PDPage headerPage = new PDPage();
            PDPage coursePage = new PDPage();
            document.addPage(headerPage);
            document.addPage(coursePage);
            PDPageContentStream contentStream = new PDPageContentStream(document, coursePage);

            //set the header for the table contents
            content[0][0] = "Course Name";
            content[0][1] = "Letter Grade";
            content[0][2] = "Credits";
            content[0][3] = "Course Type";

            while (rs.next()) {
                for (int i = 0; i <= 3; i++) {
                    content[rs.getRow()][0] = rs.getString(3);
                    content[rs.getRow()][1] = rs.getString(4);
                    content[rs.getRow()][2] = rs.getString(5);
                    content[rs.getRow()][3] = rs.getString(6);
                }
            }

            createGradeHeaderPdf(document, headerPage, gradeYr);
            drawTable(coursePage, contentStream, 700, 100, content);
            contentStream.close();

            // Create if the folder does not exist and Save the results to the local drive
            folderFile.mkdirs();
            document.save(docFile);

            // Close the document
            document.close();
            System.out.println("PDF created successfully.");

            //close the statement and the connections
            statement.close();
            connection.close();

        } catch (IOException e) {
            System.err.println("Error creating PDF: " + e.getMessage());
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CalcWindow.class.getName()).log(Level.SEVERE, null, ex);
        }


    }                                                         

    private void yearsSelectionActionPerformed(java.awt.event.ActionEvent evt) {                                               
        populateDatafromLogin();
    }                                              

    private void logoutButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        LoginScreen l = new LoginScreen();
        l.setVisible(true);
        l.getUsersFromDb();
        this.dispose();
    }                                            

    private void allYearPdfRptButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                    

        String folderPath = "./downloads/" + LocalDateTime.now().toString().replaceAll(":", "");
        String fileName = "gpa-report.pdf";
        File folderFile = new File(folderPath);
        File docFile = new File(folderFile + "/" + fileName);
        int columns = 5;
        int rows = 29;
        String[][] content = new String[rows][columns];
        ArrayList<String> allGradesList = new ArrayList<String>(); //(ex: A+, B)
        ArrayList<String> allCourseTypesList = new ArrayList<String>(); //(ex: AP, DE)
        String gradeYr = "Years 1-4 (9th-12th)";

        try {
            //Class is used to get the instance of CalcWindow with the specified class name, here we are getting the instance of JDBC Class
            // JDBC - Java Database Connectity    
            Class.forName("org.sqlite.JDBC");

            //Create a database connection
            Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
            Statement statement = connection.createStatement();

            //Prevents exhausting the Database connections (in seconds).
            statement.setQueryTimeout(10);

            ResultSet rs = statement.executeQuery("select * from students_grade where student_id = " + studentId);

            // Create a new document
            PDDocument document = new PDDocument();
            // Add a pages to the document
            PDPage headerPage = new PDPage();
            PDPage coursePage = new PDPage();
            document.addPage(headerPage);
            document.addPage(coursePage);
            PDPageContentStream contentStream = new PDPageContentStream(document, coursePage);

            //set the header for the table contents
            content[0][0] = "Course Name";
            content[0][1] = "Letter Grade";
            content[0][2] = "Credits";
            content[0][3] = "Course Type";
            content[0][4] = "Year";

            while (rs.next()) {
                for (int i = 0; i <= 3; i++) {
                    content[rs.getRow()][0] = rs.getString(3);
                    content[rs.getRow()][1] = rs.getString(4);
                    content[rs.getRow()][2] = rs.getString(5);
                    content[rs.getRow()][3] = rs.getString(6);
                    content[rs.getRow()][4] = rs.getString(7);
                    
                    allGradesList.add(rs.getString(4));
                    allCourseTypesList.add(rs.getString(6));
                }
            }

            CalculatedGpa calGpa = calculateStudentAllYearGPA(allGradesList, allCourseTypesList);

            createAllGradeHeaderPdf(document, headerPage, gradeYr, calGpa);
            drawTable(coursePage, contentStream, 700, 100, content);
            contentStream.close();

            // Create if the folder does not exist and Save the results to the local drive
            folderFile.mkdirs();
            document.save(docFile);

            // Close the document
            document.close();
            System.out.println("PDF created successfully.");

            //close the statement and the connections
            statement.close();
            connection.close();

        } catch (IOException e) {
            System.err.println("Error creating PDF: " + e.getMessage());
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CalcWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                                   
    
     /*
    * This method creates the Header for the GPA PDF Report Generation
     */
    public void createAllGradeHeaderPdf(PDDocument document, PDPage page, String gradeYr, CalculatedGpa calGpa) throws IOException {
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
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 24);
        contentStream.showText("Midlothian High School");
        contentStream.setLeading(12);
        contentStream.newLine();
        contentStream.newLine();
        contentStream.newLine();
        contentStream.newLine();
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 18);
        contentStream.showText("Student ID: " + studentId);
        contentStream.setLeading(12);
        contentStream.newLine();
        contentStream.newLine();
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 18);
        contentStream.showText("Student Name: " + studentName);
        contentStream.setLeading(12);
        contentStream.newLine();
        contentStream.newLine();
        contentStream.showText("Report Year: " + gradeYr);
        contentStream.setLeading(12);
        contentStream.newLine();
        contentStream.showText("");
        contentStream.setLeading(12);
        contentStream.newLine();
        contentStream.showText(input);
        contentStream.newLine();
        //new line on a pdf (both setLeading and newLine are needed)
        contentStream.setFont(PDType1Font.HELVETICA, 12);
        contentStream.showText("Unweighted GPA: " + calGpa.getUnWeighted() + "               ");
        contentStream.showText("Weighted GPA: " + calGpa.getWeighted());
        contentStream.setLeading(12);
        contentStream.newLine();
        contentStream.newLine();
        contentStream.newLine();
        contentStream.newLine();
        contentStream.newLine();
        contentStream.newLine();
        contentStream.newLine();
        //This closes the textblock, which is a nessecary function to implement the table.
        contentStream.endText();
        contentStream.close();

    }
    
    /*
    * This method creates the Header for the GPA PDF Report Generation
     */
    public void createGradeHeaderPdf(PDDocument document, PDPage page, String gradeYr) throws IOException {
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
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 24);
        contentStream.showText("Midlothian High School");
        contentStream.setLeading(12);
        contentStream.newLine();
        contentStream.newLine();
        contentStream.newLine();
        contentStream.newLine();
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 18);
        contentStream.showText("Student ID: " + studentId);
        contentStream.setLeading(12);
        contentStream.newLine();
        contentStream.newLine();
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 18);
        contentStream.showText("Student Name: " + studentName);
        contentStream.setLeading(12);
        contentStream.newLine();
        contentStream.newLine();
        contentStream.showText("Report Year: " + gradeYr);
        contentStream.setLeading(12);
        contentStream.newLine();
        contentStream.showText("");
        contentStream.setLeading(12);
        contentStream.newLine();
        contentStream.showText(input);
        contentStream.newLine();
        //new line on a pdf (both setLeading and newLine are needed)
        contentStream.setFont(PDType1Font.HELVETICA, 12);
        contentStream.showText("Unweighted GPA: " + unweightedVal.getText() + "               ");
        contentStream.showText("Weighted GPA: " + weightedVal.getText());
        contentStream.setLeading(12);
        contentStream.newLine();
        contentStream.newLine();
        contentStream.newLine();
        contentStream.newLine();
        contentStream.newLine();
        contentStream.newLine();
        contentStream.newLine();
        //This closes the textblock, which is a nessecary function to implement the table.
        contentStream.endText();
        contentStream.close();

    }

    /**
     * @param page
     * @param contentStream
     * @param y the y-coordinate of the first row
     * @param margin the padding on left and right of table
     * @param content a 2d array containing the table data
     * @throws IOException
     */
    public static void drawTable(PDPage page, PDPageContentStream contentStream,
            float y, float margin,
            String[][] content) throws IOException {
        final int rows = content.length;
        final int cols = content[0].length;
        final float rowHeight = 20f;
        final float tableWidth = page.getMediaBox().getWidth() - (2 * margin);
        final float tableHeight = rowHeight * rows;
        final float colWidth = tableWidth / (float) cols;
        final float cellMargin = 5f;

        //draw the rows
        float nexty = y;
        for (int i = 0; i <= rows; i++) {
            contentStream.drawLine(margin, nexty, margin + tableWidth, nexty);
            nexty -= rowHeight;
        }

        //draw the columns
        float nextx = margin;
        for (int i = 0; i <= cols; i++) {
            contentStream.drawLine(nextx, y, nextx, y - tableHeight);
            nextx += colWidth;
        }

        //now add the text
        contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);

        float textx = margin + cellMargin;
        float texty = y - 15;
        for (int i = 0; i < content.length; i++) {
            for (int j = 0; j < content[i].length; j++) {
                String text = content[i][j];
                contentStream.beginText();
                contentStream.moveTextPositionByAmount(textx, texty);
                if (null != text) {
                    contentStream.drawString(text);
                }
                contentStream.endText();
                textx += colWidth;
            }
            texty -= rowHeight;
            textx = margin + cellMargin;
        }
    }

    public void populateDatafromLogin() {
        String courseId = "";
        String gradeYr = "'Year 1 (9th)";

        try {
            //Class is used to get the instance of CalcWindow with the specified class name, here we are getting the instance of JDBC Class
            // JDBC - Java Database Connectity
            Class.forName("org.sqlite.JDBC");

            //Create a database connection
            Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
            Statement statement = connection.createStatement();

            //Prevents exhausting the Database connections (in seconds).
            statement.setQueryTimeout(10);

            //resolve the selected grade year, if null grade will be default to 1 year
            if (null != String.valueOf(yearsSelection.getSelectedItem())) {
                gradeYr = String.valueOf(yearsSelection.getSelectedItem());
            }
            ResultSet rs = statement.executeQuery("select * from students_grade where student_id = " + studentId + " AND grade_year = '" + gradeYr + "'");

            while (rs.next()) {
                // read the result set from Database
                System.out.println("student id " + rs.getString("student_id") + " course id " + rs.getString("course_id") + " course name " + rs.getString("course_name") + " letter grade " + rs.getString("letter_grade") + " course type " + rs.getString("course_type") + " grade year" + rs.getString("grade_year"));

                courseId = rs.getString("course_id");

                if (courseId.equals("0")) {
                    grade1.setSelectedItem(rs.getString("letter_grade"));
                    type1.setSelectedItem(rs.getString("course_type"));
                    credits1.setSelectedItem(rs.getString("credits"));
                }
                if (courseId.equals("1")) {
                    grade2.setSelectedItem(rs.getString("letter_grade"));
                    type2.setSelectedItem(rs.getString("course_type"));
                    credits2.setSelectedItem(rs.getString("credits"));
                }
                if (courseId.equals("2")) {
                    grade3.setSelectedItem(rs.getString("letter_grade"));
                    type3.setSelectedItem(rs.getString("course_type"));
                    credits3.setSelectedItem(rs.getString("credits"));
                }
                if (courseId.equals("3")) {
                    grade4.setSelectedItem(rs.getString("letter_grade"));
                    type4.setSelectedItem(rs.getString("course_type"));
                    credits4.setSelectedItem(rs.getString("credits"));
                }
                if (courseId.equals("4")) {
                    grade5.setSelectedItem(rs.getString("letter_grade"));
                    type5.setSelectedItem(rs.getString("course_type"));
                    credits5.setSelectedItem(rs.getString("credits"));
                }
                if (courseId.equals("5")) {
                    grade6.setSelectedItem(rs.getString("letter_grade"));
                    type6.setSelectedItem(rs.getString("course_type"));
                    credits6.setSelectedItem(rs.getString("credits"));
                }
                if (courseId.equals("6")) {
                    grade7.setSelectedItem(rs.getString("letter_grade"));
                    type7.setSelectedItem(rs.getString("course_type"));
                    credits7.setSelectedItem(rs.getString("credits"));
                }
            }

            // if resultset has no rows, reset the grade values to default
            if (rs != null) {
                if (rs.getRow() <= 0) {
                    course1.setText("Subject #1");
                    grade1.setSelectedItem("");
                    type1.setSelectedItem("Regular");
                    credits1.setSelectedItem("1.0");
                    course2.setText("Subject #2");
                    grade2.setSelectedItem("");
                    type2.setSelectedItem("Regular");
                    credits2.setSelectedItem("1.0");
                    course3.setText("Subject #3");
                    grade3.setSelectedItem("");
                    type3.setSelectedItem("Regular");
                    credits3.setSelectedItem("1.0");
                    course4.setText("Subject #4");
                    grade4.setSelectedItem("");
                    type4.setSelectedItem("Regular");
                    credits4.setSelectedItem("1.0");
                    course5.setText("Health & PE");
                    grade5.setSelectedItem("");
                    type5.setSelectedItem("Regular");
                    credits5.setSelectedItem("1.0");
                    course6.setText("Elective #1");
                    grade6.setSelectedItem("");
                    type6.setSelectedItem("Regular");
                    credits6.setSelectedItem("1.0");
                    course7.setText("Elective #2");
                    grade7.setSelectedItem("");
                    type7.setSelectedItem("Regular");
                    credits7.setSelectedItem("1.0");
                }
            }

            userIdDisplay.setText("Welcome, " + studentName + "!");
            //reset gpa calculation
            unweightedVal.setText("0.00");
            weightedVal.setText("0.00");
            //close the statement and the connections
            statement.close();
            connection.close();

        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(CalcWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insertStudentsGrades(ArrayList allCourseNameList, ArrayList allGradesList, ArrayList allCreditsList, ArrayList allCourseTypesList) {

        String gradeYear = String.valueOf(yearsSelection.getSelectedItem());
        try {
            //Class is used to get the instance of this Class with the specified class name, here we are getting the instance of JDBC Class
            //JDBC - Java Database Connectity    
            Class.forName("org.sqlite.JDBC");

            //Creates a connection to the database (sample.db)
            Connection connection = DriverManager.getConnection("jdbc:sqlite:sample.db");
            Statement statement = connection.createStatement();

            //Prevents exhausting the Database connections(in seconds).
            statement.setQueryTimeout(10);

            //Creates and deletes the 'studentsgrd' table; this is not needed everytime, only initially.
            //statement.executeUpdate("drop table if exists students_grade");
            //statement.executeUpdate("create table students_grade (student_id string, course_id string null, course_name string null, letter_grade string null, credits string null, course_type string null, grade_year string null)");
            //Delete the records of a specific userid and for the selected grade year, to repopulate the values entered by user
            statement.executeUpdate("delete from students_grade where student_id = " + studentId + " AND grade_year = '" + gradeYear + "'");

            //Inserts students grades into the database
            for (int i = 0; i < allGradesList.size(); i++) {
                statement.executeUpdate("insert into students_grade values(" + studentId + ",'" + i + "','" + allCourseNameList.get(i) + "','" + allGradesList.get(i) + "','" + allCreditsList.get(i) + "','" + allCourseTypesList.get(i) + "','" + gradeYear + "')");
            }

            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CalcWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void calculateStudentYearlyGPA() {

        ArrayList<String> allGradesList = new ArrayList<String>(); //(ex: A+, B)
        ArrayList<String> allCourseTypesList = new ArrayList<String>(); //(ex: AP, DE)
        ArrayList<String> allCourseNamesList = new ArrayList<String>();
        ArrayList<String> allCreditsList = new ArrayList<String>();
        DecimalFormat doubleFormat = new DecimalFormat("0.00");
        double unweighted = 0.0;
        double weighted = 0.0;
        double uGPA = 0.0;
        double wGPA = 0.0;

        //Ensures that no null values are entered.
        //Takes the user's inputted grade values and course types and appends them to their respective ArrayLists
        if (grade1.getSelectedItem() != "") {
            allGradesList.add(String.valueOf(grade1.getSelectedItem()));
            allCourseTypesList.add(String.valueOf(type1.getSelectedItem()));
            allCourseNamesList.add(course1.getText());
            allCreditsList.add(String.valueOf(credits1.getSelectedItem()));
        }
        if (grade2.getSelectedItem() != "") {
            allGradesList.add(String.valueOf(grade2.getSelectedItem()));
            allCourseTypesList.add(String.valueOf(type2.getSelectedItem()));
            allCourseNamesList.add(course2.getText());
            allCreditsList.add(String.valueOf(credits2.getSelectedItem()));
        }
        if (grade3.getSelectedItem() != "") {
            allGradesList.add(String.valueOf(grade3.getSelectedItem()));
            allCourseTypesList.add(String.valueOf(type3.getSelectedItem()));
            allCourseNamesList.add(course3.getText());
            allCreditsList.add(String.valueOf(credits3.getSelectedItem()));
        }
        if (grade4.getSelectedItem() != "") {
            allGradesList.add(String.valueOf(grade4.getSelectedItem()));
            allCourseTypesList.add(String.valueOf(type4.getSelectedItem()));
            allCourseNamesList.add(course4.getText());
            allCreditsList.add(String.valueOf(credits4.getSelectedItem()));

        }
        if (grade5.getSelectedItem() != "") {
            allGradesList.add(String.valueOf(grade5.getSelectedItem()));
            allCourseTypesList.add(String.valueOf(type5.getSelectedItem()));
            allCourseNamesList.add(course5.getText());
            allCreditsList.add(String.valueOf(credits5.getSelectedItem()));
        }
        if (grade6.getSelectedItem() != "") {
            allGradesList.add(String.valueOf(grade6.getSelectedItem()));
            allCourseTypesList.add(String.valueOf(type6.getSelectedItem()));
            allCourseNamesList.add(course6.getText());
            allCreditsList.add(String.valueOf(credits6.getSelectedItem()));
        }
        if (grade7.getSelectedItem() != "") {
            allGradesList.add(String.valueOf(grade7.getSelectedItem()));
            allCourseTypesList.add(String.valueOf(type7.getSelectedItem()));
            allCourseNamesList.add(course7.getText());
            allCreditsList.add(String.valueOf(credits7.getSelectedItem()));
        }

        if (grade1.getSelectedItem() != "" && grade2.getSelectedItem() != "" && grade3.getSelectedItem() != "" && grade4.getSelectedItem() != "" && grade5.getSelectedItem() != "" && grade6.getSelectedItem() != "" && grade7.getSelectedItem() != "") {
            unweightedVal.setText(doubleFormat.format(0.00));
            weightedVal.setText(doubleFormat.format(0.00));
        }

        //Adds appropriate values based on what the user inputs
        for (int i = 0; i < allGradesList.size(); i++) {

            if (allGradesList.get(i).equals("A+")) {
                unweighted += 4.5;

                if (allCourseTypesList.get(i).equals("AP") || allCourseTypesList.get(i).equals("IB") || allCourseTypesList.get(i).equals("DE")) {
                    weighted += 5.5;
                } else if (allCourseTypesList.get(i).equals("Honors")) {
                    weighted += 5.0;
                } else {
                    weighted += 4.5;
                }
            }

            if (allGradesList.get(i).equals("A")) {
                unweighted += 4;

                if (allCourseTypesList.get(i).equals("AP") || allCourseTypesList.get(i).equals("IB") || allCourseTypesList.get(i).equals("DE")) {
                    weighted += 5.0;
                } else if (allCourseTypesList.get(i).equals("Honors")) {
                    weighted += 4.5;
                } else {
                    weighted += 4.0;
                }
            }

            if (allGradesList.get(i).equals("B+")) {
                unweighted += 3.5;

                if (allCourseTypesList.get(i).equals("AP") || allCourseTypesList.get(i).equals("IB") || allCourseTypesList.get(i).equals("DE")) {
                    weighted += 4.5;
                } else if (allCourseTypesList.get(i).equals("Honors")) {
                    weighted += 4.0;
                } else {
                    weighted += 3.5;
                }
            }

            if (allGradesList.get(i).equals("B")) {
                unweighted += 3;

                if (allCourseTypesList.get(i).equals("AP") || allCourseTypesList.get(i).equals("IB") || allCourseTypesList.get(i).equals("DE")) {
                    weighted += 4.0;
                } else if (allCourseTypesList.get(i).equals("Honors")) {
                    weighted += 3.5;
                } else {
                    weighted += 3.0;
                }
            }

            if (allGradesList.get(i).equals("C+")) {
                unweighted += 2.5;

                if (allCourseTypesList.get(i).equals("AP") || allCourseTypesList.get(i).equals("IB") || allCourseTypesList.get(i).equals("DE")) {
                    weighted += 3.5;
                } else if (allCourseTypesList.get(i).equals("Honors")) {
                    weighted += 3.0;
                } else {
                    weighted += 2.5;
                }
            }

            if (allGradesList.get(i).equals("C")) {
                unweighted += 2;

                if (allCourseTypesList.get(i).equals("AP") || allCourseTypesList.get(i).equals("IB") || allCourseTypesList.get(i).equals("DE")) {
                    weighted += 3.0;
                } else if (allCourseTypesList.get(i).equals("Honors")) {
                    weighted += 2.5;
                } else {
                    weighted += 2;
                }
            }
            if (allGradesList.get(i).equals("D+")) {
                unweighted += 1.5;

                if (allCourseTypesList.get(i).equals("AP") || allCourseTypesList.get(i).equals("IB") || allCourseTypesList.get(i).equals("DE")) {
                    weighted += 2.5;
                } else if (allCourseTypesList.get(i).equals("Honors")) {
                    weighted += 2.0;
                } else {
                    weighted += 1.5;
                }
            }

            if (allGradesList.get(i).equals("D")) {
                unweighted += 1.0;
                if (allCourseTypesList.get(i).equals("AP") || allCourseTypesList.get(i).equals("IB") || allCourseTypesList.get(i).equals("DE")) {
                    weighted += 2.0;
                } else if (allCourseTypesList.get(i).equals("Honors")) {
                    weighted += 1.5;
                } else {
                    weighted += 1.0;
                }
            }

            if (allGradesList.get(i).equals("F")) {
                unweighted += 0.0;
            }
        }

        //Averages weighted and unweighted points and rounds it down
        doubleFormat.setRoundingMode(RoundingMode.DOWN);

        if (unweighted > 0.0) {
            uGPA = unweighted / allGradesList.size();
            unweightedVal.setText(doubleFormat.format(uGPA));
        }
        if (weighted > 0.0) {
            wGPA = weighted / allGradesList.size();
            weightedVal.setText(doubleFormat.format(wGPA));
        }

        insertStudentsGrades(allCourseNamesList, allGradesList, allCreditsList, allCourseTypesList);
    }

    public CalculatedGpa calculateStudentAllYearGPA(ArrayList<String> allGradesList, ArrayList<String> allCourseTypesList) {

        ArrayList<String> allCourseNamesList = new ArrayList<String>();
        ArrayList<String> allCreditsList = new ArrayList<String>();
        DecimalFormat doubleFormat = new DecimalFormat("0.00");
        CalculatedGpa calGpa = new CalculatedGpa("0.00", "0.00");
        double unweighted = 0.0;
        double weighted = 0.0;
        double uGPA = 0.0;
        double wGPA = 0.0;

        //Adds appropriate values based on what the user inputs
        for (int i = 0; i < allGradesList.size(); i++) {

            if (allGradesList.get(i).equals("A+")) {
                unweighted += 4.5;

                if (allCourseTypesList.get(i).equals("AP") || allCourseTypesList.get(i).equals("IB") || allCourseTypesList.get(i).equals("DE")) {
                    weighted += 5.5;
                } else if (allCourseTypesList.get(i).equals("Honors")) {
                    weighted += 5.0;
                } else {
                    weighted += 4.5;
                }
            }

            if (allGradesList.get(i).equals("A")) {
                unweighted += 4;

                if (allCourseTypesList.get(i).equals("AP") || allCourseTypesList.get(i).equals("IB") || allCourseTypesList.get(i).equals("DE")) {
                    weighted += 5.0;
                } else if (allCourseTypesList.get(i).equals("Honors")) {
                    weighted += 4.5;
                } else {
                    weighted += 4.0;
                }
            }

            if (allGradesList.get(i).equals("B+")) {
                unweighted += 3.5;

                if (allCourseTypesList.get(i).equals("AP") || allCourseTypesList.get(i).equals("IB") || allCourseTypesList.get(i).equals("DE")) {
                    weighted += 4.5;
                } else if (allCourseTypesList.get(i).equals("Honors")) {
                    weighted += 4.0;
                } else {
                    weighted += 3.5;
                }
            }

            if (allGradesList.get(i).equals("B")) {
                unweighted += 3;

                if (allCourseTypesList.get(i).equals("AP") || allCourseTypesList.get(i).equals("IB") || allCourseTypesList.get(i).equals("DE")) {
                    weighted += 4.0;
                } else if (allCourseTypesList.get(i).equals("Honors")) {
                    weighted += 3.5;
                } else {
                    weighted += 3.0;
                }
            }

            if (allGradesList.get(i).equals("C+")) {
                unweighted += 2.5;

                if (allCourseTypesList.get(i).equals("AP") || allCourseTypesList.get(i).equals("IB") || allCourseTypesList.get(i).equals("DE")) {
                    weighted += 3.5;
                } else if (allCourseTypesList.get(i).equals("Honors")) {
                    weighted += 3.0;
                } else {
                    weighted += 2.5;
                }
            }

            if (allGradesList.get(i).equals("C")) {
                unweighted += 2;

                if (allCourseTypesList.get(i).equals("AP") || allCourseTypesList.get(i).equals("IB") || allCourseTypesList.get(i).equals("DE")) {
                    weighted += 3.0;
                } else if (allCourseTypesList.get(i).equals("Honors")) {
                    weighted += 2.5;
                } else {
                    weighted += 2;
                }
            }
            if (allGradesList.get(i).equals("D+")) {
                unweighted += 1.5;

                if (allCourseTypesList.get(i).equals("AP") || allCourseTypesList.get(i).equals("IB") || allCourseTypesList.get(i).equals("DE")) {
                    weighted += 2.5;
                } else if (allCourseTypesList.get(i).equals("Honors")) {
                    weighted += 2.0;
                } else {
                    weighted += 1.5;
                }
            }

            if (allGradesList.get(i).equals("D")) {
                unweighted += 1.0;
                if (allCourseTypesList.get(i).equals("AP") || allCourseTypesList.get(i).equals("IB") || allCourseTypesList.get(i).equals("DE")) {
                    weighted += 2.0;
                } else if (allCourseTypesList.get(i).equals("Honors")) {
                    weighted += 1.5;
                } else {
                    weighted += 1.0;
                }
            }

            if (allGradesList.get(i).equals("F")) {
                unweighted += 0.0;
            }

          
        }

        //Averages weighted and unweighted points and rounds it down
        doubleFormat.setRoundingMode(RoundingMode.DOWN);

        if (unweighted > 0.0) {
            uGPA = unweighted / allGradesList.size();
            calGpa.setUnWeighted(doubleFormat.format(uGPA));
        }
        if (weighted > 0.0) {
            wGPA = weighted / allGradesList.size();
            calGpa.setWeighted(doubleFormat.format(wGPA));
        }
          return calGpa;
    }

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
            java.util.logging.Logger.getLogger(CalcWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalcWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalcWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalcWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        //* Creates and displays the GUI
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalcWindow().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify                     
    private javax.swing.JButton allYearPdfRptButton;
    private javax.swing.JButton calcGPAButton;
    private javax.swing.JTextField course1;
    private javax.swing.JTextField course2;
    private javax.swing.JTextField course3;
    private javax.swing.JTextField course4;
    private javax.swing.JTextField course5;
    private javax.swing.JTextField course6;
    private javax.swing.JTextField course7;
    private javax.swing.JComboBox<String> credits1;
    private javax.swing.JComboBox<String> credits2;
    private javax.swing.JComboBox<String> credits3;
    private javax.swing.JComboBox<String> credits4;
    private javax.swing.JComboBox<String> credits5;
    private javax.swing.JComboBox<String> credits6;
    private javax.swing.JComboBox<String> credits7;
    private javax.swing.JComboBox<String> grade1;
    private javax.swing.JComboBox<String> grade2;
    private javax.swing.JComboBox<String> grade3;
    private javax.swing.JComboBox<String> grade4;
    private javax.swing.JComboBox<String> grade5;
    private javax.swing.JComboBox<String> grade6;
    private javax.swing.JComboBox<String> grade7;
    private javax.swing.JPanel header;
    private javax.swing.JLabel headerShadow;
    private javax.swing.JLabel headerShadow1;
    private javax.swing.JButton instructionsButton;
    private javax.swing.JLabel letterLabel;
    private javax.swing.JButton logoutButton;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JPanel navigationPanel;
    private javax.swing.JButton qaButton;
    private javax.swing.JButton selectedYrPdfReportButton;
    private javax.swing.JComboBox<String> type1;
    private javax.swing.JComboBox<String> type2;
    private javax.swing.JComboBox<String> type3;
    private javax.swing.JComboBox<String> type4;
    private javax.swing.JComboBox<String> type5;
    private javax.swing.JComboBox<String> type6;
    private javax.swing.JComboBox<String> type7;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JLabel typeLabel1;
    private javax.swing.JLabel unweightedGPALabel;
    private javax.swing.JLabel unweightedVal;
    private javax.swing.JLabel userIdDisplay;
    private javax.swing.JLabel weightedGPALabel;
    private javax.swing.JLabel weightedVal;
    private javax.swing.JComboBox<String> yearsSelection;
    // End of variables declaration                   
}
