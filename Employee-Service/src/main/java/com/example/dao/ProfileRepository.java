/**
 * 
 */
package com.example.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.EmployeeProfile;

/**
 * @author yequa
 *
 */
@Repository
public interface ProfileRepository extends JpaRepository<EmployeeProfile, Integer>{

}
