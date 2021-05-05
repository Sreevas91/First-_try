<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<body>

	
	<div class="container">
		<h1>Patients List</h1>
		<table class="table table-striped">
			<thead>
				<tr>
				<th>Patient Id</th>
					<th>Name</th>
					<th>Gender</th>
					<th>Problem</th>
					<th>phoneNumber</th>
					
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listPatients}" var="doctor">
					<tr>
					    <td>${patient.id}</td>
						<td>${patient.name}</td>
						<td>${patient.gender}</td>
						<td>${Patient.Problem}</td>
						<td>${Patient.phoneNumber}</td>
						
						<td><a href="/update-patient?id=${patient.id}" type="button"
							class="btn btn-success">Update</a></td>
						<td><a href="/delete-patient?id=${patient.id}" type="button"
							class="btn btn-warning">Delete</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div>
			<a type="button" class="btn btn-success" href="/Patient">Add Patient</a>
		</div>
		<%@ include file="common/footer.jspf" %>
	</div>
</body>
</html>