package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {

	@Autowired
	ApiService asr;
	
	   @PostMapping("addbooks")
		public Book add(@RequestBody Book b)
		{
			return asr.saveinfo(b);
		}

		@PostMapping("addnbooks")
		public List<Book> addnbooks(@RequestBody List<Book> b)
		{
			return asr.savedetails(b);
		}
		@GetMapping("showbooks")
		public List<Book> show()
		{
			return asr.showinfo();
		}
		
		@PutMapping("updateBooks")
		public Book modify(@RequestBody Book b)
		{
			return asr.changeinfo(b);
		}
		
		@DeleteMapping("deletebooks")
		public String del(@RequestBody Book b )
		{
			asr.deleteinfo(b);
			return "Deleted successfully";
		}
		@DeleteMapping("delid/{id}")
		public void deletemyid(@PathVariable int id)
		{
			asr.deleteid(id);
			
		}
		@DeleteMapping("delparamid")
		public void deletemyparamid(@RequestParam int id)
		{
			asr.deletepid(id);
			
		}
		
	
}
