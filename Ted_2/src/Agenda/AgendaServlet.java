package Agenda;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AgendaServlet
 */
public class AgendaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgendaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
				//response.getWriter().append("Served at: ").append(request.getContextPath());
				Pessoa p1 = new Pessoa();
				Pessoa p2 = new Pessoa();
				Pessoa p3 = new Pessoa();
				Agenda ag = new Agenda();
				
				p1.setNome(request.getParameter("1nome"));
				p1.setFone1(request.getParameter("1fone1"));
				p1.setFone2(request.getParameter("1fone2"));
				ag.addPessoa(p1);
				
				p2.setNome(request.getParameter("2nome"));
				p2.setFone1(request.getParameter("2fone1"));
				p2.setFone2(request.getParameter("2fone2"));
				ag.addPessoa(p2);
				
				p3.setNome(request.getParameter("3nome"));
				p3.setFone1(request.getParameter("3fone1"));
				p3.setFone2(request.getParameter("3fone2"));
				ag.addPessoa(p3);
				
				
				/*
				PrintWriter out = response.getWriter();
				out.println(ag.imprimeAgenda());
				out.println(ag.imprimeAgenda().getNome());
				out.println(ag.imprimeAgenda().getFone1());
				out.println(ag.imprimeAgenda().getFone2());
				*/
				request.setAttribute("Agenda", ag);
				RequestDispatcher v = request.getRequestDispatcher("/Output.jsp");
				v.forward(request,response);
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
