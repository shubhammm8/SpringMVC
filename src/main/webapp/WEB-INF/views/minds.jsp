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
		.borderclass,th,tr,td {
			
			background-color:#f9f9f9;
			 margin: 40px;
			border: 2px solid black;
			padding:20px;
		

		}
		.some{
		 margin: 40px;
		 font-size:20px;
		background-color:#2d8c9e;
		}
	</style>
</head>
<body>
<h2 align="center" class="some">
	ALL Minds In Mindtree
</h2>



<form class ="borderclass"  modelAttribute="xyz">
 
	<c:if test="${!empty minds}">
	
	</c:if>
	<table align="center">
	<tr>
                <th>Minds id</th>
                <th>Mind  Name</th>
    </tr>
	<c:forEach items="${xyz}" var="x">
	<tr>
		<td>
			<c:out value="${ x.mid}"></c:out>
		</td>
		 
		 <td>
			<c:out value="${ x.mname}"> </c:out>
		</td>
	
	</tr>
</c:forEach>
</table>	
</form>
<br>
</body>
</html>