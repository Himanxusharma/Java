package Misc;
//loosly coupled When two classes, modules, or components have low dependencies on each other, 
//it is called loose coupling in Java. Loose coupling in Java means that the classes are independent of each other.
class LooslyCoupledVolume {

    public static void main(String args[]) {
 
         Cylinder b = new Cylinder(25, 25, 25);
 
            System.out.println(b.getVolume());
 
    }
 
 }
 
 final class Cylinder {
 
     private int volume;
 
     Cylinder(int length, int width, int height) {
 
              this.volume = length * width * height;
 
     }
 
     public int getVolume() {
 
              return volume;
 
     }
 
 }