/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 //My name is Aryan
 //Hi this is a second push
package menuBar;

/**
 *
 * @author ANSHUL
 */
public class emulator extends javax.swing.JFrame {

    /**
     * Creates new form emulator
     */
    public emulator() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        ip = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        q1 = new javax.swing.JTextField();
        q2 = new javax.swing.JTextField();
        q3 = new javax.swing.JTextField();
        q4 = new javax.swing.JTextField();
        q5 = new javax.swing.JTextField();
        q6 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        dl = new javax.swing.JTextField();
        dh = new javax.swing.JTextField();
        cl = new javax.swing.JTextField();
        ch = new javax.swing.JTextField();
        bl = new javax.swing.JTextField();
        bh = new javax.swing.JTextField();
        al = new javax.swing.JTextField();
        ah = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        of = new javax.swing.JTextField();
        df = new javax.swing.JTextField();
        ifl = new javax.swing.JTextField();
        tf = new javax.swing.JTextField();
        sf = new javax.swing.JTextField();
        zf = new javax.swing.JTextField();
        af = new javax.swing.JTextField();
        pf = new javax.swing.JTextField();
        cf = new javax.swing.JTextField();
        databus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        mem4 = new javax.swing.JTextField();
        mem1 = new javax.swing.JTextField();
        mem2 = new javax.swing.JTextField();
        mem3 = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMinimumSize(new java.awt.Dimension(949, 483));
        jPanel1.setLayout(null);

        jPanel2.setLayout(null);

        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("CS");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField2);
        jTextField2.setBounds(0, 0, 190, 22);

        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("DS");
        jPanel2.add(jTextField3);
        jTextField3.setBounds(0, 20, 190, 22);

        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("SS");
        jPanel2.add(jTextField4);
        jTextField4.setBounds(0, 40, 190, 22);

        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("ES");
        jPanel2.add(jTextField5);
        jTextField5.setBounds(0, 60, 190, 22);

        ip.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ip.setText("IP");
        ip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ipActionPerformed(evt);
            }
        });
        jPanel2.add(ip);
        ip.setBounds(0, 80, 190, 22);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(90, 140, 190, 110);

        jPanel3.setLayout(null);

        q1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                q1ActionPerformed(evt);
            }
        });
        jPanel3.add(q1);
        q1.setBounds(0, 0, 100, 20);
        jPanel3.add(q2);
        q2.setBounds(0, 20, 100, 22);
        jPanel3.add(q3);
        q3.setBounds(0, 40, 100, 22);
        jPanel3.add(q4);
        q4.setBounds(0, 60, 100, 22);
        jPanel3.add(q5);
        q5.setBounds(0, 80, 100, 20);
        jPanel3.add(q6);
        q6.setBounds(0, 100, 100, 22);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(790, 120, 100, 140);

        jPanel4.setLayout(null);

        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("BP");
        jPanel4.add(jTextField6);
        jTextField6.setBounds(0, 170, 250, 22);

        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField7.setText("SP");
        jPanel4.add(jTextField7);
        jTextField7.setBounds(0, 150, 250, 22);

        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField8.setText("SI");
        jPanel4.add(jTextField8);
        jTextField8.setBounds(0, 130, 250, 22);

        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setText("DI");
        jPanel4.add(jTextField9);
        jTextField9.setBounds(0, 110, 250, 22);
        jPanel4.add(dl);
        dl.setBounds(0, 90, 130, 22);
        jPanel4.add(dh);
        dh.setBounds(130, 90, 120, 22);
        jPanel4.add(cl);
        cl.setBounds(0, 70, 130, 22);
        jPanel4.add(ch);
        ch.setBounds(130, 70, 120, 22);
        jPanel4.add(bl);
        bl.setBounds(0, 50, 130, 22);
        jPanel4.add(bh);
        bh.setBounds(130, 50, 120, 22);
        jPanel4.add(al);
        al.setBounds(0, 30, 130, 22);
        jPanel4.add(ah);
        ah.setBounds(130, 30, 120, 22);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(90, 300, 250, 190);

        jPanel5.setLayout(null);
        jPanel5.add(of);
        of.setBounds(0, 0, 50, 30);
        jPanel5.add(df);
        df.setBounds(50, 0, 50, 30);
        jPanel5.add(ifl);
        ifl.setBounds(100, 0, 50, 30);
        jPanel5.add(tf);
        tf.setBounds(150, 0, 50, 30);
        jPanel5.add(sf);
        sf.setBounds(200, 0, 50, 30);
        jPanel5.add(zf);
        zf.setBounds(250, 0, 50, 30);
        jPanel5.add(af);
        af.setBounds(300, 0, 50, 30);
        jPanel5.add(pf);
        pf.setBounds(350, 0, 50, 30);
        jPanel5.add(cf);
        cf.setBounds(400, 0, 50, 30);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(320, 520, 490, 30);
        jPanel1.add(databus);
        databus.setBounds(180, 40, 720, 22);

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jLabel1.setText("Data Bus");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(510, 20, 110, 20);

        jPanel6.setLayout(null);

        mem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mem4ActionPerformed(evt);
            }
        });
        jPanel6.add(mem4);
        mem4.setBounds(0, 60, 100, 20);
        jPanel6.add(mem1);
        mem1.setBounds(0, 0, 100, 20);
        jPanel6.add(mem2);
        mem2.setBounds(0, 20, 100, 20);
        jPanel6.add(mem3);
        mem3.setBounds(0, 40, 100, 20);

        jPanel1.add(jPanel6);
        jPanel6.setBounds(910, 380, 100, 100);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1066, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 572, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void ipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ipActionPerformed

    private void q1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_q1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_q1ActionPerformed

    private void mem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mem4ActionPerformed

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
            java.util.logging.Logger.getLogger(emulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(emulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(emulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(emulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new emulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField af;
    private javax.swing.JTextField ah;
    private javax.swing.JTextField al;
    private javax.swing.JTextField bh;
    private javax.swing.JTextField bl;
    private javax.swing.JTextField cf;
    private javax.swing.JTextField ch;
    private javax.swing.JTextField cl;
    private javax.swing.JTextField databus;
    private javax.swing.JTextField df;
    private javax.swing.JTextField dh;
    private javax.swing.JTextField dl;
    private javax.swing.JTextField ifl;
    private javax.swing.JTextField ip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField mem1;
    private javax.swing.JTextField mem2;
    private javax.swing.JTextField mem3;
    private javax.swing.JTextField mem4;
    private javax.swing.JTextField of;
    private javax.swing.JTextField pf;
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    private javax.swing.JTextField q5;
    private javax.swing.JTextField q6;
    private javax.swing.JTextField sf;
    private javax.swing.JTextField tf;
    private javax.swing.JTextField zf;
    // End of variables declaration//GEN-END:variables
}
