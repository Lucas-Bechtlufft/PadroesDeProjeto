package principal;

public class Paciente {
    private String nome;
    private String endereco;
    private String telefone;
    private String historicoMedico;

    private Paciente(PacienteBuilder builder) {
        this.nome = builder.nome;
        this.endereco = builder.endereco;
        this.telefone = builder.telefone;
        this.historicoMedico = builder.historicoMedico;
    }

    public static class PacienteBuilder {
        private String nome;
        private String endereco;
        private String telefone;
        private String historicoMedico;

        public PacienteBuilder(String nome) {
            this.nome = nome;
        }

        public PacienteBuilder endereco(String endereco) {
            this.endereco = endereco;
            return this;
        }

        public PacienteBuilder telefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public PacienteBuilder historicoMedico(String historicoMedico) {
            this.historicoMedico = historicoMedico;
            return this;
        }

        public Paciente build() {
            return new Paciente(this);
        }
    }
}
