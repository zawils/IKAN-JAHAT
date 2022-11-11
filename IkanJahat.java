import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IkanJahat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IkanJahat extends Actor
{
    /**
     * Act - do whatever the IkanJahat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move();
        score();
    }
    public void move()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-4);
            setImage("fishMain2.png");
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+4);
            setImage("fishMain2.png");
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-4,getY());
            setImage("fishMain2left.png");
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+4,getY());
            setImage("fishMain2.png");
        }
    }
    public void score()
    {
        if(Level1.score.getValue()>=1010)
        {
            setImage("fishMain.png");
            getWorld().addObject(new Win(),getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.playSound("fanfare.wav");
            Greenfoot.delay(350);
            Greenfoot.setWorld(new MenuScreen());
        }
        if(Level1.hp.getValue()==0)
        {
            setImage("fishMainDead.png");
            getWorld().addObject(new Lose(),getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.playSound("loose.mp3");
            Greenfoot.delay(350);
            Greenfoot.setWorld(new MenuScreen());
        }
    }
}
