package Misc;

class TightlyCoupledVolume {

    public static void main(String args[]) {
 
         Cylinder b = new Cylinder(15, 15, 15);
 
            System.out.println(b.volume);
 
    }}
 
  class Cylinder {
 
    public int volume;
 
    Cylinder(int length, int width, int height) {
 
            this.volume = length * width * height;  }}