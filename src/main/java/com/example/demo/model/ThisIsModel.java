package com.example.demo.model;


import org.springframework.stereotype.Component;

@Component
public class ThisIsModel {
private int id;
private String name;
private String phone;

//public String toString() {
//	StringBuilder sb =new StringBuilder();
//	sb.append(id);
//	sb.append(name);
//	sb.append(phone);
//	return sb.toString();
//}

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
