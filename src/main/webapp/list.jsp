<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Students</title>
        <link rel="stylesheet" href="styles.css" />
    </head>

    <body>
        <h1>Task1</h1>
        <div>
            <div>
                <div>
                    <h2>Students</h2>
                </div>
                <%
                    List<String> names = (List<String>) request.getAttribute("userNames");

                    if (names != null && !names.isEmpty()) {
                        out.println("<ui>");
                        for (String s : names) {
                            out.println("<li>" + s + "</li>");
                        }
                        out.println("</ui>");
                    } else out.println("<p>There are no students yet!</p>");
                %>
            </div>
        </div>

        <div>
            <button onclick="location.href='/java.Task1_Servlet'">Back to main</button>
        </div>
    </body>
</html>