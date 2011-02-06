package br.com.caelum.goodbuy.testes;

import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.modelo.Produto;

public class AdicaoDeProduto {
	public static void main(String[] args) {
	
	Produto produto = criaProduto();
	
	new ProdutoDao().salva(produto);

	}

	private static Produto criaProduto() {
		
		Produto produto = new Produto();
		produto.setNome("Bola");
		produto.setDescricao("bola de futebol Nike");
		produto.setPreco(40.50);
		return produto;
	}
}
