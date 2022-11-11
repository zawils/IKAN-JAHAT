import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fish2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish2 extends Actor
{
    /**
     * Act - do whatever the Fish2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()+3,getY());
        if(isAtEdge())
            setLocation(0,Greenfoot.getRandomNumber(getWorld().getHeight()));
        if(isTouching(IkanJahat.class))
        {
            getWorld().addObject(new Fish2(), 0,Greenfoot.getRandomNumber(getWorld().getHeight()));
            Greenfoot.playSound("eating.wav");
            Level1.score.add(20);
            getWorld().removeObject(this);
        }
        }
    }

