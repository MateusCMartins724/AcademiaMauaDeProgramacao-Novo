/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.jogo;

/**
 *
 * @author Othavio
 */

import java.io.*;
import java.util.*; 
import org.apache.commons.io.FileUtils;
import javax.swing.*;
import java.io.File;

public class TelaMaterialInput extends javax.swing.JFrame {

    /**
     * Creates new form TelaMaterialInput
     */
    public TelaMaterialInput() {
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

        painelMaterialInput = new javax.swing.JPanel();
        inputLabel = new javax.swing.JLabel();
        botaoVoltar = new javax.swing.JButton();
        botaoJogar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        materialDef = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        painelMaterialInput.setBackground(new java.awt.Color(0, 0, 45));
        painelMaterialInput.setVerifyInputWhenFocusTarget(false);

        inputLabel.setBackground(new java.awt.Color(0, 0, 45));
        inputLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        inputLabel.setForeground(new java.awt.Color(187, 187, 187));
        inputLabel.setText("Input");

        botaoVoltar.setBackground(new java.awt.Color(0, 0, 45));
        botaoVoltar.setForeground(new java.awt.Color(0, 0, 45));
        botaoVoltar.setIcon(new javax.swing.ImageIcon("D:\\Documentos\\Mauá\\Primeiro Semestre\\Projeto Integrador Interdisciplinar\\Codigos\\src\\main\\java\\com\\mycompany\\jogo\\bVoltar.png")); // NOI18N
        botaoVoltar.setBorder(null);
        botaoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltarActionPerformed(evt);
            }
        });

        botaoJogar.setBackground(new java.awt.Color(0, 0, 45));
        botaoJogar.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N
        botaoJogar.setForeground(new java.awt.Color(255, 255, 255));
        botaoJogar.setText("JOGAR");
        botaoJogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoJogarActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        materialDef.setText("jLabel2");

        javax.swing.GroupLayout painelMaterialInputLayout = new javax.swing.GroupLayout(painelMaterialInput);
        painelMaterialInput.setLayout(painelMaterialInputLayout);
        painelMaterialInputLayout.setHorizontalGroup(
            painelMaterialInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMaterialInputLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(painelMaterialInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMaterialInputLayout.createSequentialGroup()
                        .addGap(389, 389, 389)
                        .addComponent(inputLabel))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelMaterialInputLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(materialDef, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(botaoJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84))))
            .addGroup(painelMaterialInputLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        painelMaterialInputLayout.setVerticalGroup(
            painelMaterialInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelMaterialInputLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelMaterialInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelMaterialInputLayout.createSequentialGroup()
                        .addComponent(botaoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(714, 714, 714)
                        .addComponent(jLabel1))
                    .addGroup(painelMaterialInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(botaoJogar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(painelMaterialInputLayout.createSequentialGroup()
                            .addComponent(inputLabel)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(materialDef, javax.swing.GroupLayout.PREFERRED_SIZE, 699, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        try{
            if (new MaterialDeApoioDAO().consultar_material_jogador(Jogador.nomeDoUsuario,1)==false)
            new MaterialDeApoioDAO().cadastrar_material_jogador(Jogador.nomeDoUsuario,1);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        MaterialDeApoioDAO dao = new MaterialDeApoioDAO();

        String material = dao.material(1);
        byte[] fotoMaterial = Base64.getDecoder().decode(material);
        Icon iconMaterial = new ImageIcon(fotoMaterial);
        materialDef.setIcon(iconMaterial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelMaterialInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelMaterialInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltarActionPerformed
        new TelaMaterialDeApoio().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoVoltarActionPerformed

    private void botaoJogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoJogarActionPerformed
        new TelaDeFase1Nivel1().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_botaoJogarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMaterialInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMaterialInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMaterialInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMaterialInput.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMaterialInput().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoJogar;
    private javax.swing.JButton botaoVoltar;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel materialDef;
    private javax.swing.JPanel painelMaterialInput;
    // End of variables declaration//GEN-END:variables
}
