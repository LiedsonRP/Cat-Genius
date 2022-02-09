/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genius;

        
import java.io.IOException;
import java.io.InputStream;
import javax.sound.sampled.*;
import javax.swing.SwingUtilities;


public class TocarSom {
    
    Clip oClip;

    public void play_sound(String caminho_arquivo) {
        System.out.println("hello");
        try {            
            // Carrega o arquivo de áudio (não funciona com .mp3, só .wav) 
            String caminho = caminho_arquivo;                        
            InputStream input = getClass().getResourceAsStream(caminho);                     
            oClip = AudioSystem.getClip();            
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(input);            
            oClip.open(audioInput);
            
            FloatControl gainControl = (FloatControl) oClip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(+6.0f);

            oClip.loop(0); // Toca uma vez            
            //clip.loop(Clip.LOOP_CONTINUOUSLY); // Toca continuamente (para o caso de músicas)

            // Para a execução (senão o programa termina antes de você ouvir o som)
            SwingUtilities.invokeLater(() -> {
            });
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.println(e);
        }
    }
    
    public void play_music(String caminho_arquivo) {
        System.out.println("hello");
        try {            
            // Carrega o arquivo de áudio (não funciona com .mp3, só .wav) 
            String caminho = caminho_arquivo;                        
            InputStream input = getClass().getResourceAsStream(caminho);                     
            oClip = AudioSystem.getClip();            
            AudioInputStream audioInput = AudioSystem.getAudioInputStream(input);                        
            oClip.open(audioInput);      
            
            FloatControl gainControl = (FloatControl) oClip.getControl(FloatControl.Type.MASTER_GAIN);
            gainControl.setValue(-5.0f);

            oClip.loop(Clip.LOOP_CONTINUOUSLY); // Toca uma vez            
            //clip.loop(Clip.LOOP_CONTINUOUSLY); // Toca continuamente (para o caso de músicas)
            
            // Para a execução (senão o programa termina antes de você ouvir o som)
            SwingUtilities.invokeLater(() -> {
            });
        } catch (IOException | LineUnavailableException | UnsupportedAudioFileException e) {
            System.out.println(e);
        }
        
             
    }
    
    public void stop() {
        this.oClip.stop();
    }

}

