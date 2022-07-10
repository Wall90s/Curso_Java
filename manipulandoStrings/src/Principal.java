public class Principal {
    public static void main(String[] args) {
        String nome = "Wallace";

        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(nome.contains("ll")); // Retornar um booleano que informa se a string contém uma determinada sequência
        System.out.println(nome.compareToIgnoreCase("WALLACE")); // Compara a string ignorando a capitalização
        System.out.println(nome.charAt(4)); // Retorna o caractere informado como parâmetro
        System.out.println(nome.concat(" Brito"));
        System.out.println(nome.isEmpty()); // Re
        System.out.println(nome.length());
        System.out.println(nome.matches("lla"));
        System.out.println(nome.trim());

        Aluno aluno1 = new Aluno();
        aluno1.id = 1;
        aluno1.nome = "Clarice";

        Aluno aluno2 = new Aluno();
        aluno2.id = 1;
        aluno2.nome = "Clarice";

        System.out.println(aluno1.equals(aluno2));

    }
}
