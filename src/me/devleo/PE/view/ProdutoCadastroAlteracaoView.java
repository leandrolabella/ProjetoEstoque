package me.devleo.PE.view;

import me.devleo.PE.controller.ProdutoController;
import me.devleo.PE.fonts.FontManager;
import me.devleo.PE.model.Produto;
import me.devleo.PE.model.Validacao;
import me.devleo.PE.sql.ProdutoDao;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.InputStream;

public class ProdutoCadastroAlteracaoView extends javax.swing.JInternalFrame {

    public ProdutoCadastroAlteracaoView() {
        initComponents();
    }

    private void initComponents() {
        JPanel jpCabecalho = new JPanel();
        lbCabecalho = new javax.swing.JLabel();
        JLabel jLabel2 = new JLabel();
        txtNome = new javax.swing.JTextField();
        JLabel jLabel4 = new JLabel();
        txtQuantidade = new javax.swing.JFormattedTextField();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel8 = new JLabel();
        txtCusto = new javax.swing.JFormattedTextField();
        JLabel jLabel6 = new JLabel();
        JLabel jLabel7 = new JLabel();
        txtValor = new javax.swing.JFormattedTextField();
        JLabel jLabel1 = new JLabel();
        JScrollPane jScrollPane1 = new JScrollPane();
        txtDescricao = new javax.swing.JTextArea();
        JButton btnSair = new JButton();
        JButton btnSalvar = new JButton();
        JButton btnGerarPDF = new javax.swing.JButton();

        setBackground(null);
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
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown();
            }
        });

        jpCabecalho.setBackground(new java.awt.Color(17, 128, 216));
        jpCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        jpCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        jpCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));
        jpCabecalho.setPreferredSize(new java.awt.Dimension(853, 29));

        lbCabecalho.setForeground(new java.awt.Color(255, 255, 255));
        lbCabecalho.setText("Cadastro de Produto");
        lbCabecalho.setMaximumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setMinimumSize(new java.awt.Dimension(853, 29));
        lbCabecalho.setPreferredSize(new java.awt.Dimension(853, 29));

        javax.swing.GroupLayout jpCabecalhoLayout = new javax.swing.GroupLayout(jpCabecalho);
        jpCabecalho.setLayout(jpCabecalhoLayout);
        jpCabecalhoLayout.setHorizontalGroup(
                jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpCabecalhoLayout.createSequentialGroup()
                                .addComponent(lbCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jpCabecalhoLayout.setVerticalGroup(
                jpCabecalhoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lbCabecalho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel2.setText("Nome");

        txtNome.setBackground(null);
        txtNome.setPreferredSize(new java.awt.Dimension(14, 22));

        jLabel4.setText("Quantidade");

        txtQuantidade.setBackground(null);
        txtQuantidade.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtQuantidade.setMaximumSize(new java.awt.Dimension(2147483647, 22));
        txtQuantidade.setMinimumSize(new java.awt.Dimension(4, 22));
        txtQuantidade.setPreferredSize(new java.awt.Dimension(4, 22));

        jLabel5.setText("Custo");

        jLabel8.setText("R$");

        txtCusto.setBackground(null);
        txtCusto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtCusto.setMaximumSize(new java.awt.Dimension(2147483647, 22));
        txtCusto.setMinimumSize(new java.awt.Dimension(4, 22));
        txtCusto.setPreferredSize(new java.awt.Dimension(4, 22));

        jLabel6.setText("Valor");

        jLabel7.setText("R$");

        txtValor.setBackground(null);
        txtValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        txtValor.setMaximumSize(new java.awt.Dimension(2147483647, 22));
        txtValor.setMinimumSize(new java.awt.Dimension(4, 22));
        txtValor.setPreferredSize(new java.awt.Dimension(4, 22));

        jLabel1.setText("Descrição");

        txtDescricao.setColumns(20);
        txtDescricao.setRows(5);
        jScrollPane1.setViewportView(txtDescricao);

        btnSair.setBackground(new java.awt.Color(102, 102, 102));
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");
        btnSair.addActionListener(this::btnSairActionPerformed);

        btnSalvar.setBackground(new java.awt.Color(0, 102, 51));
        btnSalvar.setForeground(new java.awt.Color(255, 255, 255));
        btnSalvar.setText("OK");
        btnSalvar.addActionListener(this::btnSalvarActionPerformed);

        btnGerarPDF.setBackground(new java.awt.Color(17, 128, 216));
        btnGerarPDF.setForeground(new java.awt.Color(255, 255, 255));
        btnGerarPDF.setText("Gerar PDF");
        btnGerarPDF.addActionListener(this::btnGerarPDFActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jpCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(btnGerarPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel1)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel8)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(txtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel7)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jpCabecalho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(jLabel8)
                                                                .addComponent(jLabel7)
                                                                .addComponent(txtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(txtCusto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(btnSalvar)
                                                .addComponent(btnSair)
                                                .addComponent(btnGerarPDF)))
                                .addContainerGap())
        );

        pack();
    }

    private Produto produto = null;
    private boolean modoEdicao = false;
    private String cabecario;

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setModoEdicao(boolean modoEdicao) {
        this.modoEdicao = modoEdicao;
    }

    public void setCabecario(String cabecario) {
        this.cabecario = cabecario;
    }

    public void limparFormulario() {
        txtNome.setText("");
        txtQuantidade.setText("");
        txtCusto.setText("");
        txtValor.setText("");
        txtDescricao.setText("");
    }

    public void carregarDadosTela() {
        if (modoEdicao && produto != null) {
            txtNome.setText(produto.getNome());

            txtQuantidade.setValue(produto.getQuantidade());
            txtCusto.setValue(produto.getCusto());
            txtValor.setValue(produto.getValor());

            txtDescricao.setText(produto.getDescricao());
        }
    }

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {
        String produtoPreenchido = Validacao.ProdutoCamposVazios(txtNome.getText(),
                txtQuantidade.getText(), txtCusto.getText(), txtValor.getText());
        if (produtoPreenchido.equalsIgnoreCase("")) {
            String produtoTamanhoOK = Validacao.ProdutoCamposTamanho(txtNome.getText(),
                    txtQuantidade.getText(), txtCusto.getText(), txtValor.getText());
            if (produtoTamanhoOK.equalsIgnoreCase("")) {

                String respostaController;
                if (!modoEdicao) {
                    produto = new Produto();
                }
                produto.setNome(txtNome.getText());
                produto.setQuantidade(Integer.parseInt(txtQuantidade.getText()));
                produto.setCusto(Float.parseFloat(txtCusto.getText().replaceAll(",", ".")));
                produto.setValor(Float.parseFloat(txtValor.getText().replaceAll(",", ".")));
                produto.setDescricao(txtDescricao.getText());

                if (!modoEdicao) {
                    respostaController = ProdutoController.salvar(produto);
                } else {
                    respostaController = ProdutoController.atualizar(produto);
                }
                if (respostaController == null) {
                    if (!modoEdicao) {
                        JOptionPane.showMessageDialog(rootPane,
                                "Produto cadastrado com sucesso!",
                                "Confirmação",
                                JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(rootPane,
                                "Produto atualizado com sucesso!",
                                "Confirmação",
                                JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                    }
                    limparFormulario();
                } else {
                    JOptionPane.showMessageDialog(rootPane,
                            respostaController
                                    + "\n Procure o administrador do sistema!",
                            "Erro",
                            JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane,
                        "Os campos abaixo ultrapassaram os limites de caracteres:"
                                + produtoTamanhoOK
                                + "\nPreencha os campo corretamente e tente novamente!",
                        "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "O(s) campo(s) abaixo:\n" + produtoPreenchido
                    + "Não foram preenchidos, preencha-os e tente novamente!");
        }
    }

    private void btnGerarPDFActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            String curDir = System.getProperty("user.dir");
            JRResultSetDataSource jr = new JRResultSetDataSource(ProdutoDao.listarResult());
            InputStream caminhoRel = getClass().getResourceAsStream("/me/devleo/PE/relatorio/Produtos.jasper");
            JasperPrint jp = JasperFillManager.fillReport(caminhoRel, null, jr);
            JasperExportManager.exportReportToPdfFile(jp, curDir + "/relProdutos.pdf");
            File arquivo = new File(curDir + "/relProdutos.pdf");
            Desktop.getDesktop().open(arquivo);
            arquivo.deleteOnExit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void btnSairActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }

    private void formInternalFrameOpened() {
        lbCabecalho.setText(cabecario);

        FontManager fontManager = new FontManager();
        Font futuraPT20Bold = fontManager.carregarFont("/resources/fontes/FuturaPT.otf", Font.BOLD, 20);
        lbCabecalho.setFont(futuraPT20Bold);
    }

    private void formComponentShown() {
        lbCabecalho.setText(cabecario);
    }

    private javax.swing.JLabel lbCabecalho;
    private javax.swing.JFormattedTextField txtCusto;
    private javax.swing.JTextArea txtDescricao;
    private javax.swing.JTextField txtNome;
    private javax.swing.JFormattedTextField txtQuantidade;
    private javax.swing.JFormattedTextField txtValor;
}
