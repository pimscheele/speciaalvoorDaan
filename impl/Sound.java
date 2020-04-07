package impl;

import java.io.File;

import javax.sound.sampled.*;

public abstract class Sound {
	
	private Thread _thread;
	private boolean loop = false;

    public Sound() {
        _thread = new Player();
    }

    public abstract String getFilePath();

    public void play() {
        _thread.start();
        loop = false;
    }

    public void block() {
        try {
            _thread.join();
        }
        catch (InterruptedException e) {
            // Niets doen
        }
    }

    public boolean isPlaying() {
        return false;
    }
    
    public void loop() {
    	_thread.start();
    	loop = true;
    }

    private class Player extends Thread implements Runnable {
    	@Override
        public void run() {
        	do {
        		play();
        	}
        	while (loop);
        }
        
        private void play() {
        	File file = new File(getFilePath());

            AudioInputStream stream;
            SourceDataLine source;

            try {
                stream = AudioSystem.getAudioInputStream(file);
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }

            AudioFormat format = stream.getFormat();

            DataLine.Info info = new DataLine.Info(SourceDataLine.class, format);
            try {
                source = (SourceDataLine)AudioSystem.getLine(info);
            }
            catch (Exception e) {
                e.printStackTrace();
                return;
            }
            try {
                source.open(format);
            }
            catch (Exception e) {
                e.printStackTrace();
                return;
            }
            source.start();

            int bytesRead = 0;
            int BUFFER_SIZE = 128000;
            byte[] data = new byte[BUFFER_SIZE];

            while (bytesRead != -1) {
                try {
                    bytesRead = stream.read(data, 0, data.length);
                }
                catch (Exception e) {
                    e.printStackTrace();
                    return;
                }
                if (bytesRead >= 0) {
                    @SuppressWarnings("unused")
                    int bytesWritten = source.write(data, 0, bytesRead);
                }
            }
            source.drain();
            source.close();

        }
    }
}