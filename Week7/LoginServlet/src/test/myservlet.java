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
	/*get����� �ƴ�post ����� ����ϱ� ���� �ּ�ó��
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		response.sendRedirect("myservlet");
	}*/
	//post ����� ��������
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		request.setCharacterEncoding("UTF-8"); //�ѱ۷ε� ������ �ޱ� ���� UTF-8�� ���ڵ�
		response.setContentType("text/html;charset=UTF-8");
		
		String id=request.getParameter("id");
		String pwd=request.getParameter("pwd");
		
		PrintWriter out=response.getWriter();
		
		//html�±׸� �ڹٷ� �ۼ� �� ���
		out.println("<html>");
		out.println("<head></head>");
		out.println("<body>");
		//��û�� �޾ƿ� ���� ���� �ٸ� ��� ���
		if(id.contentEquals("hong")&&pwd.contentEquals("1234")) {
			out.println("hong"+"���� ����");
		}
		else {
			out.println("���̵� �Ǵ� ��й�ȣ�� �ٽ� Ȯ���ϼ���.");
		}
		out.println("</body>");
		out.println("</html>");     
	}
}
