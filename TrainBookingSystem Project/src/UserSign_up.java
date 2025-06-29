import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class UserSign_up extends javax.swing.JFrame {

    /**
     * Creates new form userSign_up
     */
    public UserSign_up() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblpwd = new javax.swing.JLabel();
        btnSignup = new javax.swing.JButton();
        txtcontact = new javax.swing.JTextField();
        txtuname = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lbltitle = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblname = new javax.swing.JLabel();
        cmbStateSelect = new javax.swing.JComboBox<>();
        lblcontact = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        lbladdress = new javax.swing.JLabel();
        btnCencel = new javax.swing.JButton();
        lblcity = new javax.swing.JLabel();
        lblstate = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        lblEmil = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblcontact1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblpwd.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        lblpwd.setForeground(new java.awt.Color(255, 0, 0));
        lblpwd.setText("Enter Password");

        btnSignup.setBackground(new java.awt.Color(51, 255, 255));
        btnSignup.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        btnSignup.setForeground(new java.awt.Color(153, 0, 153));
        btnSignup.setText("Sign Up");
        btnSignup.setActionCommand("");
        btnSignup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignupActionPerformed(evt);
            }
        });

        txtcontact.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtcontact.setForeground(new java.awt.Color(0, 153, 153));
        txtcontact.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcontactKeyTyped(evt);
            }
        });

        txtuname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtuname.setForeground(new java.awt.Color(0, 153, 153));

        txtAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtAddress.setForeground(new java.awt.Color(0, 153, 153));

        lbltitle.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        lbltitle.setForeground(new java.awt.Color(0, 51, 204));
        lbltitle.setText("NEW USER");

        txtCity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtCity.setForeground(new java.awt.Color(0, 153, 153));

        lblname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 0, 0));
        lblname.setText("Name");

        cmbStateSelect.setBackground(new java.awt.Color(51, 255, 255));
        cmbStateSelect.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        cmbStateSelect.setForeground(new java.awt.Color(153, 0, 153));
        cmbStateSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bamenda", "Buea", "Douala", "Yaounde", "Bertoua", "Ngaoundere", "Maroua", "Ebolowa", "Garoua", "Bafoussam"}));
        cmbStateSelect.setActionCommand("");

        lblcontact.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblcontact.setForeground(new java.awt.Color(255, 0, 0));
        lblcontact.setText("Contact Details");

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 153, 153));

        lbladdress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbladdress.setForeground(new java.awt.Color(255, 0, 0));
        lbladdress.setText("Address");

        btnCencel.setBackground(new java.awt.Color(51, 255, 255));
        btnCencel.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        btnCencel.setForeground(new java.awt.Color(153, 0, 153));
        btnCencel.setText("Cancel");
        btnCencel.setActionCommand("");
        btnCencel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCencelActionPerformed(evt);
            }
        });

        lblcity.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblcity.setForeground(new java.awt.Color(255, 0, 0));
        lblcity.setText("City");

        lblstate.setFont(new java.awt.Font("Ebrima", 1, 16)); // NOI18N
        lblstate.setForeground(new java.awt.Color(255, 0, 0));
        lblstate.setText("State");

        txtEmailID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtEmailID.setForeground(new java.awt.Color(0, 153, 153));

        lblEmil.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblEmil.setForeground(new java.awt.Color(255, 0, 0));
        lblEmil.setText("Email ID");

        txtUserName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(0, 153, 153));

        lblcontact1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblcontact1.setForeground(new java.awt.Color(255, 0, 0));
        lblcontact1.setText("User Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcontact1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbladdress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmil, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblcity, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtuname, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(231, 231, 231))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblstate, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(cmbStateSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(btnCencel, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {lblEmil, lbladdress, lblcity, lblcontact, lblcontact1, lblname, txtAddress, txtCity, txtEmailID, txtUserName, txtcontact, txtuname});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbltitle, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtuname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcontact1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcontact, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbladdress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmil, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblcity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblstate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbStateSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSignup, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCencel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblEmil, lbladdress, lblcity, lblcontact, lblcontact1, lblname, txtAddress, txtCity, txtEmailID, txtUserName, txtcontact, txtuname});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignupActionPerformed
        int flag = -1;
        String UserName = txtUserName.getText();
        String name = txtuname.getText();
        String contact = txtcontact.getText();
        String address = txtAddress.getText();
        String emailID = txtEmailID.getText();
        String city = txtCity.getText();
        String cmbstate = (String) cmbStateSelect.getSelectedItem();
        String getpassword = txtPassword.getText();
        String username = "root";
        String password = "admin";
        String url;

        int answer = JOptionPane.showConfirmDialog(null, "Do you want to signup?");
        if (answer == JOptionPane.YES_OPTION) {
            // Exception handling
            try {
                Class.forName("com.mysql.jdbc.Driver");
                //Statement statement = conn.createStatement();
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaySystem?zeroDateTimeBehavior=convertToNull", "root", ""); //Statement statement = conn.createStatement();
                        Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    String query = "SELECT * FROM ulogin;";
                    try (ResultSet result = statement.executeQuery(query)) {
                        while (result.next()) {

                            String strUserName = result.getString("UserName");
                            if (UserName.equals(strUserName)) {

                                JOptionPane.showMessageDialog(this, "Username exists,please change it!!!");
                                txtUserName.setText("");
                                txtuname.setText("");
                                txtcontact.setText("");
                                txtAddress.setText("");
                                txtEmailID.setText("");
                                txtCity.setText("");
                                txtPassword.setText("");
                                flag = 0;
                                break;
                            }
                        }

                        if (flag != 0) {
                            try (Statement statement1 = conn.createStatement()) {
                                String query1 = "INSERT into ulogin(Name, Contact, Address, Email, City, State, UserName, Password) VALUES('" + txtuname.getText() + "','" + txtcontact.getText() + "','" + txtAddress.getText() + "','" + txtEmailID.getText() + "','" + txtCity.getText() + "','" + cmbstate + "', '" + txtUserName.getText() + "','" + txtPassword.getText() + "');";
                                statement1.executeUpdate(query1);
                                UserLogin ul;
                                ul = new UserLogin();
                                ul.setVisible(true);
                                dispose();
                            }
                        }
                    }
                }
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }
        }


    }//GEN-LAST:event_btnSignupActionPerformed
    // Action Buttons
    private void btnCencelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCencelActionPerformed
        UserLogin ul = new UserLogin();
        ul.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCencelActionPerformed

    private void txtcontactKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcontactKeyTyped
        char ch = evt.getKeyChar();
        if(!(Character.isDigit(ch) ||  (ch == KeyEvent.VK_BACK_SPACE) || ch == KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtcontactKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCencel;
    private javax.swing.JButton btnSignup;
    private javax.swing.JComboBox<String> cmbStateSelect;
    private javax.swing.JLabel lblEmil;
    private javax.swing.JLabel lbladdress;
    private javax.swing.JLabel lblcity;
    private javax.swing.JLabel lblcontact;
    private javax.swing.JLabel lblcontact1;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblpwd;
    private javax.swing.JLabel lblstate;
    private javax.swing.JLabel lbltitle;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtuname;
    // End of variables declaration//GEN-END:variables
}
