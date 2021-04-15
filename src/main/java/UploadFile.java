

import java.io.*;
//import javax.servlet.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;


@WebServlet(name = "UploadFile", urlPatterns = {"/UploadFile"})
@MultipartConfig(location="D:/")
public class UploadFile extends HttpServlet {

	private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
    {
    	response.setContentType("text/html;charset=UTF-8");
    	PrintWriter out =response.getWriter();
    	Part part =request.getPart("fname");
    	
    	String fileName = part.getSubmittedFileName();
    	part.write(fileName);
    	
    	out.println("File Uploaded Successfully");
    	out.println("<br><a href=\"DownloadFile\">download the file</a>");
    }
}
