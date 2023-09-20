import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cars here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cars extends Actor
{
    /**
     * Act - do whatever the cars wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int spawnedCount = 0;

    public void act() {
        move(2); // Atur kecepatan berjalan

        // Cek jika aktor berada di ujung layar
        if (isAtEdge()) {
            setRotation(Greenfoot.getRandomNumber(360)); // Berputar secara acak
        }
    }
}
