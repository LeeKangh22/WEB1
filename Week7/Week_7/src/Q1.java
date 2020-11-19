import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
//패키지 포함


@WebServlet("/Q1")
public class Q1 extends HttpServlet{
	//객체 직렬화에 필요한 클래스에 대한 고유 값
	private static final long serialVersionUID=1L;
	
	//클래스 기본 생성자
	public Q1() {
		super();
	}
	
	//HttpServletRequest는 클라이언트의 요청, HttpServletResponse는 클라리언트에게 요청의 처리 결과에 대한 응답을 위해 사용
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException,IOException{
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		
		//응답방식을 text or html으로 전송
		response.setContentType("text/html;charset=UTF-8");
		
		//서블릿에서 사용자 요청에 따른 응답을 보낼 때 인스턴스를 얻어 처리
		PrintWriter out=response.getWriter();
		
		//요청 받은 정보를 전송해 표시하기 위한 형식
		out.println("NAME="+name+"<br>");
		out.println("PHONE="+phone+"<br>");
		out.println("ADDRESS="+address+"<br>");
		
	}
}





