public class Emissora {
    Programa[] listaDeProgramas = new Programa[4];

    void encontraProgramaMaisPopular(){
        Programa programaTemporario = listaDeProgramas[0];

        for(int i = 1; i < 4; i++){
            if(listaDeProgramas[i].pontosDeAudiencia > programaTemporario.pontosDeAudiencia){
                programaTemporario = listaDeProgramas[i];
            }
        }
        System.out.println("O programa com maior audiência é: " + programaTemporario.nome);
    }
}
