package com.example.novelsproject.dao;

import com.example.novelsproject.Model.Category;
import com.example.novelsproject.db.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class CategoryDao {
    ConnectionDB connectionDB= new ConnectionDB();
    String z = "";
    ResultSet rs;
    Connection con = connectionDB.CONN();
    final ArrayList list = new ArrayList();
    public ArrayList getListCategory() {
        try {
            PreparedStatement statement = con.prepareStatement("select * from Category");
            rs = statement.executeQuery();
            while (rs.next()) {
                    list.add(rs.getString("Name"));
            }
        } catch (Exception ex) {
            z = "Exception";
        }
        return list;
    }


}
