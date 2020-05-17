package service;

import entity.StudentEntity;

public interface LoginService {
    public StudentEntity find(String stuName, String password);
}