package com.practice.corejava;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {
    @Test
    public void testComparator(){
        Fruits f1 = new Fruits("Mango",101.50,"Yellow",1.25);
        Fruits f2 = new Fruits("Apple",300.50,"Red",2.0);
        Fruits f3 = new Fruits("Banana",150.50,"Yellow",3.0);
        Fruits f4 = new Fruits("Grapes",80.50,"Green",0.5);
        Fruits f5 = new Fruits("Guava",210.50,"Green",1.6);

        List<Fruits> lstFruits = new ArrayList<>();
        lstFruits.add(f1);
        lstFruits.add(f2);
        lstFruits.add(f3);
        lstFruits.add(f4);
        lstFruits.add(f5);

        Collections.sort(lstFruits,new NameComparator());
        System.out.println("Sorting by name");
        for(Fruits fr:lstFruits){//Sorted by name
            System.out.println(fr.getName());
        }
        System.out.println("Sorting by price");
        Collections.sort(lstFruits,new PriceComparator());
        for(Fruits fr:lstFruits){//Sorted by price
            System.out.println(fr.getPrice());
        }
    }
}

class Fruits{
    private String name;
    private Double price;
    private String colour;
    private Double totalWeight;

    public Fruits(String name, Double price, String colour, Double totalWeight) {
        this.name = name;
        this.price = price;
        this.colour = colour;
        this.totalWeight = totalWeight;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public Double getTotalWeight() {
        return totalWeight;
    }
}
class NameComparator implements Comparator<Fruits> {
    @Override
    public int compare(Fruits o1, Fruits o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class PriceComparator implements Comparator<Fruits>{
    @Override
    public int compare(Fruits o1, Fruits o2) {
        if(o1.getPrice()< o2.getPrice())
            return -1;
        if(o1.getPrice()> o2.getPrice())
            return 1;
        else
            return 0;
    }
}

