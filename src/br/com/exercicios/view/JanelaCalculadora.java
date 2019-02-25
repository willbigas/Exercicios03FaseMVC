/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.exercicios.view;

import br.com.exercicios.negocio.ManterCalculadoraNegocio;
import br.com.exercicios.principal.Exercicio01Calculadora;

/**
 *
 * @author William
 */
public class JanelaCalculadora extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaCalculadora() {
        initComponents();
//        campoResultado.setText(valor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        campo1 = new javax.swing.JTextField();
        buttonSomar = new javax.swing.JButton();
        buttonSubtrair = new javax.swing.JButton();
        buttonMultiplicar = new javax.swing.JButton();
        buttonDividir = new javax.swing.JButton();
        campo2 = new javax.swing.JTextField();
        campoResultado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Calculadora");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(24, 2, 24, 2);
        getContentPane().add(jLabel1, gridBagConstraints);

        campo1.setPreferredSize(new java.awt.Dimension(73, 80));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        getContentPane().add(campo1, gridBagConstraints);

        buttonSomar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buttonSomar.setText("+");
        buttonSomar.setPreferredSize(new java.awt.Dimension(55, 40));
        buttonSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSomarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        getContentPane().add(buttonSomar, gridBagConstraints);

        buttonSubtrair.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buttonSubtrair.setText("-");
        buttonSubtrair.setPreferredSize(new java.awt.Dimension(55, 40));
        buttonSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubtrairActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        getContentPane().add(buttonSubtrair, gridBagConstraints);

        buttonMultiplicar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buttonMultiplicar.setText("*");
        buttonMultiplicar.setPreferredSize(new java.awt.Dimension(55, 40));
        buttonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMultiplicarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        getContentPane().add(buttonMultiplicar, gridBagConstraints);

        buttonDividir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        buttonDividir.setText("/");
        buttonDividir.setPreferredSize(new java.awt.Dimension(55, 40));
        buttonDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDividirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.PAGE_END;
        getContentPane().add(buttonDividir, gridBagConstraints);

        campo2.setPreferredSize(new java.awt.Dimension(73, 80));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        getContentPane().add(campo2, gridBagConstraints);

        campoResultado.setEditable(false);
        campoResultado.setColumns(5);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        getContentPane().add(campoResultado, gridBagConstraints);

        jLabel2.setText("Resultado");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        getContentPane().add(jLabel2, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSomarActionPerformed
        // TODO add your handling code here:
        String valorTotal = ManterCalculadoraNegocio.somarCampos(campo1, campo2);
        campoResultado.setText(valorTotal);
//        Exercicio01Calculadora.JanelaCalculadora(valorTotal);
    }//GEN-LAST:event_buttonSomarActionPerformed

    private void buttonSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubtrairActionPerformed
        // TODO add your handling code here:
        String valorTotal = ManterCalculadoraNegocio.subtrairCampos(campo1, campo2);
        campoResultado.setText(valorTotal);
    }//GEN-LAST:event_buttonSubtrairActionPerformed

    private void buttonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMultiplicarActionPerformed
        // TODO add your handling code here:
         String valorTotal = ManterCalculadoraNegocio.multiplicarCampos(campo1, campo2);
        campoResultado.setText(valorTotal);
    }//GEN-LAST:event_buttonMultiplicarActionPerformed

    private void buttonDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDividirActionPerformed
        // TODO add your handling code here:
         String valorTotal = ManterCalculadoraNegocio.dividirCampos(campo1, campo2);
        campoResultado.setText(valorTotal);
    }//GEN-LAST:event_buttonDividirActionPerformed

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
            java.util.logging.Logger.getLogger(JanelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JanelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JanelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JanelaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JanelaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonDividir;
    private javax.swing.JButton buttonMultiplicar;
    private javax.swing.JButton buttonSomar;
    private javax.swing.JButton buttonSubtrair;
    private javax.swing.JTextField campo1;
    private javax.swing.JTextField campo2;
    private javax.swing.JTextField campoResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}