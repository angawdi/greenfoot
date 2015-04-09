import greenfoot.*; 

public class Turtle extends Animal
{
    Counter score= new Counter();
    
    public Turtle(Counter ct){
        score=ct;
    }
    
    public void act()
    {
        tryToEatLettuce();
        tryToEatLadybug();
        tryToEatStawberry();
        move(getMoveDistance());
        if (Greenfoot.isKeyDown("right")){
                turn(5);
        }
        if (Greenfoot.isKeyDown("left")){
                turn(-5);
        }
    }
    
    private int getMoveDistance(){
        if (getWorld().getObjects(Lettuce.class).size()<5)
            return 3;
            else return 5;
    }

    public void tryToEatLettuce()
    {
        if (canSee(Lettuce.class))
        {
            eat(Lettuce.class);
            score.add(1);
            if (getWorld().getObjects(Lettuce.class).size()==0)
                Greenfoot.stop();
            if (getWorld().getObjects(Lettuce.class).size()==3) {
                 Snake snake = new Snake();
                 getWorld().addObject(snake, 200, 132);
            }
 
        }
    } 
    public void tryToEatLadybug()
    {
        if (canSee(Ladybug.class))
        {
            Ladybug lbug=(Ladybug)getOneObjectAtOffset(0,0,Ladybug.class);
            lbug.counter();
           
        }     
    }
    public void tryToEatStawberry()
    {
        if (canSee(Stawberry.class))
        {
            eat(Stawberry.class);
           
        }     
    }
    
}