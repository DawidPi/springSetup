<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spr" %>
<%@ page session="false" %>
<!DOCTYPE HTML>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="resources/css/main.css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title><spr:message code="page.title"/></title>
</head>
<body>
<%--<header id="header">--%>
    <%--<tiles:insertAttribute name="header" />--%>
<%--</header>--%>

<div id="content">
<nav id="sidemenu">
    <tiles:insertAttribute name="menu" />
</nav>

<section id="main">
    <tiles:insertAttribute name="body" />
</section>
</div>



<footer id="footer">
    <tiles:insertAttribute name="footer" />
</footer>

</body>
</html>
