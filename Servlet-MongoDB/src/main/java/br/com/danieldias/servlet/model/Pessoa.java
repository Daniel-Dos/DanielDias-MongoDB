package br.com.danieldias.servlet.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.enterprise.context.ApplicationScoped;

import lombok.Data;

/**
 * @author daniel
 * github:Daniel-Dos
 * daniel.dias.analistati@gmail.com
 * twitter:@danieldiasjava
 */

@Data
@ApplicationScoped
public class Pessoa implements Serializable {

    private static final long serialVersionUID = 1L;

    private String nome;
    private int idade;
    private String profissao;
    private Endereco endereco;
    private LocalDate dataCadastro;
}