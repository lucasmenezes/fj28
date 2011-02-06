package br.com.caelum.goodbuy.testes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.goodbuy.modelo.Produto;

public class AdicaoDeProduto {
	public static void main(String[] args) {
	
	Session session = getSession();
	
	
	Produto produto = criaProduto();
	
	
	gravaProduto(session, produto);

	}

	private static void gravaProduto(Session session, Produto produto) {
		
		Transaction tx = session.beginTransaction();
		session.save(produto);
		tx.commit();
	}

	private static Produto criaProduto() {
		
		Produto produto = new Produto();
		produto.setNome("Bola");
		produto.setDescricao("bola de futebol Nike");
		produto.setPreco(40.50);
		return produto;
	}

	private static Session getSession() {
		
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		return session;
	}
}
