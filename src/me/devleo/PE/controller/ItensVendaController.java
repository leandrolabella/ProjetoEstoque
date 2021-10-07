package me.devleo.PE.controller;

import me.devleo.PE.model.ItemVenda;
import me.devleo.PE.sql.ItensVendaDao;

import java.util.List;

public class ItensVendaController {

    public static String salvar(ItemVenda itensVenda) {
        String resposta = null;
        try {
            ItensVendaDao.salvar(itensVenda);
        } catch (Exception e) {
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }

    public static List<ItemVenda> obterItens(int idVenda) {
        List<ItemVenda> listaResposta = null;

        try {
            listaResposta = ItensVendaDao.obterItens(idVenda);
        } catch (Exception ignored) {
        }
        return listaResposta;
    }
}