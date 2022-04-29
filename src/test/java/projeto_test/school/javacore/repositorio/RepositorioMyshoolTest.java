package projeto_test.school.javacore.repositorio;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import projeto_test.school.javacore.dominio.Aluno;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
@Log4j2
class RepositorioMyshoolTest {

    @BeforeEach
    public void setup() {

    }

    @Test
    void criarAluno() {
        RepositorioMyshool.criarAluno();
    }

    @Test
    void lerAlunos() {
        System.out.println(RepositorioMyshool.lerAluno());
    }
}