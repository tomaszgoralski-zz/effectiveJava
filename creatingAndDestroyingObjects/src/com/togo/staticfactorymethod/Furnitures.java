package com.togo.staticfactorymethod;

import java.awt.*;

/**
 * Created by a587078 on 2014-12-30.
 * noninstantiable class with provide static methods for obtaining implementation
 */
public class Furnitures {

    static{
        init();
    }

    /**
     * static facotry method for obtain cached objects
     *
     * @return Furniture
     */
    public static Furniture getCachedFurniture(){
        return cachedFurniture;
    };

    private static Furniture cachedFurniture;

    /**
     *  set-up default cached furniture
     */
    private static void init() {
        cachedFurniture = new BlackFurniture();
    }

    private Furnitures() {
    }

    public static Furniture newWhiteFurniture() {
        return new WhiteFurniture();
    }

    public static Furniture newBlackFurniture() {
        return new BlackFurniture();
    }
}