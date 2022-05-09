package model;

public class Produto {

	private String nome;
	private String marca;
	private String fabricante;
	private String cor;
	private String tamanhoCam;
	private int tamanho;
	private int capacidade;
	private int valor;
	private TipoCalcado calcado;
	private TipoVideoGame videoGame;
	private TipoArmazenamento armazenamento;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanhoCam() {
		return tamanhoCam;
	}

	public void setTamanhoCam(String tamanhoCam) {
		this.tamanhoCam = tamanhoCam;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public TipoCalcado getCalcado() {
		return calcado;
	}

	public void setCalcado(TipoCalcado calcado) {
		this.calcado = calcado;
	}

	public TipoVideoGame getVideoGame() {
		return videoGame;
	}

	public void setVideoGame(TipoVideoGame videoGame) {
		this.videoGame = videoGame;
	}

	public TipoArmazenamento getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(TipoArmazenamento armazenamento) {
		this.armazenamento = armazenamento;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", marca=" + marca + ", fabricante=" + fabricante + ", cor=" + cor
				+ ", tamanhoCam=" + tamanhoCam + ", tamanho=" + tamanho + ", capacidade=" + capacidade + ", valor="
				+ valor + ", calcado=" + calcado + ", videoGame=" + videoGame + ", armazenamento=" + armazenamento
				+ "]";
	}

}
