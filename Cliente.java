public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Cliente() {
        //TODO Auto-generated constructor stub
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void imprimirDadosCliente(){
        System.out.println("Nome do Cliente: " + this.nome);
        System.out.println("CPF: " + this.cpf);
    }
}
