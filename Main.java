
package rectangular;

public class Main {
        public static void main(String[]args){
            //Instantiating the class Cuboid and Pyramid
           Cuboid C=new Cuboid();
           Pyramid P=new Pyramid();
           //setting the values to calculate volume
           C.set(10, 5, 8);
           P.set(12, 6, 9);
           //Calculating volume 
           C.volume();
           P.volume();
            
            
            
            
            
        }



    
}
