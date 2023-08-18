public class Principal {
    public static void main(String[] args) {
        Filme filme1 = new Filme();
        filme1.nome = "Poderoso Chefão";
        filme1.anoDeLancamento =1970;
        filme1.duracaoEmMinutos = 180;
        filme1.incluidoNoPlano = false;

        filme1.exibeFichaTecnica();
        filme1.avalia(9);
        filme1.avalia(4);
        filme1.avalia(6);
        filme1.avalia(10);
        System.out.println(filme1.somaDasAvaliacoes);
        System.out.println(filme1.totalDeAvaliacoes);
        System.out.println(filme1.pegaMedia());

    }
}