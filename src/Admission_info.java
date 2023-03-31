
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Admission_info extends javax.swing.JFrame {

    static Connection connection=null;
    static String databasename="studentdetail";
    static String url= "jdbc:mysql://localhost/"+databasename+"?user="+databasename+"&password="+databasename+"&useUnicode=true&characterEncoding=UTF-8";
    static String username="root";
    static String password="16691";
    public Admission_info() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        std_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fall = new javax.swing.JRadioButton();
        spring = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        year_of_admission = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        department = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Admission_info = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Admission Information");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 16, -1, 26));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 82, 82, 29));
        getContentPane().add(std_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 82, 228, 29));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Semester");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 139, 82, 30));

        buttonGroup1.add(fall);
        fall.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        fall.setText("Fall");
        getContentPane().add(fall, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 139, 83, 30));

        buttonGroup1.add(spring);
        spring.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        spring.setText("Spring");
        getContentPane().add(spring, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 139, 107, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("Year");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 195, 82, 30));
        getContentPane().add(year_of_admission, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 195, 228, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Department");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 253, 82, 30));

        department.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        department.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CSE", "EEE", "CE", "ME", "BBA", "English", "LLB" }));
        getContentPane().add(department, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 253, 228, 30));

        Admission_info.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Semester", "Year", "Department"
            }
        ));
        jScrollPane1.setViewportView(Admission_info);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(416, 0, 487, 400));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 60));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setText("Done");
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
                .addGap(107, 107, 107)
                .addComponent(jButton2)
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(262, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(52, 52, 52))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 420, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection(url,username,password);
            String query="insert into Admission_info(std_id, admitted_semester, year_of_admission, department)values(?, ?, ?, ?)";
            PreparedStatement pst=connection.prepareStatement(query);
            pst.setString(1,std_id.getText()); 
            String admitted_semester = null;
            if(fall.isSelected()){
                admitted_semester="Fall";
            }
            if(spring.isSelected()){
                admitted_semester="Spring";
            }
            pst.setString(2,admitted_semester);
            pst.setString(3,year_of_admission.getText());
            String d;
            d = department.getSelectedItem().toString();
            pst.setString(4,d);
            pst.executeUpdate();
            Statement st=connection.createStatement();
            String sql="select * from Admission_info";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                String a=String.valueOf(rs.getString("std_id"));
                String b=String.valueOf(rs.getString("admitted_semester"));
                String c=String.valueOf(rs.getString("year_of_admission"));
                String e=String.valueOf(rs.getString("department"));
                String tbData[]={a,b,c,e};
                DefaultTableModel model = (DefaultTableModel) Admission_info.getModel();
                model.addRow(tbData);
            }
            JOptionPane.showMessageDialog(null, "Inserted successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Home().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Admission_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admission_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admission_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admission_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admission_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Admission_info;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> department;
    private javax.swing.JRadioButton fall;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton spring;
    private javax.swing.JTextField std_id;
    private javax.swing.JTextField year_of_admission;
    // End of variables declaration//GEN-END:variables
}
