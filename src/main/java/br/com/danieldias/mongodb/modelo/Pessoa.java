package br.com.danieldias.mongodb.modelo;

import java.io.Serializable;
import java.util.Date;

/**
 * C
 * @author Daniel Dias
 *
 * Classe para dados de pessoas 
 */
public class Pessoa implements Serializable {
	
	private static final long serialVersionUID = -1282839400268445992L;
	
	private String nome;
	private int idade;
	private String profissao;
	private String endereco;
	private String cidade;
	private String bairro;
	private String estado;
	private Date data;
	
	//construtor sem argumentos
	public Pessoa() {
		
	}
	
	//construtor
	public Pessoa(String nome,int idade,String profissao,String endereco,String cidade,String bairro,String estado,Date data) {
		this.nome = nome;
		this.idade = idade;
		this.profissao = profissao;
		this.endereco = endereco;
		this.cidade = cidade;
		this.bairro = bairro;
		this.estado = estado;
		this.data = data;
	}

	// Gets e Sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	

}
