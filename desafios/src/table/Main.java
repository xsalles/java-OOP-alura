package table;

import table.calculate.Table;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Table numberChosed = new Table();

        System.out.println("""
                
                SEJA BEM VINDO A CALCULADORA DE TABUADA
                
                Digite o número que deseja saber a tabuada.
                (O número será multiplicado do 1 até o 10.
                
                """);
        numberChosed.setNumber(sc.nextInt());

        numberChosed.calcTable(numberChosed.getNumber());
    }
}
