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
	
	//HttpServletRequest�� Ŭ���̾�Ʈ�� ��û, HttpServletResponse�� Ŭ�󸮾�Ʈ���� ��û�� ó�� ����� ���� ������ ���� ���
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException,IOException{
		
		//num1�� num2�� �޾ƿ� �� String������ �޾ƿ��� ������ Int������ ĳ������ �����Ѵ�.
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





