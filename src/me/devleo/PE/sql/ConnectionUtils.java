package me.devleo.PE.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectionUtils {

    public static Connection obterConexao() throws ClassNotFoundException,
            SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/dbshopestoque",
                "root",
                "");
    }

    public static void criarTabelas() throws Exception {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = obterConexao();

            //TABELA PRODUTOS: ID, NOME, QUANTIDADE, CUSTO, VALOR, DESC
            preparedStatement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS TBPRODUTOS (ID INTEGER NOT NULL AUTO_INCREMENT, nome varchar(255) NOT NULL, quantidade INTEGER NOT NULL, custo FLOAT NOT NULL, valor FLOAT NOT NULL, descricao varchar(300), PRIMARY KEY(ID))");
            preparedStatement.executeUpdate();

            //TABELA VENDAS: ID, Data, qtdItens, subtotal, pagamentoDinheiro, pagamentoCartao, nomeCliente, cpfCliente
            preparedStatement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS TBVENDAS (ID INTEGER NOT NULL, data TIMESTAMP NOT NULL, qtdItens INTEGER, subtotal FLOAT, pagamentoDinheiro FLOAT, pagamentoCartao FLOAT, nomeCliente varchar(255), cpfCliente varchar(255))");
            preparedStatement.executeUpdate();

            //TABELA ItensVenda: idVenda, idItem, nomeProduto, idProduto, qtdItens, valor, valorTotal
            preparedStatement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS TBITEMVENDA (idVenda INTEGER NOT NULL, idItem INTEGER NOT NULL, nomeProduto VARCHAR(255) NOT NULL, idProduto INTEGER NOT NULL, qtdItens INTEGER NOT NULL, valor FLOAT NOT NULL, valorTotal FLOAT NOT NULL)");
            preparedStatement.executeUpdate();

            //TABELA Alertas: ID, DATA, idItem, descAlerta
            preparedStatement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS TBALERTAS (ID INTEGER NOT NULL AUTO_INCREMENT, data TIMESTAMP NOT NULL, idItem INTEGER, descAlerta varchar(255), PRIMARY KEY(ID))");
            preparedStatement.executeUpdate();
        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }
}
