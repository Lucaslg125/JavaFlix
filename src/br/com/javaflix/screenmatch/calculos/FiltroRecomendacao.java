package br.com.javaflix.screenmatch.calculos;
public class FiltroRecomendacao {
    private String recomendacao;
    public void filtra(Classificavel classificavel) {
        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() >= 2) {
            System.out.println("Muito bem avaliado no mmomento");
        } else {
            System.out.println("Coloque na sua lista para assitir depois");
        }
    }
}
