package dao;

import entity.StudentEntity;

import java.util.List;

public interface StudentDao {
    public void addStudent(StudentEntity studentEntity);
    public void deleteStudent(StudentEntity studentEntity);
    public void updateStudent(StudentEntity studentEntity);
    public void updateStudent(Integer roomId);
    public List<StudentEntity> find();
    public StudentEntity find(Integer stuId);
    public StudentEntity find(long stuNumber);
    public StudentEntity find(long stuName, String stuNumber);
    public StudentEntity find(String stuName, String stuPassword);
}
