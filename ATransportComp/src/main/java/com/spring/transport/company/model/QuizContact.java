package com.spring.transport.company.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



import javax.persistence.Column;


import javax.persistence.Table;
@Entity
@Table(name="quizcontact")
public class QuizContact {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
   
    @Column(length=1000)
    private String name;
    @Column(length=1000)
    private String email;
	@Column(length=1000)
    private String phonenum;
	@Column(length=1000)
    private String message;
    
    public QuizContact() {
		super();
	}
    public QuizContact(int id, String name, String email, String phonenum, String message) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phonenum = phonenum;
		this.message = message;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
