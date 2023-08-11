<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
        <jsp:include page="header.jsp"></jsp:include>
            <div id="gbox-bg">
              <div id="gbox-grd">
              
              <br>
                <h2>WELCOME TO OUR TRUCK TRACKING COMPANY</h2>
				<p>You can find All the Information regarding our transport company's services ,Trucks and can contact us to get your vehicle installed in our company</p>

				<p>You can find how many vehicle is on road through my company to your city or closest to it</p>
                                
                <div id="newsletter">
                  <h2>Login Form</h2>
                                   
                  <form action="alogin" method="post" accept-charset="utf-8">
                    <table><tr><td>UserName:<input type="text" name="UserName"/><br></td></tr>
                   	<tr><td>Password:<input type="password" name="Password"/><br></td></tr>
                   <tr><td> <input type="submit" value="Login"></td></tr>
                  </table>
                 </form>
                  
                </div>
                
                <div class="clear"> </div>
                
              </div>
            </div> <br>
</body>
</html>