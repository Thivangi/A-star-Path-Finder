
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dilumdesilva
 */
public class SecondScreen extends javax.swing.JFrame {

    //String variables to hold the path of the images
    ///Users/dilumdesilva/Workspaces/IIT_Workspace/Algorithms/CW/ThirdAttempt/PathFinder/src/images/mapPic.png
    String pictureMap_path = "src/images/mapPic.png";
    String gridMap_path = "src/images/gridPic.png";
    
    private boolean leftPressed = false;
    private boolean rightPressed = false;
    
    private int mapType = 0;
    private String selctedMap;
    private char distanceMetricsType;

    /**
     * Creates new form SeconScreen
     */
    public SecondScreen() {
        initComponents();
        
        //making unselected all the radio buttins at the begining.
        rBtnManhattan.setSelected(false);
        rBtnEuclidean.setSelected(false);
        rBtnChebyshev.setSelected(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblMapImage = new javax.swing.JLabel();
        btnLeft = new javax.swing.JLabel();
        rBtnManhattan = new javax.swing.JRadioButton();
        btnRight = new javax.swing.JLabel();
        rBtnEuclidean = new javax.swing.JRadioButton();
        rBtnChebyshev = new javax.swing.JRadioButton();
        btnNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(13, 127, 137));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Please select your preference map & distance metric");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 44, -1, -1));

        lblMapImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jPanel1.add(lblMapImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(247, 118, -1, -1));

        btnLeft.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow_left.png"))); // NOI18N
        btnLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLeftMouseClicked(evt);
            }
        });
        jPanel1.add(btnLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(68, 175, -1, -1));

        rBtnManhattan.setForeground(new java.awt.Color(255, 255, 255));
        rBtnManhattan.setText("Manhattan");
        rBtnManhattan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnManhattanActionPerformed(evt);
            }
        });
        jPanel1.add(rBtnManhattan, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        btnRight.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/arrow_right.png"))); // NOI18N
        btnRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRightMouseClicked(evt);
            }
        });
        jPanel1.add(btnRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 180, -1, -1));

        rBtnEuclidean.setForeground(new java.awt.Color(255, 255, 255));
        rBtnEuclidean.setText("Euclidean");
        rBtnEuclidean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnEuclideanActionPerformed(evt);
            }
        });
        jPanel1.add(rBtnEuclidean, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        rBtnChebyshev.setForeground(new java.awt.Color(255, 255, 255));
        rBtnChebyshev.setText("Chebyshev");
        rBtnChebyshev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnChebyshevActionPerformed(evt);
            }
        });
        jPanel1.add(rBtnChebyshev, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, -1, -1));

        btnNext.setBackground(new java.awt.Color(255, 255, 255));
        btnNext.setFont(new java.awt.Font("Roboto", 1, 25)); // NOI18N
        btnNext.setForeground(new java.awt.Color(13, 127, 137));
        btnNext.setText("Next");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel1.add(btnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 460, 139, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // once user clicks on this it will take login screen:

        //variables to capture mapType
        setSelctedMap(lblMapImage.getIcon().toString());
        //System.out.println(lblMapImage.getIcon().toString());

        //mapType 1 - pictureMap
        //mapType 2 - gridMap

        if (selctedMap.equals(pictureMap_path)) {
            System.out.println(CustomColors.custom_PURPLE+"User has selected picture map"+CustomColors.custom_RESET);
            System.out.println("");
            setMapType(1);
        }
        else if(selctedMap.equals(gridMap_path)){
            System.out.println(CustomColors.custom_PURPLE+"User has selected grid map"+CustomColors.custom_RESET);
            System.out.println("");
            setMapType(2);
        }

        ThirdScreen objThirdScreen = new ThirdScreen();
        objThirdScreen.setMapType(mapType);
        objThirdScreen.setDistanceMetricsType(distanceMetricsType);
        objThirdScreen.setVisible(true);
        this.dispose();
        //pathFinder.pathFinderMain(mapType);
    }//GEN-LAST:event_btnNextActionPerformed

    private void rBtnChebyshevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnChebyshevActionPerformed
        if (rBtnChebyshev.isSelected()) {
            //C - CHEBYSHEV
            setDistanceMetricsType('C');
            
            rBtnManhattan.setSelected(false);
            rBtnEuclidean.setSelected(false);
        }
    }//GEN-LAST:event_rBtnChebyshevActionPerformed

    private void rBtnEuclideanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnEuclideanActionPerformed
        if (rBtnEuclidean.isSelected()) {
            //E - EUCLIDEAN
            setDistanceMetricsType('E');
            
            rBtnManhattan.setSelected(false);
            rBtnChebyshev.setSelected(false);
        }
    }//GEN-LAST:event_rBtnEuclideanActionPerformed

    private void btnRightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRightMouseClicked
        // this method will execute ones user press on the right arrow btn
        if (rightPressed == false) {
            lblMapImage.setIcon(new ImageIcon(gridMap_path));
        }else{
            lblMapImage.setIcon(new ImageIcon(pictureMap_path));
        }

        rightPressed = true;
        leftPressed = false;
    }//GEN-LAST:event_btnRightMouseClicked

    private void rBtnManhattanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnManhattanActionPerformed
        if (rBtnManhattan.isSelected()) {
            //M - MANHATTEN
            setDistanceMetricsType('M');
            rBtnChebyshev.setSelected(false);
            rBtnEuclidean.setSelected(false);
        }
    }//GEN-LAST:event_rBtnManhattanActionPerformed

    private void btnLeftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLeftMouseClicked
        // this method will execute ones user press on the left arrow btn
        if (leftPressed == false) {
            lblMapImage.setIcon(new ImageIcon(pictureMap_path));
        }else{
            lblMapImage.setIcon(new ImageIcon(gridMap_path));
        }

        leftPressed = true;
        rightPressed = false;
    }//GEN-LAST:event_btnLeftMouseClicked

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
            java.util.logging.Logger.getLogger(SecondScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SecondScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SecondScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SecondScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SecondScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnLeft;
    private javax.swing.JButton btnNext;
    private javax.swing.JLabel btnRight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMapImage;
    private javax.swing.JRadioButton rBtnChebyshev;
    private javax.swing.JRadioButton rBtnEuclidean;
    private javax.swing.JRadioButton rBtnManhattan;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the mapType
     */
    public int getMapType() {
        return mapType;
    }

    /**
     * @param mapType the mapType to set
     */
    public void setMapType(int mapType) {
        this.mapType = mapType;
    }

    /**
     * @return the selctedMap
     */
    public String getSelctedMap() {
        return selctedMap;
    }

    /**
     * @param selctedMap the selctedMap to set
     */
    public void setSelctedMap(String selctedMap) {
        this.selctedMap = selctedMap;
    }
    
    /**
     * @return the distanceMetricsType
     */
    public char getDistanceMetricsType() {
        return distanceMetricsType;
    }

    /**
     * @param distanceMetricsType the distanceMetricsType to set
     */
    public void setDistanceMetricsType(char distanceMetricsType) {
        this.distanceMetricsType = distanceMetricsType;
    }
}
