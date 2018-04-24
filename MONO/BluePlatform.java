import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BluePlatform here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BluePlatform extends Actor
{
    //color in hexa: 0000ff
    public BluePlatform(int width, int height){
        GreenfootImage img = new GreenfootImage(width, height);
        img.setColor(Color.BLUE);
        img.fillRect(0, 0, width-14, height);
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
