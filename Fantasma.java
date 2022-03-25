import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fantasma_Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fantasma extends Actor
{
    /**
     * Act - do whatever the Fantasma_Test wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Fantasma()
    {
        getImage().scale(getImage().getWidth()/16, getImage().getHeight()/16);
    
    
    }
    public void act() 
    {
      move(4);
      if ( Greenfoot.getRandomNumber(100) < 5)
      {
        turn(Greenfoot.getRandomNumber(70) - 10);
        
    }
    
    
    }// Add your action code here.
  
}

    


