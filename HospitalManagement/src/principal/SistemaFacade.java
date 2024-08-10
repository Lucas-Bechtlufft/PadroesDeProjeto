package principal;

public class SistemaFacade {
    private SistemaAgendamento agendamento;
    private SistemaFaturamento faturamento;
    private SistemaInventario inventario;

    public SistemaFacade() {
        agendamento = new SistemaAgendamento();
        faturamento = new SistemaFaturamento();
        inventario = new SistemaInventario();
    }

    public void agendarConsulta(String paciente, String medico) {
        agendamento.agendar(paciente, medico);
        faturamento.gerarFatura(paciente, medico);
    }

    public void verificarEstoqueMedicamento(String medicamento) {
        inventario.verificarEstoque(medicamento);
    }
}

// Subsistemas simulados para a facade

class SistemaAgendamento {
    public void agendar(String paciente, String medico) {
        System.out.println("Consulta agendada para o paciente " + paciente + " com o médico " + medico);
    }
}

class SistemaFaturamento {
    public void gerarFatura(String paciente, String medico) {
        System.out.println("Fatura gerada para o paciente " + paciente + " com o médico " + medico);
    }
}

class SistemaInventario {
    public void verificarEstoque(String medicamento) {
        System.out.println("Estoque verificado para o medicamento " + medicamento);
    }
}
