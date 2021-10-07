package me.devleo.PE.sql;

import me.devleo.PE.model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDao {

    public static void salvar(Produto produto)
            throws Exception {
        String sql = "INSERT INTO TBPRODUTOS(nome, quantidade, custo, valor, descricao) VALUES(?, ?, ?, ?, ?);";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionUtils.obterConexao();

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, produto.getNome());
            preparedStatement.setInt(2, produto.getQuantidade());
            preparedStatement.setFloat(3, produto.getCusto());
            preparedStatement.setFloat(4, produto.getValor());
            preparedStatement.setString(5, produto.getDescricao());

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

    public static List<Produto> listar()
            throws Exception {
        String sql = "SELECT id, nome, quantidade, custo, valor, descricao FROM TBPRODUTOS";
        List<Produto> listaProdutos = null;

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;

        try {
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            result = preparedStatement.executeQuery();

            while (result.next()) {
                if (listaProdutos == null) {
                    listaProdutos = new ArrayList<>();
                }
                Produto produto = new Produto();
                produto.setId(result.getInt("id"));
                produto.setNome(result.getString("nome"));
                produto.setQuantidade(result.getInt("quantidade"));
                produto.setCusto(result.getFloat("custo"));
                produto.setValor(result.getFloat("valor"));
                produto.setDescricao(result.getString("descricao"));
                listaProdutos.add(produto);
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
        return listaProdutos;
    }

    public static ResultSet listarResult() {
        String sql = "SELECT nome, quantidade, custo, valor, descricao FROM TBPRODUTOS";
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;

        try {
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            result = preparedStatement.executeQuery();

            return result;
        } catch (Exception ignored) {
        }
        return null;
    }

    public static List<Produto> procurar(String nome)
            throws Exception {
        String sql = "SELECT id, nome, quantidade, custo, valor, descricao FROM TBPRODUTOS WHERE nome LIKE (?)";
        List<Produto> listaProdutos = null;

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;

        try {
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, "%" + nome + "%");

            result = preparedStatement.executeQuery();

            while (result.next()) {
                if (listaProdutos == null) {
                    listaProdutos = new ArrayList<>();
                }
                Produto produto = new Produto();
                produto.setId(result.getInt("id"));
                produto.setNome(result.getString("nome"));
                produto.setQuantidade(result.getInt("quantidade"));
                produto.setCusto(result.getFloat("custo"));
                produto.setValor(result.getFloat("valor"));
                produto.setDescricao(result.getString("descricao"));
                listaProdutos.add(produto);
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
        return listaProdutos;
    }

    public static Produto obter(Integer id)
            throws Exception {
        String sql = "SELECT * FROM TBPRODUTOS WHERE id =?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;

        try {
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);
            result = preparedStatement.executeQuery();

            if (result.next()) {
                Produto produto = new Produto();
                produto.setId(result.getInt("id"));
                produto.setNome(result.getString("nome"));
                produto.setQuantidade(result.getInt("quantidade"));
                produto.setCusto(result.getFloat("custo"));
                produto.setValor(result.getFloat("valor"));
                produto.setDescricao(result.getString("descricao"));

                return produto;
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

    public static void atualizar(Produto produtoAtualizado)
            throws Exception {
        String sql = "UPDATE TBPRODUTOS SET nome = ?, quantidade = ?, custo = ?, valor = ?, descricao = ? WHERE id = ?;";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {

            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, produtoAtualizado.getNome());
            preparedStatement.setInt(2, produtoAtualizado.getQuantidade());
            preparedStatement.setFloat(3, produtoAtualizado.getCusto());
            preparedStatement.setFloat(4, produtoAtualizado.getValor());
            preparedStatement.setString(5, produtoAtualizado.getDescricao());
            preparedStatement.setInt(6, produtoAtualizado.getId());

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

    public static void excluir(Integer id)
            throws Exception {
        String sql = "DELETE FROM TBPRODUTOS WHERE id = ?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);

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
