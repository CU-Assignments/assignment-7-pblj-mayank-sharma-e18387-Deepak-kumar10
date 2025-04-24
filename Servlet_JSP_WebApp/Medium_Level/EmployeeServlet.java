import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class EmployeeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String empId = request.getParameter("emp_id");
        // Database connection and data fetching logic here
        // For now, just hardcoding some values
        response.getWriter().println("<tr><td>1</td><td>John Doe</td><td>HR</td><td>john@example.com</td></tr>");
    }
}