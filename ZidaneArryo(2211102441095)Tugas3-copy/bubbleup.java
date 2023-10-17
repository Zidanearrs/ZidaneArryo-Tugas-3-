import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;

/**
 * Write a description of class cloud here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bubbleup extends props
{
    /**
     * Act - do whatever the cloud wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public bubbleup(){
        Random rnd = new Random();
    }
    public void act()
    {
        this.setLocation(this.getX()-1,getY());
        if (this.getX() <= 0) {
            World wrld = this.getWorld();
            wrld.addObject(new bubbleup(), wrld.getWidth()-1, new Random().nextInt(wrld.getHeight()-1));
            wrld.removeObject(this);
        }
    }
}
