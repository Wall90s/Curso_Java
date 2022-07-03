public class Principal {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Manoel";

        System.out.println("Antes da exception");

        try{
            System.out.println(professor.disciplina.id);
        }catch (Exception exception){
            System.out.println("Disciplina não pode ser nula");
        }

        System.out.println("Esta mensagem será exibida");

    }
}
