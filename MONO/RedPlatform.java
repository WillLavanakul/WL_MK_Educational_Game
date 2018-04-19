import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RedPlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RedPlatform extends Actor
{
    //color in hexa: ff0000
    public RedPlatform(int width, int height){
        GreenfootImage img = new GreenfootImage(width, height);
        img.setColor(Color.RED);
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
