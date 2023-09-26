package com.example.demo.entity.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Bank;
import com.example.demo.entity.People;
import com.example.demo.entity.repo.BankRepo;

@Service
public class BankServiceImpl implements BankService {

	@Autowired
	private BankRepo br;

	@Override
	public void save(Bank bank) {
	br.save(bank);
		
	
	}

	@Override
	public void modify(Bank bank) {
		br.save(bank);
		
	}


	public void deleteById(int id) {
		br.deleteById(id);
		
	}

	@Override
	public Bank selectById(int id) {
		Optional<Bank>op=br.findById(id);
		if(op.isPresent()) {
			return op.get();
		}
		return null;
	}

	@Override
	public List<Bank> selectAllEmployee() {
		Iterable<Bank>itr=br.findAll();
		List<Bank>ist=new ArrayList<>();
		itr.forEach(ele->ist.add(ele));
			return ist;
		}
		
	@Override
	public List<Bank> getAllPaginatedAndSorted(int pageno, int sizeSize, String field) {
	Pageable p =PageRequest.of(pageno, sizeSize, Direction.ASC, field);
		return br.findAll(p).toList();
	}

	
}
