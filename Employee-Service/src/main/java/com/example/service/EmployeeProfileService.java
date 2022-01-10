/**
 * 
 */
package com.example.service;

import java.util.List;

import com.example.model.EmployeeProfile;

/**
 * @author yequa
 *
 */
public interface EmployeeProfileService {

    void addEmployeeProfile(EmployeeProfile profile);
    List < EmployeeProfile > getEmployeeProfiles();
}
