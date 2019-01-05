package br.com.impacta.model;

public enum Sexo {
	MASCULINO("Masculino"), FEMININO("Feminino");
	
	
	private String nome;

	Sexo(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}

}
