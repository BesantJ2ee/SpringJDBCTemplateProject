<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.error {
	color: #ff0000;
}

.errorblock {
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding: 8px;
	margin: 16px;
}
</style>
<body>



<form:errors path="customerVersion.*" cssClass="errorblock" />

<form action="Registration" method="POST">


<table>
			
<tr>
<td>Customer Name   : </td>
<td><input type="text" name="box1"></td>
<td><form:errors path="customerVersion.box1" cssClass="error" /></td>
</tr>

<tr>
<td>Customer Number : </td>
<td><input type="text" name="box2"></td>
</tr>

<tr>
<td>Customer Location :</td>
<td><input type="text" name="box3"></td>
</tr>

<tr>
<td>Customer PrepaidNo :</td>
<td><input type="text" name="box4"></td>
</tr>


<tr>
<td>Customer Amount:</td>
<td><input type="text" name="box5"></td>
</tr>

<td colspan="3"><input type="submit" /></td>


</table>
</form>

</body>
</html>