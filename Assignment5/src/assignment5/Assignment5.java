/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package assignment5;

import assignment5.Bonus.Thread3;
import assignment5.Bonus.Thread4;
import java.util.concurrent.CountDownLatch;

/**
 *
 * @author aditt
 */
public class Assignment5 {

    /**
     * Run Task and BonuS separately 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
        
        //BonuS is working
        
        
//         String[] song = {
//            "do.wav", "do.wav", "sol.wav", "sol.wav", "la.wav", "la.wav", "sol.wav",
//            "sol.wav", "sol.wav", "fa.wav", "fa.wav", "mi.wav", "mi.wav", "re.wav",
//            "do.wav", "do.wav", "sol.wav", "sol.wav", "la.wav", "la.wav", "sol.wav",
//            
//        };
//         
//         // Create synchronization latch (1 count for the octave note)
//        CountDownLatch octaveLatch = new CountDownLatch(2);
//        
//        // Create and start threads
//        Thread3 melodyThread = new Thread3(song, octaveLatch);
//        Thread4 harmonyThread = new Thread4(song, octaveLatch);
//        
//        melodyThread.start();
//        harmonyThread.start();
    }
    
}
