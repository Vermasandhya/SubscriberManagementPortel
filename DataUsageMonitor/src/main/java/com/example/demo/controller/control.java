package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DataUsage;
import com.example.demo.service.services;

@RestController
@RequestMapping("/usage")
public class control {

    private final services service;

    public control(services service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<DataUsage> addUsage(@RequestBody DataUsage usage) {
        return ResponseEntity.ok(service.save(usage));
    }

    @GetMapping
    public ResponseEntity<List<DataUsage>> getAllUsage() {
        return ResponseEntity.ok(service.getAll());
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<DataUsage>> getByUser(@PathVariable String userId) {
        return ResponseEntity.ok(service.getByUserId(userId));
    }

    @GetMapping("/device/{deviceType}")
    public ResponseEntity<List<DataUsage>> getByDevice(@PathVariable String deviceType) {
        return ResponseEntity.ok(service.getByDeviceType(deviceType));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DataUsage> updateUsage(@PathVariable Long id, @RequestBody DataUsage updated) {
        return service.update(id, updated)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUsage(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}
