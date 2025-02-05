package com.WAcnt.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Wallet {

	@Id
	private int id;

	@OneToOne
	@JoinColumn(name = "user_id")
	private Userdata userdata;

	@OneToOne
	@JoinColumn(name = "currency_id")
	private Currency currency;

	private double balance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Userdata getUser() {
		return userdata;
	}

	public void setUser(Userdata userdata) {
		this.userdata = userdata;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
