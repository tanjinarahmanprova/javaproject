
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
public class Result extends javax.swing.JFrame {

    static Connection connection=null;
    static String databasename="studentdetail";
    static String url= "jdbc:mysql://localhost/"+databasename+"?user="+databasename+"&password="+databasename+"&useUnicode=true&characterEncoding=UTF-8";
    static String username="root";
    static String password="16691";
    public Result() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        std_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        course_code = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        exam_type = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        exam_date = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        gpa = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        Result = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Result");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 17, 97, 40));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 75, 84, 30));

        std_id.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(std_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 76, 233, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Course Code");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 124, -1, 30));

        course_code.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(course_code, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 125, 233, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel4.setText("GPA");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 173, 84, 30));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel5.setText("Exam Type");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 221, 84, 30));

        exam_type.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        exam_type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Final Exam", "Referred Exam", "Backlog Exam", " " }));
        getContentPane().add(exam_type, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 221, 233, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel6.setText("Exam Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 269, 84, 30));
        getContentPane().add(exam_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 270, 233, 30));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setText("Done");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 328, 80, -1));

        gpa.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        gpa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "4.00", "3.75", "3.50", "3.25", "3.00", "2.75", "2.50", "2.25", "2.00", "1.50", "1.00", "0.00" }));
        getContentPane().add(gpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 173, 233, 30));

        Result.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Course Code", "GPA", "Exam Type", "Exam Date"
            }
        ));
        jScrollPane1.setViewportView(Result);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, -6, 543, 410));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(115, 328, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 60));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 410, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            //table connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection(url,username,password);
            String query="insert into Result(std_id, course_code, gpa, exam_type, exam_date)values(?, ?, ?, ?, ?)";
            PreparedStatement pst=connection.prepareStatement(query);
            pst.setString(1,std_id.getText());
            pst.setString(2,course_code.getText());
            String g;
            g=gpa.getSelectedItem().toString();
            pst.setString(3,g);
            String t;
            t=exam_type.getSelectedItem().toString();
            pst.setString(4,t);
            pst.setString(5,exam_date.getText());
            pst.executeUpdate();
            Statement st=connection.createStatement();
            String sql="select * from Result";
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                String a=String.valueOf(rs.getString("std_id"));
                String b=String.valueOf(rs.getString("course_code"));
                String c=String.valueOf(rs.getString("gpa"));
                String d=String.valueOf(rs.getString("exam_type"));
                String e=String.valueOf(rs.getString("exam_date"));
                String tbData[]={a,b,c,d,e};
                DefaultTableModel model = (DefaultTableModel) Result.getModel();
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
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Result;
    private javax.swing.JTextField course_code;
    private javax.swing.JTextField exam_date;
    private javax.swing.JComboBox<String> exam_type;
    private javax.swing.JComboBox<String> gpa;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField std_id;
    // End of variables declaration//GEN-END:variables
}
