import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Lightning extends PApplet {

//Lucy C., APCS, Mods 6-7, Lightning
int startX = 150;
int startY = 0;
int endX = 150;
int endY = 0;
int color1 = (int)(Math.random()*256);
int color2 = (int)(Math.random()*256);
int color3 = (int)(Math.random()*256);
public void setup()
{
  size(300,300);
  strokeWeight(2);
  background(0);
}
public void draw()
{
	stroke(color1,color2,color3);
	while(endX < 300)
	{
		endX = startX + ((int)(Math.random()*17)-8);
		endY = startY + ((int)(Math.random()*10));
		line(startX,startY,endX,endY);
		startX = endX;
		startY = endY;
	}
	cloud();
}
public void cloud()
{
	noStroke();
	fill(127);
	ellipse(150,0,100,75);
	ellipse(100,0,140,100);
	ellipse(50,0,130,90);
	ellipse(200,0,120,85);
	ellipse(250,0,125,90);
}
public void mousePressed()
{
	startX = ((int)(Math.random()*290)+5);
	startY = 0;
	endX = 150;
	endY = 0;
	color1 = (int)(Math.random()*256);
	color2 = (int)(Math.random()*256);
	color3 = (int)(Math.random()*256);
}

  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Lightning" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
