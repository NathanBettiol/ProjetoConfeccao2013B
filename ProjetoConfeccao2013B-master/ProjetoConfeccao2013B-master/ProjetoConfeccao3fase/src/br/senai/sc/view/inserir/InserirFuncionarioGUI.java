/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.view.inserir;

import br.senai.sc.controller.FuncionarioController;
import br.senai.sc.model.negocio.Funcionario;
import com.sun.media.sound.ModelOscillator;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pati
 */
public class InserirFuncionarioGUI extends javax.swing.JFrame {

    private DefaultTableModel modelo = new DefaultTableModel();

    public InserirFuncionarioGUI(DefaultTableModel modelo) {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelFuncionario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txNomeFuncionario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txTelefoneFuncionario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txEmailFuncionario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txCpfFuncionario = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txRgFuncionario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txEnderecoFuncionario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txDtNascimentoFuncionario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txDtCadastroFuncionario = new javax.swing.JTextField();
        txLoginFuncionario = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbCargoFuncionario = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        txCtpsFuncionario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txSalarioFuncionario = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txDtAdmissao = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txDtRecisao = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        painelFuncionario.setBackground(new java.awt.Color(255, 255, 255));
        painelFuncionario.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Funcionário", 0, 0, new java.awt.Font("Verdana", 1, 14), new java.awt.Color(102, 102, 102))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel1.setText("Nome:  ");

        txNomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNomeFuncionarioActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setText("Telefone:  ");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel3.setText("Email:  ");

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel4.setText("Cpf:  ");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel5.setText("Rg:  ");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel6.setText("Endereço:  ");

        txEnderecoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txEnderecoFuncionarioActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel7.setText("Data Nascimento:  ");

        txDtNascimentoFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txDtNascimentoFuncionarioActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel8.setText("Login Funcionário:  ");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel9.setText("Data Cadastro:  ");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel10.setText("Cargo:  ");

        cbCargoFuncionario.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        cbCargoFuncionario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "Designer", "Auxiliar de Corte", "Auxiliar de ficha técnica", "Estagiário(a)", "Serviços Gerais" }));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel11.setText("Ctps:  ");

        txCtpsFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txCtpsFuncionarioActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel12.setText("Salário:  ");

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel13.setText("Data Admissão:  ");

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel14.setText("Data Recisão:  ");

        jButton1.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(102, 102, 102));
        jButton1.setText("Salvar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 102, 102));
        jButton2.setText("Excluir");

        javax.swing.GroupLayout painelFuncionarioLayout = new javax.swing.GroupLayout(painelFuncionario);
        painelFuncionario.setLayout(painelFuncionarioLayout);
        painelFuncionarioLayout.setHorizontalGroup(
            painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFuncionarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelFuncionarioLayout.createSequentialGroup()
                        .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbCargoFuncionario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txCtpsFuncionario)))
                    .addGroup(painelFuncionarioLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txSalarioFuncionario))
                    .addGroup(painelFuncionarioLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGap(18, 18, 18)
                        .addComponent(txDtAdmissao))
                    .addGroup(painelFuncionarioLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txDtRecisao))
                    .addGroup(painelFuncionarioLayout.createSequentialGroup()
                        .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(painelFuncionarioLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txDtNascimentoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE))
                            .addGroup(painelFuncionarioLayout.createSequentialGroup()
                                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(painelFuncionarioLayout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(4, 4, 4))
                                    .addGroup(painelFuncionarioLayout.createSequentialGroup()
                                        .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txEnderecoFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                    .addComponent(txTelefoneFuncionario, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txEmailFuncionario, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txCpfFuncionario, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txRgFuncionario)
                                    .addComponent(txNomeFuncionario)))
                            .addGroup(painelFuncionarioLayout.createSequentialGroup()
                                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(1, 1, 1)
                                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txLoginFuncionario)
                                    .addComponent(txDtCadastroFuncionario))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(painelFuncionarioLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        painelFuncionarioLayout.setVerticalGroup(
            painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelFuncionarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txEmailFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txRgFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txEnderecoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txDtNascimentoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txLoginFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txDtCadastroFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cbCargoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txCtpsFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txSalarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txDtAdmissao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txDtRecisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txNomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNomeFuncionarioActionPerformed

    private void txEnderecoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txEnderecoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txEnderecoFuncionarioActionPerformed

    private void txDtNascimentoFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txDtNascimentoFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txDtNascimentoFuncionarioActionPerformed

    private void txCtpsFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txCtpsFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txCtpsFuncionarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Funcionario fun = new Funcionario();
        fun.setNome(txNomeFuncionario.getText());
        fun.setTelefone(txTelefoneFuncionario.getText());
        fun.setEmail(txEmailFuncionario.getText());
        fun.setCpf(txCpfFuncionario.getText());
        fun.setRg(txRgFuncionario.getText());
        fun.setEndereco(txEnderecoFuncionario.getText());
        try {
            String data = txDtNascimentoFuncionario.getText();

            fun.setDtNascimento(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
        }
        fun.setLogin(txLoginFuncionario.getText());
        try {
            String data = txDtCadastroFuncionario.getText();

            fun.setDtCadastro(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
        }
        fun.setCargo(cbCargoFuncionario.getSelectedItem().toString());
        fun.setCtps(txCtpsFuncionario.getText());
        fun.setSalario(Double.parseDouble(txSalarioFuncionario.getText()));
        try {
            String data = txDtAdmissao.getText();

            fun.setDtAdimissao(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
        }
        try {
            String data = txDtRecisao.getText();

            fun.setDtRecisao(new SimpleDateFormat("dd/mm/yyyy").parse(data));
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Data incorreta" + ex);
        }

        FuncionarioController fc = new FuncionarioController();
        modelo.addRow(new Object[]{fun.getCod(), fun.getNome(), fun.getTelefone(), fun.getEmail()});
        dispose();
        fc.inserir(fun);




    }//GEN-LAST:event_jButton1ActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cbCargoFuncionario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel painelFuncionario;
    private javax.swing.JTextField txCpfFuncionario;
    private javax.swing.JTextField txCtpsFuncionario;
    private javax.swing.JTextField txDtAdmissao;
    private javax.swing.JTextField txDtCadastroFuncionario;
    private javax.swing.JTextField txDtNascimentoFuncionario;
    private javax.swing.JTextField txDtRecisao;
    private javax.swing.JTextField txEmailFuncionario;
    private javax.swing.JTextField txEnderecoFuncionario;
    private javax.swing.JTextField txLoginFuncionario;
    private javax.swing.JTextField txNomeFuncionario;
    private javax.swing.JTextField txRgFuncionario;
    private javax.swing.JTextField txSalarioFuncionario;
    private javax.swing.JTextField txTelefoneFuncionario;
    // End of variables declaration//GEN-END:variables
}
