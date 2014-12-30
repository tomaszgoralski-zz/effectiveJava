package com.togo.staticfactorymethod;

public class Main {

    public static void main(String[] args) {


        // cant instantiate
//        Furnitures f = new Furnitures();

        // get instance of white furniture
        Furniture white = Furnitures.newWhiteFurniture();
        //get instance of black furniture
        Furniture black = Furnitures.newBlackFurniture();

        Furniture cached = Furnitures.getCachedFurniture();

        System.out.println(white.getColor());
        System.out.println(black.getColor());
        System.out.println("cached: "+cached.getColor());

        System.out.println("dupa");
    }
}
