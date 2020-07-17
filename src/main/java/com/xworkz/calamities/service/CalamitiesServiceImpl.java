package com.xworkz.calamities.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.calamities.dao.CalamitiesDAO;
import com.xworkz.calamities.dto.CalamitiesDTO;

@Component
public class CalamitiesServiceImpl implements CalamitiesService {
	
	@Autowired
	private CalamitiesDAO dao;

	
	public boolean validateAndSave(CalamitiesDTO entity) {

		System.out.println("Start : service");
		boolean valid = false;
		try {
			if (Objects.nonNull(entity)) {
				String place = entity.getPlace();
				if (Objects.nonNull(place) && !place.isEmpty()) {
					System.out.println("Place is valid");
					valid = true;
				} else {
					System.out.println("Place is not Valid");
					valid = false;
				}
				String date = entity.getDate();
				if (valid && Objects.nonNull(date) && !date.isEmpty()) {
					System.out.println("Date is valid");
					valid = true;
				} else {
					System.out.println("Date is not Valid");
					valid = false;
				}
				String capturedby = entity.getCapturedBy();
				if (valid && Objects.nonNull(capturedby) && !capturedby.isEmpty()) {
					System.out.println("CapturedB is valid");
					valid = true;
				} else {
					System.out.println("CapturedB is not Valid");
					valid = false;
				}
				String calamityType = entity.getCalamityType();
				if (valid && Objects.nonNull(calamityType) && !calamityType.isEmpty()) {
					System.out.println("CalamityType is valid");
					valid = true;
				} else {
					System.out.println("CalamityType is not Valid");
					valid = false;
				}
				if (valid) {
					System.out.println("Going to call dao now");
					dao.save(entity);
					System.out.println("End : service");
				}
			} else {
				System.out.println("Data Not Availabel");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return valid;
	}

}
