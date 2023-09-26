package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="bank_table")
public class Bank {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String bankname;
	private int phonenumber;
	public Bank() {
		
	}
	public Bank(int id, String bankname, int phonenumber) {
		super();
		this.id = id;
		this.bankname = bankname;
		this.phonenumber = phonenumber;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	@Override
	public String toString() {
		return "Bank [id=" + id + ", bankname=" + bankname + ", phonenumber=" + phonenumber + "]";
	}
	
	

}
