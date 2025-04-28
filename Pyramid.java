
package rectangular;


public class Pyramid extends Rectangular{
    void predefinedValues(){
        super.set(12,6 , 9);
    }
    @Override//implementing the abstract volume method in the Pyramid class
    void volume(){
        double volume=(this.length*this.width)/3*this.height;
        System.out.println("Volume of Pyramid :"+volume+"cm3");
    }
    
}
