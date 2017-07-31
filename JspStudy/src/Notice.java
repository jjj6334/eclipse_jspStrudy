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
		
		out.println("<html><head><title>공지사항</title></head>");
		out.println("<body");	
		out.println("<h2>공지사항</h2>");
		
		String fileName = "";//불러올 파일명을 저장
		Calendar cal = Calendar.getInstance();
		fileName+= cal.get(Calendar.YEAR);//2017년 구하기
		fileName+= cal.get(Calendar.MONTH)+1;//현재 달 불러오기. 20177
		fileName+= cal.get(Calendar.DATE);//현재 날짜 불러오기. 201777
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
			System.out.println("오늘 공지사항이 없습니다");
		}
		out.println("<p align = center>");
		out.println("<hr>");
		out.println("<input type = 'submint' value='창닫기' onclick='window.close()'> ");
		
		out.println("</body>");
		out.println("</html>");
		
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		out.println("이름:"+name+"<br/>");
		out.println("주소"+addr+"<br/>");
		out.println("</body>");
		out.println("</html>");	
	}

}
