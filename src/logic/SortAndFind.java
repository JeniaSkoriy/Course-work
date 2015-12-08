/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;
import model.Equipment;

/**
 *
 * @author ImmolateImprove
 */
public class SortAndFind {

    public static String[] findEquipment(int min, int max, ArrayList<Equipment> arr) {
        String[] s = new String[arr.size()];
        for (int j = 0; j < arr.size(); j++) {
            if (arr.get(j).getPrice() > min && arr.get(j).getPrice() < max) {
                s[j] = arr.get(j).getName();

            }
        }
        int count = 0;
        for (String item : s) {
            if (item != null) {
                count++;
            }
        }
        String[] s1 = new String[count];
        int x = 0;
        for (int j = x; j < s.length; j++) {
            if (s[j] != null) {
                s1[x] = s[j];
                x++;
            }
        }
        return s1;
    }

    public static void sortWidth(ArrayList<Equipment> arr1) {
        for (int i = 0; i < arr1.size(); i++) {
            for (int j = 0; j < arr1.size() - i - 1; j++) {
                if (arr1.get(j).getWeight() > arr1.get(j + 1).getWeight()) {
                    Equipment t = arr1.get(j);
                    arr1.set(j, arr1.get(j + 1));
                    arr1.set(j, t);
                }
            }
        }
    }

    public static double calculateTotalPrice(ArrayList<Equipment> arr1) {
        double totalPrice = 0;
        for (Equipment spec : arr1) {
            totalPrice += spec.getPrice();
        }
        return totalPrice;
    }
}
