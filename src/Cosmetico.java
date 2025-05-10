package src;

public class Cosmetico extends Loja {
    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao, int tamanhoEstoque){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.taxaComercializacao = taxaComercializacao;
    }

    public double getTaxaComercializacao() {
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao) {
        this.taxaComercializacao = taxaComercializacao;
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
                Taxa de Comercialização: R$ %.2f
                """.formatted(getNome(), getEndereco().toString(), getDataFundacao().toString(),getQuantidadeFuncionarios(), getSalarioBaseFuncionario(), getEstoqueProdutos().length,getTaxaComercializacao());
    }
}
