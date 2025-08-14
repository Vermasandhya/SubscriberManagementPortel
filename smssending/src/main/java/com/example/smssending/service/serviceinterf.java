package com.example.smssending.service;

import java.util.List;

import com.example.smssending.model.modelcls;

public interface serviceinterf {
	List <modelcls> getAllData();
	modelcls createOrUpdate(modelcls newdata);
	modelcls getById (Long id);
	void deletenewdata(Long id);
}
