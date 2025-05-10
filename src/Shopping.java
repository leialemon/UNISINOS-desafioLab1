package src;

public class Shopping {

    private String nome;
    private Endereco endereco;
    private Loja[] lojas;

    public Shopping(String nome, Endereco endereco, int maxLojas){
       this.nome = nome;
       this.endereco = endereco;
       this.lojas = new Loja[maxLojas];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Loja[] getLojas() {
        return lojas;
    }

    public void setLojas(Loja[] lojas) {
        this.lojas = lojas;
    }

    @Override
    public String toString(){
        return """
                Nome: %s
                Endereço: %s
                Quantidade de lojas: %d
                """.formatted(getNome(), getEndereco().toString(), getLojas().length);
    }

    public boolean insereLoja(Loja lojaNova){
        Loja[] lojas = getLojas();
        for (int x = 0; x < lojas.length; x++){
            if(lojas[x] == null){
                lojas[x] = lojaNova;
                setLojas(lojas);
                return true;
            }
        }
        return false;
    }

    public boolean removeLoja(String nomeLoja){
        Loja[] lojas = getLojas();
        for (int x = 0; x < lojas.length; x++){
            if(lojas[x].getNome().equals(nomeLoja)){
                lojas[x] = null;
                setLojas(lojas);
                return true;
            }
        }
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja){
        int quantidadeLojas = 0;
        Loja[] lojas = getLojas();
        switch (tipoLoja){
            case "Alimentação" -> {
                for(Loja l : lojas){
                    if (l.getClass().equals(Alimentacao.class)){
                        quantidadeLojas++;
                    }
                }
                return quantidadeLojas;
            }
            case "Bijuteria" -> {
                for(Loja l : lojas){
                    if (l.getClass().equals(Bijuteria.class)){
                        quantidadeLojas++;
                    }
                }
                return quantidadeLojas;
            }
            case "Cosmético" -> {
                for(Loja l : lojas){
                    if (l.getClass().equals(Cosmetico.class)){
                        quantidadeLojas++;
                    }
                }
                return quantidadeLojas;
            }
            case "Informática" -> {
                for(Loja l : lojas){
                    if (l.getClass().equals(Informatica.class)){
                        quantidadeLojas++;
                    }
                }
                return quantidadeLojas;
            }
            case "Vestuário" -> {
                for(Loja l : lojas){
                    if (l.getClass().equals(Vestuario.class)){
                        quantidadeLojas++;
                    }
                }
                return quantidadeLojas;
            }
            default -> {
                return -1;
            }
        }
    }

    //todo TERMINAR ESSE MÉTODO!!
    public Loja lojaSeguroMaisCaro(){
        Loja[] lojas = getLojas();
        Loja lojaComSeguroMaisCaro;


        return null;
    }
}
