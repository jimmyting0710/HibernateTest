package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ThisisEntity;
import com.example.demo.model.ThisIsModel;
import com.example.demo.repositiry.ThisIsRepository;

@Service
public class ThisIsService {
	@Autowired
	private ThisIsRepository repository;

	
	public void add(ThisIsModel model) {
		ThisisEntity entity=new ThisisEntity();
		entity.setId(model.getId());
		entity.setName(model.getName());
		entity.setPhone(model.getPhone());
		repository.save(entity);
		
	}
	
//	public ThisIsModel get(int id) {
//		ThisisEntity entity =repository.findById(id).orElse(new ThisisEntity());
//		ThisIsModel model = new ThisIsModel();
//		model.setId(entity.getId());
//		model.setName(entity.getName());
//		model.setPhone(entity.getPhone());
//		return model;
//		
//		
//		
//	}
	
	
	
	
	
	
	
}
