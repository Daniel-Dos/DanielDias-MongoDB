<%@page contentType="text/html" language="java" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"
	name="viewport" content="width=device-width, initial-scale=1">
</head>
<body>
	<jsp:include page="templates/menu.jsp"></jsp:include>

	<h1 align="center">Sejam Bem Vindos!</h1>

	<div align="center">
		<img src="<c:url value="recursos/imagens/Duke2.jpg"/>"
			class="img-responsive" />
	</div>
	<br />
	<br />
	<jsp:include page="templates/rodape.jsp"></jsp:include>
</body>
</html>