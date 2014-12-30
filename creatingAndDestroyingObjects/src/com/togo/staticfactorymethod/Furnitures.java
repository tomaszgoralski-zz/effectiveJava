package com.togo.staticfactorymethod;

import java.awt.*;

/**
 * Created by a587078 on 2014-12-30.
 * noninstantiable class with provide static methods for obtaining implementation
 */
public class Furnitures {

    private Furnitures() {
    }

    public static Furniture whiteFurniture() {
        return new WhiteFurniture();
    }

    public static Furniture blackFurniture() {
        return new BlackFurniture();
    }
}