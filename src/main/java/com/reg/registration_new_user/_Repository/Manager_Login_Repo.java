package com.reg.registration_new_user._Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.reg.registration_new_user._Model.Manager_Login;

@Repository
public interface Manager_Login_Repo extends  JpaRepository<Manager_Login,Long> {
	
	Manager_Login findByEmail(String Email);

}
