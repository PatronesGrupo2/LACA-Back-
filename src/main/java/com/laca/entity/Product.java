package com.laca.entity;

public class Product {
    private int Id;
    private String name;
    private String description;

    public Product() {
    }

    public Product(int Id, String name, String description) {
        this.Id = Id;
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "ID=" + Id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
