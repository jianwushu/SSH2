package dao;

import entity.StudentEntity;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

@Repository("loginDao")
public class LoginDaoImpl extends BaseDao implements LoginDao{
    @Resource(name="hibernateTemplate")
    private HibernateTemplate hibernateTemplate;
    private StudentDao studentDao;


    @Override
    public StudentEntity find(String stuName, String stuPassword) {
        String hql = "from StudentEntity where stuName = ? and stuPassword = ?";
        List<StudentEntity> list = (List<StudentEntity>) hibernateTemplate.find(hql, stuName,stuPassword);
        if(list.isEmpty()){
            return null;
        }
        return list.get(0);
    }

    @Override
    public StudentEntity find(long stuNumber, String stuPassword) {
        initCtx();
        studentDao = ctx.getBean("studentDao",StudentDao.class);
        return studentDao.find(stuNumber,stuPassword);
    }
}
