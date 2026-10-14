package Model;

public class Tarefa {

    private int id;
    private Pessoa responsavel;
    private String nometarefa;
    private String descricao;

    public Tarefa(int id, Pessoa responsavel, String nometarefa, String descricao) {
        this.id = id;
        this.responsavel = responsavel;
        this.nometarefa = nometarefa;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Pessoa getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Pessoa responsavel) {
        this.responsavel = responsavel;
    }

    public String getNome() {
        return nometarefa;
    }

    public void setNome(String nome) {
        this.nometarefa = nometarefa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "id=" + id +
                ", responsavel=" + responsavel +
                ", nome='" + nometarefa + '\'' +
                ", descricao='" + descricao + '\'' +
                '}' + "\n";
    }
}
