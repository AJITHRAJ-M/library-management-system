package main;

import java.util.Map;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;


public class loginInterceptor {
    public void init() {
        // init method.
    }

    public void destroy() {
        // destroy method.
    }

    public String intercept(ActionInvocation actionInvocation) throws Exception {
        Map<String, Object> session = actionInvocation.getInvocationContext().getSession();
        String username = (String) session.get("username");
        String role = (String) session.get("role");

        if (username == null) {
            return "loginAction";
        }
        return actionInvocation.invoke();
}
}
