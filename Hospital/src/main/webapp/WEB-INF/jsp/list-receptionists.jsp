<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<body>
	<div class="container">
		<h1>Receptionist List</h1>
		<table class="table table-striped">
			<thead>
				<tr>
				<th> Id</th>
					<th>Name</th>
					<th>Gender</th>
					<th>Qualification</th>
					<th>phoneNumber</th>
					<th>email</th>
					<th></th>
					<th></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listReceptionists}" var="receptionist">
					<tr>
					    <td>${receptionist.id}</td>
						<td>${receptionist.name}</td>
						<td>${receptionist.gender}</td>
						<td>${receptionist.qualification}</td>
						<td>${receptionist.phoneNumber}</td>
						<td>${receptionist.email}</td>
						<td><a href="/update-receptionist?id=${receptionist.id}" type="button"
							class="btn btn-success">Update</a></td>
						<td><a href="/delete-receptionist?id=${receptionist.id}" type="button"
							class="btn btn-warning">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a type="button" class="btn btn-success" href="/Receptionist">Add Receptionist</a>
		</div>
		<%@ include file="common/footer.jspf" %>
	</div>
</body>
</html>