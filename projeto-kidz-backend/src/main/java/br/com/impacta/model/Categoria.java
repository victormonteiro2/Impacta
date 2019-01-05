package br.com.impacta.model;

public enum Categoria {
	CALCADO("Calçado"), BLUSA("Blusa"), CAMISETA("Camiseta"), CALCA("Calça");
	
	private String nome;

	Categoria(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}

}