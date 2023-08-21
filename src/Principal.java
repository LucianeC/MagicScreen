import itau.magicscreen.modelo.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.setNome("Poderoso Chefão");
        filme1.setAnoDeLancamento(1970);
        filme1.setDuracaoEmMinutos(180);
        filme1.setIncluidoNoPlano(false);


        filme1.exibeFichaTecnica();
        filme1.avalia(9);
        filme1.avalia(4);
        filme1.avalia(6);
        filme1.avalia(10);
        System.out.println("Total de avaliações: " + filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.pegaMedia());

    }
}