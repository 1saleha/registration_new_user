package com.reg.registration_new_user._Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reg.registration_new_user._Model.company_model;

public interface company_repo extends JpaRepository<company_model,Long>{

}
