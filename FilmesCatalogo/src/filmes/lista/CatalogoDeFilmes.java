package filmes.lista;

import java.util.ArrayList;import java.util.List;

public class CatalogoDeFilmes {
    private List<Filme> filmes;

    public CatalogoDeFilmes() {
        this.filmes = new ArrayList<>();
    }
    public void adicionarFilme(Filme filme) {
        filmes.add(filme);    }
    public void listarFilmes() {
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme no catálogo.");
            return;
        }        for (Filme filme : filmes) {
            System.out.println(filme);
        }
    }

    public Filme buscarFilmePorTitulo(String titulo) {
        for (Filme filme : filmes) {
            if (filme.getTitulo().equalsIgnoreCase(titulo)) {
                return filme;
            }
        }
        return null;
    }
}
