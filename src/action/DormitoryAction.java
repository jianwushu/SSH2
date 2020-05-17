package action;

import com.opensymphony.xwork2.ActionContext;
import entity.DormitoryEntity;
import entity.StudentEntity;
import service.DormitoryService;
import service.StudentService;

import java.util.List;
import java.util.Map;

public class DormitoryAction {
    private StudentEntity studentEntity;
    private DormitoryEntity dormitoryEntity;
    private StudentService studentService;
    private DormitoryService dormitoryService;
    public String update(){
        dormitoryService.updateDormitory(dormitoryEntity);
        return "update";
    }
    public String delete(){
//        studentService.updateStudent(dormitoryEntity.getRoomId());
        dormitoryService.deleteDormitory(dormitoryEntity);
        return "delete";
    }
    public String add(){
        if(dormitoryEntity.getDormitoryName()!="" && dormitoryEntity.getRoomNumber()!=null) {
            dormitoryService.addDormitory(dormitoryEntity);
            return "add";
        }
        return "error";
    }
    public String findAll(){
        List<DormitoryEntity> dormitoryList = null;
        dormitoryList = dormitoryService.find();
        Map session = ActionContext.getContext().getSession();
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
