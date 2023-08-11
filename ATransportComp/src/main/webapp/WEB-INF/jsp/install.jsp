<jsp:include page="header.jsp"></jsp:include>

            <div id="gbox-bg">
              <div id="gbox-grd">
  <h2>WELCOME TO OUR TRUCK TRACKING COMPANY</h2>
   <form name="myform" action="tsave">
<table>
<tr><td>Truck ID:<input type="text" name="id"/></td></tr>

<tr><td>Truck Model:<input type="text" name="model"/></td></tr>
<tr><td>Truck No:<input type="text" name="tno"/></td></tr>
<tr><td>Insurance:<input type="radio" name="insurance" value="yes"/>
Yes<input type="radio" name="insurance" value="no"/>NO</td></tr>
<tr><td>If Yes then Insurance Company Name:<input type="text" name="cname"/></td></tr>
<tr><td>Owner:<input type="text" name="owner"/></td></tr>
<tr><td>Mobile:<input type="text" name="mobile"/></td></tr>
<tr><td>Date:<input type="text" name="date"/></td></tr>
<tr><td>Route-From:<select name="from" id="select">
					<option>Select a Branch</option>
					<option>Ghaziabad</option>
					<option>Kanpur</option>
					<option>Delhi</option>
					<option>Agra</option>
					</select></td><td>To:<select name="to" id="select">
					<option>Select a Branch</option>
					<option>Ghaziabad</option>
					<option>Kanpur</option>
					<option>Delhi</option>
					<option>Agra</option>
					</select></td></tr>
<tr><td><input type="submit" value="create" style="padding: 2"></td></tr>
</table>
<div id="location" align="left"></div>
</form>
  <div class="clear"> </div>
              </div>
            </div>
            
     