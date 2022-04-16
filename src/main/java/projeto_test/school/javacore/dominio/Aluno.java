package projeto_test.school.javacore.dominio;

import lombok.Builder;

import java.util.List;

@Builder
public class Aluno {
    Integer id;
    String serie;
    List<Professor> professors;

}
