<#ftl encoding='Cp1251'>
<html>
<head>
    <title>Login</title>
    <link href="/css/styles.css" rel="stylesheet" type="text/css">
    <link href="/css/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<#if error??>
<div class="alert alert-danger" role="alert">����� ��� ������ ������� �������</div>
</#if>
<div class="form login">
    <form method="post">
        <h2>����</h2>
        <p type="�����:"><input class="input" type="text" id="name" name="name"/></p>
        <p type="������:"><input class="input" type="password" id="password" name="password"/></p>
        <label for="remember-me">
            <input  type="checkbox" id="remember-me" name="remember-me"> ��������� ����</label>
        <button>�����!</button>
    </form>
</body>
</html>
