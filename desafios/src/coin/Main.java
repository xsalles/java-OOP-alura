package coin;

import coin.calculate.ConvertCurrency;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ConvertCurrency dollarToReal = new ConvertCurrency();

        System.out.println("""
                
                SEJA BEM VINDO AO CONVERSOR DE DÓLAR PARA REAL
                
                Digite a quantidade em dólares que vocÊ deseja converter
               
                """);
        dollarToReal.setDollar(sc.nextDouble());

        System.out.printf("\nSe você tem U$%.2f dólares, você tem R$%.2f reais!", dollarToReal.getDollar(), dollarToReal.getConvertDollarToReal());

        sc.close();
    }
}
