/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment5;

/**
 *
 * @author aditt
 */
public class Thread1 extends Thread {
    String[] tones = {"do.wav", "mi.wav", "sol.wav", "si.wav", "do-octave.wav"};
    FilePlayer fp = new FilePlayer();
    
    @Override
    public void run() {
        for (String tone : tones) {
            try {
                if (tone.equals("do-octave.wav")) {
                    // Synchronization point - wait for Thread2 to reach the same point
                    Thread.sleep(1500);  // Match Thread2's delay
                }
                fp.play("D:/Study/Semester 1/INFO5100/Assignment/Assignment5/src/assignment5/Sounds/" + tone);
                System.out.println("Thread 1 played :: " + tone);
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
