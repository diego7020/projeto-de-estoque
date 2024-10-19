package dominio;

public abstract class BaseFuncionario {
    protected int codigo;
    protected String nome;
    protected String cargo;
    protected double salario;
    protected String email;
    protected String telefone;
        
    public BaseFuncionario() {
    }

    public BaseFuncionario(int codigo, String nome, String cargo, double salario, String email, String telefone) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.email = email;
        this.telefone = telefone;
    }
    
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
