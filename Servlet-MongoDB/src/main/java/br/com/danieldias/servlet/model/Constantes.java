package br.com.danieldias.servlet.model;

import javax.enterprise.context.ApplicationScoped;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */

@ApplicationScoped
public class Constantes {

    /* Nome do Banco e das Collections */
    public static final String BANCO_NOME = "javaMongo";
    public static final String COLLECTION_NOME = "Usuarios";

   /* Nomes das Colunas para o MongoDB */
    public static final String NOME = "nome";
    public static final String IDADE = "idade";
    public static final String PROFISSAO = "profissao";
    public static final String ENDERECO = "endereco";
    public static final String CIDADE = "cidade";
    public static final String BAIRRO = "bairro";
    public static final String ESTADO = "estado";
    public static final String DATA_CADASTRO = "data";
}