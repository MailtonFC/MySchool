package projeto_test.school.javacore.repositorio;

import lombok.extern.log4j.Log4j2;
import projeto_test.school.javacore.dominio.Aluno;
import projeto_test.school.javacore.dominio.Professor;

import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

@Log4j2
public class RepositorioMyshool implements Serializable{

    public static void criarAluno()  {
            String nomeAluno = JOptionPane.showInputDialog("Entre com nome do Aluno");
            String serieAluno = JOptionPane.showInputDialog("Entre com a Série do Aluno");
            if (nomeAluno == null || nomeAluno.isEmpty() ) {
                String nomeAluno1 = JOptionPane.showInputDialog("Não pode ser vazio,entre com nome do Aluno");
                String serieAluno2 = JOptionPane.showInputDialog("Não pode ser vazio,entre novamente com a Série do Aluno");
                nomeAluno = nomeAluno1;
                serieAluno = serieAluno2;
            }
            Aluno aluno = Aluno.builder().id(gerarIdAluno()).nome(nomeAluno).serie(serieAluno).build();
            escreverAluno(aluno);
//        System.out.println("Aluno:   salvo com sucesso!");
        log.info(aluno + " incluido ao banco de dados com sucesso! ");
    }

    public static void deletarAluno(int id) {

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
                bw.write((int) fileIdAluno.length());
                bw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return (int) fileIdAluno.length();
        }

    public static void escreverAluno(Aluno aluno) {
        File arquivo = null;
        ObjectOutputStream obj = null;
        try {
            arquivo = new File("./bin/alunos.obj");
            obj = new ObjectOutputStream(new FileOutputStream(arquivo, true));
            obj.writeObject(aluno);
            obj.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ArrayList<Aluno> lerAluno() {
        ArrayList<Aluno> alunos = new ArrayList<>();
        Aluno aluno = null;
        ObjectInputStream obj = null;

        try {
            Path path = Paths.get("./bin/alunos.obj");
            InputStream inputStream = Files.newInputStream(path);
            do {
                obj = new ObjectInputStream(inputStream);
                Object object = obj.readObject();
                aluno = (Aluno) object;
                if (aluno != null)
                    alunos.add(aluno);
            } while (inputStream.available()>0);
            obj.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return alunos;
    }
    
}
