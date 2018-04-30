import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Platform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Platform extends Actor
{
    private int height;
    private int width;
    /**
     * Act - do whatever the Platform wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Platform(int pHeight, int pWidth){//platform class used for the title screen 
        height = pHeight;
        width = pWidth;
    }
    public void act() 
    {
        GreenfootImage image = new GreenfootImage(width, height);
        image.fillRect(0, 0, width, height);
        image.setColor(Color.RED);
        setImage(image);
    }    
}