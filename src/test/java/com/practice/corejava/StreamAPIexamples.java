package com.practice.corejava;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPIexamples {

    @Test
    public void testMethod(){
        //Map to print square for each number in list
        List<Integer> numList = Arrays.asList(1,2,3,4,5);
        List<Integer> numSquare = numList.stream().map(x->x*x).collect(Collectors.toList());
        System.out.println(numSquare);

        //Sorted to sort a list
        List<String> unSortedList = Arrays.asList("Rose", "Banana", "Orange", "Lotus");
        List<String> sortedList = unSortedList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        //Filter to filter items on basis of some criteria
        List<String> randomList = Arrays.asList("Peacock","Mango","Apple","Grapes");
        List<String> filList = randomList.stream().filter(s->s.contains("a")).collect(Collectors.toList());
        System.out.println(filList);

        //cube of numbers from list
        numList.stream().map(x->x*x*x).forEach(y->System.out.println(y));

        //reduce example
        int sum = numList.stream().reduce(0,(ans,i)->ans+i);
        System.out.println("Sum of "+numList+" is : "+sum);
    }
}
