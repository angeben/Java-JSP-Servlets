<jsp:include page="include/header.jsp"/>
<%@ page import="java.util.List" %>
<%@ page import="entity.User" %>

<h3>List users</h3>

<table border="1">
<thead>
<th>User ID</th>
<th>Username</th>
<th>Email</th>
<th>Operations</th>
</thead>


<%
List<User> listusers = (List)request.getAttribute("listusers");
for(User _user: listusers){
	out.print("<tr>");
	out.print("<td>"+_user.getUserid()+"</td>");
	out.print("<td>"+_user.getUsername()+"</td>");
	out.print("<td>"+_user.getEmail()+"</td>");
	out.print("<td> <a href="+request.getContextPath()+"/site?page=updateuser&userid="+
		_user.getUserid()+"&username="+_user.getUsername()+"&email="+_user.getEmail()+
		"&first_name="+_user.getFirst_name()+"&last_name="+_user.getLast_name()+">Update</a>");
	out.print(" | ");
	out.print("<a href="+request.getContextPath()+"/site?page=deleteuser&userid="+
			_user.getUserid()+">Delete</a></td>");
	out.print("</tr>");
}
%>
</table>
<jsp:include page="include/footer.jsp"/>