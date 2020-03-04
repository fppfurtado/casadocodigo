package br.com.casadocodigo.loja.managedbeans;

import javax.enterprise.inject.Model;

import br.com.casadocodigo.loja.models.Book;

@Model
public class AdminBooksBean {
	
	private Book book = new Book();
	
	public Book getBook() {
		return book;
	}

	public void save( ) {
		System.out.println("salvando o livro:\n" + book);
	}

}
