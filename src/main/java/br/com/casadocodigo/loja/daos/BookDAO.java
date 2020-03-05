package br.com.casadocodigo.loja.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.casadocodigo.loja.models.Book;

public class BookDAO {
	
	@PersistenceContext
	private EntityManager em;

	public void save(Book book) {
		em.persist(book);
	}

}
