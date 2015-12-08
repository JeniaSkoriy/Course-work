/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ImmolateImprove
 */
public class Equipment extends Men {

    private double price;
    private double weight;
    private String name;
    private Jacket pockedCount;
    private Helmet glassStyle;

    public Equipment(double price, double weight, String name, String NameMoto) {
        super(NameMoto);
        this.price = price;
        this.weight = weight;
        this.name = name;
    }
    

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jacket getPockedCount() {
        return pockedCount;
    }

    public void setPockedCount(Jacket pockedCount) {
        this.pockedCount = pockedCount;
    }

    public Helmet getGlassStyle() {
        return glassStyle;
    }

    public void setGlassStyle(Helmet glassStyle) {
        this.glassStyle = glassStyle;
    }

}
