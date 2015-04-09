import greenfoot.*;

/**
 * Write a description of class Ladybug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ladybug extends Animal
{
    /**
     * Act - do whatever the Ladybug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int counter=0;
    
    public void act() 
    {
       {
            tryToEatLettuce();
            move(Greenfoot.getRandomNumber(10));
        
        if (atWorldEdge())
        {
             turn(15);
        }
        if (Greenfoot.getRandomNumber(200)<20){
            turn(Greenfoot.getRandomNumber(50)-10);
        }
             
        
        if(counter==60){
                getWorld().removeObject(this);
            }
    }
}
     

     public void tryToEatLettuce()
    {
        if (canSee(Lettuce.class))
        {
            eat(Lettuce.class);
            if (getWorld().getObjects(Lettuce.class).size()==0)
                Greenfoot.stop();
            //if (getWorld().getObjects(Lettuce.class).size()==4) {
               //  Snake sna = new Snake();
                // getWorld().addObject(sna, 200, 160);
            //}
 
        }
    }
    public void counter(){
        counter++;}
    
}
