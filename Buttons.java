import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Buttons extends Actor
{
    /**
     * Act - do whatever the Buttons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(String buttonName)
    {
        if (Greenfoot.mouseMoved(this)) {
            setImage(buttonName + "_over.png");
        } else if (Greenfoot.mouseMoved(null)) {
            setImage(buttonName + ".png");
        }
        
        if (Greenfoot.mouseClicked(this)) {
            setImage(buttonName + ".png");
            Greenfoot.delay(5);
            if (buttonName.equalsIgnoreCase("StartBtn")){
                Greenfoot.setWorld(new Level1());
            }
            else if (buttonName.equalsIgnoreCase("StoryBtn")){
                Greenfoot.setWorld(new StoryScreen());
            }
            else if (buttonName.equalsIgnoreCase("HelpBtn")){ 
                Greenfoot.setWorld(new HelpScreen());
            }
            else if (buttonName.equalsIgnoreCase("BackBtn")){
                Greenfoot.setWorld(new MenuScreen());
            }
        }
    }
}
