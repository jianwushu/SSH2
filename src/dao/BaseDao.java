package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseDao {
    private SessionFactory sessionFactory;
    public SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    public void setSessionFactory(SessionFactory sessionFactory){
        this.sessionFactory =sessionFactory;
    }
    public Session getSession(){
        Session session = sessionFactory.openSession();
        return session;
    }
    protected ClassPathXmlApplicationContext ctx;

    public BaseDao() {
        super();
    }

    public void initCtx() {
        String cfg = "/applicationContext.xml";
        ctx = new ClassPathXmlApplicationContext(cfg);
    }
}
