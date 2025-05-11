
package circular;
//derived class 
public class Cone extends Circular {
   
    
    void predefinedValues(){//method to predefine the values
        this.set(14, 5);//radius=14cm,height=5cm
    }
    
    //overriding the abstract class inherited from the Circular class
    @Override
    void volume(){
        double volume=22*(this.radius*this.radius*this.height)/7;//volume=22/7 by radius^2 by height
        
        System.out.println("The volume of Cone is:"+volume+"cm3");//output volume calculated in cm3
    }
    
    
    
}
