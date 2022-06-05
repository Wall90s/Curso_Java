public class Boss extends Inimigo{
    protected String itemEspecial;

    public Boss (int ataque, int defesa, int hp, String itemEspecial){
        super(ataque, defesa, hp);
        this.itemEspecial = itemEspecial;
    }
}
