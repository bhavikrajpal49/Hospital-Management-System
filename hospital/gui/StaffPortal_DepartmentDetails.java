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
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.regex.*;

/**
 *
 * @author Hp
 */
public class StaffPortal_DepartmentDetails extends javax.swing.JFrame {
    Connection con;
    PreparedStatement pst;
    ResultSet rs;

    /**
     * Creates new form StaffPortal_DepartmentDetails
     */
    public StaffPortal_DepartmentDetails() {
        initComponents();
        
        try
        {
        con = DBconnection.getConnection();
        int a;
        pst =con.prepareStatement("select * from department");
        ResultSet rs=pst.executeQuery();
        ResultSetMetaData rd = (ResultSetMetaData) rs.getMetaData();
        a=rd.getColumnCount();
        DefaultTableModel df = (DefaultTableModel) depttable.getModel();
        df.setRowCount(0);
        while(rs.next())
        {
            Vector v3=new Vector();
            for(int i=1;i<=a;i++)
            {
                v3.add(rs.getString("dept_id"));
                v3.add(rs.getString("dept_name"));
                v3.add(rs.getString("dept_desc"));
            }
            df.addRow(v3);
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        addbtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        deptnametxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        searchbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        depttable = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        deptidtxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        deptdesctxt = new javax.swing.JTextArea();
        clearbtn = new javax.swing.JButton();
        lblid = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lbldesc = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/department_icon.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 90, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        addbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        addbtn.setForeground(new java.awt.Color(51, 0, 255));
        addbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_icon.png"))); // NOI18N
        addbtn.setText("ADD");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        deletebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deletebtn.setForeground(new java.awt.Color(51, 0, 255));
        deletebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/remove_icon.png"))); // NOI18N
        deletebtn.setText("DELETE");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        updatebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(51, 0, 255));
        updatebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update_icon.png"))); // NOI18N
        updatebtn.setText("UPDATE");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/home page.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(updatebtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 380, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deletebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updatebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1420, 70));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Department Name");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 490, -1, -1));

        deptnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deptnametxtActionPerformed(evt);
            }
        });
        deptnametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                deptnametxtKeyReleased(evt);
            }
        });
        jPanel1.add(deptnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 410, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Department Discription");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 540, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("DEPARTMENT DETAILS");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        searchbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(153, 0, 255));
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 430, 100, 40));

        depttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "dept_id", "dept_name", "dept_desc"
            }
        ));
        depttable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                depttableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(depttable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 147, 1260, 270));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DeptID");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 440, -1, -1));

        deptidtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                deptidtxtKeyReleased(evt);
            }
        });
        jPanel1.add(deptidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 440, 200, -1));

        deptdesctxt.setColumns(20);
        deptdesctxt.setRows(5);
        deptdesctxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                deptdesctxtKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(deptdesctxt);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 540, 410, -1));

        clearbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(153, 0, 204));
        clearbtn.setText("CLEAR");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        jPanel1.add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 650, 120, 40));

        lblid.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblid.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 440, 150, 20));

        lblname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblname.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 490, 130, 20));

        lbldesc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbldesc.setForeground(new java.awt.Color(240, 240, 240));
        jPanel1.add(lbldesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 540, 120, 20));

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

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        // TODO add your handling code here:
        try
        {
        
        String deptid = deptidtxt.getText();
        String deptname=deptnametxt.getText();
        String deptdesc=deptdesctxt.getText();
        
        
        con = DBconnection.getConnection();
        pst=(PreparedStatement)con.prepareStatement("insert into department(dept_id,dept_name,dept_desc)values(?,?,?)");
        pst.setString(1,deptid);
        pst.setString(2,deptname);
        pst.setString(3,deptdesc);
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null,"Dept Added");
        deptidtxt.setText("");
        deptnametxt.setText("");
        deptdesctxt.setText("");
        
        
        int a;
        pst =con.prepareStatement("select * from department");
        ResultSet rs=pst.executeQuery();
        ResultSetMetaData rd = (ResultSetMetaData) rs.getMetaData();
        a=rd.getColumnCount();
        DefaultTableModel df = (DefaultTableModel) depttable.getModel();
        df.setRowCount(0);
        while(rs.next())
        {
            Vector v3=new Vector();
            for(int i=1;i<=a;i++)
            {
                v3.add(rs.getString("dept_id"));
                v3.add(rs.getString("dept_name"));
                v3.add(rs.getString("dept_desc"));
                
            }
            df.addRow(v3);
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
    
    }//GEN-LAST:event_addbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        // TODO add your handling code here:
        try
        {
        
        String id = deptidtxt.getText();
        con = DBconnection.getConnection();
        String sql = "delete from department where dept_id=? ";
        pst=(PreparedStatement)con.prepareStatement(sql);
        //pst=con.prepareStatement(sql);
        pst.setString(1,id);
        pst.execute();
        JOptionPane.showMessageDialog(null,"Dept Removed");
        deptidtxt.setText("");
        deptnametxt.setText("");
        deptdesctxt.setText("");
        
        
        int a;
        pst =con.prepareStatement("select * from department");
        ResultSet rs=pst.executeQuery();
        ResultSetMetaData rd = (ResultSetMetaData) rs.getMetaData();
        a=rd.getColumnCount();
        DefaultTableModel df = (DefaultTableModel) depttable.getModel();
        df.setRowCount(0);
        while(rs.next())
        {
            Vector v3=new Vector();
            for(int i=1;i<=a;i++)
            {
                v3.add(rs.getString("dept_id"));
                v3.add(rs.getString("dept_name"));
                v3.add(rs.getString("dept_desc"));
            }
            df.addRow(v3);
        }
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void deptnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deptnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deptnametxtActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        StaffPortal_Homepage sph = new StaffPortal_Homepage();
        sph.show();
        
        dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        try
        {
        con = DBconnection.getConnection();
        pst=(PreparedStatement)con.prepareStatement("select dept_id,dept_name,dept_desc from department where dept_id=? ");
        //int id=Integer.parseInt(deptidtxt.getText());
        String id=deptidtxt.getText();
        pst.setString(1, id);
        //pst.setInt(1, id);
        ResultSet rs1=pst.executeQuery();
        if(rs1.next()==false)
        {
        JOptionPane.showMessageDialog(this,"Sorry Record not found !");
        deptidtxt.setText("");
        deptnametxt.setText("");
        deptdesctxt.setText("");
        
        }
        else
        {
        deptidtxt.setText(rs1.getString("dept_id"));
        deptnametxt.setText(rs1.getString("dept_name"));
        deptdesctxt.setText(rs1.getString("dept_desc"));
       
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
        
    }//GEN-LAST:event_searchbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        try
        {
        
        String deptid = deptidtxt.getText();
        String deptname=deptnametxt.getText();
        String deptdesc=deptdesctxt.getText();
        
        
        con = DBconnection.getConnection();
        pst=(PreparedStatement)con.prepareStatement("update department set dept_name=?,dept_desc=? where dept_id=?");
        //pst.setInt(17,id);
        pst.setString(1,deptname);
        pst.setString(2,deptdesc);
        pst.setString(3,deptid);
        
        pst.executeUpdate();
        JOptionPane.showMessageDialog(null,"List Updated");
        deptidtxt.setText("");
        deptnametxt.setText("");
        deptdesctxt.setText("");
        
        int a;
        pst =con.prepareStatement("select * from department");
        ResultSet rs=pst.executeQuery();
        ResultSetMetaData rd = (ResultSetMetaData) rs.getMetaData();
        a=rd.getColumnCount();
        DefaultTableModel df = (DefaultTableModel) depttable.getModel();
        df.setRowCount(0);
        while(rs.next())
        {
            Vector v3=new Vector();
            for(int i=1;i<=a;i++)
            {
                v3.add(rs.getString("dept_id"));
                v3.add(rs.getString("dept_name"));
                v3.add(rs.getString("dept_desc"));
            }
            df.addRow(v3);
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
    }//GEN-LAST:event_updatebtnActionPerformed

    private void depttableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_depttableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) depttable.getModel();
        int s = depttable.getSelectedRow();
        deptidtxt.setText(df.getValueAt(s,0).toString());
        deptnametxt.setText(df.getValueAt(s,1).toString());
        deptdesctxt.setText(df.getValueAt(s,2).toString());
        
        
    }//GEN-LAST:event_depttableMouseClicked

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        // TODO add your handling code here:
        deptidtxt.setText("");
        deptnametxt.setText("");
        deptdesctxt.setText("");
    }//GEN-LAST:event_clearbtnActionPerformed

    private void deptnametxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deptnametxtKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z ]*$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(deptnametxt.getText());
        if(!match.matches()){
        lblname.setText("Invalid name!");
        }
        else
        {
        lblname.setText(null);
        }
    }//GEN-LAST:event_deptnametxtKeyReleased

    private void deptdesctxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deptdesctxtKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z0-9 ]*$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(deptdesctxt.getText());
        if(!match.matches()){
        lbldesc.setText("Invalid Description!");
        }
        else
        {
        lbldesc.setText(null);
        }
    }//GEN-LAST:event_deptdesctxtKeyReleased

    private void deptidtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_deptidtxtKeyReleased
        // TODO add your handling code here:
        String PATTERN="^[a-zA-Z0-9 ]*$";
        Pattern patt=Pattern.compile(PATTERN);
        Matcher match=patt.matcher(deptidtxt.getText());
        if(!match.matches()){
        lblid.setText("Invalid Department ID!");
        }
        else
        {
        lblid.setText(null);
        }
    }//GEN-LAST:event_deptidtxtKeyReleased

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
            java.util.logging.Logger.getLogger(StaffPortal_DepartmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StaffPortal_DepartmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StaffPortal_DepartmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StaffPortal_DepartmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StaffPortal_DepartmentDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JLabel bg;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JTextArea deptdesctxt;
    private javax.swing.JTextField deptidtxt;
    private javax.swing.JTextField deptnametxt;
    private javax.swing.JTable depttable;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbldesc;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblname;
    private javax.swing.JButton searchbtn;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}