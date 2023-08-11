package com.spring.transport.company.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;

import javax.servlet.http.*;
@Controller
public class LinkConroller  {
	 @RequestMapping("alogin")
	 public String adprocess(HttpServletRequest req,HttpServletResponse res) throws IOException {
		 String s;
		 String name=req.getParameter("UserName");
		 String pass=req.getParameter("Password");
		 if(name.equals("Karan")&& pass.equals("Karan@123")) {
			System.out.println("Success");
			s="newfile";
		 	//res.sendRedirect("Admin");
		 }else {
			 System.out.println("Fails");
				s="index";
		 }
		return s;
		
	 }
 
	 @RequestMapping("index")
	 public String index() {
		 return "index";
	 }
	
	@RequestMapping("test")
	public String test() {
		return "test";

	}
	@RequestMapping("home")
	public String home() {
		return "home";

	}

	@RequestMapping("ritruck")
	public String truck() {
		return "ritruck";

	}
	@RequestMapping("status")
	public String status() {
		return "towards";

	}
	@RequestMapping("towards")
	public String towards() {
		return "status";

	}
	@RequestMapping("services")
	public String services() {
		return "services";

	}
	
	@RequestMapping("create")
	public String create() {
		return "create";

	}
	@RequestMapping("install")
	public String install() {
		return "install";

	}
	@RequestMapping("contactus")
	public String contactus() {
		return "contactus";

	}
	
	@RequestMapping("findtruck")
	public String findtruck() {
		return "findtruck";

	}
	@RequestMapping("asave")
	public String asave(HttpServletRequest request,HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");
String username=request.getParameter("username");
String userpass=request.getParameter("userpass");

String dateofbirth=request.getParameter("dob");
String dateofjoining=request.getParameter("doj");
String salary=request.getParameter("salary");
String branch=request.getParameter("branch");
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","Karukika5@034");
PreparedStatement ps=con.prepareStatement("insert into payregister values(?,?,?,?,?,?,?)");

ps.setString(1,id);
ps.setString(2,username);
ps.setString(3,userpass);
ps.setString(4,branch);
ps.setString(6,dateofbirth);
ps.setString(5,dateofjoining);
ps.setString(7,salary);
int s=ps.executeUpdate();
if(s>0) {
	System.out.println("successfully record inserted!!");

} 
return "newfile";
}
	@RequestMapping("tsave")
public String tsave(HttpServletRequest request,HttpServletResponse response) throws Exception {
		String id=request.getParameter("id");

String model=request.getParameter("model");
 String tno=request.getParameter("tno");

String insurance=request.getParameter("insurance");
String cname=request.getParameter("cname");
String owner=request.getParameter("owner");
String from1=request.getParameter("from");
String to1=request.getParameter("to");
String mobile=request.getParameter("mobile");

java.util.Date sqdate=Calendar.getInstance().getTime();
java.sql.Date dat =new java.sql.Date(sqdate.getTime());
	

Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","Karukika5@034");
PreparedStatement ps=con.prepareStatement("insert into tinstall values(?,?,?,?,?,?,?,?,?,?)");

ps.setString(1,id);
ps.setString(2,model);
ps.setString(3,tno);
ps.setString(4,insurance);
ps.setString(5,	cname);				
ps.setString(6,owner);
ps.setString(7,from1);
ps.setString(8,to1);
ps.setString(9,mobile);
ps.setDate(10,dat);
int s=ps.executeUpdate();
if(s>0) {
System.out.print("success truck saved");
}
return "newfile";	
}
	@RequestMapping("quizcontact")
	public String quizcontact(HttpServletRequest request,HttpServletResponse response) throws Exception {
	String name= request.getParameter("name");
	String email= request.getParameter("email");
	String phone= request.getParameter("phone");
	String message= request.getParameter("message");
	 
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","Karukika5@034");

	PreparedStatement ps=con.prepareStatement("insert into quizcontact values(?,?,?,?)");
	ps.setString(1,name);
	ps.setString(2,email);
	ps.setString(3,phone);               
	ps.setString(4,message);

	int s= ps.executeUpdate();
	if(s>0) {
		System.out.println("successfully data saved");
		
	}
	return "newfile";
	}
	//********login as manager****
	@RequestMapping("loginprocess")
		public String loginprocess(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String username=request.getParameter("username");
		System.out.print(username);
		String userpass=request.getParameter("userpass");
		String branch=request.getParameter("branch");
		boolean status=false;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","Karukika5@034");
		PreparedStatement ps=con.prepareStatement("select * from payregister where username=? and userpass=? and branch=? ");
		ps.setString(1,username);
		ps.setString(2,userpass);
		ps.setString(3,branch);
		ResultSet rs=ps.executeQuery();
		status=rs.next();
		if(status)
			System.out.print(" hi");
        rs.close();
		return "home";
	
	}
	//***** manager search***
	@RequestMapping("msearch")
	public String msearch(HttpServletRequest request,HttpServletResponse response)throws Exception
	{
		String branch=request.getParameter("branch");
		String name=request.getParameter("findname");
		boolean status = false;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","Karukika5@034");
		PreparedStatement ps=con.prepareStatement("select * from payregister where username =? and branch=?");
		ps.setString(1,branch);
		ps.setString(2,name);
		ResultSet rs=ps.executeQuery();
		
		if(status)
			System.out.println("Manager Found");
		rs.close();
		return "aviewall";
	}
	//********back ward controller*******
	@RequestMapping("newfile")
	public String change() {
		return "newfile";
	}
	//*****services***
	@RequestMapping("findservices")
	public String findservices() {
		return "findservices";
	}
	
	//**************Contac us**************************
	@RequestMapping("quizcontact1")
	public String quizcontact1(HttpServletRequest req,HttpServletResponse res)throws Exception {
		PrintWriter out=res.getWriter();
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","Karukika5@034");
		PreparedStatement ps= con.prepareStatement("select * from quizcontact  ");
		ResultSet rs= ps.executeQuery();
		out.print("<table border='3'>");
		out.print("<tr><td>Name</td><td>Email</td><td>Phone</td><td>Message</td></tr>");
		
		while(rs.next()){
		out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");
		}
		out.print("</table>");
		return "contacted";
	}
	
	
	//*****find truck**
	@RequestMapping("findTruck")
	public String findTruck(HttpServletRequest req,HttpServletResponse res)throws Exception {
		String fname=req.getParameter("findName");
		PrintWriter out=res.getWriter();
		 Class.forName("com.mysql.cj.jdbc.Driver");
		 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","Karukika5@034");
         PreparedStatement ps= con.prepareStatement("Select model,tno,owner,from1,to1,dat from tinstall  order by id desc");
        	ResultSet rs= ps.executeQuery();
        	out.print("<table cellspacing='3',cellpadding='3' border='3'>");
        	out.print("<tr><th><center>Model<center></th><th><center>Number</center></th><th>Owner</th><th><center>From Route</center></th><th><center>To Route</center></th><th>Joining Date</th></tr>");
        	while(rs.next()){
        	out.print("<td>"+rs.getString(1)+"</td>");
			out.print("<td>"+rs.getString(2)+"</td>");
			out.print("<td>"+rs.getString(3)+"</td>");
			out.print("<td>"+rs.getString(4)+"</td>");
			out.print("<td>"+rs.getString(5)+"</td>");
	   		out.print("<td>"+rs.getDate(6)+"</td>");		
        	  	out.print("</tr>");
        	}
        out.print("</table>");
		return "findtruck1";
	}
	@RequestMapping("aremove")
	public String aremove(HttpServletRequest request,HttpServletResponse response)throws Exception {
		String n=request.getParameter("val");
		if(n.length()>0){
		try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","Karukika5@034");

		PreparedStatement ps=con.prepareStatement("delete from payregister where id ='"+n+"'");
		ps.executeUpdate();
		con.close();
		request.setAttribute("msg","Record Has been Deleted");
		}catch(Exception e){e.printStackTrace();}
		}//end of if
		return "newfile";
	}
}

		
	
	

	

