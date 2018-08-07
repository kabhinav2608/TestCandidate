
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Results</title>
<style>
table, th, td {
    border: 1px solid black;
}
</style>
</head>
<body>

<table class="pure-table pure-table-bordered">

<tr>
<th><b>User Id</b></th>
<th><b>Full Name</b></th>
<th><b>Designation</b></th>
<th><b>Service</b></th>
<th><b>Reporting Manager</b></th>
</tr>

 <c:forEach var="i" items="${allCandidates}">
         <tr>
         <td>
         <c:out value="${i.userId}"/>
         </td>
         <td>
         <c:out value="${i.fullName}"/>
         </td>
         <td>
         <c:out value="${i.designation}"/>
         </td>
         <td>
         <c:out value="${i.service}"/>
         </td>
         <td>
         <c:out value="${i.reportingManager}"/>
         </td>
         </tr>
 </c:forEach>
</table>

</body>
</html>