<jsp:include page="include/header.jsp"/>


<form action="${pageContext.request.contextPath}/site" method="post">
User Name: <input type="text" name="username" value="${param.username}" required="required"/><br/>
Email: <input type="text" name="email" value="${param.email}" required="required"/><br/>
First Name: <input type="text" name="first_name" value="${param.first_name}" required="required"/><br/>
Last Name: <input type="text" name="last_name" value="${param.last_name}" required="required"/><br/>
<input type="hidden" name="form" value="updateUserOperation">
<input type="hidden" name="userid" value="${param.userid}">
<input type="submit" value="Update User">
</form>


<jsp:include page="include/footer.jsp"/>