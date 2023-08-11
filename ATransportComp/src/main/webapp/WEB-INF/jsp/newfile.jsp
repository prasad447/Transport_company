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
              <div id="gbox-grd"><br>
			  <h2>WELCOME TO OUR TRUCK TRACKING COMPANY</h2>
                <div id="newsletter">
     		<form name="myform" action="msearch">
			<table><tr>
			<td>Branch:</td>
			<td><select name="branch" id="select">
					<option>Select a Branch</option>
					<option>Ghaziabad</option>
					<option>Kanpur</option>
					<option>Delhi</option>
					<option>Agra</option>
			</select></td>
			</tr>
			<tr>
				<td>Find Manager:</td>
				<td><input type="text" align="right" name="findName"></input></td>
				
			</tr>
			<tr><td><input type="submit" value="search"></td></tr>
		</table>
		<div id="right" align="right"></div>
		<div id='bottom'></div>
		<div id="right1" align="right"></div>
		<a href="create"><font style="color: navy;"><B>CreateNew Manager</B></font></a><br /> 
		<a href="install"><font syle="color: navy;"><B>Install New Truck</B></font></a><br />
		<a href="findtruck"><font style="color: navy;"><B>Search Truck</B></font></a>
	</form>
	</div>
	<div class="clear"></div>
	</div>
	</div>
</body>
</html>