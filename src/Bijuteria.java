package src;

public class Bijuteria extends Loja{
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas, int tamanhoEstoque){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas() {
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas) {
        this.metaVendas = metaVendas;
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
                Meta de vendas: R$ %.2f
                """.formatted(getNome(), getEndereco().toString(), getDataFundacao().toString(),getQuantidadeFuncionarios(), getSalarioBaseFuncionario(), getEstoqueProdutos().length,getMetaVendas());
    }
}