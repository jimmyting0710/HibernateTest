package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "vendor")
public class ThisisEntity {
	@Id
	private int id;
	private String name;
	private String phone;
//	
//	@Override
//	public String toString() {
//		return String.format("test1 [id=%d, name='%s', phone='%s']",id,name,phone);
//	}

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
			
	
	
}
