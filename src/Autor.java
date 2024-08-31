import java.util.Date;

public class Autor {
    private Long idAutor = 1L;
    private String nome;
    private Date nascimentoAutor;

    public Autor(long idAutor, String nome, Date nascimentoAutor) {

        this.idAutor = idAutor++;
        this.nome = nome;
        this.nascimentoAutor = nascimentoAutor;
    }

    public void setIdAutor(long idAutor) {
        this.idAutor = idAutor;
    }

    public long getIdAutor() {
        return idAutor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNascimentoAutor(Date nascimentoAutor) {
        this.nascimentoAutor = nascimentoAutor;
    }

    public Date getNascimentoAutor() {
        return nascimentoAutor;
    }

    @Override
    public String toString(){
        return "Autor"+
                "id: "+ idAutor +
                "nome = " + nome +
                "Nascimento: " + nascimentoAutor;
    }
}
