package com.projectMobile.mobileProject.service;

import java.util.List;

import com.projectMobile.mobileProject.dto.MobileDTO;
import com.projectMobile.mobileProject.entity.Mobile;

public interface MobileService {
	Mobile createMobile(MobileDTO dto);
    List<Mobile> getAllMobiles();
    Mobile getMobileById(int id);
    Mobile updateMobile(int id, MobileDTO dto);
    void deleteMobile(int id);
    List<Mobile> searchByBrand(String brandName);

}
