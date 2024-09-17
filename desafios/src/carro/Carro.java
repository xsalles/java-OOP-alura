package carro;
public class Carro {
    String modelo, cor;
    int ano = 0;
    int anoAtual = 2024;

    void showInformations(){
        System.out.printf("""
                \nModelo: %s
                Cor: %s
                Ano do carro: %d
                """, modelo, cor, ano);
    }
}
