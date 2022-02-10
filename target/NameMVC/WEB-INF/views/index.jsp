<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored = "false"%>
<html>
<body>
<div class="regbox box">
    <h1> Account</h1>
    <form action="/" method="post">
        <p>Input Name</p>
        Your Name: <label>
        <input type="text" name="name" required>
        <input type="submit" name="submit">
    </label>
    </form>
</div>
</body>
</html>
