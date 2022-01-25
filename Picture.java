/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2016.02.29
 */
public class Picture
{
    private Square sky;
    private Square ground;
    private Circle sun;
    private Circle moon;
    private Circle star1;
    private Circle star2;
    private Circle star3;
    private Circle star4;
    private Circle star5;
    private Circle star6;
    private Circle star7;
    private Square treetrunk1;
    private Square treetrunk2;
    private Triangle treetop1;
    private Triangle treetop2;
    private Triangle treebottom1;
    private Triangle treebottom1a;
    private Triangle treebottom2;
    private Triangle treebottom2a;
    private Person lumberjack;
    private Square axehandle1;
    private Square axehandle2;
    private Square axehandle3;
    private Square axehandle4;
    private Triangle axe;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sky = new Square();
        ground = new Square();
        sun = new Circle();
        moon = new Circle();
        star1 = new Circle();
        star2 = new Circle();
        star3 = new Circle();
        star4 = new Circle();
        star5 = new Circle();
        star6 = new Circle();
        star7 = new Circle();
        treetrunk1 = new Square();
        treetrunk2= new Square();
        treetop1 = new Triangle();
        treetop2 = new Triangle();
        treebottom1 = new Triangle();
        treebottom1a = new Triangle();
        treebottom2 = new Triangle();
        treebottom2a = new Triangle();
        lumberjack = new Person();
        axehandle1 = new Square();
        axehandle2 = new Square();
        axehandle3 = new Square();
        axehandle4 = new Square();
        axe = new Triangle();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.moveHorizontal(-350);
            sky.moveVertical(-300);
            sky.changeSize(550);
            sky.makeVisible();
            sky.changeColor("sky");
            
            ground.moveHorizontal(-350);
            ground.moveVertical(100);
            ground.changeSize(550);
            ground.makeVisible();
            ground.changeColor("green");
            
            moon.moveHorizontal(-247);
            moon.moveVertical(-110);
            moon.changeSize(116);
            moon.makeVisible();
            moon.changeColor("sky");
            
            
            sun.moveHorizontal(-250);
            sun.moveVertical(-110);
            sun.changeSize(110);
            sun.makeVisible();
            sun.changeColor("yellow");
            
            star1.moveHorizontal(210);
            star1.moveVertical(-70);
            star1.changeSize(9);
            star1.makeVisible();
        
            
            star2.moveHorizontal(100);
            star2.moveVertical(-100);
            star2.changeSize(20);
            star2.makeVisible();
            
            
            
            star3.moveHorizontal(140);
            star3.moveVertical(-30);
            star3.changeSize(13);
            star3.makeVisible();
            
            
            star4.moveHorizontal(40);
            star4.moveVertical(-45);
            star4.changeSize(10);
            star4.makeVisible();
            
            
            
            star5.moveHorizontal(10);
            star5.moveVertical(-5);
            star5.changeSize(14);
            star5.makeVisible();
            
            
            star6.moveHorizontal(-70);
            star6.moveVertical(5);
            star6.changeSize(20);
            star6.makeVisible();
            
            
            star7.moveHorizontal(-70);
            star7.moveVertical(-50);
            star7.changeSize(7);
            star7.makeVisible();
            
            
            
            treetrunk1.moveHorizontal(120);
            treetrunk1.moveVertical(71);
            treetrunk1.changeSize(30);
            treetrunk1.makeVisible();
            treetrunk1.changeColor("brown");
            
            treetop1.moveHorizontal(235);
            treetop1.moveVertical(-75);
            treetop1.changeSize(65,40);
            treetop1.makeVisible();
            treetop1.changeColor("green");
            
            treebottom1.moveHorizontal(235);
            treebottom1.moveVertical(-20);
            treebottom1.changeSize(45,60);
            treebottom1.makeVisible();
            treebottom1.changeColor("green");
            
            treebottom1a.moveHorizontal(235);
            treebottom1a.moveVertical(15);
            treebottom1a.changeSize(40,80);
            treebottom1a.makeVisible();
            treebottom1a.changeColor("green");
            
            
            
            treetrunk2.moveHorizontal(-60);
            treetrunk2.moveVertical(71);
            treetrunk2.changeSize(30);
            treetrunk2.makeVisible();
            treetrunk2.changeColor("brown");
            
            treetop2.moveHorizontal(55);
            treetop2.moveVertical(-75);
            treetop2.changeSize(85,25);
            treetop2.makeVisible();
            treetop2.changeColor("green");
            
            treebottom2.moveHorizontal(55);
            treebottom2.moveVertical(-20);
            treebottom2.changeSize(55,40);
            treebottom2.makeVisible();
            treebottom2.changeColor("green");
            
            treebottom2a.moveHorizontal(55);
            treebottom2a.moveVertical(15);
            treebottom2a.changeSize(44,70);
            treebottom2a.makeVisible();
            treebottom2a.changeColor("green");
            
            
            lumberjack.moveHorizontal(-95);
            lumberjack.moveVertical(60);
            lumberjack.changeSize(76,40);
            lumberjack.makeVisible();
            lumberjack.changeColor("brown");
            
            
            axehandle1.moveHorizontal(-105);
            axehandle1.moveVertical(140);
            axehandle1.changeSize(7);
            axehandle1.makeVisible();
            axehandle1.changeColor("black");
            
            
            axehandle2.moveHorizontal(-105);
            axehandle2.moveVertical(133);
            axehandle2.changeSize(7);
            axehandle2.makeVisible();
            axehandle2.changeColor("black");
            
            axehandle3.moveHorizontal(-105);
            axehandle3.moveVertical(126);
            axehandle3.changeSize(7);
            axehandle3.makeVisible();
            axehandle3.changeColor("black");
            
            axehandle4.moveHorizontal(-105);
            axehandle4.moveVertical(119);
            axehandle4.changeSize(7);
            axehandle4.makeVisible();
            axehandle4.changeColor("black");
            
            
            axe.moveHorizontal(0);
            axe.moveVertical(100);
            axe.changeSize(13,35);
            axe.makeVisible();
            axe.changeColor("black");

            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("black");
        ground.changeColor("white");
        moon.changeColor("white");
        sun.changeColor("black");
        star1.changeColor("white");
        star2.changeColor("white");
        star2.changeColor("white");
        star3.changeColor("white");
        star4.changeColor("white");
        star5.changeColor("white");
        star6.changeColor("white");
        star7.changeColor("white");
        treetrunk1.changeColor("white");
        treetrunk2.changeColor("white");
        lumberjack.changeColor("black");
        axehandle1.changeColor("white");
        axehandle2.changeColor("white");
        axehandle3.changeColor("white");
        axehandle4.changeColor("white");
        axe.changeColor("white");

    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("sky");
        ground.changeColor("green");
        sun.changeColor("yellow");
        moon.changeColor("yellow");
        star1.changeColor("sky");
        star2.changeColor("sky");
        star3.changeColor("sky");
        star4.changeColor("sky");
        star5.changeColor("sky");
        star6.changeColor("sky");
        star7.changeColor("sky");
        treetrunk1.changeColor("brown");
        treetrunk2.changeColor("brown");
        treetop1.changeColor("green");
        treetop2.changeColor("green");
        treebottom1.changeColor("green");
        treebottom2.changeColor("green");
        treebottom1a.changeColor("green");
        treebottom2a.changeColor("green");
        lumberjack.changeColor("brown");
        treetrunk1.changeColor("brown");
        treetrunk2.changeColor("brown");
        lumberjack.changeColor("brown");
        axehandle1.changeColor("black");
        axehandle2.changeColor("black");
        axehandle3.changeColor("black");
        axehandle4.changeColor("black");
        axe.changeColor("black");
    }
}
