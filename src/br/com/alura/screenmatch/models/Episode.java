package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculate.Classificate;

public class Episode extends Titles implements Classificate {
    private int number;
    private String name;
    private Series serie;
    private int totalVisualizations;

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getClassification() {
        if (totalVisualizations > 100) {
            return 4;
        } else{
            return 2;
        }
 
    }
}
