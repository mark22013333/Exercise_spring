package idv.cheng.servlet;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/validCode")
public class ValidCodeServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BufferedImage image = new BufferedImage(200, 100, BufferedImage.TYPE_INT_RGB);

		Graphics2D graphics2d = image.createGraphics();
		graphics2d.setColor(Color.WHITE);
		graphics2d.fillRect(0, 0, 200, 100);
		List<Integer> randList = new ArrayList<>();
		Random random = new Random();
		for (int i = 0; i < 4; i++) {
			randList.add(random.nextInt(10));
		}

		graphics2d.setFont(new Font("Arial", Font.ITALIC | Font.BOLD, 40));
		Color[] colors = new Color[] { Color.red, Color.YELLOW, Color.BLUE, Color.GREEN, Color.PINK, Color.GRAY };
		for (int i = 0; i < randList.size(); i++) {
			graphics2d.setColor(colors[random.nextInt(colors.length)]);
			graphics2d.drawString(randList.get(i) + "", i * 40, 70 + (random.nextInt(21) - 10));
		}

		for (int i = 0; i < colors.length; i++) {
			graphics2d.setColor(colors[random.nextInt(colors.length)]);
			// 把數字畫線
			graphics2d.drawLine(0, random.nextInt(101), 200, random.nextInt(101));
		}
		// graphics2d.drawString("2", 0, 50);
		ServletOutputStream outputStream = resp.getOutputStream();
		ImageIO.write(image, "jpg", outputStream);

		HttpSession session = req.getSession();
		session.setAttribute("code", "" + randList.get(0) + randList.get(1) + randList.get(2) + randList.get(3));
	}

}
