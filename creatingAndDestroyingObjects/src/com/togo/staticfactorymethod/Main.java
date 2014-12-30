package com.togo.staticfactorymethod;


import java.awt.*;

class Furniture {

    public Furniture(Color color) {
        this.color = color;
    }

    private Color color;


    /**
     * always use static factory method for creating objects
     * no name conflicts from constructor when you want to create different objects
     */
    public static Furniture getWhiteFurniture() {
        return new Furniture(Color.WHITE);
    }

    public static Furniture getBlackFurniture() {
        return new Furniture(Color.BLACK);
    }

}

public class Main {

    public static void main(String[] args) {

        // get instance of white furniture
        Furniture.getWhiteFurniture();
        //get instance of black furniture
        Furniture.getBlackFurniture();
    }
}
