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

import com.example.demo.entity.Bank;
import com.example.demo.entity.service.BankService;

@RestController
public class BankController {
	@Autowired 
	private BankService bs;
	@PostMapping("/bank")
	public String addpeople(@RequestBody Bank bank) {
		bs.save(bank);
		return"bank added succesfully";
	}
	@PutMapping("/bank")
	public String updatepeople(@RequestBody Bank bank) {
		bs.modify(bank);
		return"bank added succesfully";
	}
	@DeleteMapping("/bank")
	public String deletepeople(@RequestParam int id) {
		System.out.println("first delete");
		bs.deleteById(id);
	 return "bank deleted succesfully";
	}
	@DeleteMapping("/bank")
	public String deletepeople1(@PathVariable int id) {
		System.out.println("second delete");
		bs.deleteById(id);
	 return "bank deleted succesfully";
	}
	@GetMapping("/bank/{id}")
	public Bank getEmployeeById(@PathVariable int id) {
		return bs.selectById(id);
	}
	@GetMapping("/people")
	public List<Bank>getAllEmployees(){
		return bs.selectAllEmployee();
	}
	@GetMapping("/bankpageandsort")
	public List<Bank>getAllPaginatedAndSorted(@RequestParam int pageno,@RequestParam int pagesize,@RequestParam String field){
		return bs.getAllPaginatedAndSorted(pageno, pagesize, field);
	}


}
