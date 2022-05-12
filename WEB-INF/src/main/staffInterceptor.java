package main;

import java.util.Map;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;


public class staffInterceptor implements Interceptor {

    public void init(){

    }
    public void destroy(){

    }

    public String intercept(ActionInvocation actionInvocation) throws Exception {
        Map<String, Object> s = actionInvocation.getInvocationContext().getSession();
        String userrole = (String) s.get("role");
        
        if(userrole == null) return "loginAction";

        if (userrole.equals("staff")) {
            return actionInvocation.invoke();
        }


        return "loginAction";
    }
}
