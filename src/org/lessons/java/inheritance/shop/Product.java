package org.lessons.java.inheritance.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Product {

    //ATTRIBUTI
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private BigDecimal vat;



    //COSTRUTTORI

    public Product(String name, String description, BigDecimal price, BigDecimal vat){


        code = generateCode();
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;

    }
    //GETTER AND SETTER
    public int getCode() {
        return code;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getVat() {
        return vat;
    }

    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    //METODI
    //prezzo con iva
    public BigDecimal getFullPrice(){
        BigDecimal vatOnPrice = price.multiply(vat);
        return price.add(vatOnPrice).setScale(2, RoundingMode.HALF_EVEN);
    }
    //nome + codice
    public String getFullName(){
        return code + " " + name;
    }

    //numero random codice
    private int generateCode(){
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(1000, 100000);
    }

}

