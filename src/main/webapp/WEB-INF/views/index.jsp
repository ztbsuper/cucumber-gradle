Hello world

<form action="${pageContext.request.contextPath}/login" method="post">
    username:
    <label>
        <input type="text" name="username"/>
    </label>
    <label>
        password:
        <input type="password" name="password">
    </label>

    <input type="submit" value="submit" >
</form>