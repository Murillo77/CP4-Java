package filmes.lista;

public class Filme {
    private String titulo;
    private String diretor;
    private int ano;

    public Filme(String titulo, String diretor, int ano) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.ano = ano;
    }

    public Filme(String titulo) {
    }

    public String getTitulo() {
        return titulo;
    }
    public String getDiretor() {
        return diretor;
    }
    public int getAno() {
        return ano;
    }

}
