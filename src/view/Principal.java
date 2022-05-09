package view;

import java.util.ArrayList;

import model.Produto;
import model.ProdutoBuilder;
import model.TipoArmazenamento;
import model.TipoCalcado;
import model.TipoVideoGame;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Produto> produtos = new ArrayList<Produto>();

		Produto calcado1 = ProdutoBuilder.builder().addCalcado(35, "preto", TipoCalcado.SOCIAL, 100).get();
		Produto calcado2 = ProdutoBuilder.builder().addCalcado(36, "azil", TipoCalcado.TENIS, 200).get();
		Produto calcado3 = ProdutoBuilder.builder().addCalcado(40, "branco", TipoCalcado.TENIS, 300).get();

		Produto camiseta1 = ProdutoBuilder.builder().addCamiseta("PP", "branco", "Hering", 50).get();
		Produto camiseta2 = ProdutoBuilder.builder().addCamiseta("M", "verde", "C&A", 60).get();
		Produto camiseta3 = ProdutoBuilder.builder().addCamiseta("G", "preto", "MCD", 100).get();

		Produto jogo1 = ProdutoBuilder.builder().addVideoGame("GTA", TipoVideoGame.PLAYSTATION, 300).get();
		Produto jogo2 = ProdutoBuilder.builder().addVideoGame("Call of Duty", TipoVideoGame.XBOX, 200).get();
		Produto jogo3 = ProdutoBuilder.builder().addVideoGame("Forza", TipoVideoGame.SWITCH, 250).get();

		Produto hd1 = ProdutoBuilder.builder().addHD(TipoArmazenamento.SSD, 1000, "Seagate", 300).get();
		Produto hd2 = ProdutoBuilder.builder().addHD(TipoArmazenamento.HDD, 2000, "Samsung", 500).get();
		Produto hd3 = ProdutoBuilder.builder().addHD(TipoArmazenamento.NVME, 4000, "Kingston", 1000).get();

		produtos.add(calcado1);
		produtos.add(calcado2);
		produtos.add(calcado3);
		produtos.add(camiseta1);
		produtos.add(camiseta2);
		produtos.add(camiseta3);
		produtos.add(jogo1);
		produtos.add(jogo2);
		produtos.add(jogo3);
		produtos.add(hd1);
		produtos.add(hd2);
		produtos.add(hd3);

		System.out.println(produtos.toString());
	}
}
