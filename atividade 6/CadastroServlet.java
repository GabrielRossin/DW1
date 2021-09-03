package edu.ifsp.lojinha;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/cadastrar")
public class CadastroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String nome = request.getParameter("nome");
		String email = request.getParameter("email");
		
		PrintWriter writer = response.getWriter();
        writer.println("<!DOCTYPE html> <html><head></head><body>");
        writer.append("<h2> Cadastro realizado com sucesso</h2>");
        writer.append("<h3>Dados cadastrados</h3>");
        writer.append("<p> Nome: " + nome).append("</p>");
        writer.append("<p> Email:" + email).append("</p>");


	}

}
