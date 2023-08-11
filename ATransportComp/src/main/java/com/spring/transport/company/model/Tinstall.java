package com.spring.transport.company.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;
import java.util.Date;

import javax.persistence.Table;
@Entity
@Table(name="tinstall")
public class Tinstall {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
   
    @Column(length=1000)
    private String tmodel;
    @Column(length=1000)
    private String tno;
    @Column(length=1000)
    private String insurance;
    @Column(length=1000)
    private String iname;
    @Column(length=1000)
    private String malik;
    @Column(length=1000)
    private String tfrom;
    @Column(length=1000)
    private String tto;
    @Column(length=10)
    private int mobile;
    @Column(length=1000)
    private Date tdate;
    @Column(length=1000)
    private String status;
    
    public Tinstall() {
    	super();
    }
	public Tinstall(int id, String tmodel, String tno, String insurance, String iname, String malik, String tfrom,
			String tto, int mobile, Date tdate, String status) {
		super();
		this.id = id;
		this.tmodel = tmodel;
		this.tno = tno;
		this.insurance = insurance;
		this.iname = iname;
		this.malik = malik;
		this.tfrom = tfrom;
		this.tto = tto;
		this.mobile = mobile;
		this.tdate = tdate;
		this.status = status;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTmodel() {
		return tmodel;
	}
	public void setTmodel(String tmodel) {
		this.tmodel = tmodel;
	}
	public String getTno() {
		return tno;
	}
	public void setTno(String tno) {
		this.tno = tno;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public String getIname() {
		return iname;
	}
	public void setIname(String iname) {
		this.iname = iname;
	}
	public String getMalik() {
		return malik;
	}
	public void setMalik(String malik) {
		this.malik = malik;
	}
	public String getTfrom() {
		return tfrom;
	}
	public void setTfrom(String tfrom) {
		this.tfrom = tfrom;
	}
	public String getTto() {
		return tto;
	}
	public void setTto(String tto) {
		this.tto = tto;
	}
	public int getMobile() {
		return mobile;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	public Date getTdate() {
		return tdate;
	}
	public void setTdate(Date tdate) {
		this.tdate = tdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
}
