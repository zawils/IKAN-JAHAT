import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuScreen extends Menus
{

    /**
     * Constructor for objects of class MenuScreen.
     * 
     */
    public MenuScreen()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        StartBtn startBtn = new StartBtn();
        addObject(startBtn,96,151);
        StoryBtn storyBtn = new StoryBtn();
        addObject(storyBtn,103,287);
        HelpBtn helpBtn = new HelpBtn();
        addObject(helpBtn,738,49);
        startBtn.setLocation(104,148);
        startBtn.setLocation(701,494);
        storyBtn.setLocation(712,383);
        startBtn.setLocation(694,481);
        storyBtn.setLocation(727,394);
        startBtn.setLocation(700,478);
        startBtn.setLocation(670,530);
        storyBtn.setLocation(744,415);
        startBtn.setLocation(683,515);
        helpBtn.setLocation(61,41);
    }
}
