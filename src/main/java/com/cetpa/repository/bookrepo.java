package com.cetpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cetpa.models.book;


@Repository
public interface bookrepo extends JpaRepository<book,Integer>
{
	List<book> findByBookname(String bookname);

}
