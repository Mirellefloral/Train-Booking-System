// Import Packages
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
// Class implementing forgot password activity
public class ForgetPassword extends javax.swing.JFrame {

    /**
     * Creates new form ForgotPassword
     */
    public ForgetPassword() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        txtEmailID = new javax.swing.JTextField();
        btnResetPassword = new javax.swing.JButton();
        btnCencel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("FORGOT PASSWORD");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 11, 551, 57);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 51));
        jLabel2.setText("User Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 86, 194, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 51));
        jLabel3.setText("Email ID");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 207, 194, 40);

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(txtUserName);
        txtUserName.setBounds(10, 137, 370, 40);

        txtEmailID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtEmailID.setForeground(new java.awt.Color(0, 153, 153));
        getContentPane().add(txtEmailID);
        txtEmailID.setBounds(10, 253, 370, 40);

        btnResetPassword.setBackground(new java.awt.Color(51, 255, 255));
        btnResetPassword.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnResetPassword.setForeground(new java.awt.Color(153, 0, 153));
        btnResetPassword.setText("Reset Password");
        btnResetPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(btnResetPassword);
        btnResetPassword.setBounds(10, 446, 194, 40);

        btnCencel.setBackground(new java.awt.Color(51, 255, 255));
        btnCencel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCencel.setForeground(new java.awt.Color(153, 0, 153));
        btnCencel.setText("Cancel");
        btnCencel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCencelActionPerformed(evt);
            }
        });
        getContentPane().add(btnCencel);
        btnCencel.setBounds(319, 446, 194, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Button action performed
    private void btnCencelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCencelActionPerformed
        AdminLogin al = new AdminLogin();
        al.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCencelActionPerformed

    private void btnResetPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetPasswordActionPerformed
        int flag = -1;
        String strUserName = txtUserName.getText();
        String strEmail = txtEmailID.getText();
        // Exceptional handling
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaySystem?zeroDateTimeBehavior=convertToNull", "root", ""); Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                String query = "SELECT * FROM login;";
                try (ResultSet result = statement.executeQuery(query)) {
                    while (result.next()) {
                        String strUsernamlogin = result.getString("UserName");
                        String strEmailID = result.getString("Email");
                        if (strUserName.equals(strUsernamlogin) && strEmail.equals(strEmailID)) {
                            flag = 0;
                            break;
                        }
                    }
                }
            }
            if (flag != 0) {
                JOptionPane.showMessageDialog(this, "Invalid user name or EmailID!!, Please enter correct values!!");
                txtUserName.setText("");
                txtEmailID.setText("");
            } else {
                ResetPassword rsp;
                rsp = new ResetPassword();
                rsp.setVisible(true);
                dispose();
            }

        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }


    }//GEN-LAST:event_btnResetPasswordActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCencel;
    private javax.swing.JButton btnResetPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
