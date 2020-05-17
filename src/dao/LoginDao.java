package dao;

import entity.StudentEntity;

public interface LoginDao {
    public StudentEntity find(String stuName, String stuPassword);
    public StudentEntity find(long stuNumber, String stuPassword);
}
