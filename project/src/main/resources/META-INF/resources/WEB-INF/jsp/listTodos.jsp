<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
    <head>
        <link rel="stylesheet" href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css">
		<title>List Todos page</title>
    </head>
    <body>
        <div class="Container">
            <div>
                <h1>Your Todos </h1>
            </div>
            <hr>
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>DESCIPTION</th>
                        <th>TARGET DATE</th>
                        <th>IS DONE</th> 
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${todos}" var="todo" >
                        <tr>
                            <td>${todo.id}</td>
                            <td>${todo.description}</td>
                            <td>${todo.targetDate}</td>
                            <td>${todo.done}</td>
                            <td><a href="delete-todo?id=${todo.id}" class="btn btn-warning">delete</a></td>
                            <td><a href="update-todo?id=${todo.id}" class="btn btn-success">Update</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table> 
            <a href="add-todo"class="btn btn-success">Add Todo</a>

            
        </div>

        <script src="/webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
        <script src="/webjars/jquery/3.6.0/jquery.min.js"></script>
    </body>
</html>