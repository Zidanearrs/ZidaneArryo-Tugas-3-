import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;
/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends enemies
{
    /**
     * Act - do whatever the enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    private GreenfootImage[] images; 
    private int currentImage; 

public enemy() {
    images = new GreenfootImage[3]; 
    images[0] = new GreenfootImage("squidenemy1.png");
    images[1] = new GreenfootImage("squidenemy2.png");
    images[2] = new GreenfootImage("squidenemy3.png");
    currentImage = 0; 
    setImage(images[currentImage]);
    {
        GreenfootImage img = this.getImage();
        img.scale(150,150);
        this.setImage(img);
    }
}
    int lastNameNo = 1;
    int animationDelay = 10;
    int gravity = 4;
public void act() {
    currentImage = (currentImage + 1) % images.length;
    setImage(images[currentImage]);
    {
        GreenfootImage img = this.getImage();
        img.scale(150,150);
        this.setImage(img);
    }
    move(-8);
    if (getX() <= 0) {
        getWorld().removeObject(this);
    } 
}
}
