import greenfoot.*;  // imports Actor, World, Greenfoot, GreenfootImage

public class TurtleWorld extends World
{
    /**
     * Create the turtle world. Our world has a size 
     * of 560x460 cells, where every cell is just 1 pixel.
     */
    public TurtleWorld() 
    {
        super(600, 480, 1);

        prepare();
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        Counter count= new Counter();
        addObject(count, 40,30);
        
        Turtle turtle = new Turtle(count);
        addObject(turtle, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        
        int addNumberLetteces = Greenfoot.getRandomNumber(60)+1;
        int randomX = (int)(Math.random()*300);
        int randomY = (int)(Math.random()*40);
        //int addNumberRock=Greenfoot.getRandomNumber(6)+1;
        int addNumberStawberry=Greenfoot.getRandomNumber(3)+1;
          
        int newcount=1;
        while (newcount<=addNumberLetteces)
        {
            Lettuce let = new Lettuce();
            randomX=Greenfoot.getRandomNumber(getWidth());
            randomY=Greenfoot.getRandomNumber(getHeight());
            addObject(let, randomX, randomY);
         
            newcount++;
        }
        //int add=1;
        /*while(add<=addNumberRock)
        {
               Rock r= new Rock();
               addObject(r, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
               add++;
            }
         */
        Stawberry berry= new Stawberry();
        addObject(berry, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        
        randomX=Greenfoot.getRandomNumber(getWidth());
        randomY=Greenfoot.getRandomNumber(getHeight());   
        Snake snake1 = new Snake();
        addObject(snake1,randomX,randomY);
        Snake snake2 = new Snake();
        addObject(snake2, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        Snake snake3 = new Snake();
        //addObject(snake3,randomX,randomY);
        //addObject(snake3, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        //Snake snake4 = new Snake();
        //addObject(snake4,randomX,randomY);
        //randomX=Greenfoot.getRandomNumber(getWidth());
       // randomY=Greenfoot.getRandomNumber(getHeight());
        
       
        //Rock rock= new Rock();
       // addObject(rock,  Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
         //Hedgehog hed = new Hedgehog();
       // addObject(hed,randomX,randomY);
        //randomX=Greenfoot.getRandomNumber(getWidth());
        //randomY=Greenfoot.getRandomNumber(getHeight());
        Ladybug lbug= new Ladybug();
        addObject(lbug, Greenfoot.getRandomNumber(getWidth()), Greenfoot.getRandomNumber(getHeight()));
        }
    }
        
    
