import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class chnager here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class greenChanger extends Actor
{
    public greenChanger(String text){//creates the green circles that hides/shows rectangles of that color 
        GreenfootImage img = new GreenfootImage(30, 30);
        img.setColor(Color.GREEN);
        img.fillOval(0, 0, 30, 30);
        setImage(img);
    }
    /**
     * Act - do whatever the chnager wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}
