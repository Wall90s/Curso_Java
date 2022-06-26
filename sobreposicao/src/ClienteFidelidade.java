public class ClienteFidelidade extends Cliente{
    public ClienteFidelidade(int id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    @Override
    public void entrarEmContato() {
        System.out.println("Entrando em contato com gerente");
    }
}
