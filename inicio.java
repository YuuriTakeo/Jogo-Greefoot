import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class inicio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class inicio extends World
{
   private GreenfootSound music = new GreenfootSound("terror.wav");
    /**
     * Constructor for objects of class inicio.
     * 
     */
    public inicio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(950, 500, 1); 
     
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("enter"))
        Greenfoot.setWorld(new cena1());
        if(Greenfoot.isKeyDown("space"))
        Greenfoot.setWorld(new creditos());
         
    }
    public void started()
    {
        music.playLoop();
    }
 
    public void stopped()
    {
        music.stop();
    }
    
}
