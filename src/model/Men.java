/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ImmolateImprove
 */
public class Men {

    private List<Equipment> list;
    private String NameMoto;

    public Men(String NameMoto) {
        this.NameMoto = NameMoto;
        list = new ArrayList();
    }

    public String getNameMoto() {
        return NameMoto;
    }

    public void setNameMoto(String NameMoto) {
        this.NameMoto = NameMoto;
    }

    public void addEquipment(Equipment item) {
        list.add(item);
    }

    public void removeEquipment(Equipment item) {
        list.remove(item);
    }

}
