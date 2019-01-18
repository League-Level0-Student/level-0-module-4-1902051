int x = 100;
int y = 1000;
PImage creeper; 
void draw() {
image(creeper, x, y);
}
void setup() {
size(1800,1800);
PImage minecraft = loadImage("ah.jpg");     //in setup method
minecraft.resize(1800, 1800);          //in setup method
background(minecraft);          //in setup method
creeper=loadImage("Creeper.jpg"); 
creeper.resize(100,100);
minecraft.resize(1296,1935);
}