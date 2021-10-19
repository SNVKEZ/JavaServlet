import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/add")
public class AddServlet extends HttpServlet {
    private static final long serialVersionUID = 3L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("add.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String mean = req.getParameter("mean");
        String chain = req.getParameter("chain");
        Double mark;
        if (Double.parseDouble(mean) > 0 && Double.parseDouble(mean) <= 5){
            mark = Double.parseDouble(mean);
        }
        else {
            mark = 0.0;
        }
        Student student = new Student(name, mark, Boolean.parseBoolean(chain));
        SpisokStud spstud = SpisokStud.getInstance();
        SpisokStud.nwStd(student);

        req.setAttribute("userName", name);
        doGet(req, resp);
    }
}