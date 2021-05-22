
package abstrak;

/**
 *
 * @author 19410100076
 */
public class Circle extends shape {
    
    private double radius;

    public Circle(double radius) {
        
        this.radius = radius;
        
    }
    
    

    @Override
    double GetArea() {
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        double areacircle = ( Math.PI * radius * radius);
        System.out.println("Luas Lingkaran adalah\t: " + areacircle );
        
        return areacircle;
    }
    
    
    
}
