public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    //Metodo ("Maneira de")
    void exibeFichaTecnica(){
        System.out.println("Nome do filme:" + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Duaração do filme: " + duracaoEmMinutos + " Min");
        System.out.println("Você faz parte do plano: " + incluidoNoPlano);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}