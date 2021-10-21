<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add new student</title>
<link rel="stylesheet" href="styles.css" />
    </head>

    <body>
        <div>
            <h1>Task1</h1>
        </div>

        <div>
            <%
                if (request.getAttribute("userName") != null) {
                    out.println("<p>User '" + request.getAttribute("userName") + "' added!</p>");
                }
            %>
            <div>
                <div>
                    <h2>Add user</h2>
                </div>

                <form method="post">
                    <label>Name:
                        <input type="name" name="name"><br />
                    </label>
                    <label>Avarage score:
                        <input type="mean" name="mean"><br />
                    </label>
                    <label>Blockchain:
                                           <select name="chain" >
                                                                          <option selected value="true">Knows</option>
                                                                          <option value="false">Don't knows</option>
                                                                      </select>
                                        </label>

                    <button type="submit">Submit</button>
                </form>
            </div>
        </div>

        <div>
            <button onclick="location.href='/java.Task1_Servlet'">Back to main menu</button>
        </div>
    </body>
</html>