package com.ciasoft.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ciasoft.course.entities.OrderItem;

public interface OrderItemRepository  extends JpaRepository<OrderItem, Long>{

}
