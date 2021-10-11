package me.devleo.PE.view;

import me.devleo.PE.controller.AlertaController;
import me.devleo.PE.controller.ProdutoController;
import me.devleo.PE.fonts.FontManager;
import me.devleo.PE.model.Alerta;
import me.devleo.PE.model.Produto;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.List;

public class AlertaView extends javax.swing.JInternalFrame {

    public AlertaView() {
        initComponents();
    }

    private void initComponents() {
        JPanel jPanel2 = new JPanel();
        lbCabecalho = new javax.swing.JLabel();
        JScrollPane jScrollPane1 = new JScrollPane();
        alertaTabela = new javax.swing.JTable();
        JButton btnSair = new JButton();
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
        lbCabecalho.setText("Alertas");
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

        alertaTabela.setForeground(new java.awt.Color(255, 255, 255));
        alertaTabela.setModel(new javax.swing.table.DefaultTableModel(
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
                        "Id", "Produto", "Quantidade", "Motivo", "Data"
                }
        ) {
            final Class[] types = new Class[]{
                    java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
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
        alertaTabela.setMinimumSize(new java.awt.Dimension(105, 400));
        alertaTabela.setPreferredSize(new java.awt.Dimension(225, 400));
        alertaTabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(alertaTabela);
        if (alertaTabela.getColumnModel().getColumnCount() > 0) {
            alertaTabela.getColumnModel().getColumn(0).setResizable(false);
            alertaTabela.getColumnModel().getColumn(0).setPreferredWidth(1);
            alertaTabela.getColumnModel().getColumn(1).setPreferredWidth(15);
            alertaTabela.getColumnModel().getColumn(2).setResizable(false);
            alertaTabela.getColumnModel().getColumn(2).setPreferredWidth(5);
            alertaTabela.getColumnModel().getColumn(3).setPreferredWidth(15);
            alertaTabela.getColumnModel().getColumn(4).setResizable(false);
            alertaTabela.getColumnModel().getColumn(4).setPreferredWidth(5);
        }

        btnSair.setBackground(new java.awt.Color(102, 102, 102));
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.setMaximumSize(new java.awt.Dimension(79, 32));
        btnSair.setMinimumSize(new java.awt.Dimension(79, 32));
        btnSair.setPreferredSize(new java.awt.Dimension(79, 32));
        btnSair.addActionListener(this::btnSairActionPerformed);

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
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 386, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );
        pack();
    }

    private DefaultTableModel tableModel;
    public static List<Alerta> resultado;

    public void tableModelLimpar() {
        if (tableModel == null) {
            tableModel = (DefaultTableModel) alertaTabela.getModel();
        }
        tableModel.setRowCount(0);
        atualizar();
    }

    public void atualizar() {
        resultado = AlertaController.obter();
        tableModel = (DefaultTableModel) alertaTabela.getModel();
        tableModel.setRowCount(0);
        if (resultado != null && resultado.size() > 0) {
            for (int i = 0; i < resultado.size(); i++) {
                Alerta alerta = resultado.get(i);
                if (alerta != null) {
                    Produto produto = ProdutoController.obter(alerta.getIdItem());
                    if (produto != null) {
                        Object[] dadosTabela = new Object[6];
                        dadosTabela[0] = alerta.getId();
                        dadosTabela[1] = produto.getNome();
                        dadosTabela[2] = produto.getQuantidade();
                        dadosTabela[3] = alerta.getDescAlerta();
                        dadosTabela[4] = alerta.getDataString();
                        tableModel.addRow(dadosTabela);
                    } else {
                        //PRODUTO NÃO EXISTE MAIS
                        AlertaController.excluir(i);
                    }
                }
            }
        }
    }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {
        if (alertaTabela.getSelectedRow() >= 0) {
            final int row = alertaTabela.getSelectedRow();
            String nome = (String) alertaTabela.getValueAt(row, 1);
            int respostaConfirmacao = JOptionPane.showConfirmDialog(
                    rootPane,
                    "Excluir o alerta do produto \"" + nome + "\"?",
                    "Confirmar exclusão",
                    JOptionPane.YES_NO_OPTION);
            if (respostaConfirmacao == JOptionPane.YES_OPTION) {
                Integer idAlerta = (Integer) alertaTabela.getValueAt(row, 0);
                String respostaController = AlertaController.excluir(idAlerta);
                if (respostaController == null) {
                    atualizar();
                    MenuView.atualizaImagem();
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

    private void formInternalFrameOpened() {
        alertaTabela.getTableHeader().setBackground(new Color(15, 128, 216));
        alertaTabela.getTableHeader().setForeground(Color.white);

        alertaTabela.setForeground(Color.black);

        FontManager fontManager = new FontManager();
        Font futuraPT20Bold = fontManager.carregarFont("/resources/fontes/FuturaPT.otf", Font.BOLD, 20);
        lbCabecalho.setFont(futuraPT20Bold);
    }

    private javax.swing.JTable alertaTabela;
    private javax.swing.JLabel lbCabecalho;
}
