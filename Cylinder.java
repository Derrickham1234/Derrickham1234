package circular;

//derived class
public class Cylinder extends Circular {
    
    void predefinedValues(){//method to predefine the values
        this.set(14, 10);//radius=14cm,height=10cm
    }
    
    //overriding the abstract method volume inherited from the Circular class
    @Override
    void volume(){
       double volume=22*(this.radius*this.radius*this.height)/7;//volume =22/7 by radius^2 by height
       
       System.out.println("The volume of Cylinder is:"+volume+"cm3");//output calculated volume in cm3
    }
    
}
