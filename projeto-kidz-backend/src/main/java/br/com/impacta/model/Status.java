package br.com.impacta.model;

public enum Status {
	VENDIDO("Vendido"), DISPONIVEL("Dispon�vel"), INDISPONIVEL("Indispon�vel");
	
	private String nome;

	Status(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}

}