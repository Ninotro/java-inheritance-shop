package org.exercise.shop;

import java.math.BigDecimal;

public class Televisore extends Prodotto{

    private int pollici;
    private boolean smartTV;

    public Televisore(String name, String description, BigDecimal price, BigDecimal iva, int pollici, boolean smartTV) {
        super(name, description, price, iva);
        this.pollici = pollici;
        this.smartTV = smartTV;
    }

    public void setPollici(int pollici) {
        this.pollici = pollici;
    }

    public void setSmartTV(boolean smartTV) {
        this.smartTV = smartTV;
    }

    @Override
    public String toString() {
        String isSmart = "No";
        if (smartTV) {
            isSmart = "Yes";
        }
        return  "Nome " + getName() + "," + " descrizione" + getDescription() + "," + "Prezzo " + entirePrice() + "," +
                "pollici=" + pollici +
                ", smartTV=" + isSmart
                ;
    }
}
