import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Crab1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Crab1 extends Actor
{
    /**
     * Act - do whatever the Crab1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()+1,getY());
        if(isAtEdge())
            setLocation(0,504);
    }
}
