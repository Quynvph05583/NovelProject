package com.example.novelsproject.dao;

import com.example.novelsproject.Model.Stories;
import com.example.novelsproject.db.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StoriesDao {
    ConnectionDB connectionDB= new ConnectionDB();
    String z = "";
    ResultSet rs;
    Connection con = connectionDB.CONN();
    final ArrayList list = new ArrayList();
    public ArrayList getListStories() {
        try {
            PreparedStatement statement = con.prepareStatement("select * from product");
            rs = statement.executeQuery();
            while (rs.next()) {
                list.add(rs.getString("thumbnail"));
                list.add(rs.getString("name"));
            }
        } catch (Exception ex) {
            z = "Exception";
        }
        return list;
    }
}
