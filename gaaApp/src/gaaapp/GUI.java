/*
*Author@: X01420442-Paul Norton, -Liam Flynn, -Jack Galleher
*Date: 04/12/2017
*file:Standard.Java
*/
package gaaapp;
// Imported packages needed for the application to run
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javax.swing.JOptionPane;
//Creates and declares variables
public class GUI extends javax.swing.JFrame {
    String firstName="";
    String lastName="";
    Ticket tick;
    String details = "";
    String details1 ="";
    String seatNum="";
    int numTicket=0;
    int teamChoice=0;
    int gameChoice=0;
    double cost=0.0;
    String answer="";
    String answer1="";
    Random r = new Random();
    int numCheck;
    //Constructor for the GUI
    public GUI() {
        initComponents();
        //Sets the team choices invisible on load
        teamDublin.setVisible(false); 
        teamCork.setVisible(false); 
        teamGalway.setVisible(false); 
        teamMeath.setVisible(false); 
        teamBelfast.setVisible(false); 
        //Sets the game type choices invisible on load
        gameHome.setVisible(false); 
        gameAway.setVisible(false); 
        gameFriendly.setVisible(false); 
        //Sets the user name options invisible on load
        fName.setVisible(false);
        lName.setVisible(false);
        fNameTF.setVisible(false);
        lNameTF.setVisible(false);
        //Sets the ticket number options invisible on load
        numT.setVisible(false);
        numTTF.setVisible(false);
        //Sets the seat number options invisible on load
        tickNumLbl.setVisible(false);
        seatNumLbl.setVisible(false);
        //Sets the cost options invisible on load
        CostLb.setVisible(false);        
        printedCost.setVisible(false);
        //Sets the buttons invisible on load   
        jButton2.setVisible(false);
        showBT.setVisible(false);        
    }
    @SuppressWarnings("unchecked") //Creates the visual coding required for the GUI layout
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ticketType = new javax.swing.ButtonGroup();
        teamChooser = new javax.swing.ButtonGroup();
        gameTypeChoice = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        TitleLb = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        showBT = new javax.swing.JButton();
        ClearBT = new javax.swing.JButton();
        ExitBT = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        fNameTF = new javax.swing.JTextField();
        lNameTF = new javax.swing.JTextField();
        uStandBT = new javax.swing.JRadioButton();
        pStandBT = new javax.swing.JRadioButton();
        gameHome = new javax.swing.JRadioButton();
        lName = new javax.swing.JLabel();
        fName = new javax.swing.JLabel();
        teamBelfast = new javax.swing.JRadioButton();
        teamGalway = new javax.swing.JRadioButton();
        teamDublin = new javax.swing.JRadioButton();
        teamCork = new javax.swing.JRadioButton();
        teamMeath = new javax.swing.JRadioButton();
        lStandBT = new javax.swing.JRadioButton();
        gameFriendly = new javax.swing.JRadioButton();
        gameAway = new javax.swing.JRadioButton();
        numT = new javax.swing.JLabel();
        numTTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tickNumLbl = new javax.swing.JLabel();
        CostLb = new javax.swing.JLabel();
        seatNumLbl = new javax.swing.JLabel();
        printedCost = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        Image = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(204, 51, 0));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, -1, -1));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        TitleLb.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        TitleLb.setForeground(new java.awt.Color(204, 204, 204));
        TitleLb.setText("GAA Ticket Machine");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(227, Short.MAX_VALUE)
                .addComponent(TitleLb, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(TitleLb)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 720, -1));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setForeground(new java.awt.Color(51, 51, 51));

        showBT.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        showBT.setText("Show History");
        showBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showBTActionPerformed(evt);
            }
        });

        ClearBT.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ClearBT.setText("Clear");
        ClearBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBTActionPerformed(evt);
            }
        });

        ExitBT.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        ExitBT.setForeground(new java.awt.Color(51, 51, 51));
        ExitBT.setText("Exit");
        ExitBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBTActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        fNameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameTFActionPerformed(evt);
            }
        });

        uStandBT.setBackground(new java.awt.Color(51, 51, 51));
        ticketType.add(uStandBT);
        uStandBT.setForeground(new java.awt.Color(255, 255, 255));
        uStandBT.setText("Upper Stand");
        uStandBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uStandBTActionPerformed(evt);
            }
        });

        pStandBT.setBackground(new java.awt.Color(51, 51, 51));
        ticketType.add(pStandBT);
        pStandBT.setForeground(new java.awt.Color(255, 255, 255));
        pStandBT.setText("Premium Stand");
        pStandBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pStandBTActionPerformed(evt);
            }
        });

        gameHome.setBackground(new java.awt.Color(51, 51, 51));
        gameTypeChoice.add(gameHome);
        gameHome.setForeground(new java.awt.Color(255, 255, 255));
        gameHome.setText("Home");
        gameHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameHomeActionPerformed(evt);
            }
        });

        lName.setForeground(new java.awt.Color(255, 255, 255));
        lName.setText("Last Name:");

        fName.setForeground(new java.awt.Color(255, 255, 255));
        fName.setText("First Name:");

        teamBelfast.setBackground(new java.awt.Color(51, 51, 51));
        teamChooser.add(teamBelfast);
        teamBelfast.setForeground(new java.awt.Color(255, 255, 255));
        teamBelfast.setText("Belfast");
        teamBelfast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamBelfastActionPerformed(evt);
            }
        });

        teamGalway.setBackground(new java.awt.Color(51, 51, 51));
        teamChooser.add(teamGalway);
        teamGalway.setForeground(new java.awt.Color(255, 255, 255));
        teamGalway.setText("Galway");
        teamGalway.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamGalwayActionPerformed(evt);
            }
        });

        teamDublin.setBackground(new java.awt.Color(51, 51, 51));
        teamChooser.add(teamDublin);
        teamDublin.setForeground(new java.awt.Color(255, 255, 255));
        teamDublin.setText("Dublin");
        teamDublin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamDublinActionPerformed(evt);
            }
        });

        teamCork.setBackground(new java.awt.Color(51, 51, 51));
        teamChooser.add(teamCork);
        teamCork.setForeground(new java.awt.Color(255, 255, 255));
        teamCork.setText("Cork");
        teamCork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamCorkActionPerformed(evt);
            }
        });

        teamMeath.setBackground(new java.awt.Color(51, 51, 51));
        teamChooser.add(teamMeath);
        teamMeath.setForeground(new java.awt.Color(255, 255, 255));
        teamMeath.setText("Meath");
        teamMeath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                teamMeathActionPerformed(evt);
            }
        });

        lStandBT.setBackground(new java.awt.Color(51, 51, 51));
        ticketType.add(lStandBT);
        lStandBT.setForeground(new java.awt.Color(255, 255, 255));
        lStandBT.setText("Lower Stand");
        lStandBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lStandBTActionPerformed(evt);
            }
        });

        gameFriendly.setBackground(new java.awt.Color(51, 51, 51));
        gameTypeChoice.add(gameFriendly);
        gameFriendly.setForeground(new java.awt.Color(255, 255, 255));
        gameFriendly.setText("Friendly");
        gameFriendly.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameFriendlyActionPerformed(evt);
            }
        });

        gameAway.setBackground(new java.awt.Color(51, 51, 51));
        gameTypeChoice.add(gameAway);
        gameAway.setForeground(new java.awt.Color(255, 255, 255));
        gameAway.setText("Away");
        gameAway.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gameAwayActionPerformed(evt);
            }
        });

        numT.setForeground(new java.awt.Color(255, 255, 255));
        numT.setText("Number of tickets:");

        numTTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTTFActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("( 1* Free Beverage )");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("( Tour )");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("( Tour + Free Bar )");

        tickNumLbl.setForeground(new java.awt.Color(255, 255, 255));
        tickNumLbl.setText("Seat Number:");

        CostLb.setForeground(new java.awt.Color(255, 255, 255));
        CostLb.setText("Total Cost:");

        seatNumLbl.setForeground(new java.awt.Color(255, 255, 255));

        printedCost.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(fName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(ExitBT)
                                    .addGap(58, 58, 58)
                                    .addComponent(ClearBT, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(tickNumLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(seatNumLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(75, 75, 75)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(CostLb)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(printedCost, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(showBT)
                                    .addGap(58, 58, 58)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(numT)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(numTTF, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(teamGalway)
                                                .addComponent(gameHome))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(teamDublin)
                                                .addComponent(gameFriendly)))
                                        .addComponent(lStandBT)
                                        .addComponent(jLabel2))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3)
                                                .addComponent(uStandBT))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(pStandBT)
                                                .addComponent(jLabel4)))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(gameAway)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addComponent(teamBelfast)
                                                    .addGap(43, 43, 43)
                                                    .addComponent(teamMeath)
                                                    .addGap(45, 45, 45)
                                                    .addComponent(teamCork)))
                                            .addGap(0, 0, Short.MAX_VALUE)))))
                            .addGap(65, 65, 65))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fName)
                    .addComponent(fNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lName)
                    .addComponent(lNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(uStandBT)
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel3))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(lStandBT)
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel2))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(pStandBT)
                                .addGap(1, 1, 1)
                                .addComponent(jLabel4)))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(teamDublin)
                                .addComponent(teamBelfast))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(teamGalway)
                                .addComponent(teamMeath)
                                .addComponent(teamCork)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(gameHome)
                                    .addComponent(gameFriendly)
                                    .addComponent(gameAway))
                                .addGap(21, 21, 21)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(numT)
                                    .addComponent(numTTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(tickNumLbl)
                                .addComponent(CostLb))
                            .addComponent(printedCost, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(seatNumLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showBT)
                    .addComponent(ClearBT)
                    .addComponent(ExitBT)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 560, 600));

        Image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gaaapp/lawn.jpg"))); // NOI18N
        Image.setText("jLabel5");
        getContentPane().add(Image, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, -20, 880, 920));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Button event handler for the Lower stand Option
    private void lStandBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lStandBTActionPerformed
        //Creates new instance of the Standard child class
        tick = new Standard();
        //Sets the team choice radio buttoms to visible.
        teamDublin.setVisible(true); 
        teamCork.setVisible(true); 
        teamGalway.setVisible(true); 
        teamMeath.setVisible(true); 
        teamBelfast.setVisible(true);            
    }//GEN-LAST:event_lStandBTActionPerformed
    //Button event handler for the Upper stand Option
    private void uStandBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uStandBTActionPerformed
        //Creates new instance of the Upper child class
        tick = new Upper();
        //Sets the team choice radio buttoms to visible.
        teamDublin.setVisible(true); 
        teamCork.setVisible(true); 
        teamGalway.setVisible(true); 
        teamMeath.setVisible(true); 
        teamBelfast.setVisible(true); 
    }//GEN-LAST:event_uStandBTActionPerformed
    //Button event handler for the Clear all fields Option
    private void ClearBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBTActionPerformed
        //Clears all radio button choices
        ticketType.clearSelection();
        teamChooser.clearSelection();
        gameTypeChoice.clearSelection();
        //clears all entered field text
        fNameTF.setText("");
        lNameTF.setText("");
        numTTF.setText("");
        printedCost.setText("");
        seatNumLbl.setText("");
        //sets all team choices to invisisble
        teamDublin.setVisible(false); 
        teamCork.setVisible(false); 
        teamGalway.setVisible(false); 
        teamMeath.setVisible(false); 
        teamBelfast.setVisible(false); 
        //sets all game type choices to invisisble
        gameHome.setVisible(false); 
        gameAway.setVisible(false); 
        gameFriendly.setVisible(false); 
        //sets all name options to invisisble
        fName.setVisible(false);
        lName.setVisible(false);
        fNameTF.setVisible(false);
        lNameTF.setVisible(false);
        //sets all ticket options to invisisble
        numT.setVisible(false);
        numTTF.setVisible(false);
        //sets all seat number options to invisisble
        tickNumLbl.setVisible(false);
        seatNumLbl.setVisible(false);
        //sets all cost options to invisisble
        CostLb.setVisible(false);        
        printedCost.setVisible(false);
        //sets the buttons to invisible    
        jButton2.setVisible(false);
        showBT.setVisible(false);
    }//GEN-LAST:event_ClearBTActionPerformed
    //Event handler for the Show History Button - Shows the history of transactions that have been made
    private void showBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBTActionPerformed
        //try/ when the information is entered it is saved to the text file and it can be read by the user
        //the while loop seen in the code is used so we can see all the transactions made by the user in the text file and it isnt overwritten.
        try{
            File f = new File("football tickets.txt");
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String details;
            details = br.readLine();
            while(details!=null){
                JOptionPane.showMessageDialog(null,details);
                details = br.readLine();
            }
            br.close();
        }        
        //catch for the read to file option
        catch(IOException e){
            System.out.println(e);
            System.out.println("Sorry I can't read the file");
        }
    }//GEN-LAST:event_showBTActionPerformed
    //Button event handler for the Premium Option
    private void pStandBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pStandBTActionPerformed
        //Creates new instance of the Premium child class
        tick = new Premium();
        //Sets the team choice radio buttoms to visible.
        teamDublin.setVisible(true); 
        teamCork.setVisible(true); 
        teamGalway.setVisible(true); 
        teamMeath.setVisible(true); 
        teamBelfast.setVisible(true); 
    }//GEN-LAST:event_pStandBTActionPerformed
    //Submit Button - Implements changes made using the application
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Validation - Checks for errors
        if (lNameTF.getText().equals("")||fNameTF.getText().equals("")||ticketType.getSelection()==null||teamChooser.getSelection()==null||gameTypeChoice.getSelection()==null||(numTTF.getText().equals(""))){
            JOptionPane.showMessageDialog(null, "Error: All fields must be filled");
        }        
        else {
            numCheck=Integer.parseInt(numTTF.getText());
            if (numCheck>0){             
                if (tick!=null){
                tick.setTeamChoice(teamChoice);
                tick.setGameChoice(gameChoice);
                tick.setNumTicket(Integer.parseInt(numTTF.getText()));
                int rand1 = r.nextInt(9);
                int rand2 = r.nextInt(9);
                int rand3 = r.nextInt(9);
                seatNum=""+rand1+rand2+rand3;
                tick.setSeatNum(seatNum);
                }
                //if statements to check for selected radio buttons in addition to calcultaions 
                //if statement for lower stand button
                if (lStandBT.isSelected()){
                    ((Standard)(tick)).computeCost();
                    cost=((Standard)(tick)).getCost();
                    seatNum=((Standard)(tick)).getSeatNum();
                    details1=tick.getDetails()+((Standard)(tick)).getStandardDetails();
                }
                //if statement for Upper stand button
                else if(uStandBT.isSelected()){
                    ((Upper)(tick)).computeCost();
                    cost=((Upper)(tick)).getCost();
                    seatNum=((Upper)(tick)).getSeatNum();
                    details1=tick.getDetails()+((Upper)(tick)).getUpperDetails();
                }
                //if statement for Premium stand button
                else if(pStandBT.isSelected()){
                    ((Premium)(tick)).computeCost();
                    cost=((Premium)(tick)).getCost();
                    seatNum=((Premium)(tick)).getSeatNum();
                    details1=tick.getDetails()+((Premium)(tick)).getPremDetails();                  
                }
                tick.setSeatNum(seatNum);
                seatNumLbl.setText(seatNum);
                answer = ""+cost;
                printedCost.setText(answer);
                //writing to a file 
                //this code saves the information to the text file known as football tickets.txt
                try{
                    File f = new File("football tickets.txt");
                    FileWriter fw = new FileWriter(f,true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    firstName = fNameTF.getText();
                    lastName = lNameTF.getText();
                    details = firstName+" "+lastName;
                    JOptionPane.showMessageDialog(null, "Thanks "+details+" your tickets have been purchased");
                    bw.write("Name: "+details+details1);
                    bw.newLine();
                    bw.close();
                    //Catch for the Filewriter
                }
                catch(IOException e){
                    System.out.println(e);
                    System.out.println("sorry problem writing to the file");
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Error: Not a valid number entered for tickets.");
            }    
        }
    }//GEN-LAST:event_jButton2ActionPerformed
    //Button Event Handler for the Exit Button
    private void ExitBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBTActionPerformed
        //Closes the application
        System.exit(0);
    }//GEN-LAST:event_ExitBTActionPerformed
    //Cant delete this redudent code
    private void fNameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameTFActionPerformed
    }//GEN-LAST:event_fNameTFActionPerformed
    //Cant delete this redudent code
    private void numTTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTTFActionPerformed
    }//GEN-LAST:event_numTTFActionPerformed
    //Radio button event handler for Friendly Game choice
    private void gameFriendlyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameFriendlyActionPerformed
        //Assigns a value to a veriable
        gameChoice=2;
        //sets the name fields and visible
        fName.setVisible(true);
        lName.setVisible(true);
        fNameTF.setVisible(true);
        lNameTF.setVisible(true);
        //sets the ticket number fields as visible
        numT.setVisible(true);
        numTTF.setVisible(true);
        //sets the seat number fields and visisble
        tickNumLbl.setVisible(true);
        seatNumLbl.setVisible(true);
        //sets the cost fields as visisble
        CostLb.setVisible(true);        
        printedCost.setVisible(true);
        //sets these buttons as visible   
        jButton2.setVisible(true);       
        showBT.setVisible(true);
    }//GEN-LAST:event_gameFriendlyActionPerformed
    //Radio button event handler for Away Game choice
    private void gameAwayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameAwayActionPerformed
        //Assigns a value to a veriable
        gameChoice=1;
        //sets the name fields and visible
        fName.setVisible(true);
        lName.setVisible(true);
        fNameTF.setVisible(true);
        lNameTF.setVisible(true);
        //sets the ticket number fields as visible
        numT.setVisible(true);
        numTTF.setVisible(true);;
        //sets the seat number fields and visisble
        tickNumLbl.setVisible(true);
        seatNumLbl.setVisible(true);
        //sets the cost fields as visisble
        CostLb.setVisible(true);        
        printedCost.setVisible(true);
        //sets these buttons as visible      
        jButton2.setVisible(true);      
        showBT.setVisible(true);        
    }//GEN-LAST:event_gameAwayActionPerformed
    //Radio button event handler for Home Game choice
    private void gameHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gameHomeActionPerformed
        //Assigns a value to a veriable
        gameChoice=0;
        //sets the name fields and visible
        fName.setVisible(true);
        lName.setVisible(true);
        fNameTF.setVisible(true);
        lNameTF.setVisible(true);
        //sets the ticket number fields as visible
        numT.setVisible(true);
        numTTF.setVisible(true);
        //sets the seat number fields and visisble
        tickNumLbl.setVisible(true);
        seatNumLbl.setVisible(true);
        //sets the cost fields as visisble
        CostLb.setVisible(true);        
        printedCost.setVisible(true);
        //sets these buttons as visible    
        jButton2.setVisible(true);
        showBT.setVisible(true);
    }//GEN-LAST:event_gameHomeActionPerformed
    //Radio button event handler for the Cork team choice
    private void teamCorkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamCorkActionPerformed
        //Assigns a value to a veriable
        teamChoice=1;
        //Sets the radio buttons for the game type visiable
        gameHome.setVisible(true); 
        gameAway.setVisible(true); 
        gameFriendly.setVisible(true); 
    }//GEN-LAST:event_teamCorkActionPerformed
    //Radio button event handler for the Meath team choice
    private void teamMeathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamMeathActionPerformed
        //Assigns a value to a veriable
        teamChoice=3;
        //Sets the radio buttons for the game type visiable
        gameHome.setVisible(true); 
        gameAway.setVisible(true); 
        gameFriendly.setVisible(true); 
    }//GEN-LAST:event_teamMeathActionPerformed
    //Radio button event handler for the Galway team choice
    private void teamGalwayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamGalwayActionPerformed
        //Assigns a value to a veriable
        teamChoice=2;
        //Sets the radio buttons for the game type visiable
        gameHome.setVisible(true); 
        gameAway.setVisible(true); 
        gameFriendly.setVisible(true); 
    }//GEN-LAST:event_teamGalwayActionPerformed
    //Radio button event handler for the Belfast team choice
    private void teamBelfastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamBelfastActionPerformed
        //Assigns a value to a veriable
        teamChoice=4;
        //Sets the radio buttons for the game type visiable
        gameHome.setVisible(true); 
        gameAway.setVisible(true); 
        gameFriendly.setVisible(true); 
    }//GEN-LAST:event_teamBelfastActionPerformed
    //Radio button event handler for the Dublin team choice
    private void teamDublinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_teamDublinActionPerformed
        //Assigns a value to a veriable
        teamChoice=0;
        //Sets the radio buttons for the game type visiable
        gameHome.setVisible(true); 
        gameAway.setVisible(true); 
        gameFriendly.setVisible(true); 
    }//GEN-LAST:event_teamDublinActionPerformed
    //Method to create GUI application???
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }    
    // Creates the GUI design choices
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearBT;
    private javax.swing.JLabel CostLb;
    private javax.swing.JButton ExitBT;
    private javax.swing.JLabel Image;
    private javax.swing.JLabel TitleLb;
    private javax.swing.JLabel fName;
    private javax.swing.JTextField fNameTF;
    private javax.swing.JRadioButton gameAway;
    private javax.swing.JRadioButton gameFriendly;
    private javax.swing.JRadioButton gameHome;
    private javax.swing.ButtonGroup gameTypeChoice;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lName;
    private javax.swing.JTextField lNameTF;
    private javax.swing.JRadioButton lStandBT;
    private javax.swing.JLabel numT;
    private javax.swing.JTextField numTTF;
    private javax.swing.JRadioButton pStandBT;
    private javax.swing.JLabel printedCost;
    private javax.swing.JLabel seatNumLbl;
    private javax.swing.JButton showBT;
    private javax.swing.JRadioButton teamBelfast;
    private javax.swing.ButtonGroup teamChooser;
    private javax.swing.JRadioButton teamCork;
    private javax.swing.JRadioButton teamDublin;
    private javax.swing.JRadioButton teamGalway;
    private javax.swing.JRadioButton teamMeath;
    private javax.swing.JLabel tickNumLbl;
    private javax.swing.ButtonGroup ticketType;
    private javax.swing.JRadioButton uStandBT;
    // End of variables declaration//GEN-END:variables
}
