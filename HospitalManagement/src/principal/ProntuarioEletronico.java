package principal;

import java.util.HashMap;
import java.util.Map;

public class ProntuarioEletronico {
    private static ProntuarioEletronico instance;
    private Map<String, Paciente> prontuarios;

    private ProntuarioEletronico() {
        prontuarios = new HashMap<>();
    }

    public static ProntuarioEletronico getInstance() {
        if (instance == null) {
            instance = new ProntuarioEletronico();
        }
        return instance;
    }

    public void adicionarProntuario(String id, Paciente paciente) {
        prontuarios.put(id, paciente);
    }

    public Paciente getProntuario(String id) {
        return prontuarios.get(id);
    }
}
