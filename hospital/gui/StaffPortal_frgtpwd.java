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
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class StaffPortal_frgtpwd extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;

    /**
     * Creates new form StaffPortal_frgtpwd
     */
    public StaffPortal_frgtpwd() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        sectxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        anstxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        passtxt = new javax.swing.JTextField();
        verifytxt = new javax.swing.JButton();
        cleartxt = new javax.swing.JButton();
        viewbtn = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Forget");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password ?");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 50, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("User Id :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 140, 80, 20));
        jPanel1.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 190, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Security Question :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        sectxt.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(sectxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 190, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Answer :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));
        jPanel1.add(anstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 190, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Password :");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));
        jPanel1.add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 190, -1));

        verifytxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        verifytxt.setText("Verify");
        verifytxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifytxtActionPerformed(evt);
            }
        });
        jPanel1.add(verifytxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 70, 30));

        cleartxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cleartxt.setText("Clear");
        cleartxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cleartxtActionPerformed(evt);
            }
        });
        jPanel1.add(cleartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 80, 40));

        viewbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        viewbtn.setText("View");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });
        jPanel1.add(viewbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 80, 40));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/small_window bg.jpg"))); // NOI18N
        bg.setPreferredSize(new java.awt.Dimension(5000, 3500));
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 533, 398));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void verifytxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifytxtActionPerformed
        // TODO add your handling code here:
        String id=idtxt.getText();
        try
        {
            
            con = DBconnection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select question from adminname where username= '"+id+"' ");
            if(rs.next())
            {
                sectxt.setText(rs.getString(1));
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Please Write Correct Usertname");
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_verifytxtActionPerformed

    private void cleartxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cleartxtActionPerformed
        // TODO add your handling code here:
        idtxt.setText("");
        anstxt.setText("");
        sectxt.setText("");
        passtxt.setText("");
        
    }//GEN-LAST:event_cleartxtActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
        // TODO add your handling code here:
        String id=idtxt.getText();
        //String que=sectxt.getText();
        String ans=anstxt.getText();
        //String pass=passtxt.getText();
        try
        {
            
            con = DBconnection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select * from adminname");
            while(rs.next())
            {
                String usrname = rs.getString("username");
                String answer = rs.getString("answer");
                String password = rs.getString("password");
                if(id.equals(usrname) && ans.equals(answer))
                {
                    JOptionPane.showMessageDialog(null,"Answer Matched Successfully");
                    passtxt.setText(password);
                    
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Incorrect Answer!!");
                }
            }
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_viewbtnActionPerformed

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
            java.util.logging.Logger.getLogger(StaffPortal_frgtpwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffPortal_frgtpwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffPortal_frgtpwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffPortal_frgtpwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffPortal_frgtpwd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anstxt;
    private javax.swing.JLabel bg;
    private javax.swing.JButton cleartxt;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField passtxt;
    private javax.swing.JTextField sectxt;
    private javax.swing.JButton verifytxt;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}
