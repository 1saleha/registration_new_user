package com.reg.registration_new_user._Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reg.registration_new_user._Model.Employee_Salary;

@Repository
public interface Employee_Salary_Repo extends JpaRepository<Employee_Salary,Long>{

}
