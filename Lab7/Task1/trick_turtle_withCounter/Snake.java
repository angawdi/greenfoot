import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Animal
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        tryToEatTurtle();
        
        move(5);
        
        if (atWorldEdge())
        {
             turn(15);
        }
        if (Greenfoot.getRandomNumber(100)<10){
            turn(Greenfoot.getRandomNumber(40)-20);
        }
       // removeSnake();
    }    
    
    public void tryToEatTurtle()
    {
        if (canSee(Turtle.class))
        {
            eat(Turtle.class);
            Greenfoot.stop();
        }     
    }
    /*public void removeSnake()
    {
       if(canSee(Rock.class))
       {
           getWorld().removeObject(this);
        }
    }
    */
}

