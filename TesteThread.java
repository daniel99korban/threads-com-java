
package thread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class TesteThread {
    public static void main(String[] args) {
        
        MinhaThread t1 = new MinhaThread("#1", 1000);
        MinhaThread t2 = new MinhaThread("#2", 1400);
        MinhaThread t3 = new MinhaThread("#3", 1200);
        
        // quando as threads se enceraram a proxima linha d codigo irá rodar
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(TesteThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("O processo terminou");
        
    }
}
