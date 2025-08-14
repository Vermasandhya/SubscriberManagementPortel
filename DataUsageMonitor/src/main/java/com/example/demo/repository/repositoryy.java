package com.example.demo.repository;

import com.example.demo.model.DataUsage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface repositoryy extends JpaRepository<DataUsage, Long> {
    List<DataUsage> findByUserId(String userId);
    List<DataUsage> findByDeviceType(String deviceType);
}
