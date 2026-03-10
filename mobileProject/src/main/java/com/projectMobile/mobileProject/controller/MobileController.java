package com.projectMobile.mobileProject.controller;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.projectMobile.mobileProject.dto.MobileDTO;
import com.projectMobile.mobileProject.entity.Mobile;
import com.projectMobile.mobileProject.service.MobileService;

import java.util.List;

@RestController
@RequestMapping("/api/mobiles")
public class MobileController {

    private final MobileService service;

    public MobileController(MobileService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Mobile> createMobile(@Valid @RequestBody MobileDTO dto) {
        return ResponseEntity.status(201).body(service.createMobile(dto));
    }

    @GetMapping
    public ResponseEntity<List<Mobile>> getAllMobiles() {
        return ResponseEntity.ok(service.getAllMobiles());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Mobile> getMobileById(@PathVariable Long id) {
        return ResponseEntity.ok(service.getMobileById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Mobile> updateMobile(@PathVariable Long id, @Valid @RequestBody MobileDTO dto) {
        return ResponseEntity.ok(service.updateMobile(id, dto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMobile(@PathVariable Long id) {
        service.deleteMobile(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search")
    public ResponseEntity<List<Mobile>> searchByBrand(@RequestParam String brandName) {
        return ResponseEntity.ok(service.searchByBrand(brandName));
    }
}