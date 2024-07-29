<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
    <head>
        <link rel="stylesheet" href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css">
		<title>List Todos page</title>
    </head>
    <body>
        <div class="Container">
            <h1>Enter your todo details</h1>
            <form:form method="post" modelAttribute="todo">
                Description <form:input type="text" path="description" required="required"></form:input>
                <form:input type="hidden" path="id" required="required"></form:input>
                <form:input type="hidden" path="done" required="required"></form:input>
                <input type="submit" class="btn btn-success">
                <h1></h1>
                <form:errors path="description" cssClass="text-warning"/>
            </form:form>


            
        </div>

        <script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>