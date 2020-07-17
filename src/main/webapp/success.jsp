<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>You have Successfully Completed Registration</h1>
<h3>Details are :</h3>

 Place : <b>${place}</b><br>
 Date : <b>${dtoClass.date} </b><br>
 Captured By : <b>${dtoClass.capturedBy}</b><br>
 Calamity Type :  <b>${dtoClass.calamityType}</b><br>
 Affected Area :  <b>${dtoClass.area}</b><br>
 Average Loss : <b>${dtoClass.averageLoss}</b><br>
 Number Of Deaths : <b>${dtoClass.noOfDeaths}</b><br>
 Number Of Injured : <b>${dtoClass.noOfInjured}</b><br>

</body>
</html>