import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Character extends Actor
{
    private int vSpeed = 0;
    private Class color = BluePlatform.class;
    private String strColor = "Blue";
    
    public void act() 
    {
        setImage("rboystanding.png");
        checkChange();
        checkFall();
        if(Greenfoot.isKeyDown("d")){
            move(5);
        }
        if(Greenfoot.isKeyDown("a")){
            move(-5);
        }
        if ("space".equals(Greenfoot.getKey()) && onGround())
            {
                vSpeed = -15;
                setLocation(getX(), getY()+vSpeed);
            }
        
    }
    
    public void leftAnimation(){
        setImage("lboy1.png");
        Greenfoot.delay(1);
        setImage("lboy2.png");
    }
    public int checkChange(){
        if(isTouching(blueChanger.class)){
            color = BluePlatform.class;
            MyWorld myWorld = (MyWorld) getWorld();
            ((MyWorld)getWorld()).showBluePlatform();
            ((MyWorld)getWorld()).hideGreenPlatform();
            ((MyWorld)getWorld()).hideRedPlatform();
            return 0;
        }
        if(isTouching(redChanger.class)){
            color = RedPlatform.class;
            ((MyWorld)getWorld()).hideBluePlatform();
            ((MyWorld)getWorld()).hideGreenPlatform();
            ((MyWorld)getWorld()).showRedPlatform();
            return 0;
        }
        if(isTouching(greenChanger.class)){
            color = GreenPlatform.class;
            ((MyWorld)getWorld()).hideBluePlatform();
            ((MyWorld)getWorld()).showGreenPlatform();
            ((MyWorld)getWorld()).hideRedPlatform();
            return 0;
        }
        return 0;
    }
    
    public void setColor(Class c){
        color = c;
    }
    
    public Class getColor(){
        return color;
    }
    
    public void setStrColor(String c){
        strColor = c;
    }
    
    public String getStrColor(){
        return strColor;
    }
    
    public void fall()
    {
        vSpeed++;
        setLocation(getX(), getY() + vSpeed);
    }
    
    public boolean onGround()
    {
        int spriteHeight = getImage().getHeight();
        int lookForGround = (int)(spriteHeight/2) + 5;
        //boolean ground = isTouching(color);
        Actor ground = getOneObjectAtOffset(0, lookForGround, color);
        if(ground == null){
            return false;
        }
        else{
            return true;
        }
    }
    
    public void checkFall()
    {
        if(onGround()){
            vSpeed = 0;
        }
        else{
            fall();
        }
    }
    
}