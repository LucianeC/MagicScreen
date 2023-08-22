import itau.magicscreen.modelo.Filme;
import itau.magicscreen.modelo.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("Poderoso Chefão");
        filme1.setAnoDeLancamento(1970);
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

        Serie serie1 = new Serie();
        serie1.setNome("Lost");
        serie1.setAnoDeLancamento(2001);
        serie1.setTemporadas(5);
        serie1.setEspisodiosPorTemporada(14);
        serie1.setMinutosPorEpisodio(45);
        System.out.println("Duração em minutos para maratonar: " + serie1.getDuracaoEmMinutos());

    }
}