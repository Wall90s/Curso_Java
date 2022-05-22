public class Principal {

    public static void main(String[] args) {
        Show show = new Show(new Artista("Michael Jackson", 1000000.00f));

        System.out.println(show.artista.nome);
    }
}


