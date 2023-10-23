package org.exercise.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Prodotto {
    private long IMEIcode;
    private int memoryCapacity;




    public Smartphone(String name, String description, BigDecimal price, BigDecimal iva,  int memoryCapacity) {
        super(name, description, price, iva);
        this.IMEIcode = ImeiCode();
        this.memoryCapacity = memoryCapacity;
    }

    private int  ImeiCode() {
        Random randomGenerator1 = new Random();
        int randomNumber = randomGenerator1.nextInt(10000000, 99999999);
        return randomNumber;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
    }

    @Override
    public String toString() {
        return "Nome " + getName() + "," + " descrizione" + getDescription() + "," + "Prezzo " + entirePrice() + ","  +
                "IMEIcode=" + IMEIcode +
                ", memoria in GB=" + memoryCapacity
                ;
    }
}
