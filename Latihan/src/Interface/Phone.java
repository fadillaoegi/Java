package Interface;

/**
 *
 * @author 10410100076
 */
public interface Phone {
    
//    Konstanta
    int MAX_VOLUME = 100;
    int MIN_VOLUME = 0;
    
//    Abstract method
    void poweron();
    void poweroff();
    void volumeup();
    void volumedown();
    
}
