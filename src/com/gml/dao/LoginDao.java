package com.gml.dao;

import com.gml.module.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @program: TestServlet
 * @description:
 * @author: Mr.Gml
 * @create: 2020-07-08 22:17
 **/
public class LoginDao {
    Connection connection=null;
    PreparedStatement ps=null;

    public User selectUserIofo(String username)  {
        User user=new User();
        try {
            DataSource ds = new ComboPooledDataSource();
            connection = ds.getConnection();
            String sql="select  * from user where username=?";
            ps=connection.prepareStatement(sql);
            ps.setString(1,username);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
//            connection.close();
//            ps.close();
        }
        return user;

    }
}
