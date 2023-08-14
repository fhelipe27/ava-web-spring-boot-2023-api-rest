package com.devbackend.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devbackend.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
