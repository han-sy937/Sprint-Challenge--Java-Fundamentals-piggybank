package com.lambdaschool.piggybank.models;

import javax.persistence.*;

@Entity
@Table(name = "coins")
public class Coin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    //coinid, name, nameplural, value, quantity
    private long coinid;
    private String name;
    private String nameplural;
    private double value;
    private int quantity;

    public Coin() {
    }

    public Coin(long coinid, String name, String nameplural, double value, int quantity) {
        this.coinid = coinid;
        this.name = name;
        this.nameplural = nameplural;
        this.value = value;
        this.quantity = quantity;
    }

    public long getCoinid() {
        return coinid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameplural() {
        return nameplural;
    }

    public void setNamePlural(String nameplural) {
        this.nameplural = nameplural;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "coinid=" + coinid +
                ", name='" + name + '\'' +
                ", namePlural='" + nameplural + '\'' +
                ", value=" + value +
                ", quantity=" + quantity +
                '}';
    }
}
