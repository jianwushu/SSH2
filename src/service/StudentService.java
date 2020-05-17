package service;

import entity.StudentEntity;

import java.util.List;

public interface StudentService {
    public void addStudent(StudentEntity studentEntity);
    public void deleteStudent(StudentEntity studentEntity);
    public void updateStudent(StudentEntity studentEntity);
    public void updateStudent(Integer roomId);
    public List<StudentEntity> find();
    public StudentEntity find(Integer stuId);
    public StudentEntity find(long stuNumber);
    public StudentEntity find(long stuNumber, String stuName);
    public StudentEntity find(String stuName, String stuPassword);
}
