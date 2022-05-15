public class Principal {

    public static void main(String[] args) {
        Programa programa1 = new Programa();
        programa1.nome = "TV Globinho";
        programa1.pontosDeAudiencia = 7.8f;

        Programa programa2 = new Programa();
        programa2.nome = "Bom dia & cia";
        programa2.pontosDeAudiencia = 8.5f;

        Programa programa3 = new Programa();
        programa3.nome = "Quintal da Cultura";
        programa3.pontosDeAudiencia = 5.5f;

        Programa programa4 = new Programa();
        programa4.nome = "Encontro com Fátima Bernardes";
        programa4.pontosDeAudiencia = 1.1f;

        Emissora emissora = new Emissora();
        emissora.listaDeProgramas[0] = programa1;
        emissora.listaDeProgramas[1] = programa2;
        emissora.listaDeProgramas[2] = programa3;
        emissora.listaDeProgramas[3] = programa4;

        emissora.encontraProgramaMaisPopular();
    }

}
