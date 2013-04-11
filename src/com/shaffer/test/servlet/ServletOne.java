package com.shaffer.test.servlet;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.google.gson.*;
import com.shaffer.test.model.Person;


@WebServlet("/ServletOne")
public class ServletOne extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
       
    public ServletOne() 
    {
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Person ret = new Person("Bob","Smith");
		String objRet = new Gson().toJson(ret);
		response.getWriter().print(objRet);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		InputStreamReader isr = new InputStreamReader(request.getInputStream());
		Person personIn = new Gson().fromJson(isr, Person.class);
		try 
		{
			savePerson(personIn);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		Person personOut = new Person("Mike","Shaffer");
		String objRet = new Gson().toJson(personOut);
		response.getWriter().print(objRet);
	}
	private void savePerson(Person newPerson) throws Exception
	{
		System.out.println("Here's who we're saving:");
		System.out.println(newPerson.getFirstName() + " " + newPerson.getLastName());
		if(newPerson.getFirstName().equals("Mike"))
		{
			//throw new Exception("not allowed");
		}
	}
}
