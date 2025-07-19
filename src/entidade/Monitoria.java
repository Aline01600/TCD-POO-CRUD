package entidade;

public class Monitoria {
    private int id;
    private Aluno aluno;
    private Professor professor;
    private String disciplina;
    private String horario;
    private boolean ativa;
    private boolean naLixeira;

    public Monitoria(int id, Aluno aluno, Professor professor, String disciplina, String horario, boolean ativa) {
        this.id = id;
        this.aluno = aluno;
        this.professor = professor;
        this.disciplina = disciplina;
        this.horario = horario;
        this.ativa = ativa;
        this.naLixeira = false;
    }

    // Getters e Setters
    public int getId() { return id; }
    public Aluno getAluno() { return aluno; }
    public Professor getProfessor() { return professor; }
    public String getDisciplina() { return disciplina; }
    public String getHorario() { return horario; }
    public boolean isAtiva() { return ativa; }
    public boolean isNaLixeira() { return naLixeira; }

    public void setId(int id) { this.id = id; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }
    public void setProfessor(Professor professor) { this.professor = professor; }
    public void setDisciplina(String disciplina) { this.disciplina = disciplina; }
    public void setHorario(String horario) { this.horario = horario; }
    public void setAtiva(boolean ativa) { this.ativa = ativa; }
    public void setNaLixeira(boolean naLixeira) { this.naLixeira = naLixeira; }

    @Override
    public String toString() {
        return "Monitoria [id=" + id + ", aluno=" + aluno.getNome() + ", professor=" + professor.getNome() +
                ", disciplina=" + disciplina + ", horario=" + horario + ", ativa=" + ativa + "]";
    }
}
