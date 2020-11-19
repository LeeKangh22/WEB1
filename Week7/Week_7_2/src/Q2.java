import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;

@WebServlet("/Q2")
public class Q2 extends HttpServlet{
	private static final long serialVersionUID=1L;
	
	public Q2() {
		super();
	}
	
	//HttpServletRequest는 클라이언트의 요청, HttpServletResponse는 클라리언트에게 요청의 처리 결과에 대한 응답을 위해 사용
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException,IOException{
		
		//num1과 num2를 받아올 때 String형으로 받아오기 때문에 Int형으로 캐스팅해 저장한다.
		int num1=Integer.parseInt(request.getParameter("num1"));
		int num2=Integer.parseInt(request.getParameter("num2"));
		
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out=response.getWriter();
		
		out.println("ADD= "+(num1+num2)+"<br>");
		out.println("SUB= "+(num1-num2)+"<br>");
		out.println("MUL= "+(num1*num2)+"<br>");
		out.println("DIV= "+(num1/num2)+"<br>");
		
		
		
	}
}





