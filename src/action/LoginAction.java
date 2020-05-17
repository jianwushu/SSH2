package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import entity.DormitoryEntity;
import entity.StudentEntity;
import service.DormitoryService;
import service.LoginService;
import java.util.Map;

public class LoginAction extends ActionSupport{
    private StudentEntity studentEntity;
    private LoginService loginService;
    private DormitoryService dormitoryService;
    public String execute() throws Exception{
        if(studentEntity.getStuName()=="" || studentEntity.getStuPassword()==""){
            addFieldError("studentEntity.stuName","用户名或密码不能为空");
            return ERROR;
        }else {
            StudentEntity studentEntity1 = loginService.find(studentEntity.getStuName(), studentEntity.getStuPassword());
            if (studentEntity1 != null) {
                DormitoryEntity dormitoryEntity = studentEntity1.getRoom();
                Map session = ActionContext.getContext().getSession();
                session.put("studentEntity", studentEntity1);
                session.put("dormitoryEntity", dormitoryEntity);
                return SUCCESS;
            } else {
                addFieldError("studentEntity.stuName","用户名或密码错误");
                return ERROR;
            }
        }

    }
    public String logout(){
        Map session = ActionContext.getContext().getSession();
        session.remove("studentEntity");
        session.remove("dormitoryEntity");
        return SUCCESS;
    }
    public StudentEntity getStudentEntity() {
        return studentEntity;
    }

    public void setStudentEntity(StudentEntity studentEntity) {
        this.studentEntity = studentEntity;
    }

    public LoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    public String admin(){
        System.out.println("登录操作");
        Map session = ActionContext.getContext().getSession();
        if(session.get("studentEntity") == null)
        {
            return "error";
        }else {
            return "success";
        }
    }
}
