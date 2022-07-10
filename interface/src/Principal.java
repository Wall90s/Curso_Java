import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        FormaGeometrica triangulo = new Triangulo();
        FormaGeometrica quadrado = new Quadrado();

        List<FormaGeometrica> lista = new ArrayList<>();
        lista.add(triangulo);
        lista.add(quadrado);

        System.out.println(triangulo.calcularArea(10,2));
        System.out.println(quadrado.calcularArea(10,2));
    }
}
