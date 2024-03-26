package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PacienteBuilderTest {
    @Test
    void deveRetornarExcecaoParaPacienteSemConvenio() {
        try {
            PacienteBuilder pacienteBuilder = new PacienteBuilder();
            Paciente paciente = pacienteBuilder
                    .setNome("Ronaldo")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Convenio Inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaPacienteSemNome() {
        try {
            PacienteBuilder pacienteBuilder = new PacienteBuilder();
            Paciente paciente = pacienteBuilder
                    .setConvenio("Unimed")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nome inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarPacienteValido() {
        PacienteBuilder pacienteBuilder = new PacienteBuilder();
        Paciente paciente = pacienteBuilder
                .setConvenio("Unimed")
                .setNome("Ronaldo")
                .build();

        assertNotNull(paciente);
    }


}