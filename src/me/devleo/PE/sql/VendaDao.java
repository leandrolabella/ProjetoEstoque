package me.devleo.PE.sql;

import me.devleo.PE.model.Venda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VendaDao {

    public static void salvar(Venda venda)
            throws Exception {
        String sql = "INSERT INTO TBVENDAS(id, data, qtdItens, subtotal, pagamentoDinheiro, pagamentoCartao, nomeCliente, cpfCliente) VALUES(?, ?, ?, ?, ?, ?, ?, ?);";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtils.obterConexao();

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, venda.getId());
            java.sql.Timestamp data = new java.sql.Timestamp(venda.getData().getTime());
            preparedStatement.setTimestamp(2, data);
            preparedStatement.setInt(3, venda.getItensVenda().size());
            preparedStatement.setFloat(4, venda.getSubtotal());
            preparedStatement.setFloat(5, venda.getPagamentoDinheiro());
            preparedStatement.setFloat(6, venda.getPagamentoCartao());
            preparedStatement.setString(7, venda.getNomeCliente());
            preparedStatement.setString(8, venda.getCPFCliente());

            preparedStatement.execute();
        } finally {
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
    }

    public static Venda obterUltima()
            throws Exception {
        String sql = "SELECT MAX(id) qtdVendas FROM TBVENDAS";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;
        try {
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);

            result = preparedStatement.executeQuery();
            if (result.next()) {
                Venda venda = new Venda();
                venda.setId(result.getInt("qtdVendas"));
                return venda;
            }
        } finally {
            if (result != null && !result.isClosed()) {
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return null;
    }

    public static List<Venda> listar()
            throws Exception {
        String sql = "SELECT id, data, qtdItens, subtotal, pagamentoDinheiro, pagamentoCartao, nomeCliente, cpfCliente FROM TBVENDAS";
        List<Venda> listaVendas = null;

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;

        try {
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            result = preparedStatement.executeQuery();

            while (result.next()) {
                if (listaVendas == null) {
                    listaVendas = new ArrayList<>();
                }
                Venda venda = new Venda();
                venda.setId(result.getInt("id"));
                Date data = new Date(result.getTimestamp("data").getTime());
                venda.setData(data);
                venda.setQtdItens(result.getInt("qtdItens"));
                venda.setSubtotal(result.getFloat("subtotal"));
                venda.setPagamentoDinheiro(result.getFloat("pagamentoDinheiro"));
                venda.setPagamentoCartao(result.getFloat("pagamentoCartao"));
                venda.setNomeCliente(result.getString("nomeCliente"));
                venda.setCPFCliente(result.getString("cpfCliente"));
                listaVendas.add(venda);
            }
        } finally {
            if (result != null && !result.isClosed()) {
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return listaVendas;
    }

    public static List<Venda> procurar(String dataInicio, String dataFim)
            throws Exception {
        String sql = "SELECT id, data, qtdItens, subtotal, pagamentoDinheiro, pagamentoCartao, nomeCliente, cpfCliente FROM TBVENDAS WHERE data BETWEEN ? AND ?";
        List<Venda> listaVendas = null;
        Connection connection = null;
        ResultSet result = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, dataInicio + " 00:00:00");
            preparedStatement.setString(2, dataFim + " 23:59:59");

            result = preparedStatement.executeQuery();

            while (result.next()) {
                if (listaVendas == null) {
                    listaVendas = new ArrayList<>();
                }
                Venda venda = new Venda();
                venda.setId(result.getInt("id"));
                Date data = new Date(result.getTimestamp("data").getTime());
                venda.setData(data);
                venda.setQtdItens(result.getInt("qtdItens"));
                venda.setSubtotal(result.getFloat("subtotal"));
                venda.setPagamentoDinheiro(result.getFloat("pagamentoDinheiro"));
                venda.setPagamentoCartao(result.getFloat("pagamentoCartao"));
                venda.setNomeCliente(result.getString("nomeCliente"));
                venda.setCPFCliente(result.getString("cpfCliente"));
                listaVendas.add(venda);
            }
        } finally {
            if (result != null && !result.isClosed()) {
                result.close();
            }
            if (preparedStatement != null && !preparedStatement.isClosed()) {
                preparedStatement.close();
            }
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        }
        return listaVendas;
    }

    public static ResultSet extractRelatorio(int id) {
        String sql = /*"SELECT vendas.ID, vendas.data, vendas.nomeCliente, vendas.pagamentoCartao, " +
                "vendas.pagamentoDinheiro, vendas.subtotal, vendas.qtdItens, item.idItem, item.nomeProduto, " +
                "item.idProduto, item.qtdItens AS qtd2, item.valor, item.valorTotal SUM(pagamentoDinheiro + pagamentoCartao) " +
                "FROM tbvendas AS vendas INNER JOIN tbitemvenda AS item WHERE vendas.ID = " + id + " AND item.idVenda = vendas.ID";*/
                "SELECT vendas.ID, vendas.data, vendas.nomeCliente, vendas.pagamentoCartao, vendas.pagamentoDinheiro, vendas.subtotal, vendas.qtdItens AS qtdVenda, item.* FROM tbvendas AS vendas INNER JOIN tbitemvenda AS item WHERE vendas.ID =" + id + " AND item.idVenda =" + id;
        Connection connection;
        PreparedStatement preparedStatement;
        ResultSet result;

        try {
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            result = preparedStatement.executeQuery();

            return result;
        } catch (Exception ignored) {
        }
        return null;
    }
}
