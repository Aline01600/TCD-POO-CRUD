package repositorio;

/**
 *
 * @author vitor
 */

import entidade.Professor;
import java.util.ArrayList;
import java.util.List;

public class ProfessorRepository {
    private List<Professor> professores = new ArrayList<>();
    private List<Professor> lixeira = new ArrayList<>();

    public void adicionar(Professor professor) {
        professores.add(professor);
    }

    public void editar(int id, String novoNome, String novoDepartamento) {
        for (Professor p : professores) {
            if (p.getId() == id) {
                p.setNome(novoNome);
                p.setDepartamento(novoDepartamento);
                return;
            }
        }
    }

    public List<Professor> listar() {
        return professores;
    }

    public List<Professor> buscarPorNome(String nome) {
        List<Professor> resultado = new ArrayList<>();
        for (Professor p : professores) {
            if (p.getNome().toLowerCase().contains(nome.toLowerCase())) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    public void moverParaLixeira(int id) {
        for (int i = 0; i < professores.size(); i++) {
            Professor p = professores.get(i);
            if (p.getId() == id) {
                p.setNaLixeira(true);
                lixeira.add(p);
                professores.remove(i);
                break;
            }
        }
    }

    public void restaurarDaLixeira(int id) {
        for (int i = 0; i < lixeira.size(); i++) {
            Professor p = lixeira.get(i);
            if (p.getId() == id) {
                p.setNaLixeira(false);
                professores.add(p);
                lixeira.remove(i);
                break;
            }
        }
    }

    public void excluirPermanentemente(int id) {
        lixeira.removeIf(p -> p.getId() == id);
    }

    public List<Professor> listarLixeira() {
        return lixeira;
    }
}
