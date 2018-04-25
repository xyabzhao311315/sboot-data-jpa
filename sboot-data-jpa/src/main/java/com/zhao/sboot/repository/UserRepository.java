package com.zhao.sboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zhao.sboot.beans.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
