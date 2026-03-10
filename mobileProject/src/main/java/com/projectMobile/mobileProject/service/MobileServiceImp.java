package com.projectMobile.mobileProject.service;



import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.projectMobile.mobileProject.dto.MobileDTO;
import com.projectMobile.mobileProject.entity.Mobile;
import com.projectMobile.mobileProject.repository.MobileRepo;

import java.util.List;

@Service
public class MobileServiceImp implements MobileService {

    private final MobileRepo repository;

    public MobileServiceImp(MobileRepo repository) {
        this.repository = repository;
    }

    @Override
    public Mobile createMobile(MobileDTO dto) {
        Mobile mobile = new Mobile( dto.getBrandName(), dto.getModelName(),dto.getPrice(), dto.getRam(), dto.getStorage());
        return repository.save(mobile);
    }

    @Override
    @Cacheable("mobiles")
    public List<Mobile> getAllMobiles() {
        return repository.findAll();
    }

    @Override
    public Mobile getMobileById(int id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Mobile not found with id: " + id));
    }

    @Override
    public Mobile updateMobile(int id, MobileDTO dto) {
        Mobile mobile = getMobileById(id);
        mobile.setBrandName(dto.getBrandName());
        mobile.setModelName(dto.getModelName());
        mobile.setPrice(dto.getPrice());
        mobile.setRam(dto.getRam());
        mobile.setStorage(dto.getStorage());
        return repository.save(mobile);
    }

    @Override
    @CacheEvict(value = "mobiles", allEntries = true)
    public void deleteMobile(int id) {
        Mobile mobile = getMobileById(id);
        repository.delete(mobile);
    }

    @Override
    public List<Mobile> searchByBrand(String brandName) {
        return repository.findBy
    }
}
