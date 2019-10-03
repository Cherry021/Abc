package com;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	private BookService bs;
	
	@RequestMapping("/books")
	public List<Book> getAllBooks(){
		return bs.findAll();
	}

}
