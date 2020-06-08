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
public class DormitoryAction {
    private StudentEntity studentEntity;
    private DormitoryEntity dormitoryEntity;
    @Autowired
    @Qualifier("studentServiceImpl")
    private StudentService studentService;
    @Autowired
    @Qualifier("dormitoryServiceImpl")
    private DormitoryService dormitoryService;
    public String update(){
        dormitoryService.updateDormitory(dormitoryEntity);
        return "update";
    }
    public String delete(){
        studentService.updateStudent(dormitoryEntity.getRoomId());
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
