/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author admin
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    public Game() {
        
        initComponents();
        this.setSize(800, 800);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sf = new javax.swing.JButton();
        green = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(210, 210));
        getContentPane().setLayout(null);

        sf.setText("SF");
        sf.setToolTipText("");
        sf.setActionCommand("");
        sf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sfActionPerformed(evt);
            }
        });
        getContentPane().add(sf);
        sf.setBounds(6, 6, 75, 29);

        green.setText("Length");
        getContentPane().add(green);
        green.setBounds(250, 10, 43, 16);

        jToggleButton1.setText("NY");
        getContentPane().add(jToggleButton1);
        jToggleButton1.setBounds(460, 10, 60, 29);

        jButton1.setText("FL");
        getContentPane().add(jButton1);
        jButton1.setBounds(370, 150, 75, 29);

        jButton2.setText("TX");
        getContentPane().add(jButton2);
        jButton2.setBounds(110, 150, 75, 29);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(20, 190, 530, 20);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(10, 410, 530, 12);

        jLabel1.setText("Player 2 name: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 430, 100, 16);

        jLabel2.setText("Player 1 name: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 210, 100, 16);

        jLabel3.setText("#ANN");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 210, 60, 16);

        jLabel4.setText("#BOB");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 430, 60, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sfActionPerformed
        //green.setText("Length"); // example of an action. 


        // TODO add your handling code here:
    }//GEN-LAST:event_sfActionPerformed

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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel green;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton sf;
    // End of variables declaration//GEN-END:variables
}
