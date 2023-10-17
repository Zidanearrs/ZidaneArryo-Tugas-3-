import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;

/**
 * Write a description of class rembo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class squid extends player
{
    /**
     * Act - do whatever the rembo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void squid()
    {
        this.setImage(new GreenfootImage("squid4.png"));
    }
    {
        GreenfootImage img = this.getImage();
        img.scale(150,150);
        this.setImage(img);
    }
    int lastNameNo = 1;
    int animationDelay = 10;
    int gravity = 4;
    void animate(){
        if(animationDelay <20 ){
            animationDelay++;
            return;
        }
        animationDelay=0;
        
        if(lastNameNo==4){
            lastNameNo = 1;
        }else{
            lastNameNo ++;
        }
        this.setImage(new GreenfootImage("squid"+lastNameNo+".png"));
        GreenfootImage img = this.getImage();
        img.scale(150,150);
        this.setImage(img);
    }
    public void act()
    {
        animate();
        super.act();
        this.setLocation(this.getX(), this.getY()+gravity);
        if (Greenfoot.isKeyDown("space")) {
            this.setLocation(this.getX(), this.getY()-8);
        } 
    }
}
