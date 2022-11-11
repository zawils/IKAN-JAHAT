import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends MainScreen
{

    /**
     * Constructor for objects of class Level1.
     * 
     */
    public static Counter score = new Counter("Score : ");
    public static Counter2 hp = new Counter2("HP : ");
    public Level1()
    {
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bubble bubble = new Bubble();
        addObject(bubble,597,330);
        bubble.setLocation(530,334);
        Bubble1 bubble1 = new Bubble1();
        addObject(bubble1,149,272);
        Crab crab = new Crab();
        addObject(crab,371,555);
        Bubble bubble2 = new Bubble();
        addObject(bubble2,662,272);
        Crab1 crab1 = new Crab1();
        addObject(crab1,251,504);
        for(int i=1;i<=5;i++)
            addObject(new Fish1(), 0,Greenfoot.getRandomNumber(getHeight()));
        for(int i=1;i<=3;i++)
            addObject(new Fish2(), 0,Greenfoot.getRandomNumber(getHeight()));
        for(int i=1;i<=3;i++)
            addObject(new Fish4(), 0,Greenfoot.getRandomNumber(getHeight()));
        IkanJahat ikanJahat = new IkanJahat();
        addObject(ikanJahat,300,160);
        Counter score = new Counter("Score : ");
        addObject(score,90,52);
        score.setValue(0);
        bubble1.setLocation(138,48);
        bubble1.setLocation(107,42);
        bubble2.setLocation(714,52);
        Counter2 counter2 = new Counter2("Hp : ");
        addObject(counter2,714,52);
        bubble1.setLocation(122,46);
        BackBtn backBtn = new BackBtn();
        addObject(backBtn,56,547);
    }
}

