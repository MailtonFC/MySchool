package projeto_test.school.javacore.dominio;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;
import lombok.Value;

import java.io.Serializable;
import java.util.List;
@Value
@ToString
@Builder
public class Aluno implements Serializable {
    Integer id;
    String nome;
    String serie;
    List<Professor> professors;

}
