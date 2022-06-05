public class Veiculo {
    protected String tipoDeCombustivel;
    protected int porcentagemDeCombustivelNoTanque;

    public void setTipoDeCombustivel(){
        if (tipoDeCombustivel == "gasolina" || tipoDeCombustivel == "álcool" || tipoDeCombustivel == "diesel"){
            this.tipoDeCombustivel = tipoDeCombustivel;
        }else{
            System.out.println("Combustível inválido (gasolina, álcool, diesel");
        }
    }

    public Veiculo(){}

    public Veiculo (String tipoDeCombustivel, int porcentagemDeCombustivelNoTanque) {
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.porcentagemDeCombustivelNoTanque = porcentagemDeCombustivelNoTanque;
    }
}
