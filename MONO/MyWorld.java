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
    private int level = 1;
    BluePlatform titlePlatform = new BluePlatform(900, 50);
    public MyWorld()
    {    
        super(800, 600, 1); 
        title();
    }
    
    
    public void act(){
        if (level < 3 && "space".equals(Greenfoot.getKey())){
            switch (level) {
                case 1: instructions();
                        break;
                case 2: level1();
                        level++;
                        break;
            }
        }
    }
    
    public void nextLevel(){
        switch (level) {
                case 3: level2();
                        level++;
                        break;
                case 4: level3();
                        level++;
                        break;
                case 5: level4();
                        level++;
                        break;
                case 6: level5();
                        level++;
                        break;
            }
    }
    
    public void title(){
        level = 1;
        setBackground("title.png");
        addObject((titlePlatform), 400, 560);
        hideBluePlatform();
        addObject(titleChar, 10, 500);
    }
    
    public void instructions(){
        removeObject(titleChar);
        level = 2;
        setBackground("instructions.png");
    }
    
    public void level1(){
        removeObjects(getObjects(null));
        setBackground("bricks3.jpg");
        addObject(new Character(), 10, 0);
        addObject(new blueChanger("BLUE"), 10, 0);
        addObject(new redChanger("RED"), 100, 200);
        addObject(new greenChanger("GREEN"), 400, 500);  
        addObject(new greenChanger("GREEN"), 400, 100);    
        //Red platforms (left to right)
        addObject(new RedPlatform(414, 82), 200, 600);
        
        //Green platforms (left to right)
        addObject(new GreenPlatform(514, 50), 400, 300);
        addObject(new GreenPlatform(64, 50), 500, 600);
        
        //Blue platforms (left to right)
        addObject(new BluePlatform(514, 50), 205, 150);
        addObject(new BluePlatform(64, 50), 100, 500);
        addObject(new BluePlatform(64, 50), 350, 600);
        
        addObject(new triangle(), 500, 550);
        
    }
    
    public void level2(){
        removeObjects(getObjects(null));
        addObject(new Character(), 20, 0);
        addObject(new BluePlatform(600, 30), 300, 100);
        addObject(new GreenPlatform(714, 30), 600, 800);
        addObject(new greenChanger("GREEN"), 525, 450);
        addObject(new blueChanger("BLUE"), 0, 0);

        addObject(new greenChanger("GREEN"), 630, 70);
        addObject(new blueChanger("BLUE"), 450, 300);
        addObject(new BluePlatform(104, 50), 450, 500);
        addObject(new GreenPlatform(364, 30), 650, 300);

        addObject(new RedPlatform(614, 50), 275, 580);
        addObject(new redChanger("RED"), 275, 430);

        addObject(new triangle(), 100, 525);
    }
    
    public void level3(){
        removeObjects(getObjects(null));
        addObject(new Character(), 20, 0);
        addObject(new blueChanger("BLUE"), 0, 0);
        addObject(new BluePlatform(114, 30), 25, 600);

        addObject(new greenChanger("GREEN"), 90, 525);
        addObject(new GreenPlatform(64, 30), 125, 525);

        addObject(new blueChanger("BLUE"), 180, 450);
        addObject(new BluePlatform(84, 30), 250, 450);

        addObject(new redChanger("RED"), 285, 375);
        addObject(new RedPlatform(84, 30), 325, 375);

        addObject(new greenChanger("GREEN"), 370, 300);
        addObject(new GreenPlatform(304, 30), 550, 300);

        addObject(new blueChanger("BLUE"), 400, 150);
        addObject(new redChanger("RED"), 450, 150);
        addObject(new blueChanger("BLUE"), 500, 150);
        addObject(new redChanger("RED"), 550, 150);
        addObject(new blueChanger("BLUE"), 600, 150);
        addObject(new redChanger("RED"), 650, 150);

        addObject(new BluePlatform(84, 30), 707, 575);
        addObject(new RedPlatform(84, 30), 707, 575);
        addObject(new triangle(), 700, 525);
    }
    
    public void level4(){
        removeObjects(getObjects(null));
    }
    
    public void level5(){
        removeObjects(getObjects(null));
        removeObject(titlePlatform);
        setBackground("bricks3.jpg");
        addObject(new Character(), 10, 0);
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