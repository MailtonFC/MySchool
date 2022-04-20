package projeto_test.school.javacore.repositorio;
import lombok.Getter;
import lombok.ToString;
import lombok.extern.log4j.Log4j2;
import projeto_test.school.javacore.dominio.Aluno;
import projeto_test.school.javacore.dominio.Classe;
import projeto_test.school.javacore.dominio.Professor;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Log4j2
public class RepositorioMyshool {

    public static void criarAluno() {
            String nomeAluno = JOptionPane.showInputDialog("Entre com nome do Aluno");
            String serieAluno = JOptionPane.showInputDialog("Entre com a Série do Aluno");
            if (nomeAluno == null || nomeAluno.isEmpty() ) {
                String nomeAluno1 = JOptionPane.showInputDialog("Não pode ser vazio,entre com nome do Aluno");
                String serieAluno2 = JOptionPane.showInputDialog("Não pode ser vazio,entre novamente com a Série do Aluno");
                nomeAluno = nomeAluno1;
                serieAluno = serieAluno2;
            }
            Aluno aluno = Aluno.builder().id(gerarIdAluno()).nome(nomeAluno).serie(serieAluno).build();
        System.out.println("Aluno: "+ aluno + " salvo com sucesso!");
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

        public static int gerarIdAluno() {
            File fileIdAluno = new File("idAluno.txt");
            try(FileWriter fw = new FileWriter(fileIdAluno, true)) {
                BufferedWriter bw = new BufferedWriter(fw);
                fw.write((int) fileIdAluno.length());
                fw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return (int) fileIdAluno.length();
        }
}
