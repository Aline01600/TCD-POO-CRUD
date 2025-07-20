package entidade;

/**
 *
 * @author vitor
 */

public class Professor {
    private int id;
    private String nome;
    private String departamento;

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

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Professor{id=" + id + ", nome=\"" + nome + "\", departamento=\"" + departamento + "\", naLixeira=" + naLixeira + "}";
    }
}
