package me.devleo.PE.view;

import me.devleo.PE.fonts.FontManager;
import me.devleo.PE.relogio.AtualizadorHorario;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.awt.*;
import java.beans.PropertyVetoException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MenuView extends javax.swing.JFrame {

    public MenuView() {
        initComponents();
        AtualizadorHorario.start(lbRelogio);
        setLocationRelativeTo(null);
    }

    private void initComponents() {
        JPanel jpTudo = new JPanel();
        JPanel jpCabecalho = new JPanel();
        JLabel lbGrupo8 = new JLabel();
        JButton btnSair = new JButton();
        lbRelogio = new javax.swing.JLabel();
        JPanel jpBotoes = new JPanel();
        JLabel lbVenda = new JLabel();
        btnVenda = new javax.swing.JButton();
        JLabel lbCadastroProduto = new JLabel();
        btnCadastroProduto = new javax.swing.JButton();
        JLabel lbConsultaProduto = new JLabel();
        btnConsultaProduto = new javax.swing.JButton();
        lbAlerta = new javax.swing.JLabel();
        btnAlerta = new javax.swing.JButton();
        JLabel lbRelatorioVendas = new JLabel();
        btnRelatorioVendas = new javax.swing.JButton();
        JLabel lbLogo = new JLabel();
        JPanel jpCorpo = new JPanel();
        dskPainelPrincipal = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("StonePDV 1.0");
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(1024, 560));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened();
            }
        });

        jpTudo.setBackground(new java.awt.Color(255, 255, 255));
        jpTudo.setMaximumSize(new java.awt.Dimension(1024, 560));
        jpTudo.setMinimumSize(new java.awt.Dimension(1024, 560));
        jpTudo.setPreferredSize(new java.awt.Dimension(1024, 560));

        jpCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        jpCabecalho.setMaximumSize(new java.awt.Dimension(1024, 40));
        jpCabecalho.setMinimumSize(new java.awt.Dimension(1024, 40));
        jpCabecalho.setPreferredSize(new java.awt.Dimension(1024, 40));

        lbGrupo8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagens/logo 180x30.png"))); // NOI18N

        btnSair.setBackground(new java.awt.Color(17, 128, 216));
        btnSair.setFont(new java.awt.Font("Futura PT", 0, 16)); // NOI18N
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagens/power 25x25.png"))); // NOI18N
        btnSair.setBorder(null);
        btnSair.addActionListener(this::btnSairActionPerformed);

        lbRelogio.setBackground(new java.awt.Color(17, 128, 216));
        lbRelogio.setForeground(new java.awt.Color(255, 255, 255));
        lbRelogio.setText("03/05/2021 12:35:43");

        javax.swing.GroupLayout jpCabecalhoLayout = new javax.swing.GroupLayout(jpCabecalho);
        jpCabecalho.setLayout(jpCabecalhoLayout);
        jpCabecalhoLayout.setHorizontalGroup(
                jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCabecalhoLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(lbGrupo8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 367, Short.MAX_VALUE)
                                .addComponent(lbRelogio)
                                .addGap(321, 321, 321)
                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        jpCabecalhoLayout.setVerticalGroup(
                jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpCabecalhoLayout.createSequentialGroup()
                                .addGroup(jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jpCabecalhoLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(lbRelogio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addComponent(lbGrupo8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jpBotoes.setBackground(new java.awt.Color(102, 102, 102));
        jpBotoes.setForeground(new java.awt.Color(153, 153, 153));
        jpBotoes.setMaximumSize(new java.awt.Dimension(165, 502));
        jpBotoes.setMinimumSize(new java.awt.Dimension(165, 502));
        jpBotoes.setPreferredSize(new java.awt.Dimension(165, 502));

        lbVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagens/venda.png"))); // NOI18N
        lbVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbVendaMouseClicked();
            }
        });

        btnVenda.setBackground(new java.awt.Color(102, 102, 102));
        btnVenda.setForeground(new java.awt.Color(255, 255, 255));
        btnVenda.setText("Venda");
        btnVenda.setBorder(null);
        btnVenda.addActionListener(this::btnVendaActionPerformed);

        lbCadastroProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagens/parafusos.png"))); // NOI18N
        lbCadastroProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbCadastroProdutoMouseClicked();
            }
        });

        btnCadastroProduto.setBackground(new java.awt.Color(102, 102, 102));
        btnCadastroProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastroProduto.setText("Cadastrar Produto");
        btnCadastroProduto.setBorder(null);
        btnCadastroProduto.addActionListener(this::btnCadastroProdutoActionPerformed);

        lbConsultaProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagens/consultar_produto.png"))); // NOI18N
        lbConsultaProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbConsultaProdutoMouseClicked();
            }
        });

        btnConsultaProduto.setBackground(new java.awt.Color(102, 102, 102));
        btnConsultaProduto.setForeground(new java.awt.Color(255, 255, 255));
        btnConsultaProduto.setText("Consultar Produto");
        btnConsultaProduto.setBorder(null);
        btnConsultaProduto.addActionListener(this::btnConsultaProdutoActionPerformed);

        TelaAlerta.atualizar();
        if (AlertaView.resultado == null || AlertaView.resultado.size() < 0) {
            lbAlerta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagens/sino.png"))); // NOI18N
        } else {
            lbAlerta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagens/notificacao.png")));
        }
        lbAlerta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbAlertaMouseClicked();
            }
        });

        btnAlerta.setBackground(new java.awt.Color(102, 102, 102));
        btnAlerta.setForeground(new java.awt.Color(255, 255, 255));
        btnAlerta.setText("Avisos");
        btnAlerta.setBorder(null);
        btnAlerta.addActionListener(this::btnAlertaActionPerformed);

        lbRelatorioVendas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagens/relatorio_vendas.png"))); // NOI18N
        lbRelatorioVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbRelatorioVendasMouseClicked();
            }
        });

        btnRelatorioVendas.setBackground(new java.awt.Color(102, 102, 102));
        btnRelatorioVendas.setForeground(new java.awt.Color(255, 255, 255));
        btnRelatorioVendas.setText("Relatório");
        btnRelatorioVendas.setBorder(null);
        btnRelatorioVendas.addActionListener(this::btnRelatorioVendasActionPerformed);

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagens/logo 150x150 (2).png"))); // NOI18N

        javax.swing.GroupLayout jpBotoesLayout = new javax.swing.GroupLayout(jpBotoes);
        jpBotoes.setLayout(jpBotoesLayout);
        jpBotoesLayout.setHorizontalGroup(
                jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpBotoesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lbVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbConsultaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbRelatorioVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(btnCadastroProduto)
                                                .addComponent(btnVenda, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(btnAlerta, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addComponent(btnConsultaProduto)
                                        .addComponent(btnRelatorioVendas))
                                .addGap(19, 19, 19))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBotoesLayout.createSequentialGroup()
                                .addComponent(lbLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jpBotoesLayout.setVerticalGroup(
                jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpBotoesLayout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jpBotoesLayout.createSequentialGroup()
                                                .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jpBotoesLayout.createSequentialGroup()
                                                                .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(jpBotoesLayout.createSequentialGroup()
                                                                                .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(btnVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(lbVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(btnCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(lbCadastroProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnConsultaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(lbConsultaProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(btnAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(lbAlerta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jpBotoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btnRelatorioVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbRelatorioVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        jpCorpo.setMaximumSize(new java.awt.Dimension(853, 514));
        jpCorpo.setMinimumSize(new java.awt.Dimension(853, 514));
        jpCorpo.setPreferredSize(new java.awt.Dimension(853, 514));

        dskPainelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        dskPainelPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        dskPainelPrincipal.setMaximumSize(new java.awt.Dimension(853, 514));
        dskPainelPrincipal.setMinimumSize(new java.awt.Dimension(853, 514));

        javax.swing.GroupLayout dskPainelPrincipalLayout = new javax.swing.GroupLayout(dskPainelPrincipal);
        dskPainelPrincipal.setLayout(dskPainelPrincipalLayout);
        dskPainelPrincipalLayout.setHorizontalGroup(
                dskPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        dskPainelPrincipalLayout.setVerticalGroup(
                dskPainelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpCorpoLayout = new javax.swing.GroupLayout(jpCorpo);
        jpCorpo.setLayout(jpCorpoLayout);
        jpCorpoLayout.setHorizontalGroup(
                jpCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dskPainelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpCorpoLayout.setVerticalGroup(
                jpCorpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(dskPainelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpTudoLayout = new javax.swing.GroupLayout(jpTudo);
        jpTudo.setLayout(jpTudoLayout);
        jpTudoLayout.setHorizontalGroup(
                jpTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpTudoLayout.createSequentialGroup()
                                .addGroup(jpTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jpCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jpTudoLayout.createSequentialGroup()
                                                .addComponent(jpBotoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jpCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jpTudoLayout.setVerticalGroup(
                jpTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpTudoLayout.createSequentialGroup()
                                .addComponent(jpCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jpTudoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jpCorpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jpBotoes, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jpTudo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jpTudo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new MenuView().setVisible(true));
    }

    private VendaView TelaDeVenda;
    private ProdutoCadastroAlteracaoView produtoCadastroAlteracao;
    private ProdutoConsultaView produtoConsulta;
    private RelatorioConsultaView relatorioConsulta;
    public static final AlertaView TelaAlerta = new AlertaView();

    public JDesktopPane getDskPainelPrincipal() {
        return dskPainelPrincipal;
    }

    public void telaVenda() {
        if (TelaDeVenda == null) {
            TelaDeVenda = new VendaView();
            TelaDeVenda.menuView = this;
        }

        if (!TelaDeVenda.isVisible()) {
            dskPainelPrincipal.add(TelaDeVenda);
            TelaDeVenda.setVisible(true);
        }
        TelaDeVenda.toFront();

        try {
            TelaDeVenda.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        ((BasicInternalFrameUI) TelaDeVenda.getUI()).setNorthPane(null);
    }

    public void cadastrarProduto() {
        if (produtoCadastroAlteracao == null) {
            produtoCadastroAlteracao = new ProdutoCadastroAlteracaoView();
        }

        produtoCadastroAlteracao.setCabecario("Cadastro de Produto");
        if (!produtoCadastroAlteracao.isVisible()) {
            dskPainelPrincipal.add(produtoCadastroAlteracao);
            produtoCadastroAlteracao.setVisible(true);
        }
        produtoCadastroAlteracao.toFront();
        try {
            produtoCadastroAlteracao.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        ((BasicInternalFrameUI) produtoCadastroAlteracao.getUI()).setNorthPane(null);
    }

    public void consultarProduto() {
        if (produtoConsulta == null) {
            produtoConsulta = new ProdutoConsultaView();
        }
        if (!produtoConsulta.isVisible()) {
            dskPainelPrincipal.add(produtoConsulta);
            produtoConsulta.setVisible(true);
        }
        produtoConsulta.toFront();

        try {
            produtoConsulta.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        produtoConsulta.tableModelLimpar();
        ((BasicInternalFrameUI) produtoConsulta.getUI()).setNorthPane(null);
    }

    public void relatorioVendas() {
        if (relatorioConsulta == null) {
            relatorioConsulta = new RelatorioConsultaView();
        }
        if (!relatorioConsulta.isVisible()) {
            dskPainelPrincipal.add(relatorioConsulta);
            relatorioConsulta.setVisible(true);
            relatorioConsulta.tableModelLimpar();
        }
        relatorioConsulta.toFront();

        try {
            relatorioConsulta.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }

        relatorioConsulta.tableModelLimpar();

        ((BasicInternalFrameUI) relatorioConsulta.getUI()).setNorthPane(null);
    }

    public void alertas() {
        //if (TelaAlerta == null) {
        //    TelaAlerta = new AlertaView();
        //}
        if (!TelaAlerta.isVisible()) {
            dskPainelPrincipal.add(TelaAlerta);
            TelaAlerta.setVisible(true);
            TelaAlerta.tableModelLimpar();
        }
        TelaAlerta.toFront();

        try {
            TelaAlerta.setMaximum(true);
        } catch (PropertyVetoException ex) {
            Logger.getLogger(MenuView.class.getName()).log(Level.SEVERE, null, ex);
        }

        TelaAlerta.tableModelLimpar();

        ((BasicInternalFrameUI) TelaAlerta.getUI()).setNorthPane(null);
    }

    public static void atualizaImagem() {
        if (AlertaView.resultado == null) {
            lbAlerta.setIcon(new javax.swing.ImageIcon(VendaView.class.getResource("/resources/imagens/sino.png")));
        } else {
            lbAlerta.setIcon(new javax.swing.ImageIcon(VendaView.class.getResource("/resources/imagens/notificacao.png")));
        }
    }

    private void btnCadastroProdutoActionPerformed(java.awt.event.ActionEvent evt) {
        cadastrarProduto();
    }

    private void btnConsultaProdutoActionPerformed(java.awt.event.ActionEvent evt) {
        consultarProduto();
    }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    private void btnAlertaActionPerformed(java.awt.event.ActionEvent evt) {
        alertas();
    }

    private void btnRelatorioVendasActionPerformed(java.awt.event.ActionEvent evt) {
        relatorioVendas();
    }

    private void btnVendaActionPerformed(java.awt.event.ActionEvent evt) {
        telaVenda();
    }

    private void formWindowOpened() {
        FontManager fontManager = new FontManager();
        Font futuraPT14 = fontManager.carregarFont("/resources/fontes/FuturaPT.otf", Font.PLAIN, 14);
        Font futuraPT16 = fontManager.carregarFont("/resources/fontes/FuturaPT.otf", Font.PLAIN, 16);

        btnAlerta.setFont(futuraPT14);
        btnCadastroProduto.setFont(futuraPT14);
        btnConsultaProduto.setFont(futuraPT14);
        btnVenda.setFont(futuraPT14);
        btnRelatorioVendas.setFont(futuraPT14);
        lbRelogio.setFont(futuraPT16);
    }


    private void lbVendaMouseClicked() {
        telaVenda();
    }

    private void lbCadastroProdutoMouseClicked() {
        cadastrarProduto();
    }

    private void lbConsultaProdutoMouseClicked() {
        consultarProduto();
    }

    private void lbAlertaMouseClicked() {
        alertas();
    }

    //RELATORIO VENDAS
    private void lbRelatorioVendasMouseClicked() {
        relatorioVendas();
    }

    private javax.swing.JButton btnAlerta;
    private javax.swing.JButton btnCadastroProduto;
    private javax.swing.JButton btnConsultaProduto;
    private javax.swing.JButton btnRelatorioVendas;
    private javax.swing.JButton btnVenda;
    private javax.swing.JDesktopPane dskPainelPrincipal;
    private static javax.swing.JLabel lbAlerta;
    private javax.swing.JLabel lbRelogio;
}
