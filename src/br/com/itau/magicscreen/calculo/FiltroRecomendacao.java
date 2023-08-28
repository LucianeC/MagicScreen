package br.com.itau.magicscreen.calculo;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >=2) {
            System.out.println("Muito bem classificado");
        } else {
            System.out.println("Coque ba sua lista para assistir depois");
        }
    }
}