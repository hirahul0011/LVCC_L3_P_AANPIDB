<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Enter New Product Details</h1>
	<form action="NewProduct" method="post">
		Enter Product Name:&nbsp; <input type="text" name="pName"><br><br>
		Enter Product Price:&nbsp; <input type="text" name="price"><br><br>
		Enter Product HDD:&nbsp; <input type="text" name="hdd"><br><br>
		Enter Product CPU:&nbsp; <input type="text" name="cpu"><br><br>
		Enter Product RAM:&nbsp; <input type="text" name="ram"><br><br>
		&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;<input type="submit" value="Load"/>
	</form>

</body>
</html>