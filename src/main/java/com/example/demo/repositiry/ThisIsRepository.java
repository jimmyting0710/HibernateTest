package com.example.demo.repositiry;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ThisisEntity;

@Repository
public interface ThisIsRepository extends CrudRepository<ThisisEntity, Integer>{

}
