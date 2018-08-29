package com.test.sevlet;

import com.test.myejb.AddBean;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dhanushka
 */
@WebServlet(name = "AddServlet", urlPatterns = {"/AddServlet"})
public class AddServlet extends HttpServlet {
  
    @EJB
    AddEjb obj;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
       PrintWriter out = response.getWriter();//need this to print on client machine
       
       int i = Integer.parseInt(request.getParameter("n1"));
       int j = Integer.parseInt(request.getParameter("n2"));
       
     //  AddBean obj = new AddBean();
     //using ejb we can prevent from creating objects
       obj.setI(i);
       obj.setJ(j);
       
       obj.add();
       
       out.println("new Addition EJB is: "+ obj.getK());
    }


}
