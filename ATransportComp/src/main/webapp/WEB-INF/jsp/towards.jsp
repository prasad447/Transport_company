
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.ResultSet"%>       

 <jsp:include page="header.jsp"></jsp:include>
      <div id="gbox-bg">
             <div id="gbox-grd">
             <h2>WELCOME TO OUR TRUCK TRACKING COMPANY</h2>
				<marquee dir="ltr"><font style="color: navy;">Delhi-Kanpur,Agra-Kanpur,Agra-Ghaziabad,Kanpur-Delhi........</font></marquee>             
             <br/>
              <% 
            //String branch =(String)session.getAttribute("branch");
              Class.forName("com.mysql.cj.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","Karukika5@034");
              PreparedStatement ps= con.prepareStatement("Select model,tno,owner,from1 from tinstall order by id desc ");
             	ResultSet rs= ps.executeQuery();
             	out.print("<table cellspacing='3',cellpadding='3' border='3'>");
             	out.print("<tr><th><center>Model<center></th><th><center>Number</center></th><th>Owner</th><th><center>From</center></th></tr>");
            	//String status=request.getParameter("status");
            	 //out.print("status of Truck: "+status);
             	while(rs.next()){
             	out.print("<tr>");
             			out.print("<td>"+rs.getString(1)+"</td>");
             			out.print("<td>"+rs.getString(2)+"</td>");
             			out.print("<td>"+rs.getString(3)+"</td>");
             			
             	   		out.print("<td>"+rs.getString(4)+"</td>");	
             	    	out.print("</tr>");
             	}
             out.print("</table>");out.print("</br>");
             //out.print("status of Truck: "+status);
              %>
             
            <br/></div> 
            </div>
