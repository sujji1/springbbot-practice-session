package com.example.demo.entity.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Bank;

public interface BankRepo extends JpaRepository<Bank,Integer> {

}
