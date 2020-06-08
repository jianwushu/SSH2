package interceptor;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;
import org.apache.struts2.ServletActionContext;

/**
 * @author ilvyu.cn
 * @version 520.1314
 * @Date 2020/6/8 9:21
 */
public class MyInterceptor extends MethodFilterInterceptor{

    @Override
    protected String doIntercept(ActionInvocation actionInvocation) throws Exception {
        System.out.println("拦截中");
        Object entity = ServletActionContext.getRequest().getSession().getAttribute("studentEntity");
        if(entity!=null){
            return actionInvocation.invoke();
        }
        return "login";
    }
}
