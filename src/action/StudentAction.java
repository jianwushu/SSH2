package action;

import com.opensymphony.xwork2.ActionContext;
import entity.DormitoryEntity;
import entity.StudentEntity;
import service.DormitoryService;
import service.StudentService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentAction {
    private StudentEntity studentEntity;
    private DormitoryEntity dormitoryEntity;
    private StudentService studentService;
    private DormitoryService dormitoryService;
    public String updateSelf(){
        studentEntity.setRoom(dormitoryEntity);
        studentService.updateStudent(studentEntity);
        Map request = (Map) ActionContext.getContext().get("request");
        request.put("success","修改成功");
        Map session = ActionContext.getContext().getSession();
        session.put("studentEntity",studentEntity);
        session.put("dormitoryEntity",dormitoryEntity);
        session.put("success","修改成功");
        return "updateSelf";
    }
    public String update(){
        studentEntity.setRoom(dormitoryEntity);
        studentService.updateStudent(studentEntity);
        return "update";
    }
    public String delete(){
        studentService.deleteStudent(studentEntity);
        return "delete";
    }
    public String add(){
        if(studentEntity.getStuName()!="" && studentEntity.getStuNumber()!= null ) {
            studentEntity.setRoom(dormitoryEntity);
            studentService.addStudent(studentEntity);
            return "add";
        }
        return "error";
    }
    public String findAll(){
        List<StudentEntity> studentList = null;
        List<DormitoryEntity> dormitoryList = new ArrayList<DormitoryEntity>();
        studentList = studentService.find();
        for(StudentEntity stu:studentList){
           dormitoryList.add(stu.getRoom());
        }
        Map session = ActionContext.getContext().getSession();
        session.put("studentList",studentList);
        session.put("dormitoryList",dormitoryList);
        return "findAll";
    }
    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public DormitoryService getDormitoryService() {
        return dormitoryService;
    }

    public void setDormitoryService(DormitoryService dormitoryService) {
        this.dormitoryService = dormitoryService;
    }

    public DormitoryEntity getDormitoryEntity() {
        return dormitoryEntity;
    }

    public void setDormitoryEntity(DormitoryEntity dormitoryEntity) {
        this.dormitoryEntity = dormitoryEntity;
    }

    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }
}
