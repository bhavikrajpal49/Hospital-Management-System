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
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hp
 */
public class DoctorPortal_frgtpwd extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;
    Statement st;

    /**
     * Creates new form DoctorPortal_frgtpwd
     */
    public DoctorPortal_frgtpwd() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        sectxt = new javax.swing.JTextField();
        anstxt = new javax.swing.JTextField();
        passtxt = new javax.swing.JTextField();
        Viewbtn = new javax.swing.JButton();
        Clearbtn = new javax.swing.JButton();
        verifybtn = new javax.swing.JButton();
        incorrecttxt = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Forgot");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password ?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User Id :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Security Question :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Answer :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Password :");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, -1, -1));
        jPanel1.add(idtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 230, -1));
        jPanel1.add(sectxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 230, -1));
        jPanel1.add(anstxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 220, 230, -1));
        jPanel1.add(passtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, 230, -1));

        Viewbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Viewbtn.setText("View");
        Viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Viewbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 80, 40));

        Clearbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Clearbtn.setText("Clear");
        Clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearbtnActionPerformed(evt);
            }
        });
        jPanel1.add(Clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 80, 40));

        verifybtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        verifybtn.setText("Verify");
        verifybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verifybtnActionPerformed(evt);
            }
        });
        jPanel1.add(verifybtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 70, 30));

        incorrecttxt.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(incorrecttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/small_window bg.jpg"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void ViewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewbtnActionPerformed
        // TODO add your handling code here:
        String id = idtxt.getText();
        String ans = anstxt.getText();
        
        try
        {
            con = DBconnection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select * from doctor");
            
            while(rs.next())
            {
                String uname = rs.getString("doc_username");
                String answer = rs.getString("doc_answer");
                String password = rs.getString("doc_password");
                
                if(id.equals(uname) && ans.equals(answer))
                {
                    JOptionPane.showMessageDialog(null, "matched");
                    passtxt.setText(password);
                }
                /*else
                {
                    incorrecttxt.setText("incorrect ans");
                }*/
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_ViewbtnActionPerformed

    private void verifybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verifybtnActionPerformed
        // TODO add your handling code here:
        String id = idtxt.getText();
        try
        {
            con = DBconnection.getConnection();
            st = con.createStatement();
            rs = st.executeQuery("select doc_question from doctor where doc_username = '"+id+"' ");
            if(rs.next())
            {
                sectxt.setText(rs.getString(1));
            }
            else{
                JOptionPane.showMessageDialog(null, "please enter correct username");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_verifybtnActionPerformed

    private void ClearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearbtnActionPerformed
        // TODO add your handling code here:
        idtxt.setText("");
        anstxt.setText("");
        sectxt.setText("");
        passtxt.setText("");
    }//GEN-LAST:event_ClearbtnActionPerformed

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
            java.util.logging.Logger.getLogger(DoctorPortal_frgtpwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DoctorPortal_frgtpwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DoctorPortal_frgtpwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DoctorPortal_frgtpwd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DoctorPortal_frgtpwd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Clearbtn;
    private javax.swing.JButton Viewbtn;
    private javax.swing.JTextField anstxt;
    private javax.swing.JLabel bg;
    private javax.swing.JTextField idtxt;
    private javax.swing.JLabel incorrecttxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField passtxt;
    private javax.swing.JTextField sectxt;
    private javax.swing.JButton verifybtn;
    // End of variables declaration//GEN-END:variables
}
