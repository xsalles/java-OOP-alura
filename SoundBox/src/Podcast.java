import java.util.Scanner;

public class Podcast extends Audio {
   private String Channel;


    public String getChannel() {
        return Channel;
    }

    public void setChannel(String channel) {
        Channel = channel;
    }

    @Override
    void showInformations(){
        System.out.printf("""
                    
                    Título: %s.
                    Duração: %.2f.
                    Total de reproduções: %d.
                    Curtidas: %d.
                    Canal: %s
                    
                    """, getTitle(), getDuration(), getTotalOfReproductions(), getLikes(), getChannel());
    }

}
