
package Interface;

/**
 *
 * @author 19410100076
 */
public class PhoneUser {
    
    private Phone phone;

    PhoneUser(Phone p) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        phone = p;
    }

    
    public void turnOnThePhone(){
        
        phone.poweron();
        
    }
    
    public void turnOffThePhone(){
        
        phone.poweroff();
        
    }
    
    public void makePhoneLouder(){
        
        phone.volumeup();
        
    }
    
    public void makePhoneSilent() {
        
        phone.volumedown();
        
    }
    
}
