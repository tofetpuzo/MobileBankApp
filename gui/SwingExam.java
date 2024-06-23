/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import javax.swing.JOptionPane;

/**
 *
 * @author femitemiola
 */
public class SwingExam extends javax.swing.JFrame {

    /**
     * Creates new form SwingExam
     */
    public SwingExam() {
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

        txtuser = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lbltextuserfield = new javax.swing.JTextField();
        buttonReset = new javax.swing.JButton();
        SubmitButtonTextfield = new javax.swing.JButton();
        jpasstextfield = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        setForeground(java.awt.Color.lightGray);

        txtuser.setFont(new java.awt.Font("Menlo", 0, 13)); // NOI18N
        txtuser.setForeground(new java.awt.Color(51, 0, 255));
        txtuser.setText("username");

        lblPass.setForeground(new java.awt.Color(0, 0, 255));
        lblPass.setText("password");

        lbltextuserfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbltextuserfieldActionPerformed(evt);
            }
        });

        buttonReset.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        buttonReset.setForeground(new java.awt.Color(255, 153, 153));
        buttonReset.setText("Reset");
        buttonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonResetActionPerformed(evt);
            }
        });

        SubmitButtonTextfield.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        SubmitButtonTextfield.setForeground(new java.awt.Color(255, 153, 153));
        SubmitButtonTextfield.setText("Sumbit");
        SubmitButtonTextfield.addActionListener(this::SubmitButtonTextfieldActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(SubmitButtonTextfield)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jpasstextfield))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbltextuserfield)))
                .addGap(273, 273, 273))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtuser)
                    .addComponent(lbltextuserfield, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPass, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(jpasstextfield))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonReset, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SubmitButtonTextfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(330, 330, 330))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonResetActionPerformed
        // TODO add your handling code here:
        jpasstextfield.setText("");
        lbltextuserfield.setText("");
    }//GEN-LAST:event_buttonResetActionPerformed

    private void lbltextuserfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbltextuserfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbltextuserfieldActionPerformed

    private void SubmitButtonTextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonTextfieldActionPerformed
        // TODO add your handling code here:
        String username = lbltextuserfield.getText();
        String password = jpasstextfield.getText();
        System.out.println("Username: " + username);
        System.out.println("password: " + password);
        JOptionPane.showMessageDialog(this, "Username: " + username + "\npassword: " + password );
    }//GEN-LAST:event_SubmitButtonTextfieldActionPerformed

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
            java.util.logging.Logger.getLogger(SwingExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SwingExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SwingExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SwingExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SwingExam().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubmitButtonTextfield;
    private javax.swing.JButton buttonReset;
    private javax.swing.JPasswordField jpasstextfield;
    private javax.swing.JLabel lblPass;
    private javax.swing.JTextField lbltextuserfield;
    private javax.swing.JLabel txtuser;
    // End of variables declaration//GEN-END:variables
}
