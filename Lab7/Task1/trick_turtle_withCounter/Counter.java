 

/**
 * Write a description of class Counter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
  import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Counter extends Actor {
    private static final Color transparent = new Color(0,0,0,0);
    private GreenfootImage background;
    private int target;

    public Counter() {
        background = getImage();  // get image from class
        target = 0;
        updateImage();
    }
    
    public void act() {
    }

    public void add(int score) {
        target += score;
        updateImage();
    }

    public int getValue() {
        return target;
    }

    public void setValue(int newValue) {
        target = newValue;
        updateImage();
    }

    private void updateImage() {
        GreenfootImage image = new GreenfootImage(background);
        GreenfootImage text = new GreenfootImage("" + target, 22, Color.BLACK, transparent);

        image.drawImage(text, (image.getWidth()-text.getWidth())/2, 
                        (image.getHeight()-text.getHeight())/2);
        setImage(image);
    }
}
     

