package org.exercise.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{
    String color;
    Boolean isWireless;

    public Cuffie(String name, String description, BigDecimal price, BigDecimal iva, String color, Boolean isWireless) {
        super(name, description, price, iva);
        this.color = color;
        this.isWireless = isWireless;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getWireless() {
        return isWireless;
    }

    public void setWireless(Boolean wireless) {
        isWireless = wireless;
    }

    @Override
    public String toString() {
        String isSmart = "Cablate";
        if (isWireless) {
            isSmart = "Wireless";
        }
        return "Nome " + getName() + "," + " descrizione" + getDescription() + "," + "Prezzo " + entirePrice() + ","  +
                "color='" + color + '\'' +
                ", isWireless=" + isSmart +
                '}';
    }
}
