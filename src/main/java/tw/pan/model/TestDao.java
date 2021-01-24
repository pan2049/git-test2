package tw.pan.model;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

//@Repository("testDao")
public class TestDao {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	//@Bean
	public Session getSession() {
		SessionFactory sessionFactory = entityManagerFactory.unwrap(SessionFactory.class);
		Session session = sessionFactory.openSession();
		return session;
	}
	
	public Test select(String name) {
		String tableName = "Test";
		String columnName = "name";
		String hqlsql = String.format("from %s as l where %s =?1", tableName,columnName);
		
		Query<Test> query = getSession().createQuery(hqlsql,Test.class);
		query.setParameter(1, name);
		Test tBean = query.uniqueResult();
		if(tBean != null) {
			tBean.getId();
			tBean.getName();
			System.out.println("This is you need!!!");
			return tBean;
			
		} else {
			System.out.println("No Answer");
			return tBean;
		}
	}
	
	public List<Test> selectAll(){
		String hqlsql = "from Test";
		Query<Test> query = getSession().createQuery(hqlsql,Test.class);
		System.out.println("go1");
		return query.list();
		
	}

}
