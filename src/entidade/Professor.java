package entidade;

/**
 *
 * @author vitor
 */

public class Professor {
    private int id;
    private String nome;
    private String departamento;
    private boolean naLixeira = false;

    // Construtor de Professor
    public Professor(int id, String nome, String departamento) {
        this.id = id;
        this.nome = nome;
        this.departamento = departamento;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public boolean isNaLixeira() {
        return naLixeira;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setNaLixeira(boolean naLixeira) {
        this.naLixeira = naLixeira;
    }

    @Override
    public String toString() {
        return "Professor{id=" + id + ", nome=\"" + nome + "\", departamento=\"" + departamento + "\", naLixeira=" + naLixeira + "}";
    }
}
