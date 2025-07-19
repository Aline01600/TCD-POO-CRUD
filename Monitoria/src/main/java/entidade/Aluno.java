
package entidade;

public class Aluno {
    private String nome;
    private String cpf;
    private String disciplina;
    private String matricula;
    private String telefone;
    private String email;
    private boolean ehMonitor = false;
    
    
    public Aluno(String nome,String cpf, String disciplina, String matricula,String telefone, String email, boolean ehMonitor) {
        this.nome = nome;
        this.cpf = cpf;
        this.disciplina = disciplina;
        this.matricula = matricula;
        this.telefone = telefone;
        this.email = email;
        this.ehMonitor = ehMonitor;
    }
    //<editor-fold defaultstate="collapsed" desc="Getters/Setters">
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    } 
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean getEhMonitor() {
        return ehMonitor;
    }
     public void setEhMonitor(boolean ehMonitor) {
        this.ehMonitor = ehMonitor;
    }
    //</editor-fold>
}
