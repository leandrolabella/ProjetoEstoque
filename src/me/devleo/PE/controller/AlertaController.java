package me.devleo.PE.controller;

import me.devleo.PE.model.Alerta;
import me.devleo.PE.sql.AlertaDao;

import java.util.List;

public class AlertaController {

    public static String salvar(Alerta alerta) {
        String resposta = null;

        try {
            AlertaDao.salvar(alerta);
        } catch (Exception e) {
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }

    public static String excluir(Integer id) {
        String resposta = null;
        try {
            AlertaDao.excluir(id);
        } catch (Exception e) {
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }

    public static Alerta obter(Integer id) {
        try {
            return AlertaDao.obter(id);
        } catch (Exception ignored) {
        }
        return null;
    }

    public static List<Alerta> obter() {
        List<Alerta> listaResposta = null;
        try {
            listaResposta = AlertaDao.listar();
        } catch (Exception ignored) {
        }
        return listaResposta;
    }
}