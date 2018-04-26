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
    private int animationCount = 0;
    private GreenfootImage rboy1 = new GreenfootImage("rboy1.png");
    private GreenfootImage rboy2 = new GreenfootImage("rboy2.png");
    private GreenfootImage rboystanding = new GreenfootImage("rboystanding.png");
    private GreenfootImage lboy1 = new GreenfootImage("lboy1.png");
    private GreenfootImage lboy2 = new GreenfootImage("lboy2.png");
    private GreenfootImage lboystanding = new GreenfootImage("lboystanding.png");
    private int timer = 0;
    private int level = 1;
    
    public void act() 
    {
        animationCount++;
        checkChange();
        
        checkFall();
        if(Greenfoot.isKeyDown("d")){
            rightAnimation();
            move(5);
            
        }
        if(Greenfoot.isKeyDown("a")){
            leftAnimation();
            move(-5);
        }
        if(!Greenfoot.isKeyDown("d") && !Greenfoot.isKeyDown("a")) {
            if(getImage().equals(rboy1) || getImage().equals(rboy2) || getImage().equals(rboystanding)){
                setImage("rboystanding.png");
            }
            if(getImage().equals(lboy1) || getImage().equals(lboy2) || getImage().equals(lboystanding)){
                setImage("lboystanding.png");
            }
        }
        if ("space".equals(Greenfoot.getKey()) && onGround())
            {
                vSpeed = -15;
                setLocation(getX(), getY()+vSpeed);
            }
        onBottom();
        if(isTouching(triangle.class)){
            endTimer();
        }
    }
    
    public void leftAnimation(){
        if(animationCount == 3){
            setImage(lboy1);
        }
        else if(animationCount == 6){    
            setImage(lboystanding);
        }
        else if(animationCount == 9){    
            setImage(lboy2);
        }
        else if(animationCount > 10){    
            animationCount = 0;
        }
    }
    
    public void onBottom(){
        if (getY() >= 590){
            setLocation(10, 0);
        }
    }
    
    public void rightAnimation(){
        if(animationCount == 3){
            setImage(rboy1);
        }
        else if(animationCount == 6){    
            setImage(rboystanding);
        }
        else if(animationCount == 9){    
            setImage(rboy2);
        }
        else if(animationCount >= 10){    
            animationCount = 0;
        }
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
    
    public void endTimer(){
        timer++;
        if(timer == 180){
           ((MyWorld)getWorld()).nextLevel();
        }
    }
}