package me.devleo.PE.sql;

import me.devleo.PE.model.Alerta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AlertaDao {

    public static void salvar(Alerta alerta) throws Exception {
        String sql = "INSERT INTO TBALERTAS(data, idItem, descAlerta) VALUES(?, ?, ?);";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);

            java.sql.Timestamp data = new java.sql.Timestamp(alerta.getData().getTime());
            preparedStatement.setTimestamp(1, data);
            preparedStatement.setInt(2, alerta.getIdItem());
            preparedStatement.setString(3, alerta.getDescAlerta());

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

    public static Alerta obter(Integer id)
            throws Exception {
        String sql = "SELECT * FROM TBALERTAS WHERE id =?";

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;

        try {
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);
            result = preparedStatement.executeQuery();

            if (result.next()) {
                Alerta alerta = new Alerta();
                alerta.setId(result.getInt("id"));
                Date data = new Date(result.getTimestamp("data").getTime());
                alerta.setData(data);
                alerta.setIdItem(result.getInt("idItem"));
                alerta.setDescAlerta(result.getString("descAlerta"));
                return alerta;
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

    public static List<Alerta> listar()
            throws Exception {
        String sql = "SELECT * FROM TBALERTAS";
        List<Alerta> listaAlertas = null;

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet result = null;

        try {
            connection = ConnectionUtils.obterConexao();
            preparedStatement = connection.prepareStatement(sql);
            result = preparedStatement.executeQuery();

            while (result.next()) {
                if (listaAlertas == null) {
                    listaAlertas = new ArrayList<>();
                }
                Alerta alerta = new Alerta();
                alerta.setId(result.getInt("id"));
                Date data = new Date(result.getTimestamp("data").getTime());
                alerta.setData(data);
                alerta.setIdItem(result.getInt("idItem"));
                alerta.setDescAlerta(result.getString("descAlerta"));
                listaAlertas.add(alerta);
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
        return listaAlertas;
    }

    public static void excluir(Integer id)
            throws Exception {
        String sql = "DELETE FROM TBALERTAS WHERE id = ?";

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
