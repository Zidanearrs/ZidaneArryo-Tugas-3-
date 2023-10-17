import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class myworld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class myworld extends World
{

    /**
     * Constructor for objects of class myworld.
     * 
     */
    public myworld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        bubbleup bubbleup = new bubbleup();
        addObject(bubbleup,577,207);
        squid squid = new squid();
        addObject(squid,135,161);
        enemy enemy = new enemy();
        addObject(enemy,651,241);
        enemy.act();
        enemy.setLocation(716,160);
    }

    public void act() {
            if(Greenfoot.getRandomNumber(100)<1){
                addObject(new enemy(),853,Greenfoot.getRandomNumber(479));
            }
    }
}
