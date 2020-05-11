package com.learning.MyApp1;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@GetMapping("/book")
	public List<BookModel> getAllBook()
	{
		return Arrays.asList(new BookModel(1,"Spring","Jhonson"));
		
	}
	
	

}
