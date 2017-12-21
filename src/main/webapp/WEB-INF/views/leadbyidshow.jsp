<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Person Page</title>
	<style type="text/css">
/*		.tg  {border-collapse:collapse;border-spacing:0;border-color:#ccc;}
		.tg td{font-family:Arial, sans-serif;font-size:14px;padding:0px 0px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#fff;}
		.tg th{font-family:Arial, sans-serif;font-size:14px;font-weight:normal;padding:0px 0px;border-style:solid;border-width:1px;overflow:hidden;word-break:normal;border-color:#ccc;color:#333;background-color:#f0f0f0;}
		.tg .tg-4eph{background-color:#f9f9f9}*/
		.borderclass,tr {
			border: 1px solid black;
			
		

		}
	</style>
</head>
<body>
<h1>
	
</h1>



<form class ="borderclass"  modelAttribute="xyz">
 
	
	<table >
	<tr>
                <th>Leads id</th>
                <th>Lead name</th>
    </tr>
	
	<tr>
		<td>
			<th><c:out value="${ xyz.lid}"></c:out>
		</td>
		 
		 <td>
			<th><c:out value="${ xyz.lname}"> </c:out></th>
		</td>
	
	</tr>

</table>	
</form>
<br>
</body>
</html>