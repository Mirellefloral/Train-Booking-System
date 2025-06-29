// Import packages
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class PassengerDetailsForm extends javax.swing.JFrame {

    String AC1, AC2, AC3, SL, from1, to1, no, distance, type, seat1, name, arrtime, deptime;
    static String PassName11;

    public PassengerDetailsForm() {
        initComponents();
    }

    /*
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTrainNumber = new javax.swing.JTextField();
        txtFrom = new javax.swing.JTextField();
        txtTo = new javax.swing.JTextField();
        txtPassengerName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        btnBookTicket = new javax.swing.JButton();
        btnResetForm = new javax.swing.JButton();
        cmbSeat = new javax.swing.JComboBox<>();
        txtGender = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName(""); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("PASSENGER DETAILS");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("Train Number");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("From");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 51));
        jLabel5.setText("To");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("Seat Type");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 51));
        jLabel8.setText("Name");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 51));
        jLabel9.setText("Gender");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 51));
        jLabel10.setText("Age");

        txtTrainNumber.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTrainNumber.setForeground(new java.awt.Color(0, 153, 153));
        txtTrainNumber.setName(""); // NOI18N
        txtTrainNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTrainNumberKeyTyped(evt);
            }
        });

        txtFrom.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtFrom.setForeground(new java.awt.Color(0, 153, 153));
        txtFrom.setName(""); // NOI18N

        txtTo.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtTo.setForeground(new java.awt.Color(0, 153, 153));
        txtTo.setName(""); // NOI18N

        txtPassengerName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassengerName.setForeground(new java.awt.Color(0, 153, 153));
        txtPassengerName.setName(""); // NOI18N

        txtAge.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAge.setForeground(new java.awt.Color(0, 153, 153));
        txtAge.setName(""); // NOI18N
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAgeKeyTyped(evt);
            }
        });

        btnBookTicket.setBackground(new java.awt.Color(0, 255, 255));
        btnBookTicket.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnBookTicket.setForeground(new java.awt.Color(153, 0, 153));
        btnBookTicket.setText("Book Ticket");
        btnBookTicket.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookTicketActionPerformed(evt);
            }
        });

        btnResetForm.setBackground(new java.awt.Color(0, 255, 255));
        btnResetForm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnResetForm.setForeground(new java.awt.Color(153, 0, 153));
        btnResetForm.setText("Reset Form");
        btnResetForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetFormActionPerformed(evt);
            }
        });

        cmbSeat.setBackground(new java.awt.Color(102, 255, 255));
        cmbSeat.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbSeat.setForeground(new java.awt.Color(153, 0, 153));
        cmbSeat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC1", "AC2", "AC3", "SL" }));

        txtGender.setBackground(new java.awt.Color(102, 255, 255));
        txtGender.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtGender.setForeground(new java.awt.Color(153, 0, 153));
        txtGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));

        btnBack.setBackground(new java.awt.Color(51, 255, 255));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnBack.setForeground(new java.awt.Color(153, 0, 153));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTrainNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(488, 707, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPassengerName, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(87, 87, 87)
                                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(156, 156, 156)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cmbSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnBookTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(120, 120, 120)
                                    .addComponent(btnResetForm, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnBack)
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTrainNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbSeat, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPassengerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBookTicket, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnResetForm, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnResetFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetFormActionPerformed
        txtFrom.setText("");
        txtTrainNumber.setText("");
        txtTo.setText("");
        txtPassengerName.setText("");
        txtAge.setText("");

    }//GEN-LAST:event_btnResetFormActionPerformed
    // Action buttons
    private void btnBookTicketActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookTicketActionPerformed
        int flag = -1;
        String from = txtFrom.getText();
        String to = txtTo.getText();
        String trno = txtTrainNumber.getText();
        String seat = (String) cmbSeat.getSelectedItem();
        String gender = (String) txtGender.getSelectedItem();
        PassName11 = txtPassengerName.getText();
        // Exception handling
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaySystem?zeroDateTimeBehavior=convertToNull", "root", ""); Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {

                String query = "SELECT * FROM traindetails WHERE StationFrom='" + from + "' AND StationTo= '" + to + "' AND TrainNO = '" + trno + "'";
                try (ResultSet result = statement.executeQuery(query)) {
                    while (result.next()) {
                        from1 = result.getString("StationFrom");
                        to1 = result.getString("StationTo");
                        no = result.getString("TrainNo");
                        name = result.getString("Name");
                        distance = result.getString("Distance");
                        type = result.getString("TrainType");
                        arrtime = result.getString("ArrTime");
                        deptime = result.getString("DepTime");
                        switch (seat) {
                            case "AC1":
                                seat1 = result.getString("AC1Fare");
                                break;
                            case "AC2":
                                seat1 = result.getString("AC2Fare");
                                break;
                            case "AC3":
                                seat1 = result.getString("AC3Fare");
                                break;
                            case "SL":
                                seat1 = result.getString("SLFare");
                                break;
                            default:
                                break;
                        }

                        if (from.equals(from1) && to.equals(to1) && trno.equals(no)) {
                            flag = 0;
                            break;
                        }
                    }

                    if (flag != 0) {
                        JOptionPane.showMessageDialog(this, "This train not found!!, Please enter other train!!");
                    } else {
                        try (Statement statement1 = conn.createStatement()) {
                            String sql1 = "TRUNCATE passrecord";
                            statement1.executeUpdate(sql1);
                            String sql = "DELETE FROM passrecord";
                            statement1.executeUpdate(sql);
                            String query1 = "INSERT into passrecord(pName, pGender, pAge, pAction, StationFrom, StationTo, TrainNo, Distance, TrainType, SeetFare, trainName,ArrTime,DepTime) VALUES('" + txtPassengerName.getText() + "','" + gender + "','" + txtAge.getText() + "','" + seat + "','" + from1 + "','" + to1 + "', '" + no + "','" + distance + "','" + type + "', '" + seat1 + "','" + name + "', '" + arrtime + "','" + deptime + "');";
                            statement1.executeUpdate(query1);
                            Ticket al;
                            al = new Ticket();
                            al.setVisible(true);
                            this.setVisible(false);
                        }
                    }
                }
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_btnBookTicketActionPerformed

    private void txtTrainNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrainNumberKeyTyped
        char ch = evt.getKeyChar();
        if (!(Character.isDigit(ch) || (ch == KeyEvent.VK_BACK_SPACE) || ch == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtTrainNumberKeyTyped

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        AdminDashBoard pdf = new AdminDashBoard();
        pdf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyTyped
        char ch = evt.getKeyChar();
        if (!(Character.isDigit(ch) || (ch == KeyEvent.VK_BACK_SPACE) || ch == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtAgeKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBookTicket;
    private javax.swing.JButton btnResetForm;
    private javax.swing.JComboBox<String> cmbSeat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JComboBox<String> txtGender;
    private javax.swing.JTextField txtPassengerName;
    private javax.swing.JTextField txtTo;
    private javax.swing.JTextField txtTrainNumber;
    // End of variables declaration//GEN-END:variables
}
