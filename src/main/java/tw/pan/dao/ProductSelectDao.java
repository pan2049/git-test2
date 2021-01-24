package tw.pan.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

import tw.pan.model.Product;

//@Repository("productSelectDao")
public interface ProductSelectDao extends JpaRepository<Product,Long> {

//	@Autowired
//	private EntityManagerFactory entityManagerFactory;
//	
//	@Bean
//	public Session getSession() {
//		SessionFactory sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
//		Session session = sessionFactory.openSession();
//		return session;
//	}
//	
//	@Bean
//	public EntityManager getEntityManager() {
//		return entityManagerFactory.createEntityManager();
//	}
	
//	public List<Product> selectAll(){
//		String hqlsql = "select p_name,price,p_img from Product";
//		//select p_name,price,p_img from Product;
//		@SuppressWarnings("unchecked")
//		List<Product> pList =(List<Product>) getEntityManager().createQuery(hqlsql).getResultList();
//		System.out.println("GO!!!");
//		return pList;
//		
//	}
	
	// 載入頁面時，顯示全部
	@Query(value="select p_name,price,p_img from Product")
	List<Product> selectAll();
	
	// 查詢大項
	@Query(value="select p_name,price,p_img from Product where p_main = ?1")
	List<Product> selectMain(String p_main);
	
	// 查詢大項 + 小項
	@Query(value="select p_name,price,p_img from Product where p_main = ?1 and p_detail = ?2")
	List<Product> selectMainAndDetail(String p_main,String p_detail);
	
	// 查詢名稱  select * from Product where p_name like '%手工%';
	@Query(value="select p_name,price,p_img from Product where p_name like %?1%")
	List<Product> selectName(String p_name);
	
	
}














