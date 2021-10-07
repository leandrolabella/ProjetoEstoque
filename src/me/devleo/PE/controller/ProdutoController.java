package me.devleo.PE.controller;

import me.devleo.PE.model.Produto;
import me.devleo.PE.sql.ProdutoDao;

import java.util.List;

public class ProdutoController {

    public static String salvar(Produto produto) {
        String resposta = null;

        try {
            ProdutoDao.salvar(produto);
        } catch (Exception e) {
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }

    public static List<Produto> procurar(String nome) {
        List<Produto> listaResposta = null;
        try {

            if (nome == null || "".equals(nome)) {
                listaResposta = ProdutoDao.listar();
            } else {
                listaResposta = ProdutoDao.procurar(nome);
            }
        } catch (Exception ignored) {
        }
        return listaResposta;
    }

    public static String atualizar(Produto produto) {
        String resposta = null;
        try {
            ProdutoDao.atualizar(produto);
        } catch (Exception e) {
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }

    public static String excluir(Integer id) {
        String resposta = null;
        try {
            ProdutoDao.excluir(id);
        } catch (Exception e) {
            resposta = "Erro na fonte de dados";
        }
        return resposta;
    }

    public static Produto obter(Integer id) {
        Produto produto = new Produto();
        try {
            produto = ProdutoDao.obter(id);
        } catch (Exception ignored) {
        }
        return produto;
    }
}