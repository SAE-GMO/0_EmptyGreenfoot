import greenfoot.World;

/**
 * Write a description of class RabbitLevel1 here.
 * 
 * @author SAE
 * @version 1.0
 */
public class TestWorld extends World
{

    
    /**
     * Constructor for objects of class RabbitLevel1.
     * 
     */
    public TestWorld()
    {
        super(8, 8, 60);
        setBackground("./images/cell.jpg");
        setPaintOrder(Player.class);
        addObject(new Player(), 0,0);
    }
    
}
