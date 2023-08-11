package com.spring.transport.company.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.transport.company.model.PayRegister;
import com.spring.transport.company.repository.PayRegisterRepository;


@Service
public class PayRegisterService implements IPayRegisterService{
	@Autowired
	private PayRegisterRepository payRegisterRepository;

	@Override
	public List<PayRegister> getPayRegisterByManger(String manager) {
		
		return payRegisterRepository.findByusername(manager);
	}

	

	
}
