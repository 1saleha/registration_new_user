package com.reg.registration_new_user._Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.reg.registration_new_user._Model.New_User_Model;

public interface  New_User_Repo extends JpaRepository<New_User_Model,Long>{

}
