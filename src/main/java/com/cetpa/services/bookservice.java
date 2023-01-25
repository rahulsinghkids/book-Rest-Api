package com.cetpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.models.book;
import com.cetpa.repository.bookrepo;
@Service
public class bookservice 
{
	@Autowired
	private bookrepo repo;

	public book addBook(book book)
	{
		book bkk = repo.save(book);
		
		return bkk;
	}

	public List<book> allBook()
	{
		List<book> book = repo.findAll();
 		return book;
	}

	public book bookbyid(int bookid)
	{
		
		book bk = repo.findById(bookid).orElse(null);
		return bk;
	}

	public List<book> bookbyname(String bookname) 
	{
		
		
		return repo.findByBookname(bookname);
	}

}
