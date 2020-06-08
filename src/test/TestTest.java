package test;

import action.StudentAction;
import dao.DormitoryDao;
import dao.StudentDao;
import entity.DormitoryEntity;
import entity.StudentEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class TestTest extends TestBase{
    private SessionFactory sessionFactory;
    private Session session;
    private Transaction transaction;
    private DormitoryDao dormitoryDao;
    private StudentDao studentDao;
    @Test
    public void creat(){
        Configuration cfg = new Configuration().configure("src/hibernate.cfg.xml");
        SchemaExport se = new SchemaExport(cfg);
        se.create(true, true);
    }
    @Test
    public void connect()  throws SQLException {
        initCtx();
        DataSource ds = ctx.getBean("dataSource",DataSource.class);
        Connection conn = ds.getConnection();
        System.out.println(conn);
        conn.close();
    }
    @Before
    public void initDao(){
        initCtx();
        dormitoryDao = ctx.getBean("dormitoryDao",DormitoryDao.class);
        studentDao = ctx.getBean("studentDao",StudentDao.class);
    }

    @Test

    public void testAdd(){
        DormitoryEntity dormitoryEntity = new DormitoryEntity("南三",112);
        StudentEntity studentEntity = new StudentEntity("王3",201720180002l);
        StudentEntity studentEntity2 = new StudentEntity("王4",201720180005l);
        studentEntity.setRoom(dormitoryEntity);
        studentEntity2.setRoom(dormitoryEntity);
        studentDao.addStudent(studentEntity);
        studentDao.addStudent(studentEntity2);
    }
    /*增*/
    @Test
    public void save() {

    }
    /*删*/
    @Test
    public void delete(){

    }
    /*改*/
    @Test
    public void update(){
        StudentEntity studentEntity = new StudentEntity("王3",20172018005l);
        studentEntity.setStuId(6);
        studentDao.updateStudent(studentEntity);
    }
    /*查*/
    @Test
    public void query(){
    }
    @Test
    public void service1(){
        new StudentAction().findAll();
    }
}