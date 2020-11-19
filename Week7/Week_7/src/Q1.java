import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
//��Ű�� ����


@WebServlet("/Q1")
public class Q1 extends HttpServlet{
	//��ü ����ȭ�� �ʿ��� Ŭ������ ���� ���� ��
	private static final long serialVersionUID=1L;
	
	//Ŭ���� �⺻ ������
	public Q1() {
		super();
	}
	
	//HttpServletRequest�� Ŭ���̾�Ʈ�� ��û, HttpServletResponse�� Ŭ�󸮾�Ʈ���� ��û�� ó�� ����� ���� ������ ���� ���
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	throws ServletException,IOException{
		String name=request.getParameter("name");
		String phone=request.getParameter("phone");
		String address=request.getParameter("address");
		
		//�������� text or html���� ����
		response.setContentType("text/html;charset=UTF-8");
		
		//�������� ����� ��û�� ���� ������ ���� �� �ν��Ͻ��� ��� ó��
		PrintWriter out=response.getWriter();
		
		//��û ���� ������ ������ ǥ���ϱ� ���� ����
		out.println("NAME="+name+"<br>");
		out.println("PHONE="+phone+"<br>");
		out.println("ADDRESS="+address+"<br>");
		
	}
}





