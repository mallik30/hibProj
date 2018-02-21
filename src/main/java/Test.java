
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.mtc.entity.Product;
import com.mtc.util.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Product product = session.get(Product.class,102);
		
		System.out.println("Product Id    : "+product.getId());
		System.out.println("Product Name  : "+product.getName());
		System.out.println("Product Price : "+product.getPrice());
		System.out.println("Product Desc  : "+product.getDescription());
		
		session.close();
		
		sessionFactory.close();

	}

}
