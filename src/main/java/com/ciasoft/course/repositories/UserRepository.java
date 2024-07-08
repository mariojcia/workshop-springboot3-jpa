package com.ciasoft.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciasoft.course.entities.User;

public interface UserRepository  extends JpaRepository<User, Long>{

}
