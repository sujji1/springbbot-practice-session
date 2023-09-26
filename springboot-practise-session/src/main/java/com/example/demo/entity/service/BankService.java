package com.example.demo.entity.service;



import java.util.List;

import com.example.demo.entity.Bank;



public interface BankService {
	void save(Bank bank);
	void modify(Bank bank);
	void deleteById(int id);
	Bank selectById(int id);
	List<Bank>selectAllEmployee();
	List<Bank>getAllPaginatedAndSorted(int pageno,int sizeSize,String field);


}
