/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package assignment5.Bonus;

import assignment5.FilePlayer;
import java.util.concurrent.CountDownLatch;

/**
 *
 * @author aditt
 */

public class Thread4 extends Thread {
    private final String[] allowedTones = {"re.wav", "fa.wav", "la.wav", "do-octave.wav"};
    private FilePlayer fp = new FilePlayer();
    private String[] songSequence;
    private CountDownLatch latch;
    
    public Thread4(String[] songSequence, CountDownLatch latch) {
        this.songSequence = songSequence;
        this.latch = latch;
    }
    
    @Override
    public void run() {
        for (String tone : songSequence) {
            try {
                if (isAllowed(tone)) {
                    if (tone.equals("do-octave.wav")) {
                        latch.countDown();  // Signal ready to play octave
                        latch.await();     // Wait for Thread1 to be ready
                    }
                    
                    fp.play("D:/Study/Semester 1/INFO5100/Assignment/Assignment5/src/assignment5/Sounds/" + tone);
                    System.out.println("Thread 4 ( Which is Thread 2) played :: " + tone);
                    Thread.sleep(500);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    private boolean isAllowed(String tone) {
        for (String allowed : allowedTones) {
            if (allowed.equals(tone)) return true;
        }
        return false;
    }
}