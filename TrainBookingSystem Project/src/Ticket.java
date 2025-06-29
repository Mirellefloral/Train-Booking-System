// Import packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ticket extends javax.swing.JFrame {

    /**
     * Creates new form Ticket
     */
    public Ticket() {
        this.name2 = PassengerDetailsForm.PassName11;
        initComponents();
    }
    String name2;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblTrName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblTrNo = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPassName = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lblTrType = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblFrom = new javax.swing.JLabel();
        lblTo = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lblDepTime = new javax.swing.JLabel();
        lblArrival = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lblFare = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblAction = new javax.swing.JLabel();
        lblDistance = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Booked Ticket");

        jLabel2.setBackground(new java.awt.Color(255, 204, 204));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 0, 102));
        jLabel2.setText("Train Name");

        lblTrName.setBackground(new java.awt.Color(255, 204, 204));
        lblTrName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTrName.setForeground(new java.awt.Color(102, 0, 102));
        lblTrName.setName("frame5"); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 204, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 0, 102));
        jLabel4.setText("Train No");

        lblGender.setBackground(new java.awt.Color(255, 204, 204));
        lblGender.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblGender.setForeground(new java.awt.Color(102, 0, 102));
        lblGender.setName("frame5"); // NOI18N

        lblTrNo.setBackground(new java.awt.Color(255, 204, 204));
        lblTrNo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTrNo.setForeground(new java.awt.Color(102, 0, 102));
        lblTrNo.setName("frame5"); // NOI18N

        jLabel7.setBackground(new java.awt.Color(255, 204, 204));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 0, 102));
        jLabel7.setText("Pass Name");

        lblPassName.setBackground(new java.awt.Color(255, 204, 204));
        lblPassName.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPassName.setForeground(new java.awt.Color(102, 0, 102));
        lblPassName.setName("frame5"); // NOI18N

        lblAge.setBackground(new java.awt.Color(255, 204, 204));
        lblAge.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblAge.setForeground(new java.awt.Color(102, 0, 102));
        lblAge.setName("frame5"); // NOI18N

        jLabel10.setBackground(new java.awt.Color(255, 204, 204));
        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 0, 102));
        jLabel10.setText("Age");

        jLabel11.setBackground(new java.awt.Color(255, 204, 204));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(102, 0, 102));
        jLabel11.setText("Train Type");

        lblTrType.setBackground(new java.awt.Color(255, 204, 204));
        lblTrType.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTrType.setForeground(new java.awt.Color(102, 0, 102));
        lblTrType.setName("frame5"); // NOI18N

        jLabel13.setBackground(new java.awt.Color(255, 204, 204));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 0, 102));
        jLabel13.setText("Gender");

        jLabel14.setBackground(new java.awt.Color(255, 204, 204));
        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 0, 102));
        jLabel14.setText("From");

        jLabel15.setBackground(new java.awt.Color(255, 204, 204));
        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 0, 102));
        jLabel15.setText("To");

        lblFrom.setBackground(new java.awt.Color(255, 204, 204));
        lblFrom.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblFrom.setForeground(new java.awt.Color(102, 0, 102));
        lblFrom.setName("frame5"); // NOI18N

        lblTo.setBackground(new java.awt.Color(255, 204, 204));
        lblTo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblTo.setForeground(new java.awt.Color(102, 0, 102));
        lblTo.setName("frame5"); // NOI18N

        jLabel18.setBackground(new java.awt.Color(255, 204, 204));
        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 0, 102));
        jLabel18.setText("Departure");

        jLabel19.setBackground(new java.awt.Color(255, 204, 204));
        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 0, 102));
        jLabel19.setText("Arrived");

        lblDepTime.setBackground(new java.awt.Color(255, 204, 204));
        lblDepTime.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDepTime.setForeground(new java.awt.Color(102, 0, 102));
        lblDepTime.setName("frame5"); // NOI18N

        lblArrival.setBackground(new java.awt.Color(255, 204, 204));
        lblArrival.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblArrival.setForeground(new java.awt.Color(102, 0, 102));
        lblArrival.setName("frame5"); // NOI18N

        jLabel22.setBackground(new java.awt.Color(255, 204, 204));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(102, 0, 102));
        jLabel22.setText("Total Fare");

        lblFare.setBackground(new java.awt.Color(255, 204, 204));
        lblFare.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblFare.setForeground(new java.awt.Color(102, 0, 102));
        lblFare.setName("frame5"); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 153));
        jLabel3.setText("Total Distance");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 153));
        jLabel5.setText("Seat Type");

        lblAction.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblAction.setForeground(new java.awt.Color(153, 0, 153));
        lblAction.setName("frame5"); // NOI18N

        lblDistance.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblDistance.setForeground(new java.awt.Color(153, 0, 153));
        lblDistance.setName("frame5"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTrName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(lblTrNo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblTrType, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblPassName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(131, 131, 131)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(301, 301, 301)
                        .addComponent(lblDepTime, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(lblArrival, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(478, 478, 478)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(lblFare, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(522, 522, 522)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(301, 301, 301)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(34, 34, 34)
                                        .addComponent(lblTo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(145, 145, 145)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(lblDistance))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblAction, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(136, 136, 136))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel13, jLabel3, jLabel5, lblAction, lblAge, lblDistance});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTrName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTrNo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTrType, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassName, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblDistance)
                                    .addComponent(lblAction)))))
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(lblDepTime, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblArrival, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFare, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(136, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel13, jLabel3, jLabel5, lblAction, lblAge, lblDistance});

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Form generation
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        int flag = -1;
        // Exception Handling
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/railwaySystem?zeroDateTimeBehavior=convertToNull", "root", ""); Statement statement = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                String query = "SELECT * FROM passrecord WHERE pName='" + name2 + "'";
                try (ResultSet result = statement.executeQuery(query)) {
                    while (result.next()) {
                        String from1 = result.getString("StationFrom");
                        String to1 = result.getString("StationTo");
                        String trtype = result.getString("TrainType");
                        String trno = result.getString("TrainNo");
                        String trname = result.getString("trainName");
                        String arrtime = result.getString("ArrTime");
                        String distance = result.getString("Distance");
                        String deptime = result.getString("DepTime");
                        String page = result.getString("pAge");
                        String pname = result.getString("pName");
                        String gender = result.getString("pGender");
                        String action = result.getString("pAction");
                        String fare = result.getString("SeetFare");
                        lblTrType.setText(trtype);
                        lblFrom.setText(from1);
                        lblTo.setText(to1);
                        lblGender.setText(gender);
                        lblPassName.setText(pname);
                        lblTrName.setText(trname);
                        lblFare.setText(fare);
                        lblAction.setText(action);
                        lblDistance.setText(distance);
                        lblAge.setText(page);
                        lblDepTime.setText(deptime);
                        lblArrival.setText(arrtime);
                        lblTrNo.setText(trno);
                        break;

                    }
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_formWindowOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblAction;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblArrival;
    private javax.swing.JLabel lblDepTime;
    private javax.swing.JLabel lblDistance;
    private javax.swing.JLabel lblFare;
    private javax.swing.JLabel lblFrom;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblPassName;
    private javax.swing.JLabel lblTo;
    private javax.swing.JLabel lblTrName;
    private javax.swing.JLabel lblTrNo;
    private javax.swing.JLabel lblTrType;
    // End of variables declaration//GEN-END:variables
}
