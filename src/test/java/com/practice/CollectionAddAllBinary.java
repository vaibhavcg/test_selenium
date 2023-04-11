package com.practice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionAddAllBinary {
    @Test
    public void testMethod(){
        List<String> stringList = new ArrayList<>();
        Collections.addAll(stringList,"Shoes","Tyres","Horse","Toys","Grapes");
        Collections.sort(stringList);
        System.out.println(stringList);
        for (String f:stringList){
            System.out.println("Index of "+f+" "+Collections.binarySearch(stringList,f));
        }
        System.out.println(
                "The index of Dog is "
                        + Collections.binarySearch(stringList, "Dog"));

    }
}
