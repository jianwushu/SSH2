package service;

import dao.StudentDao;
import entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public void addStudent(StudentEntity studentEntity) {
        studentDao.addStudent(studentEntity);
    }

    @Override
    public void deleteStudent(StudentEntity studentEntity) {
        studentDao.deleteStudent(studentEntity);
    }

    @Override
    public void updateStudent(StudentEntity studentEntity) {
        studentDao.updateStudent(studentEntity);
    }

    @Override
    public void updateStudent(Integer roomId) {
        studentDao.updateStudent(roomId);
    }

    @Override
    public List<StudentEntity> find() {
        return studentDao.find();
    }

    @Override
    public StudentEntity find(Integer stuId) {
        return studentDao.find(stuId);
    }

    @Override
    public StudentEntity find(long stuNumber) {
        return studentDao.find(stuNumber);
    }

    @Override
    public StudentEntity find(long stuName, String stuNumber) {
        return studentDao.find(stuName,stuNumber);
    }

    @Override
    public StudentEntity find(String stuName, String stuPassword) {
        return studentDao.find(stuName,stuPassword);
    }
}
