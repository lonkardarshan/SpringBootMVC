<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Darshan wellcome to page</title>
</head>
<body>
<form action="/student" method="post">
		Id<input type="text" name="id" /> 
		Name<input type="text" name="name" />
		City<input type="text" name="cityname" /> 
		Salary<input type="text" name="salary"/> 		
		<input type="submit" value="Insert" />
		
			 <input type="submit" value="Update" formaction="/studentupdate" /> 
			<input type="submit" value="Delete" formaction="/studentdelete" />
			 <input type="submit" value="ShowAll" formaction="/studentdata" />
	</form>
</body>
</html>