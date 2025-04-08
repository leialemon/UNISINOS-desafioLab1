package src;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String menu = """
                (1) Criar uma Loja
                (2) Criar um produto
                (3) Sair
                """;

        int input = 0;

        do {
            System.out.println(menu);
            input = entrada.nextInt();
            switch (input){
                case 1 -> criarNovaLoja();
                case 2 -> criarNovoProduto();
                case 3 -> System.out.println("Saindo do sistema");
                default -> System.out.println("Opção inválida");
            }
        } while(input != 3);

        entrada.close();
    }

    public static void criarNovaLoja(){
        System.out.println("Criando nova loja\n");
    }

    public static void criarNovoProduto(){
        System.out.println("Criando novo produto\n");
    }
}
