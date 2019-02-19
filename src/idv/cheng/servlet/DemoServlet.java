package idv.cheng.servlet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import idv.cheng.testC.People;

@WebServlet("/demo")
public class DemoServlet extends HttpServlet {
	private People people;
	private People people2;

	public void init() throws ServletException {
		WebApplicationContext wac = WebApplicationContextUtils.getRequiredWebApplicationContext(getServletContext());
		people = wac.getBean("peo", People.class);
		people2 = wac.getBean("peo", People.class);
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("people1" + people);
		System.out.println("people2" + people2);
	}

	// @Override
	// protected void service(HttpServletRequest request, HttpServletResponse
	// response)
	// throws ServletException, IOException {
	// ServletOutputStream os = response.getOutputStream();
	// InputStream is = new FileInputStream(new
	// File(getServletContext().getRealPath("images"), "goodNight.jpg"));
	// for (int i = 0; (i = is.read()) != -1;) {
	// os.write(i);
	// }
	// }

}
