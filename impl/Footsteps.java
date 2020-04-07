package impl;

public class Footsteps extends Sound {
	
	@Override
    public String getFilePath() {
        try {
            return Class.class.getResource("/resources/soundtrack.wav").getPath();
        }
        catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
