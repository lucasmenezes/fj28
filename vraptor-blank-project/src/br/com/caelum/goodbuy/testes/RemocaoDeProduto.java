package br.com.caelum.goodbuy.testes;

import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.modelo.Produto;

public class RemocaoDeProduto {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Produto produto = new ProdutoDao().carregaProduto(2L);
		new ProdutoDao().Remove(produto);
	}

}
