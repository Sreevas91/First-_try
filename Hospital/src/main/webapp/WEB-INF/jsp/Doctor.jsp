<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<body>
	<div class="container">

		<form:form method="post" modelAttribute="doctor">
			<fieldset class="form-group">
				<form:label path="name">name :</form:label>
				<form:input path="name" type="text" class="form-controler"
					required="required" />
					<form:errors path="name" cssClass="text-warning" />
			</fieldset>
			<fieldset class="form-group">
				<form:label path="gender">gender :</form:label>
				<form:input path="gender" type="text" class="form-controler"
					required="required" />
					<form:errors path="gender" cssClass="text-warning" />
			</fieldset>
			<fieldset class="form-group">
				<form:label path="qualification">qualification :</form:label>
				<form:input path="qualification" type="text" class="form-controler"
					required="required" />
					<form:errors path="qualification" cssClass="text-warning" />
			</fieldset>
			<fieldset class="form-group">
				<form:label path="specialization">specialization :</form:label>
				<form:input path="specialization" type="text" class="form-controler"
					required="required" />
					<form:errors path="specialization" cssClass="text-warning" />
			</fieldset>
			<fieldset class="form-group">
				<form:label path="phoneNumber">phoneNumber :</form:label>
				<form:input path="phoneNumber" type="text" class="form-controler"
					required="required" />
					<form:errors path="phoneNumber" cssClass="text-warning" />
			</fieldset>
			<fieldset class="form-group">
				<form:label path="email">email :</form:label>
				<form:input path="email" type="text" class="form-controler"
					required="required" />
					<form:errors path="email" cssClass="text-warning" />
			</fieldset>
			
			<button type="submit" class="btn btn-success">Add</button>
		</form:form>
	</div>
<%@ include file="common/footer.jspf" %>
</body>
</html>