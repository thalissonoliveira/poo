<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta http-equiv="X-UA-Compatible" content="ie=edge"/>
    <title>TimeSkip Games</title>
    <link href="<c:url value='resources/css/style_login.css' />" rel="stylesheet" />
    <script type="text/javascript" src="script.js"></script>
</head>
<body>
    <section>
        <div class="form_content">
            <div>
                <a href="index.html">
                    <div class="seta">
                        <div class="seta1"></div>
                        <div class="seta2"></div>
                        <div class="seta3"></div>
                    </div>
                </a>
            </div>
            <div class="form">
                <p class="title_login">Login</p>
                <form id="loginForm" class="form_login" action="logon" method="post">
                <p>E-Mail</p>
                <input id="email" type="text" name="email" class="email" />
                <p>Senha</p>
                <input id="senha" type="password" name="senha" class="senha" />
                <div class="botoes">
                    <button class="entrar" onclick="doLogin()">Entrar</button>
                    <a href="cadastro.html" class="cadastro">Cadastrar</a>
                </div>
                <a href="esqueceu.html" class="esqueceu">Esqueceu a Senha?</a>
                </form>
                <div class="form_end">
                    <div class="logo"></div>
                    <p class="sua_loja">TimeSkip Games sua loja de jogos retrÃ´</p>
                </div>
            </div>
        </div>
        <div class="imagem"></div>
    </section>
</body>
<script type="text/javascript">
function doLogin() {
    document.getElementById("loginForm").submit();
}
</script>
</html>