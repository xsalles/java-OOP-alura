package convert_temperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ConvertTemperature convertTemperature = new ConvertTemperature();
        int answer = 0;

        while(answer != 3){
        System.out.println("""
                
                SEJA BEM VINDO AO TRANSFORMADOR DE TEMPARATURA
                
                1 - Quero transformar celsius em fahrenheit.
                2 - Quero transformar fahrenheit em celsius
                3 - Sair
                """);
        answer = sc.nextInt();

        switch (answer){
            case 1:
                System.out.println("Digite a temperatura em celsius que você deseja transformar em fahrenheit");
                convertTemperature.setCelsius(sc.nextDouble());
                convertTemperature.formCelsiusToFahrenheit(convertTemperature.getCelsius());
                System.out.printf("A temperatura é %.2f", convertTemperature.getFahrenheit());
                break;
            case 2:
                System.out.println("Digite a temperatura em fahrenheit que você deseja transformar em celsius");
                convertTemperature.setFahrenheit(sc.nextDouble());
                convertTemperature.formFahrenheitToCelsius(convertTemperature.getFahrenheit());
                System.out.printf("A temperatura é %.2f", convertTemperature.getCelsius());
                break;
            case 3: break;
            default:
                System.out.println("Opção inválida");
        }


    }
        sc.close();
}}
