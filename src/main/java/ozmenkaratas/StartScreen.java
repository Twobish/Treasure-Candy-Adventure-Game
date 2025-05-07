package ozmenkaratas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class StartScreen extends javax.swing.JFrame {

    public StartScreen() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnLevel1 = new javax.swing.JButton();
        btnLevel2 = new javax.swing.JButton();
        btnScore = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 153, 153));

        btnLevel1.setBackground(new java.awt.Color(255, 153, 153));
        btnLevel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLevel1.setForeground(new java.awt.Color(255, 51, 102));
        btnLevel1.setText("Start Level 1");
        btnLevel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102), 2));
        btnLevel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLevel1MouseClicked(evt);
            }
        });

        btnLevel2.setBackground(new java.awt.Color(255, 153, 153));
        btnLevel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnLevel2.setForeground(new java.awt.Color(255, 51, 102));
        btnLevel2.setText("Start Level 2");
        btnLevel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102), 2));
        btnLevel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLevel2MouseClicked(evt);
            }
        });
        btnLevel2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLevel2ActionPerformed(evt);
            }
        });

        btnScore.setBackground(new java.awt.Color(255, 153, 153));
        btnScore.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnScore.setForeground(new java.awt.Color(255, 51, 102));
        btnScore.setText("Score Board");
        btnScore.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102), 2));
        btnScore.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnScoreMouseClicked(evt);
            }
        });
        btnScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScoreActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(255, 153, 153));
        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 51, 102));
        btnExit.setText("Exit");
        btnExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102), 2));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 153, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to Treasure Candy Adventure Game");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102), 5));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 747, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(btnLevel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLevel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnScore, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLevel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnLevel2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnScore, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed


    }//GEN-LAST:event_btnExitActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked

        System.exit(0);

    }//GEN-LAST:event_btnExitMouseClicked

    private void btnLevel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLevel1MouseClicked

        String name = null;

        while (true) {
            name = JOptionPane.showInputDialog("Enter your name using letters only: ");

            if (name == null) {

                JOptionPane.showMessageDialog(null, "The game has been cancelled.");
                return;
            }

            name = name.trim();

            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Name cannot be left blank.");
            } else if (!name.matches("[a-zA-ZğüşıöçĞÜŞİÖÇ]+")) {
                JOptionPane.showMessageDialog(null, "Please use letters only (no numbers, spaces or special characters).");
            } else {
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "Hello, " + name + "! The game begins...");

        Level1 level = new Level1(name);
        this.dispose();
        level.setVisible(true);
    }//GEN-LAST:event_btnLevel1MouseClicked

    private void btnLevel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLevel2MouseClicked

        String name = null;

        while (true) {
            name = JOptionPane.showInputDialog("Enter your name using letters only: ");

            if (name == null) {

                JOptionPane.showMessageDialog(null, "The game has been cancelled.");
                return;
            }

            name = name.trim();

            if (name.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Name cannot be left blank.");
            } else if (!name.matches("[a-zA-ZğüşıöçĞÜŞİÖÇ]+")) {
                JOptionPane.showMessageDialog(null, "Please use letters only (no numbers, spaces or special characters).");
            } else {
                break;
            }
        }

        JOptionPane.showMessageDialog(null, "Hello, " + name + "! The game begins...");

        Level2 leve2 = new Level2(name);
        this.dispose();
        leve2.setVisible(true);

    }//GEN-LAST:event_btnLevel2MouseClicked

    private void btnScoreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnScoreMouseClicked

        String name = JOptionPane.showInputDialog("ENTER A NAME");
        if (name != null) {
            try {
                String message = "Username :" + name + '\n' + "All the scores :";
                File file = new File("scoreboard.txt");
                Scanner reader = new Scanner(file);
                String data[] = null;
                BSTree<Integer> tree = new BSTree<>();

                while (reader.hasNextLine()) {
                    data = reader.nextLine().split(",");
                    if (data[0].equals(name)) {
                        tree.insert(Integer.parseInt(data[2]));
                        message += data[2] + "(" + data[1] + ")" + " ";
                    }
                }
                reader.close();
                message += '\n' + "Best score :" + tree.max();
                message += '\n' + "Worst score :" + tree.min();

                JOptionPane.showMessageDialog(rootPane, message);
            } catch (FileNotFoundException e) {

                JOptionPane.showMessageDialog(rootPane, "Score file not found!");

            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Name cannot be left blank.");
        }
    }//GEN-LAST:event_btnScoreMouseClicked

    private void btnScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScoreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnScoreActionPerformed

    private void btnLevel2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLevel2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLevel2ActionPerformed

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
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLevel1;
    private javax.swing.JButton btnLevel2;
    private javax.swing.JButton btnScore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
