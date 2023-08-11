<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>       
<jsp:include page="header.jsp"></jsp:include>
            
              <% 
                Class.forName("com.mysql.cj.jdbc.Driver");
	            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","Karukika5@034");
                PreparedStatement ps= con.prepareStatement("Select model,tno,owner,from1,to1,dat from tinstall  order by id desc");
               	ResultSet rs= ps.executeQuery();
               	out.print("<table cellspacing='3',cellpadding='3' border='3'>");
               	out.print("<tr><th><center>Model<center></th><th><center>Number</center></th><th>Owner</th><th><center>Route</center></th><th>Joining Date</th></tr>");
               	while(rs.next()){
               	out.print("<tr>");
               	out.print("<td>"+rs.getString(1)+"</td>");
       			out.print("<td>"+rs.getString(2)+"</td>");
       			out.print("<td>"+rs.getString(3)+"</td>");
       			out.print("<td>"+rs.getString(4)+"-"+rs.getString(5)+"</td>");
       	   		out.print("<td>"+rs.getDate(6)+"</td>");		
               	  	out.print("</tr>");
               	}
               out.print("</table>");
                %>
                 
