import java.util.Scanner;

public class PrimeiroPrograma {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        float nota1;
        float nota2;
        float nota3;
        float nota4;

        System.out.println("Digite a 1ª nota: ");
        nota1 = scan.nextFloat();

        System.out.println("Digite a 2ª nota: ");
        nota2 = scan.nextFloat();

        System.out.println("Digite a 3ª nota: ");
        nota3 = scan.nextFloat();

        System.out.println("Digite a 4ª nota: ");
        nota4 = scan.nextFloat();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média do(a) aluno(a) é: " + media);

        if(media >= 5){
            System.out.println("Aluno(a) aprovado(a)");
        }else{
            System.out.println("Aluno(a) reprovado(a)");
        }
    }
}
