package conversionservlet;

import java.io.IOException;
import java.io.PrintWriter;
 
import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import org.osgi.util.measurement.*;

@WebServlet("/ConversionServlet") //http://localhost:8080/ConversionServlet
public class ConversionServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
 
		// read form fields
        double value = Float.parseFloat(request.getParameter("value"));
        String from_unit = request.getParameter("from_unit");
        String to_unit = request.getParameter("to_unit");
 
        // calculate new value
        UnitConverter conv = new UnitConverter(from_unit, to_unit, value);
        double newValue = conv.convert();
        
        // get response writer
        PrintWriter writer = response.getWriter();
        
    	String htmlResponse = "";

        if (newValue == -1) {
        	htmlResponse = "<html>";
            htmlResponse += "<h2>" + "Unknown unit, cannot convert!" + "</h2>";
            htmlResponse += "</html>";

        }
        else {
            // build HTML code
        	htmlResponse = "<html>";
            htmlResponse += "<h2>" + value + " " + from_unit +" is " + newValue + to_unit + "</h2>";   
            htmlResponse += "</html>";
        }
         
        // return response
        writer.println(htmlResponse);
 
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
        // get response writer
        PrintWriter writer = response.getWriter();
        
        // build HTML code
		String htmlResponse = "<html>";
		htmlResponse +=	"<form name=\"conversionForm\" method=\"post\" action=\"conversionServlet\">"; 
		htmlResponse +=	" Value: <input type=\"number\" name=\"value\"/>"; 
		htmlResponse +=	" From unit: <input type=\"text\" name=\"from_unit\"/>";
		htmlResponse +=	" To unit: <input type=\"text\" name=\"to_unit\"/>"; 
		htmlResponse +=	" <input type=\"submit\" value=\"Convert\" /></form>";
		htmlResponse +=	"</html>";
         
        // return response
        writer.println(htmlResponse);
	}
	
	double Converter(double value, Unit from_unit, Unit to_unit) {
		Measurement m = new Measurement(value, from_unit);
		return 0.2;
	}
	
}
