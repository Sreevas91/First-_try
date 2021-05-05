<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<body>
<div class="container">
<font color="red">${errormessage}</font>
<form method="Post">
Name: <input type="text" name="name" />
Password: <input type="password" name="password" />
<input type="submit" />
</form>
</div>
<%@ include file="common/footer.jspf" %>
</body>
</html>