import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class AttendanceServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentName = request.getParameter("student_name");
        String date = request.getParameter("date");
        String attendance = request.getParameter("attendance");
        
        // Save to database logic here
        response.sendRedirect("attendance-success.jsp");
    }
}