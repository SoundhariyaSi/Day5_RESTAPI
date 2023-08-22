package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepo;

@Service
public class ApiService {

	@Autowired
	BookRepo br;
	
	public Book saveinfo(Book b)
	{
		return br.save(b);
	}
	public List<Book> savedetails(List<Book> b)
	{
		return (List<Book>) br.saveAll(b);
	}
	 public List<Book> showinfo()
	    {
	    	return br.findAll();// retrieving the data that has been store in the database
	    }
	    public Book changeinfo(Book b)
	    {
	    	return br.saveAndFlush(b);
	    }
	    public void deleteinfo(Book b)
	    {
	    	br.delete(b);
	    }
	    //delete by id for path variable
	    public void deleteid(int id)
	    {
	    	br.deleteById(id);
	    }
	    
	    //delete by id for requestParam
	    public void deletepid(int id)
	    {
	    	br.deleteById(id);
	    }
	    
}
