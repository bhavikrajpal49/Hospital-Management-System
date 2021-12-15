/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital.gui;

import hospital.dbutil.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class PatientPortal_CheckDetails extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    String patient;
    

    /**
     * Creates new form PatientPortal_CheckDetails
     */
    public PatientPortal_CheckDetails() {
        initComponents();
    }
    public PatientPortal_CheckDetails(String pid) {
        initComponents();
        patient = pid;
        viewapt();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        patidtxt = new javax.swing.JTextField();
        fnametxt = new javax.swing.JTextField();
        phtxt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lnametxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        agetxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        singlerb = new javax.swing.JRadioButton();
        marriedrb = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        desctxt = new javax.swing.JTextArea();
        bloodgrptxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        malerb = new javax.swing.JRadioButton();
        femalerb = new javax.swing.JRadioButton();
        otherrb = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        visitdatetxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        patypetxt = new javax.swing.JTextField();
        daystxt = new javax.swing.JTextField();
        effecttxt = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        tab4txt = new javax.swing.JTextField();
        dose4txt = new javax.swing.JTextField();
        tab3txt = new javax.swing.JTextField();
        dose3txt = new javax.swing.JTextField();
        tab2txt = new javax.swing.JTextField();
        dose2txt = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        diseasetxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        prscbtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        tab1txt = new javax.swing.JTextField();
        dose1txt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PATIENT ID");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 160, 50));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 0, 255));
        jLabel3.setText("CHECK YOUR DETAILS");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home page.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 696, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(598, 598, 598))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 1800, 70));

        patidtxt.setEditable(false);
        patidtxt.setToolTipText("Enter Patient ID");
        jPanel1.add(patidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 170, 30));
        jPanel1.add(fnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, 160, -1));
        jPanel1.add(phtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 150, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Phone no.");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 100, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("First Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 100, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Last Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 110, 30));
        jPanel1.add(lnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 160, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Age");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 40, 30));
        jPanel1.add(agetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 160, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Maritial Status");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, 120, 30));

        singlerb.setBackground(new java.awt.Color(102, 0, 255));
        singlerb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        singlerb.setForeground(new java.awt.Color(255, 255, 255));
        singlerb.setText("Single");
        jPanel1.add(singlerb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        marriedrb.setBackground(new java.awt.Color(102, 0, 255));
        marriedrb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        marriedrb.setForeground(new java.awt.Color(255, 255, 255));
        marriedrb.setText("Married");
        marriedrb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marriedrbActionPerformed(evt);
            }
        });
        jPanel1.add(marriedrb, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Description");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 100, 40));

        desctxt.setColumns(20);
        desctxt.setRows(5);
        jScrollPane2.setViewportView(desctxt);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 250, 190));
        jPanel1.add(bloodgrptxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, 150, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Blood grp");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 80, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Gender");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 70, 30));

        malerb.setBackground(new java.awt.Color(102, 0, 255));
        malerb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        malerb.setForeground(new java.awt.Color(255, 255, 255));
        malerb.setText("Male");
        jPanel1.add(malerb, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, -1, -1));

        femalerb.setBackground(new java.awt.Color(102, 0, 255));
        femalerb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        femalerb.setForeground(new java.awt.Color(255, 255, 255));
        femalerb.setText("Female");
        jPanel1.add(femalerb, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, -1, -1));

        otherrb.setBackground(new java.awt.Color(102, 0, 255));
        otherrb.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        otherrb.setForeground(new java.awt.Color(255, 255, 255));
        otherrb.setText("Other");
        jPanel1.add(otherrb, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 430, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Date");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 40, 30));
        jPanel1.add(visitdatetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 160, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Patient Type");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 530, 120, 40));
        jPanel1.add(patypetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 540, 160, -1));
        jPanel1.add(daystxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 530, 190, -1));
        jPanel1.add(effecttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 470, 500, 40));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Days");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 530, 50, -1));

        tab4txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab4txtActionPerformed(evt);
            }
        });
        jPanel1.add(tab4txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, 250, 40));
        jPanel1.add(dose4txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 370, 240, 40));
        jPanel1.add(tab3txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 340, 250, -1));
        jPanel1.add(dose3txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 340, 240, -1));
        jPanel1.add(tab2txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 310, 250, -1));
        jPanel1.add(dose2txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 310, 240, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Daily Dose");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 260, 110, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Name of the Tablets");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 260, 190, 20));
        jPanel1.add(diseasetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 210, 410, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Disease");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 70, 20));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("MEDICINE PRESCRIPTION");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 130, 330, 40));

        prscbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        prscbtn.setForeground(new java.awt.Color(102, 0, 255));
        prscbtn.setText("View Presc");
        prscbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prscbtnActionPerformed(evt);
            }
        });
        jPanel1.add(prscbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 130, 110, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/hospital bed.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 70));
        jPanel1.add(tab1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 280, 250, -1));
        jPanel1.add(dose1txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 280, 240, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Possible Side effects :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/1440,720_bg.jpg"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PatientPortal pd = new PatientPortal(patient);
        pd.show();

        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
private void viewapt() {
        try
        {
            con = DBconnection.getConnection();
            pst=(PreparedStatement)con.prepareStatement("select pat_id,pat_fname,pat_lname,pat_age,pat_bloodgrp,pat_gender,pat_ph,pat_marital,pat_patype,pat_visitdate,pat_disease from patient1 where pat_id=? ");
            //int id=Integer.parseInt(patidtxt.getText());
            
            pst.setString(1, patient);
            ResultSet rs1=pst.executeQuery();
            if(rs1.next()==false)
            {
                JOptionPane.showMessageDialog(this,"Sorry Record not found !");
                patidtxt.setText("");
                fnametxt.setText("");
                lnametxt.setText("");
                //agetxt.setText("");
                bloodgrptxt.setText("");
                phtxt.setText("");
                patypetxt.setText("");
                visitdatetxt.setText("");
                desctxt.setText("");
                //gendertxt.setText("");
                malerb.setSelected(true);
                singlerb.setSelected(false);
                diseasetxt.setText("");
                tab1txt.setText("");
                dose1txt.setText("");
                tab2txt.setText("");
                dose2txt.setText("");
                tab3txt.setText("");
                dose3txt.setText("");
                tab4txt.setText("");
                dose4txt.setText("");
                effecttxt.setText("");
                daystxt.setText("");
            }
            else
            {
                patidtxt.setText(rs1.getString("pat_id"));
                fnametxt.setText(rs1.getString("pat_fname"));
                lnametxt.setText(rs1.getString("pat_lname"));
                agetxt.setText(rs1.getString("pat_age"));
                phtxt.setText(rs1.getString("pat_ph"));
                bloodgrptxt.setText(rs1.getString("pat_bloodgrp"));
                patypetxt.setText(rs1.getString("pat_patype"));
                visitdatetxt.setText(rs1.getString("pat_visitdate"));
                desctxt.setText(rs1.getString("pat_disease"));

                String sex = rs1.getString("pat_gender");
                if(sex.equals("Male"))
                {
                    malerb.setSelected(true);
                }
                else if(sex.equals("Female"))
                {
                    femalerb.setSelected(true);
                }
                else
                {
                    otherrb.setSelected(true);
                }

                String marriage = rs1.getString("pat_marital");
                if(marriage.equals("Single"))
                {
                    singlerb.setSelected(true);
                }
                else
                {
                    marriedrb.setSelected(true);
                }
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"DB Error"+ex,"Exception",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    private void marriedrbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marriedrbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marriedrbActionPerformed

    private void tab4txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab4txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tab4txtActionPerformed

    private void prscbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prscbtnActionPerformed
        // TODO add your handling code here:
        try
        {
            con = DBconnection.getConnection();
            pst=(PreparedStatement)con.prepareStatement("select pat_id,pat_fname,pat_lname,pat_age,pat_bloodgrp,pat_gender,pat_ph,pat_marital,pat_patype,pat_visitdate,pat_disease,prs_disease,prs_tab1,prs_dose1,prs_tab2,prs_dose2,prs_tab3,prs_dose3,prs_tab4,prs_dose4,prs_sideeffect,prs_days from patient1,prescription where patient1.pat_id = prescription.prs_patid and patient1.pat_id = ?");
            //int id=Integer.parseInt(patidtxt.getText());
            String id=patidtxt.getText();
            //pst.setInt(1, id);
            pst.setString(1, id);
            ResultSet rs1=pst.executeQuery();
            if(rs1.next()==false)
            {
                JOptionPane.showMessageDialog(this,"No Prescription added !");
                diseasetxt.setText("");
                tab1txt.setText("");
                dose1txt.setText("");
                tab2txt.setText("");
                dose2txt.setText("");
                tab3txt.setText("");
                dose3txt.setText("");
                tab4txt.setText("");
                dose4txt.setText("");
                effecttxt.setText("");
                daystxt.setText("");

            }
            else
            {
                patidtxt.setText(rs1.getString("pat_id"));
                fnametxt.setText(rs1.getString("pat_fname"));
                lnametxt.setText(rs1.getString("pat_lname"));
                agetxt.setText(rs1.getString("pat_age"));
                phtxt.setText(rs1.getString("pat_ph"));
                bloodgrptxt.setText(rs1.getString("pat_bloodgrp"));
                patypetxt.setText(rs1.getString("pat_patype"));
                visitdatetxt.setText(rs1.getString("pat_visitdate"));
                desctxt.setText(rs1.getString("pat_disease"));
                diseasetxt.setText(rs1.getString("prs_disease"));
                tab1txt.setText(rs1.getString("prs_tab1"));
                dose1txt.setText(rs1.getString("prs_dose1"));
                tab2txt.setText(rs1.getString("prs_tab2"));
                dose2txt.setText(rs1.getString("prs_dose2"));
                tab3txt.setText(rs1.getString("prs_tab3"));
                dose3txt.setText(rs1.getString("prs_dose3"));
                tab4txt.setText(rs1.getString("prs_tab4"));
                dose4txt.setText(rs1.getString("prs_dose4"));
                effecttxt.setText(rs1.getString("prs_sideeffect"));
                daystxt.setText(rs1.getString("prs_days"));

                String sex = rs1.getString("pat_gender");
                if(sex.equals("Male"))
                {
                    malerb.setSelected(true);
                }
                else if(sex.equals("Female"))
                {
                    femalerb.setSelected(true);
                }
                else
                {
                    otherrb.setSelected(true);
                }

                String marriage = rs1.getString("pat_marital");
                if(marriage.equals("Single"))
                {
                    singlerb.setSelected(true);
                }
                else
                {
                    marriedrb.setSelected(true);
                }
            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"DB Error"+ex,"Exception",JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }//GEN-LAST:event_prscbtnActionPerformed

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
            java.util.logging.Logger.getLogger(PatientPortal_CheckDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PatientPortal_CheckDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PatientPortal_CheckDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PatientPortal_CheckDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientPortal_CheckDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField agetxt;
    private javax.swing.JLabel bg;
    private javax.swing.JTextField bloodgrptxt;
    private javax.swing.JTextField daystxt;
    private javax.swing.JTextArea desctxt;
    private javax.swing.JTextField diseasetxt;
    private javax.swing.JTextField dose1txt;
    private javax.swing.JTextField dose2txt;
    private javax.swing.JTextField dose3txt;
    private javax.swing.JTextField dose4txt;
    private javax.swing.JTextField effecttxt;
    private javax.swing.JRadioButton femalerb;
    private javax.swing.JTextField fnametxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lnametxt;
    private javax.swing.JRadioButton malerb;
    private javax.swing.JRadioButton marriedrb;
    private javax.swing.JRadioButton otherrb;
    private javax.swing.JTextField patidtxt;
    private javax.swing.JTextField patypetxt;
    private javax.swing.JTextField phtxt;
    private javax.swing.JButton prscbtn;
    private javax.swing.JRadioButton singlerb;
    private javax.swing.JTextField tab1txt;
    private javax.swing.JTextField tab2txt;
    private javax.swing.JTextField tab3txt;
    private javax.swing.JTextField tab4txt;
    private javax.swing.JTextField visitdatetxt;
    // End of variables declaration//GEN-END:variables

    
}
