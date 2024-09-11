public class Endereco {
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String estado;

    public Endereco(String logradouro, int numero, String complemento, String bairro, String cep, String cidade, String estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Endereco() {
        //TODO Auto-generated constructor stub
    }

    public void setLogadouro(String logadouro){
        this.logradouro = logadouro;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

    public void setBairro(String bairro){
        this.bairro = bairro;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public void imprimirEndereco(){
        System.out.println("Logradouro: " + this.logradouro);
        System.out.println("Número: " + this.numero);
        System.out.println("Complemento: " + this.complemento);
        System.out.println("Bairro: " + this.bairro);
        System.out.println("CEP: " + this.cep);
        System.out.println("Cidade: " + this.cidade);
        System.out.println("Estado: " + this.estado);
    }
    
}
