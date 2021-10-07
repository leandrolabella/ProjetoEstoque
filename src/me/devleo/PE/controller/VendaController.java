package me.devleo.PE.controller;

import me.devleo.PE.model.Venda;
import me.devleo.PE.sql.VendaDao;

import java.util.List;

public class VendaController {

    public static String salvar(Venda venda) {
        String resposta = null;
        try {
            VendaDao.salvar(venda);
        } catch (Exception e) {
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }

    public static List<Venda> procurar(String dataInicio, String dataFim) {
        List<Venda> listaResposta = null;
        try {
            if (dataInicio == null || dataFim == null) {
                listaResposta = VendaDao.listar();
            } else {
                listaResposta = VendaDao.procurar(dataInicio, dataFim);
            }
        } catch (Exception ignored) {
        }
        return listaResposta;
    }

    public static Venda obterUltima() {
        Venda venda = new Venda();
        try {
            venda = VendaDao.obterUltima();
        } catch (Exception ignored) {
        }
        return venda;
    }
}