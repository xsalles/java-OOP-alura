public class Series extends Titles {
    private int seasons;
    private int episodesBySeason;
    private boolean active;
    private int minutesByEpisodes;
    
    public int getMinutesByEpisodes() {
        return minutesByEpisodes;
    }
    public void setMinutesByEpisodes(int minutesByEpisodes) {
        this.minutesByEpisodes = minutesByEpisodes;
    }

    public boolean isActive() {
        return active;
    }
    public void setActive(boolean active) {
        this.active = active;
    }
    
    public int getEpisodesBySeason() {
        return episodesBySeason;
    }
    public void setEpisodesBySeason(int episodesBySeason) {
        this.episodesBySeason = episodesBySeason;
    }
    
    public int getSeasons() {
        return seasons;
    }
    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    @Override
    public int getDurationInMinutes (){
        return seasons * episodesBySeason * minutesByEpisodes;
    }
}
