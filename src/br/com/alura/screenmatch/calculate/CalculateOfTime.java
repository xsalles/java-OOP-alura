package br.com.alura.screenmatch.calculate;

import br.com.alura.screenmatch.models.Titles;

public class CalculateOfTime {
    private int totalTime;

    public int getTempoTotal() {
        return this.totalTime;
    }

    // public void include(Movie m){
    // this.totalTime += m.getDurationInMinutes();
    // }

    // public void include(Series s){
    // this.totalTime += s.getDurationInMinutes();
    // }

    public void include(Titles title) {
        this.totalTime += title.getDurationInMinutes();
    }
}
