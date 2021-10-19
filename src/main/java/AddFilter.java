import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;


@WebFilter("/AddFilter")
public class AddFilter implements Filter {
    private FilterConfig filterConfig;



    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        String mark = "";
        if (filterConfig.getInitParameter("active").equalsIgnoreCase("true")){
            HttpServletRequest req = (HttpServletRequest)request;
            mark = request.getParameter("mean");
            if (Double.parseDouble(mark) > 0){
                chain.doFilter(request, response);
                return;
            } else{
                RequestDispatcher dispatcher = request.getRequestDispatcher("/add.jsp");
                dispatcher.forward(request, response);
                return;
            }

        }
    }

    @Override
    public void destroy() {
        filterConfig = null;
    }
}
