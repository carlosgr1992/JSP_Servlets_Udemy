package servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
			
			String usuario = request.getParameter("usuario");
			String contrasena = request.getParameter("contrasena");
			
				//getServletContext().getRequestDispatcher("/postLogin.jsp").forward(request, response);
				System.out.println("Tu nombre es " + request.getParameter("usuario") + " y tu contraseña es " + request.getParameter("contrasena"));
		
				
				//HAY 3 FORMAS DE MOVER LOS PARAMETROS EN UN SERVLET:
				
				//Ambito Request	(son de un solo uso, se eliminan rápido)
				request.setAttribute("usuario", usuario);
				request.setAttribute("contrasena", contrasena);
				
				//Amito Session (duran hasta que el usuario cierre el navegador)
				HttpSession sesion = request.getSession();
				
				sesion.setAttribute("usuario", usuario);
				sesion.setAttribute("contrasena", contrasena);
				
				//Ambito Contexto (duran hasta que hagas un destroy)
				ServletContext contexto = request.getServletContext();
				
				contexto.setAttribute("usuario", usuario);
				contexto.setAttribute("contrasena", contrasena);
				
				// Vamos a postLogin
				getServletContext().getRequestDispatcher("/postLogin.jsp").forward(request, response);
		
		
		}else {
				getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
			}
			

	}

}
