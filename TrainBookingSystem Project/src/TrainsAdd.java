// Import Packages
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.*;
import javax.swing.JOptionPane;

// For adding trains
public class TrainsAdd extends javax.swing.JFrame {

    /**
     * Creates new form TrainsAdd
     */
    public TrainsAdd() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cmbTrainSelect = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtFrom = new javax.swing.JTextField();
        txtTo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtArrivalTime = new javax.swing.JTextField();
        txtDate = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtSleeperFare = new javax.swing.JTextField();
        txtAC3Fare = new javax.swing.JTextField();
        txtAC2Fare = new javax.swing.JTextField();
        txtDistance = new javax.swing.JTextField();
        txtAC1Fare = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtTrainNo = new javax.swing.JTextField();
        txtTrainName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDays = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtDepartureTime = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Select train");

        cmbTrainSelect.setBackground(new java.awt.Color(51, 255, 255));
        cmbTrainSelect.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cmbTrainSelect.setForeground(new java.awt.Color(102, 0, 102));
        cmbTrainSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Passenger", "SupperFast", "Local", "InterCity", "Express"}));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("From");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("To");

        txtFrom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFrom.setForeground(new java.awt.Color(0, 153, 153));

        txtTo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTo.setForeground(new java.awt.Color(0, 153, 153));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setText("Arrival Time");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Departure Time");

        txtArrivalTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtArrivalTime.setForeground(new java.awt.Color(0, 153, 153));
        txtArrivalTime.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtArrivalTimeKeyTyped(evt);
            }
        });

        txtDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDate.setForeground(new java.awt.Color(0, 153, 153));
        txtDate.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDateKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Sleeper Fare");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("AC3 Fare");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("AC2 Fare");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("AC1 Fare");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("Distance");

        txtSleeperFare.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSleeperFare.setForeground(new java.awt.Color(0, 153, 153));
        txtSleeperFare.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSleeperFareKeyTyped(evt);
            }
        });

        txtAC3Fare.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAC3Fare.setForeground(new java.awt.Color(0, 153, 153));
        txtAC3Fare.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAC3FareKeyTyped(evt);
            }
        });

        txtAC2Fare.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAC2Fare.setForeground(new java.awt.Color(0, 153, 153));
        txtAC2Fare.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAC2FareKeyTyped(evt);
            }
        });

        txtDistance.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDistanceKeyTyped(evt);
            }
        });

        txtAC1Fare.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtAC1Fare.setForeground(new java.awt.Color(0, 153, 153));
        txtAC1Fare.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAC1FareKeyTyped(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(51, 255, 255));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(153, 0, 153));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(51, 255, 255));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnReset.setForeground(new java.awt.Color(153, 0, 153));
        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("Train No");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Name");

        txtTrainNo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTrainNo.setForeground(new java.awt.Color(0, 153, 153));
        txtTrainNo.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTrainNoKeyTyped(evt);
            }
        });

        txtTrainName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTrainName.setForeground(new java.awt.Color(0, 153, 153));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("Days");

        txtDays.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDays.setForeground(new java.awt.Color(0, 153, 153));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("Date");

        txtDepartureTime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDepartureTime.setForeground(new java.awt.Color(0, 153, 153));
        txtDepartureTime.addKeyListener(new java.awt.event.KeyAdapter() {

            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDepartureTimeKeyTyped(evt);
            }
        });

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
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(40, 40, 40).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(950, 950, 950).addComponent(btnBack)).addGroup(layout.createSequentialGroup().addGap(40, 40, 40).addComponent(cmbTrainSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addGap(40, 40, 40).addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(130, 130, 130).addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(200, 200, 200).addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addGap(40, 40, 40).addComponent(txtTrainNo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(80, 80, 80).addComponent(txtTrainName, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(90, 90, 90).addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addGap(40, 40, 40).addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(144, 144, 144).addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(99, 99, 99).addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(68, 68, 68).addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(70, 70, 70).addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addGap(40, 40, 40).addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(88, 88, 88).addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(58, 58, 58).addComponent(txtArrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(68, 68, 68).addComponent(txtDepartureTime, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(68, 68, 68).addComponent(txtDays, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addGap(32, 32, 32).addComponent(jLabel6).addGap(128, 128, 128).addComponent(jLabel7).addGap(132, 132, 132).addComponent(jLabel8).addGap(137, 137, 137).addComponent(jLabel9).addGap(140, 140, 140).addComponent(jLabel10)).addGroup(layout.createSequentialGroup().addGap(32, 32, 32).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING).addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(layout.createSequentialGroup().addComponent(txtSleeperFare, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(89, 89, 89).addComponent(txtAC3Fare, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))).addGap(64, 64, 64).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addComponent(txtAC2Fare, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(69, 69, 69).addComponent(txtAC1Fare, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)).addGroup(layout.createSequentialGroup().addGap(86, 86, 86).addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))).addGap(68, 68, 68).addComponent(txtDistance, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout.createSequentialGroup().addGap(30, 30, 30).addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)).addComponent(btnBack)).addGap(10, 10, 10).addComponent(cmbTrainSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE).addGap(26, 26, 26).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))).addGap(7, 7, 7).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(txtTrainNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(txtTrainName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(19, 19, 19).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(layout.createSequentialGroup().addGap(10, 10, 10).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))).addGap(7, 7, 7).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(txtArrivalTime, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(txtDepartureTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(txtDays, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)).addGap(45, 45, 45).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel6).addComponent(jLabel7).addComponent(jLabel8).addComponent(jLabel9).addComponent(jLabel10)).addGap(14, 14, 14).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(txtAC1Fare, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(txtDistance, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE).addGroup(layout.createSequentialGroup().addGap(4, 4, 4).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(txtSleeperFare, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(txtAC3Fare, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(txtAC2Fare, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))).addGap(45, 45, 45).addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)).addContainerGap(181, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        int flag = -1;
        String strTrainNo = txtTrainNo.getText();
        String cmbTrainType = (String) cmbTrainSelect.getSelectedItem();
        String time = txtDepartureTime.getText();
        String time1 = txtArrivalTime.getText();
        LocalTime depTime = LocalTime.parse(time);
        LocalTime arrTime = LocalTime.parse(time1);

        int answer = JOptionPane.showConfirmDialog(null, "Do you want to Add?");
        if (answer == JOptionPane.YES_OPTION) {
            // Exception Handling
            try {
                Class.forName("com.mysql.jdbc.Driver");
                //Statement statement = conn.createStatement();
                try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaySystem?zeroDateTimeBehavior=convertToNull", "root", ""); //Statement statement = conn.createStatement();
                        Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                    String query = "SELECT * FROM traindetails";
                    try (ResultSet result = statement.executeQuery(query)) {
                        while (result.next()) {

                            String trainno = result.getString("TrainNo");
                            if (strTrainNo.equals(trainno)) {

                                JOptionPane.showMessageDialog(this, "This train already exist, please add other train!!!");
                                flag = 0;
                                break;
                            }
                        }

                        if (flag != 0) {
                            try (Statement statement1 = conn.createStatement()) {
                                String query1 = "INSERT into traindetails(TrainType, TrainNo, Name, StationFrom, StationTo, ArrTime, DepTime, SLFare, AC3Fare, AC2Fare, AC1Fare,Distance, Days, date )VALUES('" + cmbTrainType + "','" + txtTrainNo.getText() + "','" + txtTrainName.getText() + "','" + txtFrom.getText() + "','" + txtTo.getText() + "','" + txtArrivalTime.getText() + "','" + txtDepartureTime.getText()+ "','" + txtSleeperFare.getText() + "','" + txtAC3Fare.getText() + "','" + txtAC2Fare.getText() + "','" + txtAC1Fare.getText() + "','" + txtDistance.getText() + "','" + txtDays.getText() + "','" + txtDate.getText() + "');";
                                statement1.executeUpdate(query1);
                                AdminDashBoard adb;
                                adb = new AdminDashBoard();
                                adb.setVisible(true);
                                dispose();
                            }
                        }
                    }
                }
            } catch (HeadlessException | ClassNotFoundException | SQLException e) {
                System.out.println(e);
            }
        }

        btnSave.setEnabled(false);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtTrainNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrainNoKeyTyped
        char ch = evt.getKeyChar();
        if (!(Character.isDigit(ch) || (ch == KeyEvent.VK_BACK_SPACE) || ch == KeyEvent.VK_DELETE)) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtTrainNoKeyTyped
    // Enter Date

    private void txtDateKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDateKeyTyped
        char ch = evt.getKeyChar();
        if (Character.isLetter(ch) && !evt.isAltDown()) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDateKeyTyped
    // Enter Arrival Time

    private void txtArrivalTimeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtArrivalTimeKeyTyped
        char ch = evt.getKeyChar();
        if (Character.isLetter(ch) && !evt.isAltDown()) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtArrivalTimeKeyTyped
    // Enter departure time

    private void txtDepartureTimeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDepartureTimeKeyTyped
        char ch = evt.getKeyChar();
        if (Character.isLetter(ch) && !evt.isAltDown()) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDepartureTimeKeyTyped
    // Enter Distance

    private void txtDistanceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDistanceKeyTyped
        char ch = evt.getKeyChar();
        if (Character.isLetter(ch) && !evt.isAltDown()) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtDistanceKeyTyped
    // Enter Fares

    private void txtAC1FareKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAC1FareKeyTyped
        char ch = evt.getKeyChar();
        if (Character.isLetter(ch) && !evt.isAltDown()) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtAC1FareKeyTyped

    private void txtAC2FareKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAC2FareKeyTyped
        char ch = evt.getKeyChar();
        if (Character.isLetter(ch) && !evt.isAltDown()) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtAC2FareKeyTyped

    private void txtAC3FareKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAC3FareKeyTyped
        char ch = evt.getKeyChar();
        if (Character.isLetter(ch) && !evt.isAltDown()) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtAC3FareKeyTyped

    private void txtSleeperFareKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSleeperFareKeyTyped
        char ch = evt.getKeyChar();
        if (Character.isLetter(ch) && !evt.isAltDown()) {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_txtSleeperFareKeyTyped

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        AdminDashBoard pdf = new AdminDashBoard();
        pdf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed
    // Action button

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        btnSave.setEnabled(true);
        txtAC2Fare.setText("");
        txtAC3Fare.setText("");
        txtArrivalTime.setText("");
        txtDate.setText("");
        txtDays.setText("");
        txtDepartureTime.setText("");
        txtDistance.setText("");
        txtFrom.setText("");
        txtSleeperFare.setText("");
        txtTo.setText("");
        txtTrainName.setText("");
        txtTrainNo.setText("");
        txtAC1Fare.setText("");
    }//GEN-LAST:event_btnResetActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cmbTrainSelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtAC1Fare;
    private javax.swing.JTextField txtAC2Fare;
    private javax.swing.JTextField txtAC3Fare;
    private javax.swing.JTextField txtArrivalTime;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtDays;
    private javax.swing.JTextField txtDepartureTime;
    private javax.swing.JTextField txtDistance;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextField txtSleeperFare;
    private javax.swing.JTextField txtTo;
    private javax.swing.JTextField txtTrainName;
    private javax.swing.JTextField txtTrainNo;
    // End of variables declaration//GEN-END:variables
}
