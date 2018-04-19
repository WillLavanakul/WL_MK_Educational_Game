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
    public GreenPlatform(int cWidth, int cHeight){
        width = cWidth;
        height = cHeight;
        GreenfootImage img = new GreenfootImage(width, height);
        img.setColor(Color.GREEN);
        img.fillRect(width - (width-8), 0, width-8, height);
        setImage(img);
    }
    public void hide() 
    {
        getImage().setTransparency(0);
    }  
    public void show() 
    {
        getImage().setTransparency(255);
    }  
}
