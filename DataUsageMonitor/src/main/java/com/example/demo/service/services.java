package com.example.demo.service;

import com.example.demo.model.DataUsage;
import com.example.demo.repository.repositoryy;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class services {

    private final repositoryy repo;

    public services(repositoryy repo) {
        this.repo = repo;
    }

    public DataUsage save(DataUsage usage) {
        return repo.save(usage);
    }

    public List<DataUsage> getAll() {
        return repo.findAll();
    }

    public List<DataUsage> getByUserId(String userId) {
        return repo.findByUserId(userId);
    }

    public List<DataUsage> getByDeviceType(String deviceType) {
        return repo.findByDeviceType(deviceType);
    }

    public Optional<DataUsage> update(Long id, DataUsage updatedUsage) {
        return repo.findById(id).map(existing -> {
            existing.setUserId(updatedUsage.getUserId());
            existing.setDeviceType(updatedUsage.getDeviceType());
            existing.setDataUsedInMB(updatedUsage.getDataUsedInMB());
            existing.setUsageDate(updatedUsage.getUsageDate());
            existing.setNetworkType(updatedUsage.getNetworkType());
            return repo.save(existing);
        });
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }
}
