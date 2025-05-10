package src;

public class Loja {

    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private Produto[] estoqueProdutos;

    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanhoEstoque){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.estoqueProdutos = new Produto[tamanhoEstoque];
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int tamanhoEstoque){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.salarioBaseFuncionario = -1;
        this.estoqueProdutos = new Produto[tamanhoEstoque];
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Data getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos() {
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos) {
        this.estoqueProdutos = estoqueProdutos;
    }

    @Override
    public String toString(){
        return """
                Informações da Loja
                Nome: %s
                Endereço: %s
                Data de Fundação: %s
                Quantidade de funcionários: %d
                Salário base dos funcionários: R$ %.2f
                Tamanho do estoque: %d
                """.formatted(getNome(), getEndereco().toString(), getDataFundacao().toString(),getQuantidadeFuncionarios(), getSalarioBaseFuncionario(), getEstoqueProdutos().length);
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

    public void imprimeProdutos(){
        for(Produto p : getEstoqueProdutos()){
            System.out.println(p.toString());
        }
    }

    public boolean insereProduto(Produto produto){
        Produto[] estoque = getEstoqueProdutos();
        for (int x = 0; x < estoque.length; x++){
            if(estoque[x] == null){
                estoque[x] = produto;
                setEstoqueProdutos(estoque);
                return true;
            }
        }
        return false;
    }

    public boolean removeProduto(String nomeProduto){
        Produto[] estoque = getEstoqueProdutos();
        for (int x = 0; x < estoque.length; x++){
            if(estoque[x].getNome().equals(nomeProduto)){
                estoque[x] = null;
                setEstoqueProdutos(estoque);
                return true;
            }
        }
        return false;
    }
}
