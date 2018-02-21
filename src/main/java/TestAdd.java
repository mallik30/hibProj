import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.mtc.entity.Product;
import com.mtc.util.HibernateUtil;

public class TestAdd {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Product product = new Product();
		
		product.setId(228);
		product.setName("Blackberry");
		product.setPrice(2000);
		product.setDescription("Mobile");
		
		Transaction transaction = session.getTransaction();
		
		transaction.begin();
		
			session.save(product);
			
		transaction.commit();
		
		session.close();
		
		sessionFactory.close();
	}

}
