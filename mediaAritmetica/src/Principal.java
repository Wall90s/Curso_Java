import java.util.Scanner;

public class Principal {

    public static void calculoMedia(){
        Scanner scan = new Scanner(System.in);

        float nota1;
        float nota2;
        float nota3;
        float nota4;

        System.out.println("Informe a primeira nota: ");
        nota1 = scan.nextInt();
        System.out.println("Informe a segunda nota: ");
        nota2 = scan.nextInt();
        System.out.println("Informe a terceira nota: ");
        nota3 = scan.nextInt();
        System.out.println("Informe a quarta nota: ");
        nota4 = scan.nextInt();

        float media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média das notas é " + media);
    }

    public static void main(String[] args) {
        calculoMedia();
    }
}
