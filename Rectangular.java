
package rectangular;


public abstract class Rectangular {
     double length;
     double width;
     double height;
    
    void set(double length,double width,double height){
        this.length=length;
        this.width=width;
        this.height=height;
    }
    abstract void volume();
    
    

 
}
