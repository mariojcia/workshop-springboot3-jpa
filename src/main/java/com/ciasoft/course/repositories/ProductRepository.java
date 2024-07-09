package com.ciasoft.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciasoft.course.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Long>{

}
