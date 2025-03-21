package src;

public class DesafioApp {
    public static void main(String[] args) {
        Data dataTeste = new Data(29, 2, 2025);
        System.out.println(dataTeste.toString());
        System.out.println(dataTeste.verificaAnoBissexto());
        dataTeste.setAno(2025);
        System.out.println(dataTeste.verificaAnoBissexto());
    }
}
