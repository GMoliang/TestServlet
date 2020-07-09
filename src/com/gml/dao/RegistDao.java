package com.gml.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * @program: TestServlet
 * @description:
 * @author: Mr.Gml
 * @create: 2020-07-08 22:28
 **/
public class RegistDao {

    Connection connection=null;
    PreparedStatement ps=null;

    public int insertUserIofo(String username,String password)  {
        //标记插入成功失败
        int flag=0;
        try {
            DataSource ds = new ComboPooledDataSource();
            connection = ds.getConnection();
            String sql="insert into user (username,password) values(?,?)";
            ps=connection.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,password);
            flag=ps.executeUpdate();
            System.out.println(flag);
        }catch (Exception ex){
            ex.printStackTrace();
        }finally {
//            connection.close();
//            ps.close();
        }
        return flag;

    }
}
