package src;

public class Informatica extends Loja{

    private double seguroEletronicos;

    public Informatica(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double seguroEletronicos, int tamanhoEstoque){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.seguroEletronicos = seguroEletronicos;
    }

    public double getSeguroEletronicos() {
        return seguroEletronicos;
    }

    public void setSeguroEletronicos(double seguroEletronicos) {
        this.seguroEletronicos = seguroEletronicos;
    }

    @Override
    public String toString() {
        return """
                Informações da Loja
                Nome: %s
                Endereço: %s
                Data de Fundação: %s
                Quantidade de funcionários: %d
                Salário base dos funcionários: R$ %.2f
                Tamanho do estoque: %d
                Seguro de eletrônicos: R$ %.2f
                """.formatted(getNome(), getEndereco().toString(), getDataFundacao().toString(),getQuantidadeFuncionarios(), getSalarioBaseFuncionario(), getEstoqueProdutos().length, getSeguroEletronicos());

    }
}
