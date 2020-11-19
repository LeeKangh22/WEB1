package test;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


@WebServlet("/myservlet")
public class myservlet extends HttpServlet{
	private static final long serialVersionUID=1L;
	
	public myservlet() {
		super();
	}
	/*get방식이 아닌post 방식을 사용하기 위해 주석처리
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.sendRedirect("myservlet");
	}*/
	//post 방식의 정보전달
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8"); //한글로된 정보를 받기 위해 UTF-8로 인코딩
		response.setContentType("text/html;charset=UTF-8");
		
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		
		PrintWriter out=response.getWriter();
		
		//html태그를 자바로 작성 시 취약
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		//요청해 받아온 값에 따라 다른 결과 출력
		if(id.contentEquals("hong")&&pwd.contentEquals("1234")) {
			out.println("hong"+"님이 등장");
		}
		else {
			out.println("아이디 또는 비밀번호를 다시 확인하세요.");
		}
		out.println("</body>");
		out.println("</html>");     
	}
}
