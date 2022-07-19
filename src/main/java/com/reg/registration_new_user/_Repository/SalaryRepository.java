package com.reg.registration_new_user._Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reg.registration_new_user._Model.Salary;

@Repository
public interface SalaryRepository extends JpaRepository<Salary,Long>{

}
