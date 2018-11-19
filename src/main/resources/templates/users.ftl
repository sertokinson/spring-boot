<html>
<head>
    <title>Users</title>
    <link href="/styles.css" rel="stylesheet" type="text/css">
</head>
<body>
    <table >
        <tr>
            <th>Name</th>
            <th>Birth date</th>
        </tr>
        <#list users as user>
            <tr onClick="location.href=location.pathname.concat('/${user.id}')">
                <td>${user.name}</td>
                <td><#if user.birthDate??>${user.birthDate}</#if> </td>
            </tr>
       </#list>
    </table>
</body>
</html>
