<html>
<head><title>Attendance</title></head>
<body>
    <h2>Mark Attendance</h2>
    <form action="AttendanceServlet" method="POST">
        Student Name: <input type="text" name="student_name"><br>
        Date: <input type="text" name="date"><br>
        Present: <input type="radio" name="attendance" value="Present"> Present
        <input type="radio" name="attendance" value="Absent"> Absent<br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>