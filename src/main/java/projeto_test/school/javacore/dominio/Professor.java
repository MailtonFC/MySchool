package projeto_test.school.javacore.dominio;

import lombok.Builder;
import java.util.List;

@Builder
public class Professor {
    Integer id;
    String name;
    List<Classe> classes;
}