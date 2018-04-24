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
    titleCharacter titleChar = new titleCharacter();
    /**
     * 
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(800, 600, 1); 
        title();
    }
    
    public void title(){
        setBackground("title.png");
        addObject(titleChar, 10, 510);
    }
    
    public void level1(){
        addObject(char1, 10, 0);
        addObject(new blueChanger("BLUE"), 25, 100);
        addObject(new blueChanger("BLUE"), 100, 410);
        addObject(new greenChanger("GREEN"), 120, 370);
        addObject(new redChanger("RED"), 200, 250);
        addObject(new blueChanger("BLUE"), 250, 500);
        addObject(new greenChanger("GREEN"), 400, 400);
        addObject(new redChanger("RED"), 600, 365);
        
        //Red platforms (left to right)
        addObject(new RedPlatform(114, 50), 200, 600);
        addObject(new RedPlatform(64, 50), 500, 480);
        
        //Green platforms (left to right)
        addObject(new GreenPlatform(64, 50), 200, 400);
        addObject(new GreenPlatform(64, 50), 500, 600);
        addObject(new GreenPlatform(64, 50), 600, 500);
        
        //Blue platforms (left to right)
        addObject(new BluePlatform(64, 50), 25, 400);
        addObject(new BluePlatform(64, 50), 100, 500);
        addObject(new BluePlatform(64, 50), 350, 550);
        
        addObject(new triangle(), 500, 425);
        
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