
package Interface;

/**
 *
 * @author 19410100076
 */
public class Xiomi implements Phone{
    
    private int volume;
    private boolean isPowerOn; //true or false

//    public Xiomi(Phone p) {
//        super(p);
//    }

//    Xiomi() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }


    @Override
    public void poweron() {
        
        isPowerOn = true;
        System.out.println("Power On");
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void poweroff() {
  
        isPowerOn = false;
        System.out.println("Power off");
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void volumeup() {
  
        volume = 15;
        System.out.println("Volume Up   : " + volume);
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void volumedown() {
        
        volume = 5;
        System.out.println("Volume Down : " + volume);
        
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void GetVolume () {
        
        System.out.println("volume has changed");
        
    }
    
}
