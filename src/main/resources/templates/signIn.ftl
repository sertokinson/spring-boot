<#ftl encoding='Cp1251'>
<html>
<head>
    <title>Login</title>
    <link href="/styles.css" rel="stylesheet" type="text/css">
    <link href="/bootstrap.min.css" rel="stylesheet"/>
</head>
<body>
<#if error??>
<div class="alert alert-danger" role="alert">����� ��� ������ ������� �������</div>
</#if>
<div class="login">
    <form method="post" >
        <h2>����</h2>
        <p type="�����:"><input class="input" type="text" id="name" name="name"/></p>
        <p type="������:"><input class="input" type="password" id="password" name="password"/></p>
        <button>�����!</button>
    </form>
</div>
</body>
</html>
