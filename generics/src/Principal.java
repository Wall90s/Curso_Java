import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Caixa<Integer> caixa = new Caixa<>();
        caixa.setDado1(2);
        caixa.imprimeDado();

        int[] arrayNumeros = new int[3];
        arrayNumeros[0] = 7;
        arrayNumeros[1] = 13;
        arrayNumeros[2] = 15;

        List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(7);
        listaNumeros.add(13);
        listaNumeros.add(15);

        for (int i = 0; i < listaNumeros.size(); i++){
            System.out.println(listaNumeros.get(i));
        }

        listaNumeros.remove(1);

        for (int i = 0; i < listaNumeros.size(); i++){
            System.out.println(listaNumeros.get(i));
        }
    }
}
