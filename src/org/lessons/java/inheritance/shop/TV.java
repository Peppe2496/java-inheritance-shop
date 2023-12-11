package org.lessons.java.inheritance.shop;

import java.math.BigDecimal;

public class TV extends Product{

    private int screenSize;
    private boolean smart;
    public TV(String name, String description, BigDecimal price, BigDecimal vat, int screenSize, boolean smart) {
        super(name, description, price, vat);
        this.screenSize = screenSize;
        this.smart = smart;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }
}
