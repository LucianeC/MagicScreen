
package br.com.itau.magicscreen.calculo;

        import br.com.itau.magicscreen.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

//        public void inclui(Filme f){
//        TempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//        TempoTotal += s.getDuracaoEmMinutos();
//    }

    public void inclui(Titulo titulo){

        this.tempoTotal += titulo.getDuracaoEmMinutos();

    }


}