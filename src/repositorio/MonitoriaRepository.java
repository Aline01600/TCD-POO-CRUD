package repositorio;

import entidade.Monitoria;
import java.util.ArrayList;
import java.util.List;

public class MonitoriaRepository {
    private List<Monitoria> monitorias = new ArrayList<>();
    private List<Monitoria> lixeira = new ArrayList<>();

    public void criar(Monitoria m) {
        monitorias.add(m);
    }

    public void atualizar(Monitoria atualizada) {
        for (int i = 0; i < monitorias.size(); i++) {
            if (monitorias.get(i).getId() == atualizada.getId()) {
                monitorias.set(i, atualizada);
                break;
            }
        }
    }

    public List<Monitoria> listar() {
        return monitorias;
    }

    public void excluir(int id) {
        monitorias.removeIf(m -> m.getId() == id);
    }

    // ----- Funções de Lixeira -----

    public void moverParaLixeira(int id) {
        for (Monitoria m : monitorias) {
            if (m.getId() == id) {
                m.setNaLixeira(true);
                lixeira.add(m);
                monitorias.remove(m);
                break;
            }
        }
    }

    public void moverListaParaLixeira(List<Monitoria> lista) {
        for (Monitoria m : lista) {
            moverParaLixeira(m.getId());
        }
    }

    public List<Monitoria> recuperarTodosDaLixeira() {
        return lixeira;
    }

    public Monitoria recuperarPorIdDaLixeira(int id) {
        for (Monitoria m : lixeira) {
            if (m.getId() == id) return m;
        }
        return null;
    }

    public void excluirDefinitivo(int id) {
        lixeira.removeIf(m -> m.getId() == id);
    }

    public void esvaziarLixeira() {
        lixeira.clear();
    }
}
