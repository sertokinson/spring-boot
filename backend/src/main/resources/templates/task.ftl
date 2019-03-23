<#ftl encoding='Cp1251'>
<html>
<head>
    <title>Task</title>
    <link href="/css/styles.css" rel="stylesheet" type="text/css">
    <link href="/css/bootstrap.min.css" rel="stylesheet"/
</head>
<body>
<#if error??>
<div class="alert alert-danger alert-task" role="alert">Неверно</div>
</#if>
<#if success??>
  <div class="alert alert-success alert-task" role="alert">
      Правильно!
  </div>
</#if>
<form class="taskForm" method="post">
    <div class="div">
        <img width="250px" src="/image/dog.jpg">
    </div>
    <input
            style="color: ${color}"
            value="${value}"
            autocomplete="off"
            class="input word"
            type="text"
            id="result"
            name="result"
    />
<#if error??>
    <div class="div answer">Ответ: dog</div>
</#if>
    <button class="submit">${action}</button>
</form>
</body>
</html>
