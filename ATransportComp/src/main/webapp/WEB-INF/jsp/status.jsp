
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
                Class.forName("com.mysql.cj.jdbc.Driver");
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","Karukika5@034");
                PreparedStatement ps= con.prepareStatement("Select model,tno,from1,to1 from tinstall order by id desc ");
               	ResultSet rs= ps.executeQuery();
               	out.print("<table cellspacing='3',cellpadding='3' border='3'>");
               	out.print("<tr><th><center>Model<center></th><th><center>Number</center></th><th><center>From</center></th><th><center>To</center></th></tr>");
               	while(rs.next()){
               	out.print("<tr>");
               			out.print("<td>"+rs.getString(1)+"</td>");
               			out.print("<td>"+rs.getString(2)+"</td>");
               			out.print("<td>"+rs.getString(3)+"</td>");
               			
               	   		out.print("<td>"+rs.getString(4)+"</td>");
               	   		
               	  //out.print("<td><a href='change' onclick='sendInfo(this.name)' name='"+rs.getString(5)+"'>click</a></td>");	
               	    	out.print("</tr>");
               	}
               out.print("</table>");
             %>
               <form action="ssave">            
                </form>
				</div>				         
             </div>
            