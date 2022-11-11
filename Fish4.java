import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish4 extends Actor
{
    /**
     * Act - do whatever the Fish4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act()
    {
        setLocation(getX()+4,getY());
        if(isAtEdge())
            setLocation(0,Greenfoot.getRandomNumber(getWorld().getHeight()));
        if(isTouching(IkanJahat.class))
        {
            getWorld().addObject(new Fish4(), 0,Greenfoot.getRandomNumber(getWorld().getHeight()));
            Level1.hp.add(-1);
            Greenfoot.playSound("eating.wav");
            getWorld().removeObject(this);
        }
        }
}

