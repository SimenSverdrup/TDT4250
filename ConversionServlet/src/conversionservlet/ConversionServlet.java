package conversionservlet;
import java.io.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.ServletException;
import org.osgi.util.measurement.*;


public class ConversionServlet extends HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
				resp.setContentType("text/plain");
				resp.getWriter().write("Input value: ");
				resp.getWriter().write("\nInput unit: ");
				resp.getWriter().write("\nInput wanted unit: ");
	}
	
	double Converter(double value, Unit from_unit, Unit to_unit) {
		Measurement m = new Measurement(value, from_unit);
		return 0.2;
	}
	
}
