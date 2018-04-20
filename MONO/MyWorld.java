import greenfoot.*;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Character char1 = new Character();
    /**
     * 
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(800, 600, 1); 
        addObject(char1, 0, 0);
        level1();
    }
    
    
    public void level1(){
        addObject(new blueChanger("BLUE"), 25, 250);
        addObject(new greenChanger("GREEN"), 120, 370);
        addObject(new blueChanger("BLUE"), 100, 410);
        addObject(new blueChanger("BLUE"), 250, 530);
        addObject(new redChanger("RED"), 200, 250);
        addObject(new redChanger("RED"), 600, 365);
        addObject(new greenChanger("GREEN"), 400, 400);
        addObject(new RedPlatform(50, 50), 500, 480);
        addObject(new GreenPlatform(50, 50), 200, 400);
        addObject(new GreenPlatform(50, 50), 500, 600);
        addObject(new GreenPlatform(50, 50), 600, 500);
        addObject(new BluePlatform(50, 50), 25, 400);
        addObject(new RedPlatform(100, 50), 200, 600);
        addObject(new BluePlatform(50, 50), 350, 550);
        addObject(new BluePlatform(50, 50), 100, 500);
        
        
    }
    
    public Character getCharacter(){
        return char1;
    }
    
    public void hideGreenPlatform(){
        for (Object obj : getObjects(GreenPlatform.class)){
            GreenPlatform p = (GreenPlatform) obj;
            p.hide();
        }
    }
    public void showGreenPlatform(){
        for (Object obj : getObjects(GreenPlatform.class)){
            GreenPlatform p = (GreenPlatform) obj;
            p.show();
        }
    }
    
    public void hideRedPlatform(){
        for (Object obj : getObjects(RedPlatform.class)){
            RedPlatform p = (RedPlatform) obj;
            p.hide();
        }
    }
    public void showRedPlatform(){
        for (Object obj : getObjects(RedPlatform.class)){
            RedPlatform p = (RedPlatform) obj;
            p.show();
        }
    }
    
    public void hideBluePlatform(){
        for (Object obj : getObjects(BluePlatform.class)){
            BluePlatform p = (BluePlatform) obj;
            p.hide();
        }
    }
    public void showBluePlatform(){
        for (Object obj : getObjects(BluePlatform.class)){
            BluePlatform p = (BluePlatform) obj;
            p.show();
        }
    }
}