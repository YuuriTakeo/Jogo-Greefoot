
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**greenfoot programming random movements

 * Write a degreenfoot programming random movements
greenfoot programming random movements
greenfoot programming random movements
scription of class Funcionario here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Funcionario extends Actor
{   int speed = 15;
   
    class Direcction {
       public static final int UP = 270; 
       public static final int DOWN = 90; 
       public static final int LEFT = -180; 
       public static final int RIGHT = 0; 
       
    }    
    /**
     * Act - do whatever the Funcionario wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Funcionario()
    {
         getImage().scale(getImage().getWidth()/3, getImage().getHeight()/3);
    }
    int Lives = 3;
    int Points = 0;
    
    public void act()
    {
       movePlayer();
        showStatus();
        hitcafe();
        hitFantasma();
        testEndGame();
        testWinGame();
       
      
    }
    
    public void movePlayer(){
    {
        int x = getX();
        int y = getY();
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(x + 4, y);
            if(hitwalls())
            {
                setLocation(x - 4, y);
            }
            if(hitesquerda())
            {
                setLocation(x - 4, y);
            }
            if(hitjunção())
            {
                setLocation(x - 4, y);
            }

        
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(x - 4, y);
            if(hitwalls())
            {
                setLocation(x + 4, y);
            }
            if(hitesquerda())
            {
                setLocation(x + 4, y);
            }
            if(hitjunção())
            {
                setLocation(x + 4, y);
            }

        
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(x, y-4);
            if(hitwalls())
            {
                setLocation(x, y+4);
            }
            if(hitesquerda())
            {
                setLocation(x, y+4);
            }
            if(hitjunção())
            {
                setLocation(x, y+4);
            }

        
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(x, y+4);
            if(hitwalls())
            {
                setLocation(x, y-4);
            }
            if(hitesquerda())
            {
                setLocation(x, y-4);
            }
            if(hitjunção())
            {
                setLocation(x, y-4);
            }

        
        }
        
    }
    }   
    public boolean hitwalls()
    {
        if(isTouching(direita.class))
        {
        return true;
        }
        else
        {
         return false;
        }
    }
    public boolean hitesquerda()
    {
        if(isTouching(esquerda.class))
        {
        return true;
        }
        else
        {
         return false;
        }
    }
    public boolean hitjunção()
    {
        if(isTouching(junção_1.class))
        {
        return true;
        }
        else
        {
         return false;
        }
    }
 
    private int getChangeX(int direcction){
       if(direcction == Direcction.RIGHT){
         return speed;  
        }
        if (direcction == Direcction.LEFT){
          return -speed;
        }
        return 0;
    }
    private int getChangeY(int direcction){
       if(direcction == Direcction.DOWN){
         return speed;  
        }
        if (direcction == Direcction.UP){
          return -speed;
        }
        return 0;
    }
    public void showStatus()
{
    getWorld().showText("Lives" +Lives,50,30);
    getWorld().showText("Points"+Points,50,10);
}

public void addPoints()
{
    Points = Points + 1;
}

public void loseLife()
{
    Lives = Lives - 1;
}
       
public void testEndGame()
 {
        if (Lives<1)
        {
           
            Greenfoot.setWorld(new gameover());
        }
 }

 public void testWinGame()
 {
        if (Points == 20)
        {
          
            Greenfoot.setWorld(new vitoria());
        }
 }
 
public void hitcafe()
{
    if (isTouching (cafe.class) )
    {
        removeTouching (cafe.class);
        addPoints();
    }
}

public void hitFantasma()
{
    if (isTouching (Fantasma.class) )
    {
        setLocation(814,147);
        loseLife();
    }
}

}

 

   
  
    

