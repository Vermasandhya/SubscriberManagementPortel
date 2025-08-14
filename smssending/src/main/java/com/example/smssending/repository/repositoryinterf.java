package com.example.smssending.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.smssending.model.modelcls;

public interface repositoryinterf extends JpaRepository<modelcls,Long> {

}
