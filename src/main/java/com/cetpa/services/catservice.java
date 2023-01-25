package com.cetpa.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cetpa.models.category;
import com.cetpa.repository.catRepo;

@Service
public class catservice
{
	@Autowired
	private catRepo repo;

	public category addcat(category category)
	{
		category cat = repo.save(category);
		
		
		
		return cat;
	}

}
