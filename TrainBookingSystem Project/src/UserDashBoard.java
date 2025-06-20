// This is class for admin dashboard
public class UserDashBoard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashBoard
     */
    public UserDashBoard() {
        initComponents();
    }

    /*
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnTicketBooking = new javax.swing.JButton();
        btnTrainSchedule = new javax.swing.JButton();
        btnTrainFind = new javax.swing.JButton();
        btnPassengerDetails = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("USER DASHBOARD");

        btnTicketBooking.setBackground(new java.awt.Color(51, 255, 255));
        btnTicketBooking.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTicketBooking.setForeground(new java.awt.Color(153, 0, 153));
        btnTicketBooking.setText("Ticket Booking");
        btnTicketBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketBookingActionPerformed(evt);
            }
        });

        btnTrainSchedule.setBackground(new java.awt.Color(51, 255, 255));
        btnTrainSchedule.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTrainSchedule.setForeground(new java.awt.Color(153, 0, 153));
        btnTrainSchedule.setText("Train Schedule");
        btnTrainSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrainScheduleActionPerformed(evt);
            }
        });

        btnTrainFind.setBackground(new java.awt.Color(51, 255, 255));
        btnTrainFind.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTrainFind.setForeground(new java.awt.Color(153, 0, 153));
        btnTrainFind.setText("Find Train");
        btnTrainFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrainFindActionPerformed(evt);
            }
        });
        
        btnPassengerDetails.setBackground(new java.awt.Color(51, 255, 255));
        btnPassengerDetails.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnPassengerDetails.setForeground(new java.awt.Color(153, 0, 153));
        btnPassengerDetails.setText("Passenger Details");
        btnPassengerDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassengerDetailsActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(51, 255, 255));
        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(153, 0, 153));
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(141, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTrainFind, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTicketBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(224, 224, 224)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTrainSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnPassengerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(139, 139, 139))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnPassengerDetails, btnTicketBooking, btnTrainFind, btnTrainSchedule});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnLogout)
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTicketBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTrainSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnTrainFind, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPassengerDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(183, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnPassengerDetails, btnTicketBooking, btnTrainFind, btnTrainSchedule});

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Button for performing actions
    private void btnTicketBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketBookingActionPerformed
        TicketBookingForm tbf = new TicketBookingForm();
        tbf.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnTicketBookingActionPerformed

    private void btnTrainScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrainScheduleActionPerformed
        TrainScheduleForm ts = new TrainScheduleForm();
        ts.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTrainScheduleActionPerformed

    private void btnTrainFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrainFindActionPerformed
        TrainBetweenStation tbs = new TrainBetweenStation();
        tbs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnTrainFindActionPerformed

    private void btnPassengerDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassengerDetailsActionPerformed
        PassengerDetailsForm pdf = new PassengerDetailsForm();
        pdf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPassengerDetailsActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        HomeScreen hs = new HomeScreen();
        hs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPassengerDetails;
    private javax.swing.JButton btnTicketBooking;
    private javax.swing.JButton btnTrainFind;
    private javax.swing.JButton btnTrainSchedule;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables

   
}
