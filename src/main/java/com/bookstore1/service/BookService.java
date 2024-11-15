package com.bookstore1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bookstore1.entity.Book;
import com.bookstore1.repository.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository boRepo;
	
	  public void save(Book b) {
		  boRepo.save(b);
		  
	  }
	  
	  public List<Book> getAllBook(){
		  return boRepo.findAll();
		  
	  }
	  
	  public Book getBookById(int id){
		  return boRepo.findById(id).get();  
		  
	  }
	  
	  public void deleteById(int id) {
		  boRepo.deleteById(id);
	  }

}
