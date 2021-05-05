<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<body>

	
	<div class="container">
		<h1>Doctors List</h1>
		<table class="table table-striped">
			<thead>
				<tr>
				<th>Doctor Id</th>
					<th>Name</th>
					<th>Gender</th>
					<th>Qualification</th>
					<th>Specialization</th>
					<th>phoneNumber</th>
					<th>email</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listDoctors}" var="doctor">
					<tr>
					    <td>${doctor.id}</td>
						<td>${doctor.name}</td>
						<td>${doctor.gender}</td>
						<td>${doctor.qualification}</td>
						<td>${doctor.specialization}</td>
						<td>${doctor.phoneNumber}</td>
						<td>${doctor.email}</td>
						<td><a href="/update-doctor?id=${doctor.id}" type="button"
							class="btn btn-success">Update</a></td>
						<td><a href="/delete-doctor?id=${doctor.id}" type="button"
							class="btn btn-warning">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a type="button" class="btn btn-success" href="/Doctor">Add Doctor</a>
		</div>
		<%@ include file="common/footer.jspf" %>
	</div>
</body>
</html>