import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) throws IOException {
        List<Heroi> listaHerois = new ArrayList<>();
        listaHerois.add(new Heroi(1, "Matt Murdock", "Demolidor"));

        File arquivo = new File("target/heroi.json");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(arquivo, listaHerois);
    }
}
