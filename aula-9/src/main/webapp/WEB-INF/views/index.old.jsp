<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>TimeSkip Games</title>
<link href="<c:url value='resources/css/style.css' />" rel="stylesheet" />
<!--script type="text/javascript" src="script.js"></script-->
</head>
<body>
	<header>
		<div class="container header">
			<div class="lang">
				<a href=""><div class="port"></div></a> <a href=""><div
						class="eng"></div></a>
			</div>
			<div class="search">
				<c:if test="${usuarioLoja == null}">
					<a href="<c:url value='/cadastro' />" class="link_cad">Cadastro</a>
					<a href="<c:url value='/login' />" type="post" class="link_log">
						Login</a>
				</c:if>
				<c:if test="${usuarioLoja != null}">
					<a href="#" class="link_log">Bem vindo, ${usuarioLoja.nome}</a>
					<a href="<c:url value='/logout' />" class="link_log"> Logout</a>
				</c:if>
				<a href="" class="link_search"><div class="lupa"></div></a> <input
					type="search" />
			</div>
		</div>
	</header>
	<section id="logo_menu">
		<div class="container section1">
			<div class="logo">
				<a href="<c:url value='/' />"><div class="img_logo"></div></a>
			</div>
			<div class="menu">
				<ul class="lista_menu">
					<a href="<c:url value='/' />"><li>HOME</li></a>
					<!-- 					<a href="loja.html"><li>LOJA</li></a> -->
					<a href="<c:url value='/produto' />"><li>LOJA</li></a>
					<a href="contato.html"><li>CONTATO</li></a>
					<a href="sobre.html"><li>SOBRE</li></a>
				</ul>
			</div>
		</div>
	</section>
	<section id="galeria">
		<div class="container imagens">
			<div class="anuncio">
				<div class="title">AUMENTE JÁ SUA COLEÇÃO!</div>
				<div class="text">JOGOS RETRÔ PARA VOCÊ QUE É COLECIONADOR!</div>
			</div>
		</div>
	</section>
	<section id="condicoes">
		<div class="container">
			<div class="condicoes">
				<div class="cond">
					<div class="cond_label">
						<div class="cond_img1"></div>
					</div>
					<div class="cond_text">
						<div>
							<p class="title_cond">FRETE GRÁTIS</p>
							<p class="subtitle_cond">NAS COMPRAS ACIMA DE 5 PRODUTOS</p>
						</div>
					</div>
				</div>
				<div class="cond">
					<div class="cond_label">
						<div class="cond_img2"></div>
					</div>
					<div class="cond_text">
						<div>
							<p class="title_cond">EM ATÉ 12X SEM JUROS</p>
							<p class="subtitle_cond">EM TODOS OS CARTÕES</p>
						</div>
					</div>
				</div>
				<div class="cond">
					<div class="cond_label">
						<div class="cond_img3"></div>
					</div>
					<div class="cond_text">
						<div>
							<p class="title_cond">COMPRA SEGURA</p>
							<p class="subtitle_cond">SEUS DADOS EM SIGILO</p>
						</div>
					</div>
				</div>
			</div>
		</div>
	</section>
	<section>
		<div class="container">
			<p class="em_alta">EM ALTA</p>
		</div>
		<div class="container prod_em_alta">
			<div class="em_alta_prod_text">
				<div class="prod"></div>
				<p class="lancamento">Lançamento</p>
				<p class="desc_jogo">Descrição do Jogo</p>
				<p class="a_vista">À Vista</p>
				<p class="a_prazo">Condições de parcelamento</p>
			</div>
			<div class="em_alta_prod_text">
				<div class="prod"></div>
				<p class="lancamento">Lançamento</p>
				<p class="desc_jogo">Descrição do Jogo</p>
				<p class="a_vista">À Vista</p>
				<p class="a_prazo">Condições de parcelamento</p>
			</div>
			<div class="em_alta_prod_text">
				<div class="prod"></div>
				<p class="lancamento">Lançamento</p>
				<p class="desc_jogo">Descrição do Jogo</p>
				<p class="a_vista">À Vista</p>
				<p class="a_prazo">Condições de parcelamento</p>
			</div>
			<div class="em_alta_prod_text">
				<div class="prod"></div>
				<p class="lancamento">Lançamento</p>
				<p class="desc_jogo">Descrição do Jogo</p>
				<p class="a_vista">À Vista</p>
				<p class="a_prazo">Condições de parcelamento</p>
			</div>
		</div>
	</section>
	<footer class="footer">
		<div class="container footer_content">
			<div>
				<p>&copyCopyright TimeSkip Games</p>
			</div>
			<div class="social_media">
				<a href=""><div class="facebook"></div></a> <a href=""><div
						class="instagram"></div></a>
			</div>
		</div>
	</footer>
</body>
</html>