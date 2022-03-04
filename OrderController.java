package com.example.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.orderservice.model.Orders;
import com.example.orderservice.service.OrderService;



@RestController
@RequestMapping("/order")
public class OrderController {
    
	
	 @Autowired
	 OrderService service;
	 
	 
	 @GetMapping("/all")
	 public List<Orders> showAll(){
		 return service.displayAll();
	 }
	 
	 @PostMapping("/add")
	 public String addOrder(@RequestBody Orders order) {
		 return service.insertOrder(order);
	 }
	 
	 @DeleteMapping("/delete/{oid}")
	 public String deleteOrder(@PathVariable("oid") int oid) {
		 return service.deleteOrder(oid);
	 }
}
