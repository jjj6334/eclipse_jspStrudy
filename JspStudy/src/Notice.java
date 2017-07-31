import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Notice
 */
@WebServlet("/Notice")
public class Notice extends HttpServlet {

	protected void doGet(HttpServletRequest request, 
			             HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<html><head><title>��������</title></head>");
		out.println("<body");	
		out.println("<h2>��������</h2>");
		
		String fileName = "";//�ҷ��� ���ϸ��� ����
		Calendar cal = Calendar.getInstance();
		fileName+= cal.get(Calendar.YEAR);//2017�� ���ϱ�
		fileName+= cal.get(Calendar.MONTH)+1;//���� �� �ҷ�����. 20177
		fileName+= cal.get(Calendar.DATE);//���� ��¥ �ҷ�����. 201777
		fileName+= ".txt";//201777.txt
		
		String realPath = "C:\\webtest\\4.jsp\\sou\\JspStudy\\WebContent\\notice\\"+fileName;
		System.out.println("realPath:"+realPath);
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(realPath));
			
			String line="";
			
			while((line=br.readLine())!=null) {
				out.println(line);
			}
			br.close();
		} catch(Exception e) {
			System.out.println("���� ���������� �����ϴ�");
		}
		out.println("<p align = center>");
		out.println("<hr>");
		out.println("<input type = 'submint' value='â�ݱ�' onclick='window.close()'> ");
		
		out.println("</body>");
		out.println("</html>");
		
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		out.println("�̸�:"+name+"<br/>");
		out.println("�ּ�"+addr+"<br/>");
		out.println("</body>");
		out.println("</html>");	
	}

}
