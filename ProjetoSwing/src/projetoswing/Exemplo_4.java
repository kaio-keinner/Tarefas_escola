/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projetoswing;

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Geral
 */
public class Exemplo_4 extends javax.swing.JFrame {

    /**
     * Creates new form Exemplo_4
     */
    public Exemplo_4() {
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

        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBoxIngles = new javax.swing.JCheckBox();
        jCheckBoxInformatica = new javax.swing.JCheckBox();
        jButtonVerificar = new javax.swing.JButton();
        jButtonMarcar = new javax.swing.JButton();
        jButtonDesmarcar = new javax.swing.JButton();

        jCheckBox5.setText("jCheckBox5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Exemplo_4");

        jCheckBoxIngles.setText("Ingles");
        jCheckBoxIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxInglesActionPerformed(evt);
            }
        });

        jCheckBoxInformatica.setText("Informática");

        jButtonVerificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/verificar.png"))); // NOI18N
        jButtonVerificar.setToolTipText("Verificar");
        jButtonVerificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerificarActionPerformed(evt);
            }
        });

        jButtonMarcar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/marcar.png"))); // NOI18N
        jButtonMarcar.setToolTipText("Marca as opções");
        jButtonMarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMarcarActionPerformed(evt);
            }
        });

        jButtonDesmarcar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/desmarcar.png"))); // NOI18N
        jButtonDesmarcar.setToolTipText("Desmarca todas as opções");
        jButtonDesmarcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDesmarcarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCheckBoxIngles)
                        .addGap(79, 79, 79)
                        .addComponent(jCheckBoxInformatica))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonVerificar)
                        .addGap(48, 48, 48)
                        .addComponent(jButtonMarcar)
                        .addGap(47, 47, 47)
                        .addComponent(jButtonDesmarcar)))
                .addContainerGap(204, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxInformatica)
                    .addComponent(jCheckBoxIngles))
                .addGap(83, 83, 83)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonVerificar)
                    .addComponent(jButtonMarcar)
                    .addComponent(jButtonDesmarcar))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxInglesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxInglesActionPerformed

    private void jButtonVerificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerificarActionPerformed
       String selecao = "Selecionados: ";
       if(jCheckBoxIngles.isSelected()){
           selecao += "\n"+jCheckBoxIngles.getText();
       }
       if(jCheckBoxInformatica.isSelected()){
           selecao += "\n"+jCheckBoxInformatica.getText();
       }
       if(!jCheckBoxIngles.isSelected() && !jCheckBoxInformatica.isSelected()){
           JOptionPane.showMessageDialog(null, "Nenhum curso selecionado");
       }else{
        JOptionPane.showMessageDialog(null, selecao);
       }
    }//GEN-LAST:event_jButtonVerificarActionPerformed
    
    private void jButtonDesmarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDesmarcarActionPerformed
        jCheckBoxInformatica.setSelected(false);
        jCheckBoxIngles.setSelected(false);
    }//GEN-LAST:event_jButtonDesmarcarActionPerformed

    private void jButtonMarcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMarcarActionPerformed
        jCheckBoxInformatica.setSelected(true);
        jCheckBoxIngles.setSelected(true);
    }//GEN-LAST:event_jButtonMarcarActionPerformed

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
            java.util.logging.Logger.getLogger(Exemplo_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Exemplo_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Exemplo_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Exemplo_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Exemplo_4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDesmarcar;
    private javax.swing.JButton jButtonMarcar;
    private javax.swing.JButton jButtonVerificar;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBoxInformatica;
    private javax.swing.JCheckBox jCheckBoxIngles;
    // End of variables declaration//GEN-END:variables
}
