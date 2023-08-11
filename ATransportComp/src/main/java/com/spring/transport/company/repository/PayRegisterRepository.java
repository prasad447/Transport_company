package com.spring.transport.company.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.transport.company.model.PayRegister;

public interface PayRegisterRepository extends JpaRepository<PayRegister,Integer>
{

	List<PayRegister> findByusername(String manger);

	
     
}
