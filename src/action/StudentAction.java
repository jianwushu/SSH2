package action;

import com.opensymphony.xwork2.ActionContext;
import entity.DormitoryEntity;
import entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import service.DormitoryService;
import service.StudentService;

import java.util.List;
import java.util.Map;

@Controller
@Scope("prototype")
public class StudentAction {
    private StudentEntity studentEntity;
    private DormitoryEntity dormitoryEntity;
    @Autowired
    @Qualifier("studentServiceImpl")
    private StudentService studentService;
    @Autowired
    @Qualifier("dormitoryServiceImpl")
    private DormitoryService dormitoryService;
    public String profile(){
        return "profile";
    }
    public String updateSelf(){
        studentEntity.setRoom(dormitoryEntity);
        studentService.updateStudent(studentEntity);
        Map session = ActionContext.getContext().getSession();
        session.put("studentEntity",studentEntity);
        session.put("dormitoryEntity",dormitoryEntity);
        return "updateSelf";
    }
    public String update(){
        DormitoryEntity dormitoryEntity1 = dormitoryService.find(dormitoryEntity.getDormitoryName(),dormitoryEntity.getRoomNumber());
        if(dormitoryEntity1!=null){
            studentEntity.setRoom(dormitoryEntity1);
        }else {

            studentEntity.setRoom(dormitoryEntity);
        }
        studentService.updateStudent(studentEntity);
        return "update";
    }
    public String delete(){
        studentService.deleteStudent(studentEntity);
        return "delete";
    }
    public String add(){
        if(studentEntity.getStuName()!="" && studentEntity.getStuNumber()!= null ) {
            DormitoryEntity dormitoryEntity1 = dormitoryService.find(dormitoryEntity.getDormitoryName(),dormitoryEntity.getRoomNumber());
            if(dormitoryEntity1!=null) {
                studentEntity.setRoom(dormitoryEntity1);
            }else{
                studentEntity.setRoom(dormitoryEntity);
            }
            studentService.addStudent(studentEntity);
            return "add";
        }
        return "error";
    }
    public String findAll(){
        List<StudentEntity> studentList = null;
        studentList = studentService.find();
        Map session = ActionContext.getContext().getSession();
        session.put("studentList",studentList);
        return "findAll";
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
