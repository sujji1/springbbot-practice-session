package com.example.demo.entity.service;

import java.util.List;

import com.example.demo.entity.People;

public interface PeopleService {
	void save(People people);
	void modify(People people);
	void deleteById(int id);
	People selectById(int id);
	List<People>selectAllEmployee();
	List<People>getAllPaginatedAndSorted(int pageno,int sizeSize,String field);

}
