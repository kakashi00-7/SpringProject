<html>
    <head>
        <link rel="stylesheet" href="/webjars/bootstrap/5.1.3/css/bootstrap.min.css">
        <title>login page</title>
    </head>
    <body>
        <div class="Container">
            <h1>Welcome to the login Page!</h1>
            <pre>${errorMessage}</pre>
            <form method="post">
                Name:<input type="text" name="name">
                Password:<input type="password" name="password">
                <input type="submit">
                
            </form>
        </div>
    </body>
</html>