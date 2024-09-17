package music;

import java.util.Scanner;

public class Music {
    String nameOfTheMusic, artist;
    int yearOfRelease = 0;
    int numOfRates;
    double rates, average;
    Scanner sc = new Scanner(System.in);

    void showTheAverage(double note){
        rates += note;

        numOfRates++;

        average = rates / numOfRates;
    }



    void technicalSheet(){
        System.out.printf("""
                **********************
                Nome da música: %s
                Nome do artista: %s
                Ano de lançamento: %d
                Nota média para a música: %.1f
                **********************
                """, nameOfTheMusic, artist, yearOfRelease, average);
    }
}
