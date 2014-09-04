//Lucy C., APCS, Mods 6-7, Lightning
int startX = 150;
int startY = 0;
int endX = 150;
int endY = 0;
int color1 = (int)(Math.random()*256);
int color2 = (int)(Math.random()*256);
int color3 = (int)(Math.random()*256);
void setup()
{
  size(300,300);
  strokeWeight(2);
  background(0);
}
void draw()
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
void cloud()
{
	noStroke();
	fill(127);
	ellipse(150,0,100,75);
	ellipse(100,0,140,100);
	ellipse(50,0,130,90);
	ellipse(200,0,120,85);
	ellipse(250,0,125,90);
}
void mousePressed()
{
	startX = ((int)(Math.random()*290)+5);
	startY = 0;
	endX = 150;
	endY = 0;
	color1 = (int)(Math.random()*256);
	color2 = (int)(Math.random()*256);
	color3 = (int)(Math.random()*256);
}

