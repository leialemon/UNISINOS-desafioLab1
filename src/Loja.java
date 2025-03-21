package src;

public class Loja {

    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = -1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios() {
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios) {
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario() {
        return salarioBaseFuncionario;
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario) {
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    @Override
    public String toString(){
        return """
                Informações da Loja
                Nome: %s
                Quantidade de funcionários: %d
                Salário base dos funcionários: %.2f
                """.formatted(getNome(), getQuantidadeFuncionarios(), getSalarioBaseFuncionario());
    }

    public double gastosComSalario(){
        double salarioBase = getSalarioBaseFuncionario();
        if (salarioBase == -1){
            return -1;
        }
        return (salarioBase * getQuantidadeFuncionarios());
    }

    public char tamanhoDaLoja(){
        int quantFuncionarios = getQuantidadeFuncionarios();
        if (quantFuncionarios < 10){
            return 'P';
        } else if (quantFuncionarios <= 30) {
            return 'M';
        }
        return 'G';
    }
}
