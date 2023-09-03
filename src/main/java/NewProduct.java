

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.ecommerce.EProductEntity;
import com.ecommerce.HibernateUtil;

/**
 * Servlet implementation class NewProduct
 */
public class NewProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public NewProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("deprecation")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession();
		Transaction transaction=session.beginTransaction(); //Used only to Update/Insert/Delete
															//Not required for Read
		
		boolean isNumber=true;
		
		try {
			double test=Double.parseDouble(request.getParameter("price"))/10;
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			isNumber=false;
		}		
		
		
		if (isNumber) {
			EProductEntity epe = new EProductEntity();
			epe.setpName(request.getParameter("pName"));
			epe.setpPrice(BigDecimal.valueOf((Double.parseDouble(request.getParameter("price")))));
			epe.setDateAdded(new Date());
			epe.setpHDD(request.getParameter("hdd"));
			epe.setpCPU(request.getParameter("cpu"));
			epe.setpRAM(request.getParameter("ram"));
//			session.save(epe);
			session.persist(epe);
			transaction.commit();  // VVI: Must if we are required to Update/Insert/Delete
			
			List<EProductEntity> list = session.createQuery("FROM EProductEntity").list();
			
			session.close();
			
			 PrintWriter out = response.getWriter();
			 out.println("<html><body>");
			 out.println("<b>Record Added Successfully!!</b><br><br>");
			 out.println("<b>Updated Product List</b><br><br><table>");
			 for(EProductEntity p: list) {
				 out.println("<tr><td>ID: " + String.valueOf(p.getID()) + "</td><td> Name: " + p.getpName() +
					"</td><td> Price: " + String.valueOf(p.getpPrice()) + "</td><td> Date Added: " + p.getDateAdded().toString() +
					"</td><td> HDD: " + p.getpHDD() + "</td><td> CPU: " + p.getpCPU() + "</td><td> RAM: " + p.getpRAM()+"<br></td></tr>");
			 }			 
			 out.println("</table></body></html>");
		}
			
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
