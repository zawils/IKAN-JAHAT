import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bubble1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bubble1 extends Actor
{
    /**
     * Act - do whatever the Bubble1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX(),getY()-3);
        if(isAtEdge())
             setLocation(Greenfoot.getRandomNumber(getWorld().getWidth()),600);
    }
}
