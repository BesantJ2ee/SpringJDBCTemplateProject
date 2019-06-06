<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome</h1>


<table>




<tr>
<td>Customer Name :</td>
<td> ${customerVersion.box1} </td>
</tr>

<tr>
<td>Customer Number :</td>
<td> ${customerVersion.box2} </td>
</tr>


<tr>
<td>Customer Location :</td>
<td> ${customerVersion.box3} </td>
</tr>


<tr>
<td>Customer PrepaidNo :</td>
<td> ${customerVersion.box4} </td>
</tr>


<%-- <tr>
<td>Student Array:</td>
<td> ${student.skillSet} </td>
</tr> --%>

<tr>
<td>Customer Amount:</td>
<td> ${customerVersion.box5} </td>
</tr>


</table>






</body>
</html>