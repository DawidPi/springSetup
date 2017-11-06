<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link rel="stylesheet" type="text/css" href="resources/css/main.css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>test</title>
</head>
<body>
<header id="header">
    <tiles:insertAttribute name="header" />
</header>

<nav id="sidemenu">
    <tiles:insertAttribute name="menu" />
</nav>

<section id="main">
    <tiles:insertAttribute name="body" />
</section>



<footer id="footer">
    <tiles:insertAttribute name="footer" />
</footer>

</body>
</html>
