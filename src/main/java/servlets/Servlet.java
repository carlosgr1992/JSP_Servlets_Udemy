package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String accion = request.getParameter("accion");
		
		if(accion != null) {
			if(accion.equals("login")) {
				getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
			}else if(accion.equals("inicio")) {
				getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			}
			
				}else {
			getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		}
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String accion = request.getParameter("accion");
		
		if(accion.equals("iniciarSesion")) {
				//getServletContext().getRequestDispatcher("/postLogin.jsp").forward(request, response);
				System.out.println("Tu nombre es " + request.getParameter("usuario") + " y tu contraseña es " + request.getParameter("contrasena"));
			}else {
				getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			}
			

	}

}
