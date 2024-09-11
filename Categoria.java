public class Categoria {

    private String nomeCategoria;
    private String departamnto; 

    public void setNomeCategoria(String nomeCategoria){
        this.nomeCategoria = nomeCategoria;    
    }

    public void setDepartamento(String departamento){
        this.departamnto = departamento;
    }
    
    public void imprimeCategoria(){
        System.out.println("Nome da categoria: " + this.nomeCategoria);
        System.out.println("Departamento: " + this.departamnto);
    }
}
