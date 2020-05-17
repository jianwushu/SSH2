package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import entity.StudentEntity;

import java.util.Map;

public class BaseAction extends AbstractInterceptor {

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        Map session = ActionContext.getContext().getSession();
        StudentEntity studentEntity = (StudentEntity) session.get("studentEntity");
        if(studentEntity.getStuId()==null){
            return "login";
        }else {
            return actionInvocation.invoke();
        }
    }
}
