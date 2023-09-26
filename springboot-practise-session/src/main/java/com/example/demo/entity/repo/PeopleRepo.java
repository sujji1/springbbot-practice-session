package com.example.demo.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.People;

public interface PeopleRepo  extends JpaRepository<People,Integer>{

}
