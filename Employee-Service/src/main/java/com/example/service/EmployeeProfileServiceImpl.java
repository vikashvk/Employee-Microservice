/**
 * 
 */
package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.dao.ProfileRepository;
import com.example.model.EmployeeProfile;

/**
 * @author yequa
 *
 */
public class EmployeeProfileServiceImpl implements EmployeeProfileService {

	@Autowired
	ProfileRepository repository;
	List<EmployeeProfile> employeeProfileList = new ArrayList<>();

	@Override
	public void addEmployeeProfile(EmployeeProfile profile) {
		// TODO Auto-generated method stub
		repository.save(profile);
	}

	@Override
	public List<EmployeeProfile> getEmployeeProfiles() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
