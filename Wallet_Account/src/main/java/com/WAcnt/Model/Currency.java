package com.WAcnt.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Currency {

	@Id
	private int id;

	private String name;

	private String abbreviation;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

}
