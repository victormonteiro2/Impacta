package br.com.impacta.model;

import java.math.BigDecimal;
import java.util.Date;


public class Produto {

	
	private Long user_id;
	
	private String titulo;
	
	private String descrição;
	
	private Enum sexo;
	
	private String cor;
	
	private String tamanho;
	
	private String status;
	
	private Enum categoria;

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public Enum getSexo() {
		return sexo;
	}

	public void setSexo(Enum sexo) {
		this.sexo = sexo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Enum getCategoria() {
		return categoria;
	}

	public void setCategoria(Enum categoria) {
		this.categoria = categoria;
	}
	
	
}
