package br.com.caelum.goodbuy.testes;


import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.modelo.Produto;

public class AlteracaoDeProduto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto produto = new ProdutoDao().carregaProduto(1L);
		produto.setPreco(42.50);		
		
		new ProdutoDao().altera(produto);
	
	}

}
