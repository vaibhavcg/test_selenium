package com.practice.corejava;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample {

    @Test
    public void testMethod(){
        int j=0;
        List<Integer> integerList = new ArrayList<>();
        List<Integer> removeList = new ArrayList<>();
        for(int i=0;i<=10;i++){
            integerList.add(i);
        }
        Iterator<Integer> integerIterator = integerList.iterator();
        while(integerIterator.hasNext()){
            j = integerIterator.next();
            if(j%2!=0)
                removeList.add(j);
        }
        integerList.removeAll(removeList);
        System.out.println(integerList);

    }
}
