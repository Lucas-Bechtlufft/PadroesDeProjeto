package principal;

public class Main {
    public static void main(String[] args) {
        // Testando o Singleton
        ProntuarioEletronico prontuario = ProntuarioEletronico.getInstance();
        Paciente paciente1 = new Paciente.PacienteBuilder("João Silva")
                                .endereco("Rua 123")
                                .telefone("123456789")
                                .historicoMedico("Diabetes")
                                .build();
        prontuario.adicionarProntuario("1", paciente1);

        // Testando o Facade
        SistemaFacade sistemaFacade = new SistemaFacade();
        sistemaFacade.agendarConsulta("João Silva", "Dr. Marcos");

        // Testando o Observer
        PacienteObserver pacienteObserver = new PacienteObserver();
        Medico medico = new Medico();
        pacienteObserver.adicionarObserver(medico);
        pacienteObserver.setEstado("Crítico");
    }
}
