package com.telecom.tel.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.tel.Model.Customer;

@Repository
public interface CustomerDao extends JpaRepository<Customer, Integer> {

}
