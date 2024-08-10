package principal;

import java.util.ArrayList;
import java.util.List;

public class PacienteObserver {
    private List<Observer> observers = new ArrayList<>();
    private String estado;

    public void adicionarObserver(Observer observer) {
        observers.add(observer);
    }

    public void setEstado(String estado) {
        this.estado = estado;
        notificarTodos();
    }

    private void notificarTodos() {
        for (Observer observer : observers) {
            observer.atualizar();
        }
    }
}

interface Observer {
    void atualizar();
}

class Medico implements Observer {
    @Override
    public void atualizar() {
        System.out.println("O estado do paciente foi atualizado. Verificar detalhes.");
    }
}
