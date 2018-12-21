PImage face;
int x;
int y;
void setup(){
  face = loadImage("Weird.jpg");
  size(800, 600);
   face.resize(800,600);    
  background(face);

}
void draw(){
  background(face);
fill(255,255,255);
x = mouseX;
y = mouseY;
  ellipse(320,320, 80 ,60);
if (mouseX > 360){ 
  x = 360;

}
fill(255,255,255);
  ellipse(500,325, 80 ,60);
  
  if(mouseY > 360) {
  y = 360;
  }
  fill(0,0,0);
  if (mouseX < 280){
 x = 280; 
  }
    if (mouseY < 280){
 y = 280; 
  }
ellipse(x,y, 30 ,30);
ellipse(x + 200,y + 10, 30 ,30);

} 