
package abstrak;


public class triangel extends shape{

    protected double base, height;

    public triangel(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }
    
    
    
    @Override
    double GetArea() {
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        Rumus MEncari Luas Segitiga
        double areatriangel = (0.5 * getBase() * getHeight() );
        System.out.println("Luas SegiTiga adalah\t: " + areatriangel);

        return areatriangel;

    }
    
    
    
}
