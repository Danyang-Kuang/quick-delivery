package com.mycompany.app;

public class Menu {
    private int Id;
    private String name;
    private int FoodStoreId;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFoodStoreId() {
        return FoodStoreId;
    }

    public void setFoodStoreId(int foodStoreId) {
        FoodStoreId = foodStoreId;
    }
}
