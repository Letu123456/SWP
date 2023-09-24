/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Category;
        import context.DBcontext;

/**
 *
 * @author Admin
 */
public class CategoryDao extends DBcontext{

    public List<Category> getAllCatego() {
        List<Category> li = new ArrayList<>();
        String sql = "select * from categg";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Category s = new Category(rs.getInt(1), rs.getString(2));
                li.add(s);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return li;
    }
    }
    

