package com.togo.builderpattern;

/**
 * Created by a587078 on 2014-12-30.
 */
public class Main {

    public static void main(String[] arg) {

        //The Builder pat-tern simulates named optional parameters
        NutritionFacts nf = new NutritionFacts.Builder(240, 8).calories(100).sodium(35).carbohydrate(27).build();

    }
}