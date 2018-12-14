PImage face;
void setup(){
  face = loadImage("Weird.jpg");
  size(800, 600);
   face.resize(800,600);    
  background(face);

}
void draw(){
  background(face);
fill(255,255,255);
  ellipse(320,320, 80 ,60);

fill(255,255,255);
  ellipse(500,325, 80 ,60);
  fill(0,0,0);
ellipse(mouseX,mouseY, 30 ,30);
ellipse(mouseX + 200,mouseY + 10, 30 ,30);
} 