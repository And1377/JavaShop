package com.app.model;

import java.math.BigDecimal;

public class Tv {
    private long id;
    private String brand;
    private String model;
    private String description;
    private BigDecimal price;
    private short powerConsumptionPerYear;
    private short screenSize;
    private short width;
    private short height;
    private short depth;
    private double weight;
    private String color;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public short getPowerConsumptionPerYear() {
        return powerConsumptionPerYear;
    }

    public void setPowerConsumptionPerYear(short powerConsumptionPerYear) {
        this.powerConsumptionPerYear = powerConsumptionPerYear;
    }

    public short getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(short screenSize) {
        this.screenSize = screenSize;
    }

    public short getWidth() {
        return width;
    }

    public void setWidth(short width) {
        this.width = width;
    }

    public short getHeight() {
        return height;
    }

    public void setHeight(short height) {
        this.height = height;
    }

    public short getDepth() {
        return depth;
    }

    public void setDepth(short depth) {
        this.depth = depth;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
