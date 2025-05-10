package src;

public class Alimentacao extends Loja{

    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int tamanhoEstoque){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanhoEstoque);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara() {
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara) {
        this.dataAlvara = dataAlvara;
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
                Data de expedição do alvará de funcionamento: %s
                """.formatted(getNome(), getEndereco().toString(), getDataFundacao().toString(),getQuantidadeFuncionarios(), getSalarioBaseFuncionario(), getEstoqueProdutos().length,getDataAlvara().toString());

    }
}
