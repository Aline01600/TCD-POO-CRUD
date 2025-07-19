package repositorio;

import entidade.Aluno;
import java.util.ArrayList;
import java.util.List;

public class AlunoRepository {
    private List<Aluno> alunos = new ArrayList<>();
    
    public void cadastrar(Aluno aluno) {
        alunos.add(aluno);
    }
    
    public boolean editar(Aluno alunoAtualizado) {
        for (int i = 0; i < alunos.size(); i++) {
            Aluno a = alunos.get(i);
            if (a.getMatricula().equals(alunoAtualizado.getMatricula())) {
                alunos.set(i, alunoAtualizado);
                return true; 
            }
        }
        return false;
    }
    
    public boolean excluir(String matricula) {
        return alunos.removeIf(a -> a.getMatricula().equals(matricula));
    }
    
    public List<Aluno> listarTodos() {
        return new ArrayList<>(alunos);
    }
    
    public List<Aluno> buscarPorMatricula(String matricula) {
        List<Aluno> resultado = new ArrayList<>();
        for (Aluno a : alunos) {
            if (a.getMatricula().equalsIgnoreCase(matricula)) {
                resultado.add(a);
            }
        }
      return resultado;
    }
     
    public List<Aluno> buscarPorNome(String nome) {
        List<Aluno> resultado = new ArrayList<>();
        for (Aluno a : alunos) {
            if (a.getNome().equalsIgnoreCase(nome)) {
                resultado.add(a);
            }
        }
        return resultado; 
    }
    
}
