public class InimigoComum extends Inimigo{
    protected String armaBasica;

    public InimigoComum(int ataque, int defesa, int hp, String armaBasica){
        super(ataque, defesa, hp);
        this.armaBasica = armaBasica;
    }
}
