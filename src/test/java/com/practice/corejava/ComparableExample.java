package com.practice.corejava;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    @Test
    public void testSortComparable(){
        Movie mov1 = new Movie("The Last of Us",8.9,2023);
        Movie mov2 = new Movie("The Aviator",7.5,2004);
        Movie mov3 = new Movie("Bend It Like Beckham",6.7,2002);
        Movie mov4 = new Movie("The Big Lebowski ",8.1,1998);
        Movie mov5 = new Movie("The Breakfast Club",7.8,1985);
        List<Movie> lstMovie = new ArrayList<>();
        lstMovie.add(mov1);
        lstMovie.add(mov2);
        lstMovie.add(mov3);
        lstMovie.add(mov4);
        lstMovie.add(mov5);
        Collections.sort(lstMovie);
        for(Movie m: lstMovie){
            System.out.println("Ratings: "+m.getRatings()+" Movie Name: "+m.getMovieName()+" Year: "+m.getYear());
        }
    }
}

class Movie implements Comparable<Movie>{
    private String movieName;
    private Double ratings;
    private Integer year;

    public Movie(String movieName, Double ratings, Integer year) {
        this.movieName = movieName;
        this.ratings = ratings;
        this.year = year;
    }

    public String getMovieName() {
        return movieName;
    }

    public Double getRatings() {
        return ratings;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public int compareTo(Movie m) {
        return this.year-m.getYear();
    }
}
