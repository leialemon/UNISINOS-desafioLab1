package src;

public class Produto {

    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public boolean estaVencido(Data dataAtual){
        if(getDataValidade().getAno() < dataAtual.getAno()){
            return true;
        } else if (getDataValidade().getAno() == dataAtual.getAno()){
            if (getDataValidade().getMes() < dataAtual.getMes()) {
                return true;
            } else if (getDataValidade().getMes() == dataAtual.getMes()) {
                if(getDataValidade().getDia() <= dataAtual.getDia()){
                    return true;
                }
            }
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Data getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString(){
        return """
                Informações do Produto
                Nome: %s
                Preço: %.2f
                """.formatted(getNome(), getPreco());
    }




}
