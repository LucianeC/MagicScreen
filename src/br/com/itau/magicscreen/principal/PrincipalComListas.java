package br.com.itau.magicscreen.principal;

import br.com.itau.magicscreen.modelos.Filme;
import br.com.itau.magicscreen.modelos.Serie;
import br.com.itau.magicscreen.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Poderoso Chefão", 1970);
        filme1.avalia(6);
        Filme filme2 = new Filme("Avatar", 1920);
        filme2.avalia(10);
        var filme3 = new Filme("Vovozona2", 2011);
        filme3.avalia(9);
        Serie serie1 = new Serie("Lost", 2001);


        List<Titulo> lista = new LinkedList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie1);



        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof  Filme  ){
                Filme filme = (Filme) item;
                System.out.println("Classificação: " +filme.getClassificacao());
            }

        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Ludmila");
        buscaPorArtista.add("Baco");
        buscaPorArtista.add("L7");
        buscaPorArtista.add("Anitta");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de filmes");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenado por ano");
        System.out.println(lista);
    }
}