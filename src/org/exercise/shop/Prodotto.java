package org.exercise.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    private int code;
    private String name;
    private String description;
    private BigDecimal price;
    private  BigDecimal iva;



    public Prodotto( String name, String  description, BigDecimal price,BigDecimal  iva) {


        this.code = generateRandomCode();
        this.name = name;
        this.description= description;
        this.price = price;
        this.iva = iva;

    }



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
    public BigDecimal  getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
    public BigDecimal getIva() {
        return iva;
    }
    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }
    public BigDecimal entirePrice() {
        return price.add(price.multiply(iva)).setScale(2, RoundingMode.HALF_EVEN);
    }
    public String getFullName() {
        return code+name ;
    }
    private int  generateRandomCode() {
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(0, 99999999);
        return randomNumber;
    }

    public BigDecimal fidelityCard(boolean fidelity) {

        BigDecimal prezzo = entirePrice();
        if (fidelity) {
            BigDecimal sconto = prezzo.multiply(new BigDecimal("0.02")); // Calcola lo sconto del 2%
            prezzo = prezzo.subtract(sconto);

        }
        return prezzo;
    };


    @Override
    public String toString() {
        return
                "  Nome='" + name + '\'' +
                ", descrizione='" + description + '\'' +
                ", prezzo=" + price +
                ", iva=" + iva
                ;
    }
};