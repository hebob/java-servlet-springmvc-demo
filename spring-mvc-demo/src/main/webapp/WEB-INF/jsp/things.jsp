<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>Spring MVC Demo</title>
</head>

<body>
<h2>Things</h2>
<p>
    <c:forEach var="thing" items="${things}">
        ${thing.name}
    </c:forEach>
</p>

<form:form method="post" modelAttribute="thingForm" action="/thing/add">
    <form:input path="name" type="text" /> <!-- bind to user.name-->
    <button type="submit">Add Thing</button>
</form:form>
</body>
</html>