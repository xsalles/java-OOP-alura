package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculate.Classificate;

public class Movie extends Titles implements Classificate {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassification() {
        return (int) getAverage() / 2;
    }
}
