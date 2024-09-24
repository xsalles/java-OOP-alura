package br.com.alura.screenmatch.calculate;

public class FilterRecomendate {

    public void filter(Classificate classificate){
        if(classificate.getClassification() >= 4){
            System.out.println("Está entre os preferidos do momento");
        } else if(classificate.getClassification() <= 2){
            System.out.println("Muito bem avaliado no momento");
        } else {
            System.out.println("Coloque na sua lista para assistir depois");
        }
    }
}
