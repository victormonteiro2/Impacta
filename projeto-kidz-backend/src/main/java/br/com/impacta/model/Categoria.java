package br.com.impacta.model;

public enum Categoria {
	CALCADO("Cal�ado"), BLUSA("Blusa"), CAMISETA("Camiseta"), CALCA("Cal�a");
	
	private String nome;

	Categoria(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}

}