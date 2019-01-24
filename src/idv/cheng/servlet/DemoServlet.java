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

@WebServlet("/demo")
public class DemoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		ServletOutputStream os = response.getOutputStream();
		InputStream is = new FileInputStream(new File(getServletContext().getRealPath("images"), "goodNight.jpg"));
		for (int i = 0; (i = is.read()) != -1;) {
			os.write(i);
		}
	}

}
