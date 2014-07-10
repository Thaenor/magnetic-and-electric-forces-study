package ffisica;

import selector.SelectorApplet;

public class MainWindow extends javax.swing.JFrame {

    public MainWindow() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        valor_x0 = new javax.swing.JTextField();
        valor_q = new javax.swing.JTextField();
        valor_m = new javax.swing.JTextField();
        valor_v0 = new javax.swing.JTextField();
        valor_deltav = new javax.swing.JTextField();
        valor_d = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel_fe = new javax.swing.JLabel();
        jLabel_fm = new javax.swing.JLabel();
        jLabel_y1 = new javax.swing.JLabel();
        jLabel_y2 = new javax.swing.JLabel();
        jLabel_y3 = new javax.swing.JLabel();
        jLabel_y5 = new javax.swing.JLabel();
        jLabel_y4 = new javax.swing.JLabel();
        jComboBox_nelectroes = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel_a = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("x0");

        jLabel2.setText("nº de electrões");

        jLabel3.setText("q");

        jLabel4.setText("m");

        jLabel5.setText("v0");

        jLabel6.setText("delta v");

        jLabel7.setText("d");

        valor_x0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor_x0ActionPerformed(evt);
            }
        });

        valor_q.setText("-1.60217733E-19");
        valor_q.setEnabled(false);
        valor_q.setOpaque(false);
        valor_q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor_qActionPerformed(evt);
            }
        });

        valor_m.setText("9.1093897E-31");
        valor_m.setEnabled(false);
        valor_m.setOpaque(false);
        valor_m.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor_mActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel_fe.setText("Força Electrica = ");

        jLabel_fm.setText("Força magnetica = ");

        jLabel_y1.setText("y1 =");

        jLabel_y2.setText("y2 = ");

        jLabel_y3.setText("y3 =");

        jLabel_y5.setText("y5 =");

        jLabel_y4.setText("y4 =");

        jComboBox_nelectroes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-3", "-2", "-1", "1", "2", "3" }));
        jComboBox_nelectroes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_nelectroesActionPerformed(evt);
            }
        });

        jLabel8.setText("m");

        jLabel9.setText("C");

        jLabel10.setText("Kg");

        jLabel11.setText("m/s");

        jLabel12.setText("V");

        jLabel13.setText("m");

        jLabel_a.setText("a =");

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setText("Ver Gráfico");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jMenu2.setText("Ajuda");

        jMenuItem6.setText("Ajuda");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBox_nelectroes, 0, 129, Short.MAX_VALUE)
                            .addComponent(valor_deltav, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(valor_d, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                            .addComponent(valor_v0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(valor_m)
                                .addComponent(valor_q, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                                .addComponent(valor_x0, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_y5, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_y2, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addComponent(jLabel_y1, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel_fm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_fe, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE)))
                        .addGap(13, 13, 13))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_y3, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_a)
                            .addComponent(jLabel_y4, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel_fe, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel_fm, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(valor_x0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBox_nelectroes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel_y1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valor_q, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_y2, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(valor_m)
                        .addComponent(jLabel10))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(valor_v0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_y3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(valor_deltav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_y4, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(valor_d, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(30, 30, 30)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_y5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel_a)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addGap(19, 19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Teoria a;
        a = new Teoria();
        a.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

private void valor_qActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor_qActionPerformed

}//GEN-LAST:event_valor_qActionPerformed

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    int n_aux= jComboBox_nelectroes.getSelectedIndex();
    int n=-3;
    if (n_aux==0) n=-3;
    if (n_aux==1) n=-2;
    if (n_aux==2) n=-1;
    if (n_aux==3) n=1;
    if (n_aux==4) n=2;
    if (n_aux==5) n=3;
    double q = -1.60217733E-19;
    double m = 9.1093897E-31;
    double aux1=q*n;
    float v = Float.parseFloat(valor_deltav.getText());
    float d = Float.parseFloat(valor_d.getText());
    double fe = (v/d)*aux1;
    String resultado_fe = String.valueOf(fe);
    String resultado1="Força Electrica = "+resultado_fe+" C";
    jLabel_fe.setText(resultado1);
    
    //------------------------------------
    
    double fm;
    float v0= Float.parseFloat(valor_v0.getText());
    float b;
    fm=(q*n)*v0*((v/d)/299792458);
    String resultado_fm = String.valueOf(fm);
    String resultado2="Força Magnetica = "+resultado_fm + " T";
    jLabel_fm.setText(resultado2);
    
    //------------------------------------
    
    double y=0;
    float x0= Float.parseFloat(valor_x0.getText());
    double aux2=(n*q)*(v/(d*m));
    String a = String.valueOf(aux2);
            
    String resultado_y="";
    
    for (int i = 1; i < 6; i++) {
        y=x0+(v0*i)+0.5*((q*n)*(v/(d*(n*m))))*(i*i);
        resultado_y=String.valueOf(y);
       if (i==1) jLabel_y1.setText("y1 = "+resultado_y+" m");
       if (i==2) jLabel_y2.setText("y2 = "+resultado_y+" m");
       if (i==3) jLabel_y3.setText("y3 = "+resultado_y+" m");
       if (i==4) jLabel_y4.setText("y4 = "+resultado_y+" m");
       if (i==5) jLabel_y5.setText("y5 = "+resultado_y+" m");
    }
    jLabel_a.setText("a = "+a+" m/s^2");
}//GEN-LAST:event_jButton1ActionPerformed

private void valor_mActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor_mActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_valor_mActionPerformed

private void valor_x0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor_x0ActionPerformed
// TODO add your handling code here:
}//GEN-LAST:event_valor_x0ActionPerformed

private void jComboBox_nelectroesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_nelectroesActionPerformed

}//GEN-LAST:event_jComboBox_nelectroesActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        SelectorApplet a = new SelectorApplet();
        a.Gerar_grafico();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox_nelectroes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_a;
    private javax.swing.JLabel jLabel_fe;
    private javax.swing.JLabel jLabel_fm;
    private javax.swing.JLabel jLabel_y1;
    private javax.swing.JLabel jLabel_y2;
    private javax.swing.JLabel jLabel_y3;
    private javax.swing.JLabel jLabel_y4;
    private javax.swing.JLabel jLabel_y5;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JTextField valor_d;
    private javax.swing.JTextField valor_deltav;
    private javax.swing.JTextField valor_m;
    private javax.swing.JTextField valor_q;
    private javax.swing.JTextField valor_v0;
    private javax.swing.JTextField valor_x0;
    // End of variables declaration//GEN-END:variables
}
