package com.WAcnt.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WAcnt.Model.Userdata;

@Repository
public interface UserRepo extends JpaRepository<Userdata, Integer> {

}
