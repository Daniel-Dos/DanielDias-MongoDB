package br.com.danieldias.mongodb.modelo;

import java.io.Serializable;
import java.util.Calendar;
<<<<<<< HEAD
=======
import java.util.Date;
>>>>>>> 94f9db3238fbb742901ea86f3ee204fb221a244f

import org.springframework.format.annotation.DateTimeFormat;

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
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
<<<<<<< HEAD
	private Calendar dataFinalizacao;
=======
	private Calendar data;
>>>>>>> 94f9db3238fbb742901ea86f3ee204fb221a244f
	
	//construtor sem argumentos
	public Pessoa() {
		
	}
	
	//construtor
<<<<<<< HEAD
	public Pessoa(String nome,int idade,String profissao,String endereco,String cidade,String bairro,String estado,Calendar dataFinalizacao) {
=======
	public Pessoa(String nome,int idade,String profissao,String endereco,String cidade,String bairro,String estado,Calendar data) {
>>>>>>> 94f9db3238fbb742901ea86f3ee204fb221a244f
		this.nome = nome;
		this.idade = idade;
		this.profissao = profissao;
		this.endereco = endereco;
		this.cidade = cidade;
		this.bairro = bairro;
		this.estado = estado;
<<<<<<< HEAD
		this.dataFinalizacao = dataFinalizacao;
=======
		this.data = data;
>>>>>>> 94f9db3238fbb742901ea86f3ee204fb221a244f
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
	
	public Calendar getData() {
		return data;
	}
	
<<<<<<< HEAD
	public Calendar getDataFinalizacao() {
		return dataFinalizacao;
	}
	
	public void setDataFinalizacao(Calendar dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
=======
	public void setData(Calendar data) {
		this.data = data;
>>>>>>> 94f9db3238fbb742901ea86f3ee204fb221a244f
	}
	

}
