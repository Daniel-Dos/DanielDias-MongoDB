<%--

    Copyright © 2017 Daniel Dias

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.

--%>
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