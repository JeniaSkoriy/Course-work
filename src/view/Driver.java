/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import logic.SortAndFind;
import static logic.SortAndFind.calculateTotalPrice;
import static logic.SortAndFind.findEquipment;
import model.Equipment;
import model.Helmet;
import model.Jacket;
import model.Men;

/**
 *
 * @author ImmolateImprove
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    static ArrayList<Equipment> equipmentList = new ArrayList<>();
    static ArrayList<Men> menList = new ArrayList<>();
    static ArrayList<Equipment> helmets = new ArrayList<>();
    static ArrayList<Equipment> jackets = new ArrayList<>();

    public static void main(String[] args) {
        Men jacky = new Men("Jacky");
        menList.add(jacky);
        Men stas = new Men("Stas");
        menList.add(stas);
        Men lol = new Men("Lol");
        menList.add(lol);

        Equipment varHelmet = new Equipment(10, 44, "varHelmet", "Jacky");
        equipmentList.add(varHelmet);
        Equipment coldHelmet = new Equipment(115, 47, "coldHelmet", "Stas");
        equipmentList.add(coldHelmet);
        Equipment fireHelmet = new Equipment(110, 40, "fireHelmet", "Lol");
        equipmentList.add(fireHelmet);

        Equipment varJacket = new Equipment(1100, 100, "varJacket", "Jacky");
        equipmentList.add(varJacket);
        Equipment coldJacket = new Equipment(499, 0.5, "coldJacket", "Stas");
        equipmentList.add(coldJacket);
        Equipment fireJacket = new Equipment(228, 50, "fireJacket", "Lol");
        equipmentList.add(fireJacket);

        System.out.println("Список людей");
        for (Men el : menList) {
            System.out.println(el.getNameMoto() + "   ");
        }

        System.out.println("");

        Equipment vHelmet = new Equipment(10, 44, "varHelmet", "Jacky");
        Helmet jacky1 = new Helmet("black");
        vHelmet.setGlassStyle(jacky1);
        helmets.add(vHelmet);

        Equipment cHelmet = new Equipment(115, 47, "coldHelmet", "Stas");
        Helmet jacky2 = new Helmet("white");
        cHelmet.setGlassStyle(jacky2);
        helmets.add(cHelmet);

        Equipment fHelmet = new Equipment(110, 40, "fireHelmet", "Lol");
        Helmet jacky3 = new Helmet("blue");
        fHelmet.setGlassStyle(jacky3);
        helmets.add(fHelmet);

        Equipment vJacket = new Equipment(1100, 100, "varJacket", "Jacky");
        Jacket jacky4 = new Jacket(2);
        vJacket.setPockedCount(jacky4);
        jackets.add(vJacket);

        Equipment cJacket = new Equipment(499, 0.5, "coldJacket", "Stas");
        Jacket jacky5 = new Jacket(4);
        cJacket.setPockedCount(jacky5);
        jackets.add(cJacket);

        Equipment fJacket = new Equipment(228, 50, "fireJacket", "Lol");
        Jacket jacky6 = new Jacket(6);
        fJacket.setPockedCount(jacky6);
        jackets.add(fJacket);

        System.out.println("Набір шоломів");
        for (Equipment el : helmets) {
            System.out.println(el.getName() + "   ");
        }
        for (int i = 0; i < equipmentList.size(); i++) {
            System.out.println("імя=  " + equipmentList.get(i).getName() + "  ціна=  " + equipmentList.get(i).getPrice() + "  Розмір=  " + equipmentList.get(i).getWeight());
        }
        System.out.println("");
        System.out.println("Підходящє спорядження по ціні");
        System.out.println(Arrays.toString(findEquipment(100, 500, equipmentList)));

        System.out.println("Cписок спорядження відсортованого за ціною");
        SortAndFind.sortWidth(equipmentList);
        for (Equipment el : equipmentList) {
            System.out.println(el.getName());
        }
        
        System.out.println("Загальна ціна=  "+calculateTotalPrice(equipmentList));

    }

}
