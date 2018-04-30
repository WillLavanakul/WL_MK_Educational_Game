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
    public RedPlatform(int width, int height){// creates a rectangle object that is red
        GreenfootImage img = new GreenfootImage(width, height);
        img.setColor(Color.RED);
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
