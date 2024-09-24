package rectangle_room;

import rectangle_room.calculate.MeasureRoom;

import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        MeasureRoom myRoom = new MeasureRoom();

        System.out.println("""
                
                SEJA BEM VINDO AO CALCULADOR DE ÁREA E PERÍMETRO DE SALAS
                
                Digite o valor da altura em cm da sua sala:
                
                """);
        myRoom.setHeight(sc.nextDouble());

        System.out.println("""
                
                SEJA BEM VINDO AO CALCULADOR DE ÁREA E PERÍMETRO DE SALAS
                
                Digite o valor da largura em cm da sua sala:
                
                """);
        myRoom.setWidth(sc.nextDouble());



        System.out.printf("O valor do perímetro é %.2f", myRoom.calcPermiter(myRoom.getHeight(), myRoom.getWidth()));
        System.out.printf("O valor da área é %.2f", myRoom.calcArea(myRoom.getHeight(), myRoom.getWidth()));
    }
}
