package music;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Music myMusic = new Music();

        System.out.println("Qual o nome da sua música favorita?");
        myMusic.nameOfTheMusic = sc.next();

        System.out.println("\nQual o nome do artista que canta essa música?\n");
        myMusic.artist = sc.next();

        System.out.println("\nQual o ano de lançamento dessa música?\n");
        myMusic.yearOfRelease = sc.nextInt();

        myMusic.showTheAverage(9);
        myMusic.showTheAverage(2);
        myMusic.showTheAverage(8);

        myMusic.technicalSheet();

        sc.close();
    }
}
