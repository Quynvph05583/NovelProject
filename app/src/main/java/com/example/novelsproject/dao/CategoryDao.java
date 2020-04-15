package com.example.novelsproject.dao;

import com.example.novelsproject.Model.Category;
import com.example.novelsproject.db.ConnectionDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CategoryDao {
    ConnectionDB connectionDB= new ConnectionDB();
    Connection con = connectionDB.CONN();

    public List<Category> getCategoryList() throws Exception {
        List<Category> list = new ArrayList<>();
        Statement stmt = con.createStatement();
        String sql = "Select * from Category";
        ResultSet rs =stmt.executeQuery(sql);

        while (rs.next()) {
            list.add(new Category(
                    rs.getString("CategoryID"),
                    rs.getString("Name"),
                    rs.getString("Note")
            )
            );
                }
        con.close();
        return list;
    }
}
