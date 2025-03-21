package src;

public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano){
        if (dia == 31){
            switch (mes){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    break;
                default:
                    System.err.printf("ERRO! O mês %d não tem 31 dias! Aplicando data padrão.\n", mes);
                    setDataPadrao();
                    return;
            }
        } else if (dia == 29 && mes == 2) {
            if(!(ano % 4 == 0)){
                System.err.printf("ERRO! O ano %d não é bissexto - o mês de fevereiro não pode ter 29 dias! Aplicando data padrão.\n", ano);
                setDataPadrao();
                return;
            }
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    private void setDataPadrao(){
        setDia(1);
        setMes(1);
        setAno(2000);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString(){
        return String.format("%d/%d/%d", getDia(), getMes(), getAno());
    }

    public boolean verificaAnoBissexto(){
        return (getAno() % 4) == 0;
    }
}
