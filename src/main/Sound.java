/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

/**
 *
 * @author admin
 */
public class Sound {
    
    Clip clip;
    URL soundURL[] = new URL[30];
    
    public Sound() {
    
        soundURL[0] = getClass().getResource("/sound/BlueBoyAdventure.wav");
        soundURL[1] = getClass().getResource("/sound/coin.wav");
        soundURL[2] = getClass().getResource("/sound/powerup.wav");
        soundURL[3] = getClass().getResource("/sound/unlock.wav");
        soundURL[4] = getClass().getResource("/sound/fanfare.wav");
        soundURL[5] = getClass().getResource("/sound/hitmonster.wav");
        soundURL[6] = getClass().getResource("/sound/receivedamage.wav");
        soundURL[7] = getClass().getResource("/sound/receivedamage.wav");
        soundURL[8] = getClass().getResource("/sound/levelup.wav");
        soundURL[9] = getClass().getResource("/sound/cursor.wav");
    }
    
    public void setFile(int i) {
    
            try{
                AudioInputStream ais = AudioSystem.getAudioInputStream(soundURL[i]);
                clip = AudioSystem.getClip();
                clip.open(ais);
            }catch(Exception e) {
                
            }
    }
    public void play() {
            clip.start();
    }
    public void loop() {
            clip.loop(Clip.LOOP_CONTINUOUSLY);
    
    }
    public void stop() {
            clip.stop();
    }
}
