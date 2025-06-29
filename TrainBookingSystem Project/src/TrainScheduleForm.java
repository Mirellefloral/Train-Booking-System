// Import Packages
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

// Form for scheduling trains
public class TrainScheduleForm extends javax.swing.JFrame {

    /**
     * Creates new form TrainScheduleForm
     */
    public TrainScheduleForm() {
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
        txtTrainNumber = new javax.swing.JTextField();
        btnSearchTrain = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTrainSchedule = new javax.swing.JTable();
        btnSearchTrain1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("TRAIN SCHEDULE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("Train Number");

        txtTrainNumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTrainNumber.setForeground(new java.awt.Color(0, 153, 153));
        txtTrainNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTrainNumberActionPerformed(evt);
            }
        });
        txtTrainNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTrainNumberKeyTyped(evt);
            }
        });

        btnSearchTrain.setBackground(new java.awt.Color(51, 255, 255));
        btnSearchTrain.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearchTrain.setForeground(new java.awt.Color(204, 0, 204));
        btnSearchTrain.setText("Search Train");
        btnSearchTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTrainActionPerformed(evt);
            }
        });

        tblTrainSchedule.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblTrainSchedule.setForeground(new java.awt.Color(0, 153, 153));
        tblTrainSchedule.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SR No.", "Station From", "Arrival", "Station To", "Departure", "Distance", "Day"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTrainSchedule);

        btnSearchTrain1.setBackground(new java.awt.Color(51, 255, 255));
        btnSearchTrain1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnSearchTrain1.setForeground(new java.awt.Color(204, 0, 204));
        btnSearchTrain1.setText("BACK");
        btnSearchTrain1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchTrain1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(743, 743, 743)
                .addComponent(btnSearchTrain1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(txtTrainNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(btnSearchTrain, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearchTrain1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTrainNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearchTrain, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtTrainNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTrainNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTrainNumberActionPerformed

    private void btnSearchTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTrainActionPerformed
         DefaultTableModel model =(DefaultTableModel)tblTrainSchedule.getModel();

        int flag = -1;
        String no = txtTrainNumber.getText();
        // Exception handling
        try {
            Class.forName("com.mysql.jdbc.Driver");
            ResultSet result;
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaySystem?zeroDateTimeBehavior=convertToNull", "root", ""); Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                String query = "SELECT * FROM traindetails WHERE TrainNo = '"+no+"' ;";
                result = statement.executeQuery(query);
                while (result.next()) {
                    String from1 = result.getString("StationFrom");
                    String to1 = result.getString("StationTo");
                    String no1 = result.getString("TrainNo");
                    String depaarture = result.getString("DepTime");
                    String arrival = result.getString("ArrTime");
                    String days = result.getString("days");
                    String distance = result.getString("Distance");
                    model.addRow(new Object[]{no1, from1, arrival, to1, depaarture, distance, days});
                    if (no.equals(no1) ) {
                        flag = 0;
                        break;
                    }
                }   result.close();
            }
            if (flag != 0) {
                JOptionPane.showMessageDialog(this, "We can't find any train of this route!!, Please find some other route!!");
                txtTrainNumber.setText("");
            }

        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        btnSearchTrain.setEnabled(false);
    }//GEN-LAST:event_btnSearchTrainActionPerformed
    // Action Buttons
    private void btnSearchTrain1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchTrain1ActionPerformed
        AdminDashBoard adb = new AdminDashBoard();
        adb.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSearchTrain1ActionPerformed

    private void txtTrainNumberKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTrainNumberKeyTyped
        char ch = evt.getKeyChar();
        if(!(Character.isDigit(ch) ||  (ch == KeyEvent.VK_BACK_SPACE) || ch == KeyEvent.VK_DELETE)){
            getToolkit().beep();
            evt.consume();
        }
        btnSearchTrain.setEnabled(true);
    }//GEN-LAST:event_txtTrainNumberKeyTyped

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearchTrain;
    private javax.swing.JButton btnSearchTrain1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTrainSchedule;
    private javax.swing.JTextField txtTrainNumber;
    // End of variables declaration//GEN-END:variables
}
