package model;

public class ProdutoBuilder {
	private Produto produto;
	
	ProdutoBuilder(){
		this.produto = new Produto();
	}
	
	public static ProdutoBuilder builder() {
		return new ProdutoBuilder();
	}
	
	public ProdutoBuilder addCalcado(int tamanho, String cor, TipoCalcado calcado, int valor) {
		produto.setTamanho(tamanho);
		produto.setCor(cor);
		produto.setCalcado(calcado);
		produto.setValor(valor);
		return this;
	}
	
	public ProdutoBuilder addCamiseta(String tamanhoC, String cor, String marca, int valor) {
		produto.setTamanhoCam(tamanhoC);
		produto.setCor(cor);
		produto.setMarca(marca);
		produto.setValor(valor);
		return this;
	}
	
	public ProdutoBuilder addVideoGame(String nome, TipoVideoGame videogame, int valor) {
		produto.setNome(nome);
		produto.setVideoGame(videogame);
		produto.setValor(valor);
		return this;
	}
	
	public ProdutoBuilder addHD(TipoArmazenamento armazenamento, int capacidade, String fabricante, int valor) {
		produto.setArmazenamento(armazenamento);
		produto.setCapacidade(capacidade);
		produto.setFabricante(fabricante);
		produto.setValor(valor);
		return this;
	}
	
	public Produto get() {
		return this.produto;
	}
}
