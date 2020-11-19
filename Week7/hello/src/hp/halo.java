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

   //get 메소드 방식의 데이터 전달
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
      response.setContentType("text/html;charset=UTF-8");
      PrintWriter out = response.getWriter();
      out.println("<html>" + "<body>" + "<h1>XML에서 Servlet URL mapping 하기</h1>" + "</body>" + "</html>");
   }//post 방식의 데이터 전달이나 함수 내에 get을 사용함으로써 post 방식으로 요청해도 get으로 전달
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
      doGet(request, response);
   }

}