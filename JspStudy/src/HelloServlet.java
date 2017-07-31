import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void init(ServletConfig config) throws ServletException {
		System.out.println("초기값설정");
	}

	public void destroy() {
		System.out.println("메모리 해제");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset = utf-8");
		System.out.println("get방식");
		PrintWriter out = response.getWriter();
		out.println("<html><head></head>");
		out.println("<body>");
		out.println("<table border = 1>");
		
		for (int i = 2; i < 9; i++) {
			out.println("<tr>");
			for(int j = 1 ; j < 10 ; j++) {
				out.println("<td>");
				out.println(""+i+"*"+j+"="+(i*j));
				out.println("<td>");
			}
			out.println("</tr>");
		}
		
		out.println("");
		out.println("");
		out.println("</table>");
		out.println("</body></html>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("post방식");
		
	}

}
