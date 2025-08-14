package com.example.smssending.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.smssending.model.modelcls;
import com.example.smssending.repository.repositoryinterf;

@Service
public class servicecls implements serviceinterf {
	@Autowired
	private repositoryinterf repository;

	@Override
	public List<modelcls> getAllData() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}
	@Override
	public modelcls createOrUpdate(modelcls newdata) {
		// TODO Auto-generated method stub
		return repository.save(newdata);
	}
	@Override
	public modelcls getById(Long id) {
		// TODO Auto-generated method stub
		
		return repository.findById(id).orElse(null);

	}

	@Override
	public
	 void deletenewdata(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}	
	}