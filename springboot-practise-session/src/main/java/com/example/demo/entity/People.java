package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="people_table")
public class People {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String firstname;
	private String lastname;
	@OneToOne(cascade=CascadeType.ALL)
	private Bank bank;
	public People() {
		
	}
	public People(int id, String firstname, String lastname, Bank bank) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.bank = bank;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Bank getBank() {
		return bank;
	}
	public void setBank(Bank bank) {
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "People [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", bank=" + bank + "]";
	}
	
	

}
