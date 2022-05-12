package main;


import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

import com.opensymphony.xwork2.ActionSupport;

public class logout extends ActionSupport implements SessionAware {
    private Map<String, Object> session;

    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public String execute() {
        session.get("userid");
        session.remove("username");
        session.remove("role");

        return "success";
    }
}
