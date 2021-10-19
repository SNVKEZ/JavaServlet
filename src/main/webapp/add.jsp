<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Add new student</title>
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
                    <label>Mean mark:
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