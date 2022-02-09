/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genius;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;


/**
 *
 * @author Liedson
 */
public class TocarSom {
    
    /**
     *
     * @param caminho_arquivo
     */
    public void play(String caminho_arquivo) throws UnsupportedAudioFileException, IOException, LineUnavailableException {                        
        
        File file = new File(caminho_arquivo);
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file.getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        
        clip.start();
        clip.loop(0);
        
    }
}
    
