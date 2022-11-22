
package thread;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class MinhaThread extends Thread{
    
    private String nome;
    private Integer tempoSono;

    public MinhaThread(String nome, Integer tempoSono) {
        this.nome = nome;
        this.tempoSono = tempoSono;
        this.start();
    }
    
    @Override
    public void run() {
        final int MAX = 5;
        try {
            for (int i = 1; i < MAX; i++) {
                System.out.println("Thread "+this.nome+" esta executando pela "+i+" vez");
                sleep(tempoSono);
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Thread "+this.nome+" terminou execução");
    }
    
}
