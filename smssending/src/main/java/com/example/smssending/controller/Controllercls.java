package com.example.smssending.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.smssending.model.modelcls;
import com.example.smssending.service.servicecls;

@RestController
@RequestMapping("/newdata")
public class Controllercls {
	@Autowired
	private servicecls service;
	
	@PostMapping
    public  modelcls addnewdata(@RequestBody modelcls newdata) {
        return service.createOrUpdate(newdata);
    }

    // GET /SMS - View all SMS messages
    @GetMapping
    List<modelcls> getAll() {
        return service.getAllData();
    }
    @GetMapping("/{id}")
    public modelcls getOne(@PathVariable Long id) {
    	return service.getById(id);
    }
	
	@PutMapping("/{id}")
	public modelcls createOrUpdate(@PathVariable Long id,@RequestBody modelcls newdata) {
		newdata.setId(id);
		return service.createOrUpdate(newdata);
	}
	@DeleteMapping("/{id}")
	void deletenewdata(@PathVariable Long id) {
		 service.deletenewdata(id);
	}
	
}