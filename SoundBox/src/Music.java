public class Music extends Audio{
    private String artist;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    void showInformations(){
        System.out.printf("""
                    
                    Título: %s.
                    Duração: %.2f.
                    Total de reproduções: %d.
                    Curtidas: %d.
                    Artista: %s
                    
                    """, getTitle(), getDuration(), getTotalOfReproductions(), getLikes(), getArtist());
    }
}
