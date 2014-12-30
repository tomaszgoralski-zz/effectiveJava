package com.togo.staticfactorymethod;

import java.awt.*;

/**
 * Created by a587078 on 2014-12-30.
 */
public class BlackFurniture implements Furniture {

    @Override
    public Color getColor() {
        return Color.BLACK;
    }

    public void move() {
    }

    public void animate() {
    }
    // others...
}