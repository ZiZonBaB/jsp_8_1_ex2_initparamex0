package www.javayongju.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletInitParam
 */
@WebServlet(urlPatterns={"/ServletInitParam"},initParams= {@WebInitParam(name="id",value="abcdef"),@WebInitParam(name="pw",value="12345"),
		@WebInitParam(name="path",value="f:\\JSP\\Workspace")})
public class ServletInitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletInitParam() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("doget");
	      
	      String id = getInitParameter("id");
	      String pw = getInitParameter("pw");
	      String path = getInitParameter("path");
	      
	      response.setContentType("text/html; charset=EUC-KR");
	      
	      PrintWriter writer = response.getWriter();
	      
	      writer.println("<html><head></head><body>");
	      writer.println("아이디:"+id+"</br>");
	      writer.println("비밀번호:"+pw+"</br>");
	      writer.println("경로:"+path+"</br>");
	      writer.println("</body></html>");
	      
	      writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
