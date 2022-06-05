/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * @author mateu
 */
public class TelaDeFases2 extends javax.swing.JFrame {

    /**
     * Creates new form TelaDeFases2
     */
    public TelaDeFases2() {
        initComponents();
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelTelaDeFases = new javax.swing.JPanel();
        tituloFases = new javax.swing.JLabel();
        faseInicial = new javax.swing.JButton();
        faseEstruturasCondicionais = new javax.swing.JButton();
        faseDeFuncoes = new javax.swing.JButton();
        faseWhile = new javax.swing.JButton();
        faseFor = new javax.swing.JButton();
        faseListas = new javax.swing.JButton();
        explicacaoPrimeiraFase = new javax.swing.JTextField();
        explicacaoSegundaFase = new javax.swing.JTextField();
        explicacaoTerceiraFase = new javax.swing.JTextField();
        explicacaoQuartaFase = new javax.swing.JTextField();
        explicacaoQuintaFase = new javax.swing.JTextField();
        explicacaoSextaFase = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelTelaDeFases.setBackground(new java.awt.Color(0, 0, 45));

        tituloFases.setBackground(new java.awt.Color(0, 0, 45));
        tituloFases.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloFases.setForeground(new java.awt.Color(187, 187, 187));
        tituloFases.setText("Fases");

        faseInicial.setBackground(new java.awt.Color(0, 0, 45));
        faseInicial.setForeground(new java.awt.Color(187, 187, 187));
        faseInicial.setText("Input");
        faseInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseInicialActionPerformed(evt);
            }
        });

        faseEstruturasCondicionais.setBackground(new java.awt.Color(0, 0, 45));
        faseEstruturasCondicionais.setForeground(new java.awt.Color(187, 187, 187));
        faseEstruturasCondicionais.setText("If Elif Else");
        faseEstruturasCondicionais.setPreferredSize(new java.awt.Dimension(72, 6));
        faseEstruturasCondicionais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseEstruturasCondicionaisActionPerformed(evt);
            }
        });

        faseDeFuncoes.setBackground(new java.awt.Color(0, 0, 45));
        faseDeFuncoes.setForeground(new java.awt.Color(187, 187, 187));
        faseDeFuncoes.setText("Def");
        faseDeFuncoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseDeFuncoesActionPerformed(evt);
            }
        });

        faseWhile.setBackground(new java.awt.Color(0, 0, 45));
        faseWhile.setForeground(new java.awt.Color(187, 187, 187));
        faseWhile.setText("While");
        faseWhile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseWhileActionPerformed(evt);
            }
        });

        faseFor.setBackground(new java.awt.Color(0, 0, 45));
        faseFor.setForeground(new java.awt.Color(187, 187, 187));
        faseFor.setText("For");
        faseFor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseForActionPerformed(evt);
            }
        });

        faseListas.setBackground(new java.awt.Color(0, 0, 45));
        faseListas.setForeground(new java.awt.Color(187, 187, 187));
        faseListas.setText("List");
        faseListas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                faseListasActionPerformed(evt);
            }
        });

        explicacaoPrimeiraFase.setBackground(new java.awt.Color(0, 0, 45));
        explicacaoPrimeiraFase.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        explicacaoPrimeiraFase.setForeground(new java.awt.Color(187, 187, 187));
        explicacaoPrimeiraFase.setText("Operações Matemáticas e Funções Iniciais");
        explicacaoPrimeiraFase.setAutoscrolls(false);
        explicacaoPrimeiraFase.setBorder(null);
        explicacaoPrimeiraFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                explicacaoPrimeiraFaseActionPerformed(evt);
            }
        });

        explicacaoSegundaFase.setBackground(new java.awt.Color(0, 0, 45));
        explicacaoSegundaFase.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        explicacaoSegundaFase.setForeground(new java.awt.Color(187, 187, 187));
        explicacaoSegundaFase.setText("Estruturas condicionais");
        explicacaoSegundaFase.setBorder(null);
        explicacaoSegundaFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                explicacaoSegundaFaseActionPerformed(evt);
            }
        });

        explicacaoTerceiraFase.setBackground(new java.awt.Color(0, 0, 45));
        explicacaoTerceiraFase.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        explicacaoTerceiraFase.setForeground(new java.awt.Color(187, 187, 187));
        explicacaoTerceiraFase.setText("Modularização");
        explicacaoTerceiraFase.setBorder(null);

        explicacaoQuartaFase.setBackground(new java.awt.Color(0, 0, 45));
        explicacaoQuartaFase.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        explicacaoQuartaFase.setForeground(new java.awt.Color(187, 187, 187));
        explicacaoQuartaFase.setText("Laço de Repetição I");
        explicacaoQuartaFase.setBorder(null);
        explicacaoQuartaFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                explicacaoQuartaFaseActionPerformed(evt);
            }
        });

        explicacaoQuintaFase.setBackground(new java.awt.Color(0, 0, 45));
        explicacaoQuintaFase.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        explicacaoQuintaFase.setForeground(new java.awt.Color(187, 187, 187));
        explicacaoQuintaFase.setText("Laço de Repetição II");
        explicacaoQuintaFase.setBorder(null);
        explicacaoQuintaFase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                explicacaoQuintaFaseActionPerformed(evt);
            }
        });

        explicacaoSextaFase.setEditable(false);
        explicacaoSextaFase.setBackground(new java.awt.Color(0, 0, 45));
        explicacaoSextaFase.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        explicacaoSextaFase.setForeground(new java.awt.Color(187, 187, 187));
        explicacaoSextaFase.setText("Listas");
        explicacaoSextaFase.setBorder(null);

        javax.swing.GroupLayout painelTelaDeFasesLayout = new javax.swing.GroupLayout(painelTelaDeFases);
        painelTelaDeFases.setLayout(painelTelaDeFasesLayout);
        painelTelaDeFasesLayout.setHorizontalGroup(
            painelTelaDeFasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelaDeFasesLayout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(painelTelaDeFasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tituloFases)
                    .addGroup(painelTelaDeFasesLayout.createSequentialGroup()
                        .addGroup(painelTelaDeFasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(faseFor, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                            .addComponent(faseDeFuncoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(faseInicial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(painelTelaDeFasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelTelaDeFasesLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(painelTelaDeFasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(explicacaoTerceiraFase, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(explicacaoQuintaFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(painelTelaDeFasesLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(explicacaoPrimeiraFase, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(painelTelaDeFasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(explicacaoSegundaFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(explicacaoQuartaFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(explicacaoSextaFase, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(painelTelaDeFasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(faseEstruturasCondicionais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(faseWhile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(faseListas, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                .addGap(200, 200, 200))
        );
        painelTelaDeFasesLayout.setVerticalGroup(
            painelTelaDeFasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelTelaDeFasesLayout.createSequentialGroup()
                .addGroup(painelTelaDeFasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelTelaDeFasesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(tituloFases)
                        .addGap(73, 73, 73)
                        .addGroup(painelTelaDeFasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelTelaDeFasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(faseEstruturasCondicionais, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(faseInicial, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(painelTelaDeFasesLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(painelTelaDeFasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(explicacaoSegundaFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(explicacaoPrimeiraFase, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(88, 88, 88)
                        .addGroup(painelTelaDeFasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(faseWhile, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(faseDeFuncoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(painelTelaDeFasesLayout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addGroup(painelTelaDeFasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(explicacaoTerceiraFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(explicacaoQuartaFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(painelTelaDeFasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelTelaDeFasesLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addGroup(painelTelaDeFasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(faseListas, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                            .addComponent(faseFor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(painelTelaDeFasesLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(painelTelaDeFasesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(explicacaoQuintaFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(explicacaoSextaFase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(210, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(painelTelaDeFases, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelTelaDeFases, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void faseInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseInicialActionPerformed
        new TelaMaterialInput().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_faseInicialActionPerformed

    private void faseEstruturasCondicionaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseEstruturasCondicionaisActionPerformed
        new TelaMaterialIfElifElse().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_faseEstruturasCondicionaisActionPerformed

    private void faseForActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseForActionPerformed
        new TelaMaterialFor().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_faseForActionPerformed

    private void explicacaoPrimeiraFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_explicacaoPrimeiraFaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_explicacaoPrimeiraFaseActionPerformed

    private void explicacaoSegundaFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_explicacaoSegundaFaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_explicacaoSegundaFaseActionPerformed

    private void explicacaoQuartaFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_explicacaoQuartaFaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_explicacaoQuartaFaseActionPerformed

    private void explicacaoQuintaFaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_explicacaoQuintaFaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_explicacaoQuintaFaseActionPerformed

    private void faseDeFuncoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseDeFuncoesActionPerformed
        new TelaMaterialDef().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_faseDeFuncoesActionPerformed

    private void faseWhileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseWhileActionPerformed
        new TelaMaterialWhile().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_faseWhileActionPerformed

    private void faseListasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_faseListasActionPerformed
        new TelaMaterialList().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_faseListasActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDeFases2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDeFases2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDeFases2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDeFases2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDeFases2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField explicacaoPrimeiraFase;
    private javax.swing.JTextField explicacaoQuartaFase;
    private javax.swing.JTextField explicacaoQuintaFase;
    private javax.swing.JTextField explicacaoSegundaFase;
    private javax.swing.JTextField explicacaoSextaFase;
    private javax.swing.JTextField explicacaoTerceiraFase;
    private javax.swing.JButton faseDeFuncoes;
    private javax.swing.JButton faseEstruturasCondicionais;
    private javax.swing.JButton faseFor;
    private javax.swing.JButton faseInicial;
    private javax.swing.JButton faseListas;
    private javax.swing.JButton faseWhile;
    private javax.swing.JPanel painelTelaDeFases;
    private javax.swing.JLabel tituloFases;
    // End of variables declaration//GEN-END:variables
}
