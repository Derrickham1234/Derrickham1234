//Java program to demonstrate inheritance and polymorphism
package circular;

    //base class
    public abstract class Circular {
        
        //declaration of instance variables 
        double radius;
        double height;

    void set(double radius,double height){//constructor method to initialize variables
        this.radius=radius;
        this.height=height;  
    }
    //abstract method volume that will be overriden in the derived class
    abstract void volume();
    
}
