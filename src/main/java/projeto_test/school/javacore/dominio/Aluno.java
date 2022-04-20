package projeto_test.school.javacore.dominio;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.Value;

import java.util.List;
@Value
@ToString
@Builder
public class Aluno {
    Integer id;
    String nome;
    String serie;
    List<Professor> professors;

}
