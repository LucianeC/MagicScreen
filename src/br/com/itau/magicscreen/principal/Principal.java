package br.com.itau.magicscreen.principal;

import br.com.itau.magicscreen.calculo.CalculadoraDeTempo;
import br.com.itau.magicscreen.calculo.FiltroRecomendacao;
import br.com.itau.magicscreen.modelos.Episodio;
import br.com.itau.magicscreen.modelos.Filme;
import br.com.itau.magicscreen.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme("Poderoso Chefão", 1970);
        filme1.setDuracaoEmMinutos(180);
        filme1.setIncluidoNoPlano(false);
        System.out.println("Duração em minuto: " + filme1.getDuracaoEmMinutos());


        filme1.exibeFichaTecnica();
        filme1.avalia(9);
        filme1.avalia(4);
        filme1.avalia(6);
        filme1.avalia(10);
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.pegaMedia());


        Filme filme2 = new Filme("Avatar", 1920);
        filme2.setDuracaoEmMinutos(200);
        filme2.setIncluidoNoPlano(true);


        var filme3 = new Filme("Vovozona2", 2011);
//        filme3.setNome("Vovozona2");
//        filme3.setAnoDeLancamento(2011);
        filme3.setDuracaoEmMinutos(180);
        filme3.setIncluidoNoPlano(true);
        filme3.avalia(9);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);

        System.out.println("Tamanho da lista é " + listaDeFilmes.size() + " Filmes");
        System.out.println("Primeiro filme é " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(1).toString());


        Serie serie1 = new Serie("Lost", 2001);
        serie1.setTemporadas(5);
        serie1.setEspisodiosPorTemporada(14);
        serie1.setMinutosPorEpisodio(45);
        System.out.println("Duração em minutos para maratonar: " + serie1.getDuracaoEmMinutos());



        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(serie1);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(filme1);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie1);
        episodio.setTotalVisualizacao(300);
        filtro.filtra(episodio);
    }
}