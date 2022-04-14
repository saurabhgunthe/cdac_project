package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.UserPayment;

@Repository
public interface UserPaymentRepository extends JpaRepository<UserPayment, Integer> {

}
