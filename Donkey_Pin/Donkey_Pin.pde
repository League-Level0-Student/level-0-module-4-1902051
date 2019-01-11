PImage donkey;
PImage tail;
void setup(){

donkey = loadImage("donkey.png");
tail = loadImage("tail.jpg");
size(227,222);

}
void draw(){
image(tail, mouseX, mouseY);
rect(0,0,30,30);
tail.resize(50,50);
image(tail, mouseX-10,mouseY-20);
rect(0,0,30,30);
if (dist(0, 0, mouseX, mouseY)  < 30) {
background (donkey);


} 
else {
background(277,222);
fill(0,244,244);
}
}