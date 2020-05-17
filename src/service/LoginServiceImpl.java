package service;

import dao.LoginDao;

import entity.StudentEntity;
import org.springframework.stereotype.Service;


@Service("loginService")
public class LoginServiceImpl implements LoginService {
    private LoginDao loginDao;
    @Override
    public StudentEntity find(String stuName,String stuPassword) {
        return loginDao.find(stuName,stuPassword);
    }

    public LoginDao getLoginDao() {
        return loginDao;
    }

    public void setLoginDao(LoginDao loginDao) {
        this.loginDao = loginDao;
    }
}
