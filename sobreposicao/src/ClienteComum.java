public class ClienteComum extends Cliente {
    public ClienteComum(int id, String nome, String cpf) {
        super(id, nome, cpf);
    }

    @Override
    public void entrarEmContato() {
        System.out.println("Entrando em contato via central");
    }
}
