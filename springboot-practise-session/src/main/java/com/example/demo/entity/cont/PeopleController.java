package com.example.demo.entity.cont;

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

import com.example.demo.entity.People;
import com.example.demo.entity.service.PeopleService;

@RestController
public class PeopleController {
	@Autowired 
	private PeopleService ps;
	@PostMapping("/people")
	public String addpeople(@RequestBody People people) {
		ps.save(people);
		return"people added succesfully";
	}
	@PutMapping("/people")
	public String updatepeople(@RequestBody People people) {
		ps.modify(people);
		return"people added succesfully";
	}
	@DeleteMapping("/people")
	public String deletepeople(@RequestParam int id) {
		System.out.println("first delete");
		ps.deleteById(id);
	 return "people deleted succesfully";
	}
	@DeleteMapping("/people")
	public String deletepeople1(@PathVariable int id) {
		System.out.println("first delete");
		ps.deleteById(id);
	 return "people deleted succesfully";
	}
	@GetMapping("/people/{id}")
	public People getEmployeeById(@PathVariable int id) {
		return ps.selectById(id);
	}
	@GetMapping("/people")
	public List<People>getAllEmployees(){
		return ps.selectAllEmployee();
	}
	@GetMapping("/peoplepageandsort")
	public List<People>getAllPaginatedAndSorted(@RequestParam int pageno,@RequestParam int pagesize,@RequestParam String field){
		return ps.getAllPaginatedAndSorted(pageno, pagesize, field);
	}


}
