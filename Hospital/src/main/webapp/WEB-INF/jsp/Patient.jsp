<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<body>
	<div class="container">

		<form:form method="post" modelAttribute="patient">
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
				<form:label path="problem">Problem :</form:label>
				<form:input path="problem" type="text" class="form-controler"
					required="required" />
					<form:errors path="problem" cssClass="text-warning" />
			</fieldset>
			
			
				<fieldset class="form-group">
				<form:label path="phoneNumber">phoneNumber :</form:label>
				<form:input path="phoneNumber" type="text" class="form-controler"
					required="required" />
					<form:errors path="phoneNumber" cssClass="text-warning" />
			</fieldset>
			
			
			
				
			</form:form>
			
			</div>
<%@ include file="common/footer.jspf" %>
</body>
