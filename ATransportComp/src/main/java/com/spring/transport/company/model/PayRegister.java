package com.spring.transport.company.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.Table;

@Entity
@Table(name="payregister")
public class PayRegister
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;
    @Column(length=1000)
    private String username;
   
    @Column(length=1000)
    private String userpass;
    @Column(length=100)
    private String branch;
    @Column(length=1000)
    private String dateofjoining;
    @Column(length=1000)
    private String dateofbirth;
    @Column
    private double salary;
    
    public  PayRegister() {
	super();
    }
    public PayRegister(int id, String username, String userpass, String branch, String dateofjoining,String dateofbirth, double salary)
    {
		super();
		this.id = id;
		this.username = username;
		this.userpass = userpass;
		this.branch = branch;
		this.dateofjoining = dateofjoining;
		this.dateofbirth = dateofbirth;
		this.salary = salary;
	}

	public int getId() {
    	return id;
    }
    public String getUsername() {
    	return username;
    }
    public void setUsername(String username) {
    	this.username = username;
    }
    public String getUserpass() {
    	return userpass;
    }
    public void setUserpass(String userpass) {
    	this.userpass = userpass;
    }
    public String getBranch() {
    	return branch;
    }
    public void setBranch(String branch) {
    	this.branch = branch;
    }
    public String getDateofjoining() {
    	return dateofjoining;
    }
    public void setDateofjoining(String dateofjoining) {
    	this.dateofjoining = dateofjoining;
    }
    public String getDateofbirth() {
    	return dateofbirth;
    }
    public void setDateofbirth(String dateofbirth) {
    	this.dateofbirth = dateofbirth;
    }
    public double getSalary() {
    	return salary;
    }
    public void setSalary(double salary) {
    	this.salary = salary;
    }
  

}
