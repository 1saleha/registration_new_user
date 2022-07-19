package com.reg.registration_new_user._Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reg.registration_new_user._Model.Timesheet_Model;

@Repository
public interface Timesheet_Emp_Repo extends JpaRepository<Timesheet_Model,Long>{

}
