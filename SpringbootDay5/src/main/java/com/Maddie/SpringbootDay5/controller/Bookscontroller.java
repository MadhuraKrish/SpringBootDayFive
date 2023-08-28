package com.Maddie.SpringbootDay5.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Maddie.SpringbootDay5.modelEntity.Books;
import com.Maddie.SpringbootDay5.services.BooksServices;

@RestController
public class Bookscontroller {
	@Autowired
	 BooksServices bookservice;
	@PostMapping("save")
	public Books add(@RequestBody Books book)
   {
	   return bookservice.saveBooks(book);
   }
	@GetMapping("show")
   public List< Books >show()
   {
	   return bookservice.getBooks();
   }
	@GetMapping("getuser/{id}")
   public Optional< Books>getinfo(@PathVariable int id)
   {
	   return bookservice.getBooksId(id);
   }
	@PutMapping("updateuser/{id}")
   public String modifybyid(@PathVariable int id,@RequestBody  Books book)
	{
		return bookservice.changeinfobyid(id,book);
	}
   public  void deletemyid(@PathVariable int id)
   {
	   bookservice.deletebyid(id);
   }
}
