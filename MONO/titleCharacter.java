import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class titleCharacter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class titleCharacter extends Actor
{
    private int vSpeed = 0;
    private Class color = BluePlatform.class;
    private String strColor = "Blue";
    private int animationCount = 0;
    private GreenfootImage rboy1 = new GreenfootImage("rboy1.png");
    private GreenfootImage rboy2 = new GreenfootImage("rboy2.png");
    private GreenfootImage rboystanding = new GreenfootImage("rboystanding.png");
    
    public titleCharacter(){
        rboy1.scale(50, 82);
        rboy2.scale(50, 82);
        rboystanding.scale(50, 82);
    }

    
    public void act() 
    {
        animationCount++;
        rightAnimation();
        move(5);
        onRight();
    }
    
   
    
    
    public void onRight(){
        if (getX() >= 790){
            setLocation(0, 510);
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
    
}
