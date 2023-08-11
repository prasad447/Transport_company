<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

<head>
<meta charset="ISO-8859-1">
<title>Transport Company</title>
</head>
<body style="background:white">
<div>
    <div>
      <div>
        <div>
          <div>
            <h1 align="center" style="color:blue;">TRANSPORT COMPANY</h1>
            <h3>We care about your cargo</h3>
          </div>
          <div>
          <ul class="nav justify-content-center">

  <li class="nav-item">
    <a class="nav-link" href="ritruck">RECENTLY INSTALLED TRUCKS</a>
  </li>
  <li class="nav-item">
    <a class="nav-link" href="towards">STATUS</a>
  </li>
   <li class="nav-item">
    <a class="nav-link" href="services">SERVICES</a>
  </li> 
  <li class="nav-item">
    <a class="nav-link" href="contactus">CONTACT US</a>
  </li>
   <li class="nav-item">
    <a class="nav-link" href="logout">LOGOUT</a>
  </li>
</ul>
          </div>

		  
		  <div id="page-title">
				  
		  </div>
		  
          <div>
            <div>
              <div><br>
                <h2>WELCOME TO OUR TRUCK TRACKING COMPANY</h2>
				<p>You can find All the Information regarding our transport company's services ,Trucks and can contact us to get your vehicle installed in our company</p>
				<p>You can find how many vehicle is on road through my company to your city or closest to it</p>
                                
              <div>
                  <h2>Login as Manager</h2>
                  
                  <%
                  if(request.getAttribute("notlogin_msg")!=null){
                  
                  out.print(request.getAttribute("notlogin_msg"));
                  }
                   %>
                  
                  <%
                  if(request.getAttribute("Error")!=null){
                  
                  out.print(request.getAttribute("Error"));
                  }
                   %>
                  <form action="loginprocess" method="get" accept-charset="utf-8">
                   <table>
                   <tr><td>Select a Branch:<select name="branch">
                   <option ></option>
                    				<option>Kanpur</option>
                   					 <option>Agra</option>
									<option value="Delhi">Delhi</option>
									<option value="Ghaziabad">Ghaziabad</option>
                    </select> <br/></td></tr>
                   <tr><td>UserName:<input type="text" name="username"/><br></td></tr>
                   <tr><td>Password:<input type="password" name="userpass"/><br></td></tr>
                    <tr><td><input type="submit" value="Login"><a href="test">Login as Admin</a></td></tr></table>
                  </form>
                       
               </div>
                <div> </div>
               </div>
            </div>
            <div> </div>
          </div>
		   <br>
          		  
        </div>
      </div>
    </div>
  </div>
         <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

</body>
</html>