package hp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;


@WebServlet("/halo")
public class halo extends HttpServlet {
   private static final long serialVersionUID = 1L;
       
   
    public halo() {
        super();
        
    }

   //get �޼ҵ� ����� ������ ����
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
      out.println("<html>" + "<body>" + "<h1>XML���� Servlet URL mapping �ϱ�</h1>" + "</body>" + "</html>");
   }//post ����� ������ �����̳� �Լ� ���� get�� ��������ν� post ������� ��û�ص� get���� ����
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
      doGet(request, response);
   }

}