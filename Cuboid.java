
package rectangular;

public class Cuboid extends Rectangular{
    void predefinedValues(){
        this.length=10;
        this.width=5;
        this.height=8;
    }
    @Override
    void volume(){
        double volume=this.length*this.width*this.height;
        System.out.println("Volume of Cuboid:"+volume+"cm3");
        
    }
    

 
}
