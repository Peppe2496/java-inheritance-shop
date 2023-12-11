package org.lessons.java.inheritance.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Product{

    private int codeImei;
    private int ram;

    public Smartphone(String name, String description, BigDecimal price, BigDecimal vat, int ram) {
        super(name, description, price, vat);
        this.ram = ram;
        codeImei = randomCode();
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getCodeImei() {
        return codeImei;
    }
    private int randomCode(){
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1000,100000);
    }
}
