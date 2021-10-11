package me.devleo.PE.view;

import me.devleo.PE.controller.AlertaController;
import me.devleo.PE.controller.ItensVendaController;
import me.devleo.PE.controller.ProdutoController;
import me.devleo.PE.controller.VendaController;
import me.devleo.PE.fonts.FontManager;
import me.devleo.PE.model.Alerta;
import me.devleo.PE.model.ItemVenda;
import me.devleo.PE.model.Produto;
import me.devleo.PE.model.Venda;

import javax.swing.*;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Date;

public class VendaView extends javax.swing.JInternalFrame {

    public VendaView() {
        initComponents();
    }

    private void initComponents() {
        javax.swing.JPanel jpCabecalho = new javax.swing.JPanel();
        lbCabecalho = new javax.swing.JLabel();
        javax.swing.JLabel lbVendaLogo = new javax.swing.JLabel();
        javax.swing.JLabel lbSairVenda = new javax.swing.JLabel();
        javax.swing.JLabel lbProdutoNome = new javax.swing.JLabel();
        txtProdutoNome = new javax.swing.JTextField();
        javax.swing.JLabel lbProdutoQuantidade = new javax.swing.JLabel();
        jsProdutoQuantidade = new javax.swing.JSpinner();
        javax.swing.JLabel lbProdutoValorUnitario = new javax.swing.JLabel();
        txtProdutoValorUnitario = new javax.swing.JTextField();
        javax.swing.JLabel lbProdutoValorTotal = new javax.swing.JLabel();
        txtProdutoValorTotal = new javax.swing.JTextField();
        javax.swing.JLabel lbVendaClienteCpf = new javax.swing.JLabel();
        javax.swing.JButton btAdicionarItem = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        tabelaVenda = new javax.swing.JTable();
        javax.swing.JPanel jpDadosCliente = new javax.swing.JPanel();
        txtClienteNomeInfo = new javax.swing.JTextField();
        txtClienteCpfInfo = new javax.swing.JTextField();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        cbDinheiro = new javax.swing.JCheckBox();
        txtPagamentoDinheiro = new javax.swing.JFormattedTextField();
        cbCartao = new javax.swing.JCheckBox();
        txtPagamentoCartao = new javax.swing.JFormattedTextField();
        javax.swing.JPanel jpSubtotal = new javax.swing.JPanel();
        lbSubtotal = new javax.swing.JLabel();
        txtSubtotal = new javax.swing.JTextField();
        javax.swing.JButton btRegistrarVenda = new javax.swing.JButton();
        javax.swing.JButton btRemoverItem = new javax.swing.JButton();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JFormattedTextField();
        txtNomeCliente = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        cbMaoObra = new javax.swing.JCheckBox();
        txtMaoObra = new javax.swing.JFormattedTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setMaximumSize(new java.awt.Dimension(853, 514));
        setMinimumSize(new java.awt.Dimension(853, 514));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
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
                formInternalFrameOpened(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown();
            }
        });

        jpCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        jpCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        jpCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        jpCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));

        lbCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        lbCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        lbCabecalho.setText("Venda nº 320");
        lbCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setPreferredSize(new java.awt.Dimension(853, 29));

        lbVendaLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/imagens/venda.png"))); // NOI18N

        lbSairVenda.setForeground(new java.awt.Color(255, 255, 255));
        lbSairVenda.setText("Sair");
        lbSairVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSairVendaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jpCabecalhoLayout = new javax.swing.GroupLayout(jpCabecalho);
        jpCabecalho.setLayout(jpCabecalhoLayout);
        jpCabecalhoLayout.setHorizontalGroup(
                jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCabecalhoLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbVendaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, 738, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                .addComponent(lbSairVenda)
                                .addContainerGap())
        );
        jpCabecalhoLayout.setVerticalGroup(
                jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbSairVenda))
                        .addComponent(lbVendaLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        lbProdutoNome.setText("Produto");

        txtProdutoNome.setEditable(false);
        txtProdutoNome.setText("Clique aqui para pesquisar o produto...");
        txtProdutoNome.setMinimumSize(new java.awt.Dimension(14, 25));
        txtProdutoNome.setPreferredSize(new java.awt.Dimension(14, 25));
        txtProdutoNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtProdutoNomeMouseClicked(evt);
            }
        });

        lbProdutoQuantidade.setText("Quantidade");

        jsProdutoQuantidade.setMinimumSize(new java.awt.Dimension(14, 25));
        jsProdutoQuantidade.setPreferredSize(new java.awt.Dimension(14, 25));
        jsProdutoQuantidade.addChangeListener(this::jsProdutoQuantidadeStateChanged);
        jsProdutoQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jsProdutoQuantidadeFocusLost(evt);
            }
        });

        lbProdutoValorUnitario.setText("Valor unitario");

        txtProdutoValorUnitario.setEditable(false);
        txtProdutoValorUnitario.setText("0");
        txtProdutoValorUnitario.setMinimumSize(new java.awt.Dimension(14, 25));
        txtProdutoValorUnitario.setPreferredSize(new java.awt.Dimension(14, 25));

        lbProdutoValorTotal.setText("Valor Total");

        txtProdutoValorTotal.setEditable(false);
        txtProdutoValorTotal.setText("0");
        txtProdutoValorTotal.setMinimumSize(new java.awt.Dimension(14, 25));
        txtProdutoValorTotal.setPreferredSize(new java.awt.Dimension(14, 25));

        lbVendaClienteCpf.setText("CPF Cliente");

        btAdicionarItem.setBackground(new java.awt.Color(17, 128, 216));
        btAdicionarItem.setForeground(new java.awt.Color(255, 255, 255));
        btAdicionarItem.setText("Adicionar Item");
        btAdicionarItem.addActionListener(this::btAdicionarItemActionPerformed);

        tabelaVenda.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Id do Item", "id do Produto", "Nome", "Quantidade", "Valor unitário", "Valor total"
                }
        ) {
            final Class[] types = new Class[]{
                    java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Float.class, java.lang.Float.class
            };
            final boolean[] canEdit = new boolean[]{
                    false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        tabelaVenda.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabelaVenda);
        if (tabelaVenda.getColumnModel().getColumnCount() > 0) {
            tabelaVenda.getColumnModel().getColumn(0).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(0).setPreferredWidth(3);
            tabelaVenda.getColumnModel().getColumn(1).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(1).setPreferredWidth(3);
            tabelaVenda.getColumnModel().getColumn(2).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(3).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(3).setPreferredWidth(3);
            tabelaVenda.getColumnModel().getColumn(4).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(4).setPreferredWidth(6);
            tabelaVenda.getColumnModel().getColumn(5).setResizable(false);
            tabelaVenda.getColumnModel().getColumn(5).setPreferredWidth(6);
        }

        jpDadosCliente.setBackground(new java.awt.Color(204, 204, 204));
        jpDadosCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 51, 51))); // NOI18N
        jpDadosCliente.setMaximumSize(new java.awt.Dimension(182, 134));
        jpDadosCliente.setMinimumSize(new java.awt.Dimension(182, 134));

        txtClienteNomeInfo.setEditable(false);
        txtClienteNomeInfo.setMaximumSize(new java.awt.Dimension(172, 15));
        txtClienteNomeInfo.setMinimumSize(new java.awt.Dimension(172, 15));
        txtClienteNomeInfo.setPreferredSize(new java.awt.Dimension(172, 15));

        txtClienteCpfInfo.setEditable(false);
        txtClienteCpfInfo.setMaximumSize(new java.awt.Dimension(172, 15));
        txtClienteCpfInfo.setMinimumSize(new java.awt.Dimension(172, 15));
        txtClienteCpfInfo.setPreferredSize(new java.awt.Dimension(172, 15));

        javax.swing.GroupLayout jpDadosClienteLayout = new javax.swing.GroupLayout(jpDadosCliente);
        jpDadosCliente.setLayout(jpDadosClienteLayout);
        jpDadosClienteLayout.setHorizontalGroup(
                jpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtClienteNomeInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jpDadosClienteLayout.createSequentialGroup()
                                .addComponent(txtClienteCpfInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        jpDadosClienteLayout.setVerticalGroup(
                jpDadosClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpDadosClienteLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtClienteNomeInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtClienteCpfInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(74, 74, 74))
        );

        jLabel2.setText("Pagamento em:");

        cbDinheiro.setBackground(new java.awt.Color(255, 255, 255));
        cbDinheiro.setForeground(new java.awt.Color(51, 51, 51));
        cbDinheiro.setText("Dinheiro");
        cbDinheiro.addActionListener(this::cbDinheiroActionPerformed);

        txtPagamentoDinheiro.setEditable(false);
        txtPagamentoDinheiro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPagamentoDinheiro.setText("0");
        txtPagamentoDinheiro.setMaximumSize(new java.awt.Dimension(101, 24));
        txtPagamentoDinheiro.setMinimumSize(new java.awt.Dimension(101, 24));
        txtPagamentoDinheiro.setPreferredSize(new java.awt.Dimension(101, 24));
        txtPagamentoDinheiro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPagamentoDinheiroFocusLost();
            }
        });

        cbCartao.setBackground(new java.awt.Color(255, 255, 255));
        cbCartao.setForeground(new java.awt.Color(51, 51, 51));
        cbCartao.setText("Cartão");
        cbCartao.addActionListener(this::cbCartaoActionPerformed);

        txtPagamentoCartao.setEditable(false);
        txtPagamentoCartao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtPagamentoCartao.setText("0");
        txtPagamentoCartao.setMaximumSize(new java.awt.Dimension(101, 24));
        txtPagamentoCartao.setMinimumSize(new java.awt.Dimension(101, 24));
        txtPagamentoCartao.setPreferredSize(new java.awt.Dimension(101, 24));
        txtPagamentoCartao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPagamentoCartaoFocusLost();
            }
        });

        jpSubtotal.setBackground(new java.awt.Color(153, 153, 153));

        lbSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSubtotal.setText("SUBTOTAL DA COMPRA");

        txtSubtotal.setEditable(false);
        txtSubtotal.setBackground(new java.awt.Color(153, 153, 153));
        txtSubtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSubtotal.setText("0");
        txtSubtotal.setBorder(null);

        javax.swing.GroupLayout jpSubtotalLayout = new javax.swing.GroupLayout(jpSubtotal);
        jpSubtotal.setLayout(jpSubtotalLayout);
        jpSubtotalLayout.setHorizontalGroup(
                jpSubtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpSubtotalLayout.createSequentialGroup()
                                .addComponent(lbSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
        );
        jpSubtotalLayout.setVerticalGroup(
                jpSubtotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbSubtotal, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                        .addComponent(txtSubtotal)
        );

        btRegistrarVenda.setBackground(new java.awt.Color(0, 102, 51));
        btRegistrarVenda.setForeground(new java.awt.Color(255, 255, 255));
        btRegistrarVenda.setText("Registrar Venda");
        btRegistrarVenda.addActionListener(this::btRegistrarVendaActionPerformed);

        btRemoverItem.setBackground(new java.awt.Color(153, 0, 0));
        btRemoverItem.setForeground(new java.awt.Color(255, 255, 255));
        btRemoverItem.setText("Remover Item");
        btRemoverItem.addActionListener(this::btRemoverItemActionPerformed);

        jLabel1.setText("Nome Cliente");

        try {
            txtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtCpf.setMaximumSize(new java.awt.Dimension(2147483647, 26));
        txtCpf.setMinimumSize(new java.awt.Dimension(4, 26));
        txtCpf.setPreferredSize(new java.awt.Dimension(47, 26));
        txtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCpfFocusLost();
            }
        });

        txtNomeCliente.setMinimumSize(new java.awt.Dimension(14, 25));
        txtNomeCliente.setPreferredSize(new java.awt.Dimension(14, 25));
        txtNomeCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNomeClienteFocusLost();
            }
        });

        jLabel3.setText("Taxa mão de obra:");

        cbMaoObra.setBackground(new java.awt.Color(255, 255, 255));
        cbMaoObra.setText("Cobrar");
        cbMaoObra.addActionListener(this::cbMaoObraActionPerformed);

        txtMaoObra.setEditable(false);
        txtMaoObra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtMaoObra.setText("0");
        txtMaoObra.setPreferredSize(new java.awt.Dimension(101, 24));
        txtMaoObra.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaoObraFocusLost();
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jpCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jpSubtotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txtProdutoNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lbProdutoNome)
                                                                        .addComponent(jLabel1))
                                                                .addGap(0, 0, Short.MAX_VALUE))
                                                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(lbVendaClienteCpf)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jsProdutoQuantidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbProdutoQuantidade, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(txtProdutoValorUnitario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(lbProdutoValorUnitario, javax.swing.GroupLayout.Alignment.TRAILING))
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(lbProdutoValorTotal)
                                                                        .addComponent(txtProdutoValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(123, 123, 123)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btAdicionarItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btRegistrarVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jpDadosCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btRemoverItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel2)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(cbDinheiro)
                                                                        .addComponent(cbCartao))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(txtPagamentoDinheiro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(txtPagamentoCartao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addComponent(jLabel3)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(cbMaoObra)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(txtMaoObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jpCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(lbProdutoValorUnitario)
                                                .addComponent(lbProdutoQuantidade)
                                                .addComponent(lbProdutoValorTotal))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addComponent(lbProdutoNome)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtProdutoValorUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jsProdutoQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtProdutoValorTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtProdutoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(btAdicionarItem, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(btRemoverItem, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(lbVendaClienteCpf)
                                                        .addComponent(jLabel1))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(txtNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jpDadosCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cbMaoObra)
                                                        .addComponent(txtMaoObra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(13, 13, 13)
                                                .addComponent(jLabel2)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cbDinheiro)
                                                        .addComponent(txtPagamentoDinheiro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(cbCartao)
                                                        .addComponent(txtPagamentoCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 22, Short.MAX_VALUE)
                                                .addComponent(jpSubtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(btRegistrarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }

    private VendaConsultaProdutoView consultaProduto;
    public MenuView menuView;
    private DefaultTableModel tableModel;
    private Produto produto;

    public void alteraQuantidade() {
        Produto produtoTela = new Produto();
        produtoTela.setNome(txtProdutoNome.getText());
        produtoTela.setQuantidade((Integer) jsProdutoQuantidade.getValue());
        produtoTela.setValor(Float.parseFloat(txtProdutoValorUnitario.getText()));
        float valorTotal = 0f;

        if (produtoTela.getQuantidade() < 1 || produtoTela.getQuantidade() > 999) {
            jsProdutoQuantidade.setValue(1);
            produtoTela.setQuantidade(1);
        }

        valorTotal = produtoTela.getQuantidade() * produtoTela.getValor();
        txtProdutoValorTotal.setText("" + valorTotal);
    }

    public boolean verificaEstoque() {
        Produto produtoTela = new Produto();
        produtoTela.setNome(txtProdutoNome.getText());
        produtoTela.setQuantidade((Integer) jsProdutoQuantidade.getValue());
        produtoTela.setValor(Float.parseFloat(txtProdutoValorUnitario.getText()));

        Integer quantidadeNaLista = 0;

        for (int i = 0; i + 1 <= tabelaVenda.getModel().getRowCount(); i++) {
            if (produto != null) {
                if (produto.getId().equals(tabelaVenda.getValueAt(i, 1))) {
                    quantidadeNaLista += (Integer) tabelaVenda.getValueAt(i, 3);
                }
            }
        }
        if (produto != null && produto.getId() != null) {
            return produto.getQuantidade() >= (produtoTela.getQuantidade() + quantidadeNaLista);
        }
        return true;
    }

    public void atualizaSubtotal() {
        Float subtotal = 0f;
        for (int i = 1; i <= tableModel.getRowCount(); i++) {
            subtotal += (Float) tabelaVenda.getValueAt(i - 1, 5);
        }
        txtSubtotal.setText(subtotal.toString());
    }

    public void atualizaSubtotal(float soma) {
        Float subtotal = 0f;
        if (tableModel != null) {
            for (int i = 1; i <= tableModel.getRowCount(); i++) {
                subtotal += (Float) tabelaVenda.getValueAt(i - 1, 5);
            }
        }
        subtotal += soma;
        txtSubtotal.setText(subtotal.toString());
    }

    public void atualizaIndiceVenda() {
        Venda venda = VendaController.obterUltima();
        Integer ultimaVenda = venda.getId();

        if (ultimaVenda == null) {
            lbCabecalho.setText("Venda nº 1");
        } else {
            ultimaVenda += 1;
            lbCabecalho.setText("Venda nº " + ultimaVenda);
        }
    }

    public void limpaTelaVenda() {
        txtProdutoNome.setText("Clique aqui para pesquisar o produto...");
        jsProdutoQuantidade.setValue(0);
        txtProdutoValorUnitario.setText("0");
        txtProdutoValorTotal.setText("0");

        txtCpf.setText("");
        txtNomeCliente.setText("");
        txtClienteNomeInfo.setText("");
        txtClienteCpfInfo.setText("");

        cbDinheiro.setSelected(false);
        cbCartao.setSelected(false);
        cbMaoObra.setSelected(false);
        txtPagamentoDinheiro.setValue(0);
        txtPagamentoCartao.setValue(0);
        txtPagamentoDinheiro.setEditable(false);
        txtPagamentoCartao.setEditable(false);
        txtMaoObra.setValue(0);
        txtMaoObra.setEditable(false);
        txtSubtotal.setText("0");

        tableModel = (DefaultTableModel) tabelaVenda.getModel();

        tableModel.setRowCount(0);

        if (consultaProduto != null)
            consultaProduto.setProduto(null);
    }

    public boolean verificaValorCartao() {
        float subtotal = Float.parseFloat(txtSubtotal.getText().replaceAll(",", "."));
        float valorCartao = Float.parseFloat(txtPagamentoCartao.getText().replaceAll(",", "."));
        return !(valorCartao <= subtotal);
    }

    public boolean verificaValorDinheiro() {
        float subtotal = Float.parseFloat(txtSubtotal.getText().replaceAll(",", "."));
        float valorDinheiro = Float.parseFloat(txtPagamentoDinheiro.getText().replaceAll(",", "."));
        return valorDinheiro >= subtotal;
    }

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
        tabelaVenda.getTableHeader().setBackground(new Color(15, 128, 216));
        tabelaVenda.getTableHeader().setForeground(Color.white);

        tabelaVenda.setForeground(Color.black);

        FontManager fontManager = new FontManager();
        Font futuraPT20Bold = fontManager.carregarFont("/fontes/FuturaPT.otf", Font.BOLD, 20);
        lbCabecalho.setFont(futuraPT20Bold);
        lbSubtotal.setFont(futuraPT20Bold);
        txtSubtotal.setFont(futuraPT20Bold);
        jsProdutoQuantidade.setValue(1);

        atualizaIndiceVenda();
    }

    private void txtProdutoNomeMouseClicked(java.awt.event.MouseEvent evt) {
        if (consultaProduto == null) {
            consultaProduto = new VendaConsultaProdutoView();

            consultaProduto.setLocation(170, 100);
        }
        if (!consultaProduto.isVisible()) {
            menuView.getDskPainelPrincipal().add(consultaProduto);
            consultaProduto.setVisible(true);
        }

        consultaProduto.toFront();
        ((BasicInternalFrameUI) consultaProduto.getUI()).setNorthPane(null);
    }

    private void lbSairVendaMouseClicked(java.awt.event.MouseEvent evt) {
        this.dispose();
        //this.doDefaultCloseAction();
        limpaTelaVenda();
    }

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
        produto = new Produto();

        try {
            produto.setId(consultaProduto.getProduto().getId());
            produto.setNome(consultaProduto.getProduto().getNome());
            produto.setQuantidade(consultaProduto.getProduto().getQuantidade());
            produto.setValor(consultaProduto.getProduto().getValor());

            txtProdutoNome.setText(produto.getNome());
            txtProdutoValorUnitario.setText(produto.getValor().toString());
            jsProdutoQuantidade.setValue(1);
            alteraQuantidade();

        } catch (Exception ignored) {
        }
    }

    private void jsProdutoQuantidadeStateChanged(javax.swing.event.ChangeEvent evt) {
        alteraQuantidade();
    }

    private void jsProdutoQuantidadeFocusLost(java.awt.event.FocusEvent evt) {
        alteraQuantidade();
    }

    private void btAdicionarItemActionPerformed(java.awt.event.ActionEvent evt) {
        tableModel = (DefaultTableModel) tabelaVenda.getModel();
        if (verificaEstoque()) {
            if (!txtProdutoNome.getText().equalsIgnoreCase("Clique aqui para pesquisar o produto...")) {
                Integer idItem;
                int ultimaLinha = tabelaVenda.getModel().getRowCount();
                if (ultimaLinha < 1) {
                    idItem = 1;
                } else {
                    idItem = (Integer) tabelaVenda.getValueAt(ultimaLinha - 1, 0);
                    idItem += 1;
                }
                Object[] dadosTabela = new Object[6];
                dadosTabela[0] = idItem;
                dadosTabela[1] = produto.getId();
                dadosTabela[2] = produto.getNome();
                dadosTabela[3] = (Integer) jsProdutoQuantidade.getValue();
                dadosTabela[4] = produto.getValor();
                dadosTabela[5] = Float.parseFloat(txtProdutoValorTotal.getText());
                tableModel.addRow(dadosTabela);

                atualizaSubtotal();
            }
        } else {
            JOptionPane.showMessageDialog(rootPane,
                    "Usuário, a quantidade de produtos solicitadas não existem em estoque! \n"
                            + "A quantidade deste produto em estoque é " + produto.getQuantidade() + ".",
                    "Atenção",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private void btRemoverItemActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            int row = tabelaVenda.getSelectedRow();
            tableModel.removeRow(row);
            atualizaSubtotal();
        } catch (Exception ignored) {
        }
    }

    private void btRegistrarVendaActionPerformed(java.awt.event.ActionEvent evt) {
        Venda venda = new Venda();
        float valorFaltante;
        float troco;
        int vendaIndex = Integer.parseInt(lbCabecalho.getText().replaceAll("Venda nº ", ""));
        String respostaController, respostaController2, respostaController3, respostaController4;

        if (tabelaVenda.getModel().getRowCount() < 1) {
            JOptionPane.showMessageDialog(rootPane,
                    "Você precisa adicionar itens no carrinho!",
                    "Atencão",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!cbCartao.isSelected() && !cbDinheiro.isSelected()) {
            JOptionPane.showMessageDialog(rootPane,
                    "Você deve selecionar uma forma de pagamento!",
                    "Atenção",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        //se não houver cliente na venda
        if (txtNomeCliente.getText().equals("")) {
            int respostaConfirmacao = JOptionPane.showConfirmDialog(
                    rootPane,
                    "Cliente não informado.\n\n"
                            + "Deseja continuar?",
                    "Confirmação",
                    JOptionPane.YES_NO_OPTION);
            if (respostaConfirmacao == JOptionPane.NO_OPTION) {
                return;
            }
            venda.setNomeCliente("Não informado");
        } else {
            venda.setNomeCliente(txtNomeCliente.getText());
        }
        //CPF
        if (txtCpf.getText().equals("")) {
            venda.setCPFCliente("Não informado");
        } else {
            venda.setCPFCliente(txtCpf.getText());
        }

        if (cbMaoObra.isSelected()) {
            //CHECK
        }

        if (cbCartao.isSelected() && verificaValorCartao()) {
            JOptionPane.showMessageDialog(rootPane,
                    "O Valor de pagamento em cartão não pode ser maior que o subtotal da venda!",
                    "Atencão",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (!cbCartao.isSelected() && !verificaValorDinheiro()) {
            JOptionPane.showMessageDialog(rootPane,
                    "O Valor de pagamento em dinheiro não pode ser menor que o subtotal da venda!",
                    "Atencão",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }

        txtClienteNomeInfo.setText(txtNomeCliente.getText());
        txtClienteCpfInfo.setText(txtCpf.getText());

        venda.setId(Integer.parseInt(lbCabecalho.getText().replaceAll("Venda nº ", "")));
        java.util.Date data = new Date();
        venda.setData(data);
        venda.setSubtotal(Float.parseFloat(txtSubtotal.getText()));
        venda.setPagamentoDinheiro(Float.parseFloat(txtPagamentoDinheiro.getText().replaceAll(",", ".")));
        venda.setPagamentoCartao(Float.parseFloat(txtPagamentoCartao.getText().replaceAll(",", ".")));

        for (int i = 0; i + 1 <= tabelaVenda.getModel().getRowCount(); i++) {
            ItemVenda itemVenda = new ItemVenda();
            itemVenda.setIdVenda(venda.getId());
            itemVenda.setIdItem((Integer) tabelaVenda.getValueAt(i, 0));
            itemVenda.setId((Integer) tabelaVenda.getValueAt(i, 1));
            itemVenda.setNome((String) tabelaVenda.getValueAt(i, 2));
            itemVenda.setQuantidade((Integer) tabelaVenda.getValueAt(i, 3));
            itemVenda.setValor((Float) tabelaVenda.getValueAt(i, 4));
            itemVenda.setValorTotal(itemVenda.getQuantidade() * itemVenda.getValor());

            venda.adicionarItem(itemVenda);
        }

        if (venda.getPagamentoCartao() + venda.getPagamentoDinheiro() >= venda.getSubtotal()) {
            respostaController = VendaController.salvar(venda);
            if (respostaController == null) {
                for (int i = 0; i < venda.getItensVenda().size(); i++) {
                    respostaController2 = ItensVendaController.salvar(venda.getItensVenda().get(i));
                    Produto produtoAtualizado = ProdutoController.obter(venda.getItensVenda().get(i).getId());
                    produtoAtualizado.setQuantidade(produtoAtualizado.getQuantidade() - venda.getItensVenda().get(i).getQuantidade());
                    respostaController3 = ProdutoController.atualizar(produtoAtualizado);
                    if (produtoAtualizado.getQuantidade() <= 3) {
                        if (AlertaController.obter(produtoAtualizado.getId()) == null) {
                            Alerta alerta = new Alerta();
                            alerta.setData(data);
                            alerta.setIdItem(produtoAtualizado.getId());
                            alerta.setDescAlerta("Estoque baixo.");
                            AlertaController.salvar(alerta);
                            MenuView.TelaAlerta.atualizar();
                            MenuView.atualizaImagem();
                        }
                    }
                }
                troco = (venda.getPagamentoCartao() + venda.getPagamentoDinheiro()) - venda.getSubtotal();
                JOptionPane.showMessageDialog(rootPane,
                        "Venda número " + vendaIndex + " registrada!\n\n"
                                + "Subtotal da compra: R$" + venda.getSubtotal() + "\n"
                                + "Total pago em Dinheiro: R$" + venda.getPagamentoDinheiro() + "\n"
                                + "Total pago no Cartão: R$" + venda.getPagamentoCartao() + "\n"
                                + "Troco: R$" + troco + "\n\n"
                                + "Agora você pode consultar sua venda em:\n"
                                + "Menu > Relatório",
                        "Informe de registro",
                        JOptionPane.INFORMATION_MESSAGE);
                limpaTelaVenda();

                atualizaIndiceVenda();
            } else {
                JOptionPane.showMessageDialog(rootPane,
                        respostaController
                                + "\n Procure o administrador do sistema!",
                        "Erro",
                        JOptionPane.ERROR_MESSAGE);
            }
        } else {
            valorFaltante = venda.getSubtotal() - (venda.getPagamentoCartao() + venda.getPagamentoDinheiro());
            JOptionPane.showMessageDialog(rootPane,
                    "Subtotal da compra: R$" + venda.getSubtotal() + "\n"
                            + "Total em Dinheiro: R$" + venda.getPagamentoDinheiro() + "\n"
                            + "Total no Cartão: R$" + venda.getPagamentoCartao() + "\n\n"
                            + "Faltam: R$" + valorFaltante + "\n\n"
                            + "Corrija e tente novamente.",
                    "Venda não registrada",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void cbDinheiroActionPerformed(java.awt.event.ActionEvent evt) {
        txtPagamentoDinheiro.setEditable(cbDinheiro.isSelected());
        txtPagamentoDinheiro.setValue(0);
    }

    private void cbCartaoActionPerformed(java.awt.event.ActionEvent evt) {
        txtPagamentoCartao.setEditable(cbCartao.isSelected());
        txtPagamentoCartao.setValue(0);
    }

    private void txtPagamentoDinheiroFocusLost() {
        if (txtPagamentoDinheiro.getText().length() > 10) {
            txtPagamentoDinheiro.setValue(0);
        }
    }

    private void txtPagamentoCartaoFocusLost() {
        if (txtPagamentoCartao.getText().length() > 10) {
            txtPagamentoCartao.setValue(0);
        }
        if (verificaValorCartao()) {
            JOptionPane.showMessageDialog(rootPane,
                    "O Valor de pagamento em cartão não pode ser maior que o subtotal da venda!",
                    "Atencão",
                    JOptionPane.ERROR_MESSAGE);
            txtPagamentoCartao.setValue(0);
        }
    }

    private void formComponentShown() {
        atualizaIndiceVenda();
    }

    private void txtCpfFocusLost() {
        txtClienteCpfInfo.setText(txtCpf.getText());
    }

    private void cbMaoObraActionPerformed(java.awt.event.ActionEvent evt) {
        if (cbMaoObra.isSelected()) {
            txtMaoObra.setEditable(true);
        } else {
            txtMaoObra.setEditable(false);
            atualizaSubtotal();
        }
        txtMaoObra.setValue(0);
    }

    private void txtMaoObraFocusLost() {
        if (txtMaoObra.getText().length() > 10) {
            txtMaoObra.setValue(0);
        }
        if (cbMaoObra.isSelected())
            atualizaSubtotal(Float.parseFloat(txtMaoObra.getText()));
    }

    private void txtNomeClienteFocusLost() {
        txtClienteNomeInfo.setText(txtNomeCliente.getText());
    }

    private javax.swing.JCheckBox cbCartao;
    private javax.swing.JCheckBox cbDinheiro;
    private javax.swing.JCheckBox cbMaoObra;
    private javax.swing.JSpinner jsProdutoQuantidade;
    private javax.swing.JLabel lbCabecalho;
    private javax.swing.JLabel lbSubtotal;
    private javax.swing.JTable tabelaVenda;
    private javax.swing.JTextField txtClienteCpfInfo;
    private javax.swing.JTextField txtClienteNomeInfo;
    private javax.swing.JFormattedTextField txtCpf;
    private javax.swing.JFormattedTextField txtMaoObra;
    private javax.swing.JTextField txtNomeCliente;
    private javax.swing.JFormattedTextField txtPagamentoCartao;
    private javax.swing.JFormattedTextField txtPagamentoDinheiro;
    private javax.swing.JTextField txtProdutoNome;
    private javax.swing.JTextField txtProdutoValorTotal;
    private javax.swing.JTextField txtProdutoValorUnitario;
    private javax.swing.JTextField txtSubtotal;
}
