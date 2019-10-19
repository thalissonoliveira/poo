<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<meta http-equiv="X-UA-Compatible" content="ie=edge" />
<title>TimeSkip Games</title>
<link href="<c:url value='resources/css/style_produto.css' />"
	rel="stylesheet" />
<!-- <script type="text/javascript" src="script.js"></script> -->
</head>
<body>
	<section>
		<div class="form_content">
			<div>
				<a href="<c:url value='/' />">
					<div class="seta">
						<div class="seta1"></div>
						<div class="seta2"></div>
						<div class="seta3"></div>
					</div>
				</a>
			</div>
			<div class="form">
				<p class="title_login">Produto</p>
				<form id="cadastroForm" class="form_login" action="<c:url value='/cadastroproduto' />" enctype="multipart/form-data" method="post">
					<p>Nome do Produto</p>
					<input id="produto" type="text" name="produto" class="email" />
					<p>Preço</p>
					<input id="preco" type="text" name="preco" class="senha" />
					<p>Imagem</p>
					<input type="file" name="file" id="input-file">
					<div class="botoes">
						<button class="entrar" onclick="doLogin()">Cadastrar</button>
					</div>
				</form>
				<div class="form_end">
					<div class="logo"></div>
					<p class="sua_loja">TimeSkip Games sua loja de jogos retrÃ´</p>
				</div>
			</div>
		</div>
<!-- 		<div class="imagem"></div> -->
        <div class="table-img">
        <c:if test="${!empty list}">
			<table class="table table-striped">
				<thead>
					<tr>
						<th width="80">Produto</th>
						<th width="120">Preço</th>
						<th width="120">Imagem</th>
					</tr>
				</thead>
				<c:forEach items="${list}" var="item">
					<tr>
						<td>${item.nome}</td>
						<td>${item.preco}</td>
<%-- 						<td>${item.preco}</td> --%>
						<td><img src="<c:url value='static/produto/${item.filePath}' />" height="25" width="25" /></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
        </div>
	</section>
</body>
<script type="text/javascript">
function doLogin() {
    document.getElementById("cadastroForm").submit();
}
</script>
</html>