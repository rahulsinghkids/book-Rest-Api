package com.cetpa.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cetpa.models.book;
import com.cetpa.models.category;
import com.cetpa.services.bookservice;
@RestController
@RequestMapping("book")
public class bookcontroller 
{
	@Autowired
	private bookservice service;
	
	@Autowired
	private com.cetpa.services.catservice catservice;
	
	@PostMapping("create")
	public ResponseEntity<book> createbook(@RequestBody book book)
	{
		
		book bk = service.addBook(book);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(bk);
		
	}
	
	@PostMapping("createcat")
	public ResponseEntity<category> createCat(@RequestBody category category)
	{
		
		category bk = catservice.addcat(category);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(bk);
		
	}
	
	
	
	
	
	@GetMapping("allbook")
	public ResponseEntity<List<book>> getbook()
	{
		
		List<book> bk = service.allBook();
		
		return ResponseEntity.status(HttpStatus.CREATED).body(bk);
		
	}
	
	
	@GetMapping("byid/{bookid}")
	public ResponseEntity<book> getbyid(@PathVariable int bookid)
	{
		
		book bk = service.bookbyid(bookid);
		if(bk == null)
		{
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			
		}
		
		return ResponseEntity.status(HttpStatus.CREATED).body(bk);
		
	}
	
	
	

	@GetMapping("byname/{bookname}")
	public ResponseEntity<List<book>> getbyname(@PathVariable String bookname)
	{
		
		List<book> bk = service.bookbyname(bookname);
		if(bk == null)
		{
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
			
		}
		else
		{
			return ResponseEntity.status(HttpStatus.CREATED).body(bk);
			
		}
		
		
		
	}
	
	
	

}
