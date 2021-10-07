package me.devleo.PE.view;

import me.devleo.PE.controller.ProdutoController;
import me.devleo.PE.fonts.FontManager;
import me.devleo.PE.model.Produto;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.beans.PropertyVetoException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProdutoConsultaView extends javax.swing.JInternalFrame {

    public ProdutoConsultaView() {
        initComponents();
    }

    private void initComponents() {
        JPanel jPanel2 = new JPanel();
        lbCabecalho = new javax.swing.JLabel();
        JLabel jLabel1 = new JLabel();
        txtProdutoNome = new javax.swing.JTextField();
        JButton btnPesquisar = new JButton();
        JScrollPane jScrollPane1 = new JScrollPane();
        produtoTabela = new javax.swing.JTable();
        JButton btnSair = new JButton();
        JButton btnAlterar = new JButton();
        JButton btnDeletar = new JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(853, 514));
        setMinimumSize(new java.awt.Dimension(853, 514));
        setPreferredSize(new java.awt.Dimension(853, 514));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }

            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened();
            }
        });

        jPanel2.setBackground(new java.awt.Color(17, 128, 216));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setMaximumSize(new java.awt.Dimension(853, 29));
        jPanel2.setMinimumSize(new java.awt.Dimension(853, 29));
        jPanel2.setPreferredSize(new java.awt.Dimension(853, 29));

        lbCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        lbCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        lbCabecalho.setText("Consulta de Produto");
        lbCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setPreferredSize(new java.awt.Dimension(853, 29));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nome do Produto");

        btnPesquisar.setBackground(new java.awt.Color(17, 128, 216));
        btnPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(this::btnPesquisarActionPerformed);

        produtoTabela.setForeground(new java.awt.Color(255, 255, 255));
        produtoTabela.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null},
                        {null, null, null, null, null}
                },
                new String[]{
                        "Id", "Nome", "Quantidade", "Custo", "Valor"
                }
        ) {
            final Class[] types = new Class[]{
                    java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            final boolean[] canEdit = new boolean[]{
                    false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        produtoTabela.setMinimumSize(new java.awt.Dimension(105, 400));
        produtoTabela.setPreferredSize(new java.awt.Dimension(225, 400));
        produtoTabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(produtoTabela);
        if (produtoTabela.getColumnModel().getColumnCount() > 0) {
            produtoTabela.getColumnModel().getColumn(0).setResizable(false);
            produtoTabela.getColumnModel().getColumn(0).setPreferredWidth(3);
            produtoTabela.getColumnModel().getColumn(2).setResizable(false);
            produtoTabela.getColumnModel().getColumn(2).setPreferredWidth(5);
            produtoTabela.getColumnModel().getColumn(3).setResizable(false);
            produtoTabela.getColumnModel().getColumn(3).setPreferredWidth(5);
            produtoTabela.getColumnModel().getColumn(4).setResizable(false);
            produtoTabela.getColumnModel().getColumn(4).setPreferredWidth(5);
        }

        btnSair.setBackground(new java.awt.Color(102, 102, 102));
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.setMaximumSize(new java.awt.Dimension(79, 32));
        btnSair.setMinimumSize(new java.awt.Dimension(79, 32));
        btnSair.setPreferredSize(new java.awt.Dimension(79, 32));
        btnSair.addActionListener(this::btnSairActionPerformed);

        btnAlterar.setBackground(new java.awt.Color(0, 102, 51));
        btnAlterar.setForeground(new java.awt.Color(255, 255, 255));
        btnAlterar.setText("Alterar");
        btnAlterar.setMaximumSize(new java.awt.Dimension(79, 32));
        btnAlterar.setMinimumSize(new java.awt.Dimension(79, 32));
        btnAlterar.setPreferredSize(new java.awt.Dimension(79, 32));
        btnAlterar.addActionListener(this::btnAlterarActionPerformed);

        btnDeletar.setBackground(new java.awt.Color(153, 0, 0));
        btnDeletar.setForeground(new java.awt.Color(255, 255, 255));
        btnDeletar.setText("Deletar");
        btnDeletar.setMaximumSize(new java.awt.Dimension(79, 32));
        btnDeletar.setMinimumSize(new java.awt.Dimension(79, 32));
        btnDeletar.setPreferredSize(new java.awt.Dimension(79, 32));
        btnDeletar.addActionListener(this::btnDeletarActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(txtProdutoNome)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnPesquisar)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtProdutoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );

        pack();
    }

    private DefaultTableModel tableModel;

    ProdutoCadastroAlteracaoView produtoCadastroAlteracao;

    public void tableModelLimpar() {
        if (tableModel == null) {
            tableModel = (DefaultTableModel) produtoTabela.getModel();
        }
        tableModel.setRowCount(0);
    }

    public void pesquisar() {
        List<Produto> resultado = ProdutoController.procurar(
                txtProdutoNome.getText());
        tableModel = (DefaultTableModel) produtoTabela.getModel();
        tableModel.setRowCount(0);
        if (resultado != null && resultado.size() > 0) {
            for (Produto produto : resultado) {
                if (produto != null) {
                    Object[] dadosTabela = new Object[6];
                    dadosTabela[0] = produto.getId();
                    dadosTabela[1] = produto.getNome();
                    dadosTabela[2] = produto.getQuantidade();
                    dadosTabela[3] = produto.getCusto();
                    dadosTabela[4] = produto.getValor();
                    tableModel.addRow(dadosTabela);
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Não existem resultados para a sua pesquisa!",
                    "Não há dados",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {
        if (produtoTabela.getSelectedRow() >= 0) {
            final int row = produtoTabela.getSelectedRow();
            String nome = (String) produtoTabela.getValueAt(row, 1);
            int respostaConfirmacao = JOptionPane.showConfirmDialog(
                    rootPane,
                    "Excluir o produto \"" + nome + "\"?",
                    "Confirmar exclusão",
                    JOptionPane.YES_NO_OPTION);
            if (respostaConfirmacao == JOptionPane.YES_OPTION) {
                Integer idProduto = (Integer) produtoTabela.getValueAt(row, 0);
                String respostaController = ProdutoController.excluir(idProduto);
                if (respostaController == null) {
                    pesquisar();
                } else {
                    JOptionPane.showMessageDialog(
                            rootPane,
                            respostaController
                                    + "\n Procure o administrador do sistema!",
                            "Falha na Exclusão",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {
        pesquisar();
    }

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {
        int row = produtoTabela.getSelectedRow();
        if (produtoTabela.getSelectedRow() < 0) {
            return;
        }
        Integer idProduto = (Integer) produtoTabela.getValueAt(row, 0);
        Produto produto = ProdutoController.obter(idProduto);
        if (produto != null) {
            if (produtoCadastroAlteracao == null) {
                produtoCadastroAlteracao = new ProdutoCadastroAlteracaoView();
            }
            produtoCadastroAlteracao.setProduto(produto);
            produtoCadastroAlteracao.setModoEdicao(true);
            produtoCadastroAlteracao.setCabecario("Alteração do Produto: "
                    + produto.getNome());
            this.getParent().add(produtoCadastroAlteracao);
            produtoCadastroAlteracao.setVisible(true);
            produtoCadastroAlteracao.toFront();
            produtoCadastroAlteracao.carregarDadosTela();
            try {
                produtoCadastroAlteracao.setMaximum(true);
            } catch (PropertyVetoException ex) {
                Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
            ((BasicInternalFrameUI) produtoCadastroAlteracao.getUI()).setNorthPane(null);
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Não foi possível localizar este produto para edição. "
                            + "\n Procure o administrador do sistema!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void formInternalFrameOpened() {
        produtoTabela.getTableHeader().setBackground(new Color(15, 128, 216));
        produtoTabela.getTableHeader().setForeground(Color.white);

        produtoTabela.setForeground(Color.black);

        FontManager fontManager = new FontManager();
        Font futuraPT20Bold = fontManager.carregarFont("/resources/fontes/FuturaPT.otf", Font.BOLD, 20);
        lbCabecalho.setFont(futuraPT20Bold);
    }

    private javax.swing.JLabel lbCabecalho;
    private javax.swing.JTable produtoTabela;
    private javax.swing.JTextField txtProdutoNome;
}
