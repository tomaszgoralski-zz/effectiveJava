package com.togo.staticfactorymethod;

public class Main {

    public static void main(String[] args) {


        // cant instantiate
//        Furnitures f = new Furnitures();

        // get instance of white furniture
        Furniture white = Furnitures.whiteFurniture();
        //get instance of black furniture
        Furniture black = Furnitures.blackFurniture();


        System.out.println(white.getColor());
        System.out.println(black.getColor());
    }
}
