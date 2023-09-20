import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     */
    public MyWorld()
    {
        super(600, 400, 1);
        
        cars player1 = new cars();
        this.addObject(player1, 40, 50);
        
        cars player2 = new cars();
        this.addObject(player2, 120, 180);
    }
}
