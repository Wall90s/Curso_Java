import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno1 = new Aluno();
        aluno1.nome = "Claudia";
        aluno1.idade = 28;
        aluno1.nota = 10;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Wallace";
        aluno2.idade = 23;
        aluno2.nota = 10;

        Aluno aluno3 = new Aluno();
        aluno3.nome = "Robson";
        aluno3.idade = 36;
        aluno3.nota = 10;

        Aluno aluno4 = new Aluno();
        aluno4.nome = "Fernando";
        aluno4.idade = 30;
        aluno4.nota = 10;

        Aluno aluno5 = new Aluno();
        aluno5.nome = "Rhuandro";
        aluno5.idade = 34;
        aluno5.nota = 10;

        Aluno aluno6 = new Aluno();
        aluno6.nome = "Daniel";
        aluno6.idade = 19;
        aluno6.nota = 10;

        Professor professor = new Professor();
        professor.nome = "Mateus";
        professor.idade = 24;
        professor.disciplina = "Programação Orientada a Objeto";
        professor.periodoAula = "Manhã";
        professor.coordenador = true;

        Disciplina disciplina = new Disciplina();
        disciplina.nome = "Programação Orientada a Objeto";
        disciplina.alunos[0] = aluno1;
        disciplina.alunos[1] = aluno2;
        disciplina.alunos[2] = aluno3;
        disciplina.alunos[3] = aluno4;
        disciplina.alunos[4] = aluno5;
        disciplina.alunos[5] = aluno6;

        disciplina.professor = professor;

        
    }
}
