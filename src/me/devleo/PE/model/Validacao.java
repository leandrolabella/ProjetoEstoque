package me.devleo.PE.model;

public class Validacao {

    public static String ProdutoCamposVazios(String nome, String quantidade,
                                             String custo, String valor) {
        String retorno = "";
        if (nome.equalsIgnoreCase("")) {
            retorno += "Nome\n";
        }
        if (quantidade.equalsIgnoreCase("")) {
            retorno += "Quantidade\n";
        }
        if (custo.equalsIgnoreCase("")) {
            retorno += "Custo\n";
        }
        if (valor.equalsIgnoreCase("")) {
            retorno += "Valor\n";
        }
        return retorno;
    }

    public static String ProdutoCamposTamanho(String nome, String quantidade,
                                              String custo, String valor) {
        String resposta = "";
        if (nome.length() > 70) {
            resposta += "\nNome (tamanho máximo: 70)";
        }
        if (quantidade.length() > 4) {
            resposta += "\nQuantidade (tamanho máximo: 4)";
        }
        if (custo.length() > 8) {
            resposta += "\n (tamanho máximo: 8)";
        }
        if (valor.length() > 8) {
            resposta += "\nValor (tamanho máximo: 8)";
        }
        return resposta;
    }
}
