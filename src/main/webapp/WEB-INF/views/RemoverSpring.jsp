<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Remover Dados</title>
<!-- bootstrap -->
	<link rel="stylesheet" href="../recursos/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" href="../recursos/bootstrap/css/bootstrap-theme.min.css">
	<script src="../recursos/bootstrap/js/bootstrap.min.js"></script>
	<script src="../recursos/bootstrap/js/jquery-3.1.0.min.js"></script>
<!-- bootstrap -->
<link rel="stylesheet" href="../recursos/css/style.css">

</head>
<body>
<div class="navbar navbar-inverse navbar-fixed-top">
		<div>
			<ul class="nav navbar-nav">
				<li>
					<div class="navbar-header">
						<a href="../index.html" class="navbar-brand">Home</a>
					</div>
				</li>
	
			</ul>
		</div>
	</div>


 <form action="remover" method="get" style="padding-top: 2cm">
 Nome: <input type="text" name="nome" />
 
 <input type="submit" value="Remover"/>
 
 </form>

</body>
</html>