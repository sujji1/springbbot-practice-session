package com.example.demo.entity.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.example.demo.entity.People;
import com.example.demo.entity.repo.PeopleRepo;

@Service
public class PeopleServiceImpl implements PeopleService {
	@Autowired
	private PeopleRepo pr;

	@Override
	public void save(People people) {
		pr.save(people);
		
	}

	@Override
	public void modify(People people) {
	pr.save(people);
		
	}

	public void deleteById(int id) {
	pr.deleteById(id);
	
		
	}

	@Override
	public People selectById(int id) {
		Optional<People>op=pr.findById(id);
		if(op.isPresent()) {
			return op.get();
		}
		return null;
	}

	@Override
	public List<People> selectAllEmployee() {
	Iterable<People>itr=pr.findAll();
	List<People>ist=new ArrayList<>();
	itr.forEach(ele->ist.add(ele));
		return ist;
	}

	@Override
	public List<People> getAllPaginatedAndSorted(int pageno, int sizeSize, String field) {
		Pageable p = PageRequest.of(pageno, sizeSize,Direction.ASC,field);
		return pr.findAll(p).toList();
	}


	

}
