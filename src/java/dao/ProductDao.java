/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;
import model.Product;
import context.DBcontext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Account;
import model.Category;

/**
 *
 * @author Admin
 */
public class ProductDao extends DBcontext {

    public List<Product> getAllProduct() {
        List<Product> li = new ArrayList<>();
        String sql = "select * from Maidddd";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9));
                li.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return li;
    }

    public List<Product> getCategoryId(int categoryId) {

        List<Product> li = new ArrayList<>();
        String sql = "select * from Maidddd where Maidddd.category_id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, categoryId);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9));
                li.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return li;
    }

    public Product getPoroductId(int Id) {

        String sql = "select * from Maidddd where id = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, Id);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                return new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9));

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;

    }

    public List<Product> getSearchByName(String search) {
        List<Product> li = new ArrayList<>();
        String sql = "select * from Maidddd where [name] like ? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, "%" + search + "%");
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9));
                li.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return li;
    }

    public Account login(String user, int pass) {

        String sql = "select * from Accc where username =? and pass =? ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            st.setInt(2, pass);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;

    }

    public Account checkUser(String user) {

        String sql = "select * from Accc where username =?  ";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);

            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                return new Account(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getInt(5));

            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;

    }

    public void AddAcc(String user, int pass) {

        try {
            String sql = "insert into Accc values(?,?,0,0) ";
            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, user);
            st.setInt(2, pass);
            st.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public List<Product> getsellId(int Id) {

        List<Product> li = new ArrayList<>();
        String sql = "select * from Maidddd where sellId = ?";
        try {
            PreparedStatement st = connection.prepareStatement(sql);
            st.setInt(1, Id);
            ResultSet rs = st.executeQuery();

            while (rs.next()) {
                Product p = new Product(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8), rs.getInt(9));
                li.add(p);
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return li;
    }

    public void deletePro(String id) {

        String sql = "delete from Maidddd where id =? ";

        try {

            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, id);

            st.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void AddPro(String name, String dateOfBird, String homeTown, String experience, String image, String areaWork, int cate, int id) {

        String sql = "INSERT [dbo].[Maidddd] \n"
                + "([name], [dateOfBird], [homeTown], [experiencen], [image], [areaWork], [category_id], [sellID])\n"
                + "VALUES(?,?,?,?,?,?,?,?)";

        try {

            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, name);
            st.setString(2, dateOfBird);
            st.setString(3, homeTown);
            st.setString(4, experience);
            st.setString(5, image);
            st.setString(6, areaWork);
            st.setInt(7, cate);
            st.setInt(8, id);
            st.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void editPro(String name, String dateOfBird, String homeTown, String experience, String image, String areaWork, int cate, String Id) {

        String sql = "UPDATE [dbo].[Maidddd]\n"
                + "set [name] = ?,\n"
                + "[dateOfBird] = ?,\n"
                + "[homeTown] = ?,\n"
                + "[experiencen] = ?,\n"
                + "[image] = ?,\n"
                + "[areaWork] = ?,\n"
                + "[category_id] = ?\n"
                
                + "where id = ?";

        try {

            PreparedStatement st = connection.prepareStatement(sql);
            st.setString(1, name);
            st.setString(2, dateOfBird);
            st.setString(3, homeTown);
            st.setString(4, experience);
            st.setString(5, image);
            st.setString(6, areaWork);
            st.setInt(7, cate);
            st.setString(8, Id);
            st.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}
