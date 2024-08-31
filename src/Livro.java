import java.util.Date;
import java.util.List;

public class Livro {

    private Long idLivro = 1L;
    private String titulo;
    private Autor autor;
    private boolean disponivel;
    private Date dataCadastro;
    private Date dataAtualiza;

    public Livro(long idLivro, String titulo, Autor autor , boolean disponivel , String dataCadastro , String dataAtualiza){
    this.idLivro = idLivro++;
    this.titulo = titulo;
    this.autor = autor;
    this.disponivel = true;
    this.dataCadastro = new Date();
    this.dataAtualiza = new Date();
    }

    public Long getIdLivro() {
        return idLivro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getDataAtualiza() {
        return dataAtualiza;
    }

    public void setDataAtualiza(Date dataAtualiza) {
        this.dataAtualiza = dataAtualiza;
    }
}