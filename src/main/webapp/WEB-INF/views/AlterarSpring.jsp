<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Inserir no MongoDB</title>
</head>
<body>

<div align="center">
<img alt="MongoDB" src="../recursos/imagens/mongodb-logo.png" height="150" align="middle">
<h1><a href="https://github.com/Daniel-Dos/DanielDias-MongoDB">GitHub - DanielDias-Mongo</a></h1>

<form action="alterar" method="post">

   Nome: <input type="text" name="nome"/><br /><br />
   Idade: <input type="number" name="idade"/><br /> <br />
   Profiss�o: <input type="text" name="profissao"/><br /><br />
   Endere�o: <input type="text" name="endereco"/><br /><br />
   Cidade: <input type="text" name="cidade"/><br /><br />
   Bairro: <input type="text" name="bairro"/><br /><br />
   Estado: <input type="text" name="estado"/><br /><br/>
   
   <input type="submit" value="Alterar Dados no MongoDB"/>
   


</form>

</div>
<br /><br />
<footer id="footer">
            <ul style="list-style: none;" align="center">
            <li>Copyright &copy; Daniel Dias dos Santos 2016</li>
           </ul>
        </footer>


</body>
</html>