package br.com.danieldias.servlet.model;

import java.io.Serializable;

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
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cidade;
    private String bairro;
    private String estado;
}