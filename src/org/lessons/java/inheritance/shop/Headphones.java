package org.lessons.java.inheritance.shop;

import java.math.BigDecimal;

public class Headphones extends Product{
    private String color;
    private boolean wired;
    public Headphones(String name, String description, BigDecimal price, BigDecimal vat, String color, boolean wired) {
        super(name, description, price, vat);
        this.color = color;
        this.wired = wired;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWired() {
        return wired;
    }

    public void setWired(boolean wired) {
        this.wired = wired;
    }
}
