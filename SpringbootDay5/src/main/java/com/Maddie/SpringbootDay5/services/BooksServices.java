package com.Maddie.SpringbootDay5.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Maddie.SpringbootDay5.modelEntity.Books;
import com.Maddie.SpringbootDay5.repository.BooksRepository;

@Service
public class BooksServices {
      
	@Autowired
	BooksRepository bookrepository;
	public Books saveBooks(Books book)
	{
		return bookrepository.save(book);
	}
	public List<Books>getBooks()
	{
		return bookrepository.findAll();
	}
	public Optional<Books>getBooksId(int id)
	{
		return bookrepository.findById(id);
	}
	public String changeinfobyid(int id,Books book)
	{
		bookrepository.save(book);
		if(bookrepository.existsById(id))
		{
			return "Updated";
		}
		else
		{
			return "Enter valid Id";
		}

	}
	public void deletebyid(int id)
	{
		bookrepository.deleteById(id);
	}
}
