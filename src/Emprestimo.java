import java.util.Date;

public class Emprestimo {

    private Long idEmprestimo = 1L;
    private Livro livro;
    private String nomeUsuario;
    private Date dataEmprestimo;
    private Date dataDevolucao;
    private boolean ativo;

    public Emprestimo(Livro livro, String nomeUsuario){
        this.idEmprestimo = idEmprestimo++;
        this.livro = livro;
        this.nomeUsuario = nomeUsuario;
        this.dataEmprestimo = new Date();
        this.ativo = true;
    }

    public Long getIdEmprestimo() {
        return idEmprestimo;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Date dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void devolucao(){
        this.ativo = false;
        this.dataDevolucao = new Date();
        this.livro.setDisponivel(true);
    }

}
