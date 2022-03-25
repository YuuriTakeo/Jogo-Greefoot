import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cena3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cena3 extends World
{

    /**
     * Constructor for objects of class cena3.
     * 
     */
    public cena3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 500, 1); 
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        Greenfoot.setWorld(new MyWorld());
        if(Greenfoot.isKeyDown("enter"))
        Greenfoot.setWorld(new cena4());

    }
}
