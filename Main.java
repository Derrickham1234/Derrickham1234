
package circular;

//main program that runs the project
public class Main {
    
    public static void main(String[]args){
        
        //instantiating Cylinder and Cone classes
        Cylinder CY=new Cylinder();
        Cone CO=new Cone();
        
        //initializing  dimensions
        CY.set(14, 10);//radius and height respectively in cm
        CO.set(14, 5);
        
        //method to calculate and output volume
        CY.volume();
        CO.volume();
    }
    
}
