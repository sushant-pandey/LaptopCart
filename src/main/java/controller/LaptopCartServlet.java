package controller;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LaptopDao;
import model.Laptop;

/**
 * Servlet implementation class FoodCartServlet
 */

@WebServlet("/showLaptops")
public class LaptopCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Read Laptop details from DB
		
		LaptopDao dao = new LaptopDao();
		List<Laptop> listOfLaptop = dao.fetchAllLaptops();
//		List<String> listOfLaptop = Arrays.asList("Item1", "Item2", "Item3");
//		String[] listOfLaptop = {"Item1", "Item2", "Item3"};
		request.setAttribute("listOfLaptop", listOfLaptop);
		
		RequestDispatcher rd = request.getRequestDispatcher("showLaptops.jsp");
		rd.forward(request, response);
	}

}
