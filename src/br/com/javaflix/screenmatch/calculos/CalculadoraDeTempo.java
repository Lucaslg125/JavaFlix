package br.com.javaflix.screenmatch.calculos;

import br.com.javaflix.screenmatch.modelos.Filme;
import br.com.javaflix.screenmatch.modelos.Serie;
import br.com.javaflix.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal(){
        return tempoTotal;
    }

/*    public void inclui(Filme f){
        tempoTotal += f.getDuracaoEmMinutos();
    }

    public void inclui(Serie s){
        this.tempoTotal += s.getDuracaoEmMinutos();
    }*/
    public void inclui(Titulo titulo){
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}