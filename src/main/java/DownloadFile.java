

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DownloadFile
 */
@WebServlet("/DownloadFile")
public class DownloadFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");  
		PrintWriter out = response.getWriter();  
		String filename = "920575c4a44045da9bd17ba975eb10fd.jpg";   
		String filepath = "D:\\";   
		response.setContentType("APPLICATION/OCTET-STREAM");   
		response.setHeader("Content-Disposition","attachment; filename=\"" + filename + "\"");   
		  
		FileInputStream fileInputStream = new FileInputStream(filepath + filename);  
		            
		int i;   
		while ((i=fileInputStream.read()) != -1) {  
		out.write(i);   
		}   
		fileInputStream.close();   
		out.close();   
		}  
}
