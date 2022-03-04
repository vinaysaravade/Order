package com.example.orderservice.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.orderservice.model.Orders;


@Repository
@Transactional
public interface OrderRepo extends JpaRepository<Orders, Integer>{

}
