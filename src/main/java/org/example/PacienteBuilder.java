package org.example;
import java.util.Date;

public class PacienteBuilder {
    private Paciente paciente;

    public PacienteBuilder() {
        paciente = new Paciente();
    }
    public Paciente build() {
        if (paciente.getConvenio().equals("")) {
            throw new IllegalArgumentException("Convenio Inválido");
        }
        if (paciente.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return paciente;
    }

    public PacienteBuilder setNome(String nome) {
        paciente.setNome(nome);
        return this;
    }

    public PacienteBuilder setDataNascimento(Date dataNascimento) {
        paciente.setDataNascimento(dataNascimento);
        return this;
    }

    public PacienteBuilder setNomeMae(String nomeMae) {
        paciente.setNomeMae(nomeMae);
        return this;
    }

    public PacienteBuilder setNomePai(String nomePai) {
        paciente.setNomePai(nomePai);
        return this;
    }

    public PacienteBuilder setCpf(String cpf) {
        paciente.setCpf(cpf);
        return this;
    }

    public PacienteBuilder setRg(String rg) {
        paciente.setRg(rg);
        return this;
    }

    public PacienteBuilder setConvenio(String convenio){
        paciente.setConvenio(convenio);
        return this;
    }

    public PacienteBuilder setEnderecoLogradouro(String enderecoLogradouro) {
        paciente.setEnderecoLogradouro(enderecoLogradouro);
        return this;
    }

    public PacienteBuilder setEnderecoNumero(int enderecoNumero) {
        paciente.setEnderecoNumero(enderecoNumero);
        return this;
    }

    public PacienteBuilder setEnderecoComplemento(String enderecoComplemento) {
        paciente.setEnderecoComplemento(enderecoComplemento);
        return this;
    }

    public PacienteBuilder setEnderecoBairro(String enderecoBairro) {
        paciente.setEnderecoBairro(enderecoBairro);
        return this;
    }

    public PacienteBuilder setEnderecoCidade(String enderecoCidade) {
        paciente.setEnderecoCidade(enderecoCidade);
        return this;
    }

    public PacienteBuilder setEnderecoUF(String enderecoUF) {
        paciente.setEnderecoUF(enderecoUF);
        return this;
    }

    public PacienteBuilder setCep(String cep) {
        paciente.setCep(cep);
        return this;
    }

    public PacienteBuilder setEmail(String email) {
        paciente.setEmail(email);
        return this;
    }

    public PacienteBuilder setCelular(String celular) {
        paciente.setCelular(celular);
        return this;
    }
}
