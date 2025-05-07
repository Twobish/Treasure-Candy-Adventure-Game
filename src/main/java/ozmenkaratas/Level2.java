package ozmenkaratas;

import java.awt.Image;
import java.io.FileWriter;
import java.io.IOException;
import java.util.jar.Attributes.Name;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Level2 extends javax.swing.JFrame {

    String imagePath1 = "/images/sks.png";
    String imagePath2 = "/images/tr.png";
    ImageIcon icon1 = new ImageIcon(getClass().getResource(imagePath1));
    Image image1 = icon1.getImage();

    ImageIcon icon2 = new ImageIcon(getClass().getResource(imagePath2));
    Image image2 = icon2.getImage();

    String imagePath4 = "/images/ginger.png";
    ImageIcon icon4 = new ImageIcon(getClass().getResource(imagePath4));
    Image image4 = icon4.getImage();

    String imagePath5 = "/images/left.png";
    ImageIcon icon5 = new ImageIcon(getClass().getResource(imagePath5));
    Image image5 = icon5.getImage();

    String imagePath6 = "/images/right.png"; //ileri
    ImageIcon icon6 = new ImageIcon(getClass().getResource(imagePath6));
    Image image6 = icon6.getImage();

    DLinkedList t;
    int step;
    int y = 0;
    String Name;

    public Level2(String name) {
        initComponents();
        Name = name;
        t = new DLinkedList();
        for (int i = 1; i <= 35; i++) {
            t.addLast(new CellsLevel2(i));
        }
        t.print();

        lbl1.setIcon(new ImageIcon(image1));
        JLabel[] A = {lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, lbl11, lbl12, lbl13, lbl14, lbl15, lbl16, lbl17, lbl18, lbl19, lbl20, lbl21, lbl22, lbl23, lbl24, lbl25, lbl26, lbl27, lbl28, lbl29, lbl30, lbl31, lbl32, lbl33, lbl34, lbl35};
        String imagePath = "/images/bbbbb.png";
        ImageIcon icon = new ImageIcon(getClass().getResource(imagePath));
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(lblMain.getWidth(), lblMain.getHeight(), Image.SCALE_SMOOTH);
        lblMain.setIcon(new ImageIcon(scaledImage));

        Node2 temp = t.head;

        for (int i = 0; i < 35; i++) {
            if ("treasure".equals(temp.data.durum)) {
                A[i].setIcon(new ImageIcon(image1));
            } else if ("trap".equals(temp.data.durum)) {
                A[i].setIcon(new ImageIcon(image2));
            } else if ("move forward".equals(temp.data.durum)) {
                A[i].setIcon(new ImageIcon(image6));
            } else if ("move back".equals(temp.data.durum)) {
                A[i].setIcon(new ImageIcon(image5));
            }
            if (temp.nextNode != null) {
                temp = temp.nextNode;
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl2 = new javax.swing.JLabel();
        lbl3 = new javax.swing.JLabel();
        lbl1 = new javax.swing.JLabel();
        lbl4 = new javax.swing.JLabel();
        lbl5 = new javax.swing.JLabel();
        lbl6 = new javax.swing.JLabel();
        lbl7 = new javax.swing.JLabel();
        lbl8 = new javax.swing.JLabel();
        lbl9 = new javax.swing.JLabel();
        lbl10 = new javax.swing.JLabel();
        lbl11 = new javax.swing.JLabel();
        lbl12 = new javax.swing.JLabel();
        lbl13 = new javax.swing.JLabel();
        lbl14 = new javax.swing.JLabel();
        lbl15 = new javax.swing.JLabel();
        lbl16 = new javax.swing.JLabel();
        lbl17 = new javax.swing.JLabel();
        lbl18 = new javax.swing.JLabel();
        lbl19 = new javax.swing.JLabel();
        lbl20 = new javax.swing.JLabel();
        lbl21 = new javax.swing.JLabel();
        lbl22 = new javax.swing.JLabel();
        lbl23 = new javax.swing.JLabel();
        lbl24 = new javax.swing.JLabel();
        lbl25 = new javax.swing.JLabel();
        lbl26 = new javax.swing.JLabel();
        lbl27 = new javax.swing.JLabel();
        lbl28 = new javax.swing.JLabel();
        lbl29 = new javax.swing.JLabel();
        lbl30 = new javax.swing.JLabel();
        lbl31 = new javax.swing.JLabel();
        lbl32 = new javax.swing.JLabel();
        lbl33 = new javax.swing.JLabel();
        lbl34 = new javax.swing.JLabel();
        lbl35 = new javax.swing.JLabel();
        lblZar = new javax.swing.JLabel();
        btnRoll = new javax.swing.JButton();
        lblStep = new javax.swing.JLabel();
        lblMain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(lbl2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 40, 30));
        jPanel1.add(lbl3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 40, 30));
        jPanel1.add(lbl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 40, 30));
        jPanel1.add(lbl4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 440, 40, 30));
        jPanel1.add(lbl5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 40, 30));
        jPanel1.add(lbl6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 40, 30));
        jPanel1.add(lbl7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 320, 40, 30));
        jPanel1.add(lbl8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 40, 30));
        jPanel1.add(lbl9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 40, 30));
        jPanel1.add(lbl10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, -1, 30));
        jPanel1.add(lbl11, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, -1, 30));
        jPanel1.add(lbl12, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, 30));
        jPanel1.add(lbl13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, -1, 30));
        jPanel1.add(lbl14, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 40, 30));
        jPanel1.add(lbl15, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 40, 30));
        jPanel1.add(lbl16, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, 30));
        jPanel1.add(lbl17, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, -1, 30));
        jPanel1.add(lbl18, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, -1, 30));
        jPanel1.add(lbl19, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, -1, 30));
        jPanel1.add(lbl20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 390, -1, 30));
        jPanel1.add(lbl21, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 40, 30));
        jPanel1.add(lbl22, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, -1, 30));
        jPanel1.add(lbl23, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, -1, 30));
        jPanel1.add(lbl24, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, 30));
        jPanel1.add(lbl25, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, 30));
        jPanel1.add(lbl26, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, 30));
        jPanel1.add(lbl27, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, -1, 30));
        jPanel1.add(lbl28, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 420, -1, 30));
        jPanel1.add(lbl29, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, -1, 30));
        jPanel1.add(lbl30, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, -1, 30));
        jPanel1.add(lbl31, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, -1, 30));
        jPanel1.add(lbl32, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, -1, 30));
        jPanel1.add(lbl33, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 450, -1, 30));
        jPanel1.add(lbl34, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, -1, 30));
        jPanel1.add(lbl35, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, -1, 30));

        lblZar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblZar.setForeground(new java.awt.Color(255, 51, 102));
        lblZar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102), 2));
        jPanel1.add(lblZar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 90, 30));

        btnRoll.setBackground(new java.awt.Color(255, 153, 153));
        btnRoll.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnRoll.setForeground(new java.awt.Color(255, 51, 102));
        btnRoll.setText("Roll Dice");
        btnRoll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102), 3));
        btnRoll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRollActionPerformed(evt);
            }
        });
        jPanel1.add(btnRoll, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, 90, 30));

        lblStep.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lblStep.setForeground(new java.awt.Color(255, 51, 102));
        lblStep.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 102), 2));
        jPanel1.add(lblStep, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, 250, 30));
        jPanel1.add(lblMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 750));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRollActionPerformed

        int x = (int) ((Math.random() * 6) + 1);
        JLabel[] A = {lbl1, lbl2, lbl3, lbl4, lbl5, lbl6, lbl7, lbl8, lbl9, lbl10, lbl11, lbl12, lbl13, lbl14, lbl15, lbl16, lbl17, lbl18, lbl19, lbl20, lbl21, lbl22, lbl23, lbl24, lbl25, lbl26, lbl27, lbl28, lbl29, lbl30, lbl31, lbl32, lbl33, lbl34, lbl35};
        Node2 temp = t.head;

        step += x;
        if (step > 35) {
            FileWriter writer;
            try {
                writer = new FileWriter("C:\\Users\\sevva\\OneDrive\\Belgeler\\NetBeansProjects\\OzmenKaratas\\scoreboard.txt", true);
                writer.write(Name + "," + "Level 2" + "," + y + '\n' + "--------------------------" + '\n');
                writer.close();
            } catch (IOException ex) {
                Logger.getLogger(Level1.class.getName()).log(Level.SEVERE, null, ex);
            }
            String[] options = {"Back To Menu", "Exit"};
            int response = JOptionPane.showOptionDialog(null, "Do you want to back to menu", "WARNING", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            if (response == 0) {
                StartScreen s1 = new StartScreen();
                this.dispose();
                s1.setVisible(true);
            } else if (response == 1) {
                System.exit(0);
            }
        } else {
            y += t.PositionPoint(step);

            lblZar.setText(x + "");
            lblStep.setText("Current Point: " + t.PositionPoint(step) + " | " + "Total Point: " + y);

            for (int i = 0; i < 32; i++) {
                if ("treasure".equals(temp.data.durum)) {
                    A[i].setIcon(new ImageIcon(image1));
                } else if ("trap".equals(temp.data.durum)) {
                    A[i].setIcon(new ImageIcon(image2));
                } else if ("move back".equals(temp.data.durum)) {
                    A[i].setIcon(new ImageIcon(image5));

                } else if ("move forward".equals(temp.data.durum)) {
                    A[i].setIcon(new ImageIcon(image6));

                } else if ("empty".equals(temp.data.durum)) {
                    A[i].setIcon(new ImageIcon());
                }
                if (A[i] == A[step - 1]) {

                    if ("move forward".equals(temp.data.durum)) {
                        step = step + temp.data.move;
                        A[step - 1].setIcon(new ImageIcon(image4));
                        y += t.PositionPoint(step);

                        lblZar.setText(x + "");
                        lblStep.setText("Current Point: " + t.PositionPoint(step) + " | " + "Total Point: " + y);

                    } else if ("move back".equals(temp.data.durum)) {
                        step = step - temp.data.move;
                        A[step - 1].setIcon(new ImageIcon(image4));
                        y += t.PositionPoint(step);

                        lblZar.setText(x + "");
                        lblStep.setText("Current Point: " + t.PositionPoint(step) + " | " + "Total Point: " + y);

                    } else {
                        A[i].setIcon(new ImageIcon(image4));
                    }

                }
                if (temp.nextNode != null) {
                    temp = temp.nextNode;
                }
            }

        }
    }//GEN-LAST:event_btnRollActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRoll;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl10;
    private javax.swing.JLabel lbl11;
    private javax.swing.JLabel lbl12;
    private javax.swing.JLabel lbl13;
    private javax.swing.JLabel lbl14;
    private javax.swing.JLabel lbl15;
    private javax.swing.JLabel lbl16;
    private javax.swing.JLabel lbl17;
    private javax.swing.JLabel lbl18;
    private javax.swing.JLabel lbl19;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lbl20;
    private javax.swing.JLabel lbl21;
    private javax.swing.JLabel lbl22;
    private javax.swing.JLabel lbl23;
    private javax.swing.JLabel lbl24;
    private javax.swing.JLabel lbl25;
    private javax.swing.JLabel lbl26;
    private javax.swing.JLabel lbl27;
    private javax.swing.JLabel lbl28;
    private javax.swing.JLabel lbl29;
    private javax.swing.JLabel lbl3;
    private javax.swing.JLabel lbl30;
    private javax.swing.JLabel lbl31;
    private javax.swing.JLabel lbl32;
    private javax.swing.JLabel lbl33;
    private javax.swing.JLabel lbl34;
    private javax.swing.JLabel lbl35;
    private javax.swing.JLabel lbl4;
    private javax.swing.JLabel lbl5;
    private javax.swing.JLabel lbl6;
    private javax.swing.JLabel lbl7;
    private javax.swing.JLabel lbl8;
    private javax.swing.JLabel lbl9;
    private javax.swing.JLabel lblMain;
    private javax.swing.JLabel lblStep;
    private javax.swing.JLabel lblZar;
    // End of variables declaration//GEN-END:variables
}
