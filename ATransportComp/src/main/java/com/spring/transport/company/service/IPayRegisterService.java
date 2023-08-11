package com.spring.transport.company.service;

import java.util.List;

import com.spring.transport.company.model.PayRegister;

public interface IPayRegisterService {

	 List<PayRegister> getPayRegisterByManger(String manager);
}
