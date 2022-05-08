import java.util.Scanner;

public class Principal {

    public static int retornaMaiorIdade(int idade1, int idade2, int idade3){
        if(idade1 > idade2 && idade1 > idade3){
            return idade1;
        }else if(idade2 > idade1 && idade2 > idade3) {
            return idade2;
        }else{
            return idade3;
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int idade1;
        int idade2;
        int idade3;

        System.out.println("Digite a primeira idade: ");
        idade1 = scan.nextInt();

        System.out.println("Digite a segunda idade: ");
        idade2 = scan.nextInt();

        System.out.println("Digite a terceira idade: ");
        idade3 = scan.nextInt();

        int maiorIdade = retornaMaiorIdade(idade1, idade2, idade3);
        System.out.println("A maior idade é " + maiorIdade + " anos");

    }
}
