import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GreenPlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GreenPlatform extends Actor
{
    //green in hexa: 00ff00
    private int width;
    private int height;
    public GreenPlatform(int cWidth, int cHeight){ //creates green rectangle object
        width = cWidth;
        height = cHeight;
        GreenfootImage img = new GreenfootImage(width, height);
        img.setColor(Color.GREEN);
        img.fillRect(0, 0, width-14, height);
        setImage(img);
    }
    public void hide() //makes this object invisible to the user 
    {
        getImage().setTransparency(0);
    }  
    public void show() //makes this object visible to the user 
    {
        getImage().setTransparency(255);
    }  
}
