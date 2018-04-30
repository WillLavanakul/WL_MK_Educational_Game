import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class titleCharacter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class titleCharacter extends Actor
{
    private int vSpeed = 0; //initial class variables 
    private Class color = BluePlatform.class;
    private String strColor = "Blue";
    private int animationCount = 0;
    private int jumpCount = 0;
    private GreenfootImage rboy1 = new GreenfootImage("rboy1.png");
    private GreenfootImage rboy2 = new GreenfootImage("rboy2.png");
    private GreenfootImage rboystanding = new GreenfootImage("rboystanding.png");
    
    public titleCharacter(){ //sets the size of the title character  
        rboy1.scale(50, 82);
        rboy2.scale(50, 82);
        rboystanding.scale(50, 82);
    }

    
    public void act()  //a list of all the methods used to control the sprite
    {
        animationCount++;
        jumpCount++;
        rightAnimation();
        move(5);
        onRight();
        checkFall();
        if(jumpCount == 30 || jumpCount == 120){
            vSpeed = -18;
            setLocation(getX(), getY()+vSpeed);
        }
        else if(jumpCount >= 200){
            jumpCount = 0;
        }
    }
    

    public void onRight(){ //resets level if the character runs off the right side of the screen 
        if (getX() >= 790){
            setLocation(0, getY());
        }
    }
    
    public void rightAnimation(){//sets the animation for the character when moving 
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
    
    public int checkChange(){//if character interacts with the color changers, then the rectangles will change to the respective color that was touched
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
    
    public void setColor(Class c){ //mutator for that sets the color 
        color = c;
    }
    
    public Class getColor(){//getter for the color class 
        return color;
    }
    
    public void setStrColor(String c){//sets the string color for the color changers (circles)
        strColor = c;
    }
    
    public String getStrColor(){//returns the string color for the color changers (circles)
        return strColor;
    }
    
    public void fall() //sets the gravity constant in our game that returns our character to the ground if spacebar is used to jump
    {
        vSpeed++;
        setLocation(getX(), getY() + vSpeed);
    }
    
    public boolean onGround() //returns true if the character is on the ground, false otherwise.  does so by using character height in relation to rectangle height.
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
    
    public void checkFall() //brings character to the ground if they are mid-air
    {
        if(onGround()){
            vSpeed = 0;
        }
        else{
            fall();
        }
    }
    
}
