/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senai.sc.view;

/**
 *
 * @author patricia_gageiro
 */
public class JanelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form JanelaPrincipal
     */
    public JanelaPrincipal() {
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

        PainelFundo = new javax.swing.JPanel();
        painelBiotipo = new javax.swing.JPanel();
        btUsuario = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        painelEstoque = new javax.swing.JPanel();
        btEntrada = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        painelFinanceiro = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        painelPcp = new javax.swing.JPanel();
        btFornecedor = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        PainelRh = new javax.swing.JPanel();
        btFuncionario = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton15 = new javax.swing.JButton();
        btPessoa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PainelFundo.setBackground(new java.awt.Color(255, 255, 255));
        PainelFundo.setLayout(new java.awt.GridLayout(6, 1));

        painelBiotipo.setBackground(new java.awt.Color(255, 255, 255));
        painelBiotipo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Biotipo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        painelBiotipo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        painelBiotipo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btUsuario.setText("Usuário");
        btUsuario.setBorder(null);
        btUsuario.setContentAreaFilled(false);
        btUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btUsuarioActionPerformed(evt);
            }
        });
        painelBiotipo.add(btUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 70, 80));

        jButton2.setText("Medida");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        painelBiotipo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 70, 80));

        jButton3.setText("Tipo Fisico");
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        painelBiotipo.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 70, 80));

        jButton4.setText("Coleção");
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        painelBiotipo.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 80, 80));

        jButton5.setText("Categoria Coleção");
        jButton5.setToolTipText("");
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        painelBiotipo.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 40, 90, 80));

        PainelFundo.add(painelBiotipo);

        painelEstoque.setBackground(new java.awt.Color(255, 255, 255));
        painelEstoque.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estoque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        painelEstoque.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btEntrada.setText("Entrada");
        btEntrada.setBorder(null);
        btEntrada.setContentAreaFilled(false);
        btEntrada.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btEntrada.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        painelEstoque.add(btEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 70, 100));

        jButton6.setText("Produto");
        jButton6.setContentAreaFilled(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        painelEstoque.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 70, 100));

        jButton7.setText("Matéria Prima");
        jButton7.setBorder(null);
        jButton7.setContentAreaFilled(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        painelEstoque.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 70, 100));

        jButton8.setText("Categoria Matéria Prima");
        jButton8.setBorder(null);
        jButton8.setContentAreaFilled(false);
        jButton8.setHideActionText(true);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.setIconTextGap(10);
        jButton8.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        painelEstoque.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 70, 120));

        PainelFundo.add(painelEstoque);

        painelFinanceiro.setBackground(new java.awt.Color(255, 255, 255));
        painelFinanceiro.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Financeiro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        painelFinanceiro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Nota Fiscal");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        painelFinanceiro.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        PainelFundo.add(painelFinanceiro);

        painelPcp.setBackground(new java.awt.Color(255, 255, 255));
        painelPcp.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "PCP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        painelPcp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btFornecedor.setText("Fornecedor");
        btFornecedor.setContentAreaFilled(false);
        btFornecedor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFornecedor.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        painelPcp.add(btFornecedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 90, 100));

        jButton9.setText("Trasnportadora");
        jButton9.setContentAreaFilled(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        painelPcp.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 110, 100));

        jButton10.setText("Conserto");
        jButton10.setContentAreaFilled(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        painelPcp.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 80, 100));

        PainelFundo.add(painelPcp);

        PainelRh.setBackground(new java.awt.Color(255, 255, 255));
        PainelRh.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RH", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18), new java.awt.Color(0, 0, 0))); // NOI18N
        PainelRh.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btFuncionario.setText("Funcionário");
        btFuncionario.setToolTipText("Funcionário");
        btFuncionario.setContentAreaFilled(false);
        btFuncionario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btFuncionario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PainelRh.add(btFuncionario, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 90, 100));

        jButton11.setText("Férias");
        jButton11.setContentAreaFilled(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PainelRh.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 70, 100));

        jButton12.setText("Currículo");
        jButton12.setContentAreaFilled(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PainelRh.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 80, 100));

        jButton13.setText("Vagas");
        jButton13.setContentAreaFilled(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PainelRh.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 60, 100));

        jButton14.setText("Treinamento");
        jButton14.setContentAreaFilled(false);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        PainelRh.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, 100));

        PainelFundo.add(PainelRh);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Outros", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri", 1, 18), new java.awt.Color(0, 0, 0))))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton15.setText("Endereço");
        jButton15.setContentAreaFilled(false);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 30, 80, -1));

        btPessoa.setText("Pessoa");
        btPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPessoaActionPerformed(evt);
            }
        });
        jPanel1.add(btPessoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        PainelFundo.add(jPanel1);

        getContentPane().add(PainelFundo, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btUsuarioActionPerformed

    private void btPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPessoaActionPerformed
        ListarPessoaGUI lp = new ListarPessoaGUI();
        lp.setLocationRelativeTo(null);
        lp.setVisible(true);
    }//GEN-LAST:event_btPessoaActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
     ListarMateriaPrimaGUI mp = new ListarMateriaPrimaGUI();
     mp.setLocationRelativeTo(null);
     mp.setVisible(true);
       
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PainelFundo;
    private javax.swing.JPanel PainelRh;
    private javax.swing.JButton btEntrada;
    private javax.swing.JButton btFornecedor;
    private javax.swing.JButton btFuncionario;
    private javax.swing.JButton btPessoa;
    private javax.swing.JButton btUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel painelBiotipo;
    private javax.swing.JPanel painelEstoque;
    private javax.swing.JPanel painelFinanceiro;
    private javax.swing.JPanel painelPcp;
    // End of variables declaration//GEN-END:variables
}
