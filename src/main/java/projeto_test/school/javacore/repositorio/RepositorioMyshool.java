package projeto_test.school.javacore.repositorio;

import projeto_test.school.javacore.dominio.Aluno;
import projeto_test.school.javacore.dominio.Classe;
import projeto_test.school.javacore.dominio.Professor;

public class RepositorioMyshool {
    public static void criarAluno(Aluno aluno) {
        System.out.println("salvando Aluno no banco de dados");
    }

    public static void deletarAluno(Aluno aluno) {
        System.out.println("deletar Aluno no banco de dados");
    }

    public static void editarAluno(Aluno aluno) {
        System.out.println("editar Aluno no banco de dados");
    }

    public static void criarProfessor(Professor professor) {
        System.out.println("salvando Professor no banco de dados");
    }

    public static void deletarProfessor(Professor professor) {
        System.out.println("deletar Professor no banco de dados");
    }

    public static void editarProfessor(Professor professor) {
        System.out.println("editar Professor no banco de dados");
    }

    public static void criarClasse(Classe classe) {
        System.out.println("salvando Professor no banco de dados");
    }

    public static void deletarClasse(Classe classe) {
        System.out.println("deletar Classe no banco de dados");
    }

    public static void editarClasse(Classe classe) {
        System.out.println("editar Classe no banco de dados");
    }


}
