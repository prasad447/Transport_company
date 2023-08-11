<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.*" %>
<body bgcolor="white">
<%
String from=request.getParameter("from");
String to=request.getParameter("to");

if(to!=null){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","Karukika5@034");

PreparedStatement ps=con.prepareStatement("select model,tno,cname,mobile,owner from tinstall where from1='"+from+"' and to1='"+to+"'");
//ps.setString(1,n);
out.print("<br>");
ResultSet rs=ps.executeQuery();

out.print("<table align='center' border='5' cellspacing=5 cellpadding=2 id='myTable'>");
out.print("<tr><td>Model</td><td><B>Truck No.</B></td><td><B>Insurance</B></td><td><B>Mobile</B></td><td><B>Owner</B></td></tr>");

while(rs.next()){
	out.print("</tr>");
out.print("<tr><td>"+rs.getString(1)+"</td>");
out.print("<td>"+rs.getString(2)+"</td>");
out.print("<td>"+rs.getString(3)+"</td>");
out.print("<td>"+rs.getString(4)+"</td>");
out.print("<td>"+rs.getString(5)+"</td>");
}
out.print("</table>");
con.close();

}catch(Exception e){e.printStackTrace();}
}//end of if
%>
<a href="newfile">Back</a>
</body>