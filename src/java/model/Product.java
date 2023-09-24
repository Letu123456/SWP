/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Product {

    private int id;
    private String name;
    private String dateOfBird;
    private String homeTown;
    private String experience;
    private String image;
    private String areaWork;
    private int categoryId;
    private int sellId;

    public Product() {
    }

    public Product(int id, String name, String dateOfBird, String homeTown, String experience, String image, String areaWork, int categoryId, int sellId) {
        this.id = id;
        this.name = name;
        this.dateOfBird = dateOfBird;
        this.homeTown = homeTown;
        this.experience = experience;
        this.image = image;
        this.areaWork = areaWork;
        this.categoryId = categoryId;
        this.sellId = sellId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBird() {
        return dateOfBird;
    }

    public void setDateOfBird(String dateOfBird) {
        this.dateOfBird = dateOfBird;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getAreaWork() {
        return areaWork;
    }

    public void setAreaWork(String areaWork) {
        this.areaWork = areaWork;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public int getSellId() {
        return sellId;
    }

    public void setSellId(int sellId) {
        this.sellId = sellId;
    }

}
