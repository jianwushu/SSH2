package service;

import dao.LoginDao;

import entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginDao loginDao;
    @Override
    public StudentEntity find(String stuName,String stuPassword) {
        return loginDao.find(stuName,stuPassword);
    }

    @Override
    public StudentEntity find(long stuNumber, String stuPassword) {
        return loginDao.find(stuNumber,stuPassword);
    }


}
