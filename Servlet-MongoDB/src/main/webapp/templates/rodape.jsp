<%--

    Copyright © 2017 Daniel Dias (daniel.dias.analistati@gmail.com)

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
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="<c:url value="/recursos/bootstrap/css/bootstrap.min.css"/>"
	rel="stylesheet" type="text/css" />
</head>
<body>

<footer class="footer">
		<div class="container navbar navbar-inverse">
			<p class="text-center text-primary">
				Desenvolvido por Daniel Dias. <br /> &copy; 2015 Todos os direitos
				reservados à Omega Ware.
			</p>
		</div>
	</footer>
	<script type="text/javascript"
		src="<c:url value="/recursos/bootstrap/js/bootstrap.min.js"/>"></script>
	<script type="text/javascript"
		src="<c:url value="/recursos/bootstrap/js/jquery-3.1.0.min.js"/>"></script>
</body>
</html>