package com.gml.module;

/**
 * @program: TestServlet
 * @description:
 * @author: Mr.Gml
 * @create: 2020-07-08 22:45
 **/
public class User {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private Integer id;

    private String username;

    private String password;


}
