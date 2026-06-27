package Pacoteaula;

import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);


        String nome;
        int idade;
        float virgula;
        double ponto;
        boolean verdadeiro_falso;
        char caractere;


        System.out.println("Qual seu nome? ");
        nome = leia.nextLine();
        // System.out.println("OK, seu nome é " + nome);
        System.out.println("Qual sua idade? ");
        idade = leia.nextInt();



        System.out.println("1 - cadastrar 2 - listar 3 - sair ");
        int opcao = leia.nextInt();

        switch (opcao){
            case 1:
                System.out.println("Cadastrar realizado");

                break;
            case 2:
                System.out.println("Lista de cadastro");
                break;
            case 3:
                System.out.println("encerrando");
                break;
            default:
                System.out.println("Nenhuma opção escolhida ou formato invalido ");
                break;



        }


        /*
        int opcao;
        opcao = 0;

        do {
            System.out.println("1 - cadastrar 2 - listar 3 - sair ");
            opcao = leia.nextInt();

        } */


        /*
        int opcao;
        opcao = 0;


         while(opcao != 3 ){
            System.out.println("1 - cadastrar 2 - listar 3 - sair ");
            opcao = leia.nextInt();

        } */

        // System.out.println("Sua idade é " + idade);
        /*
        for(int i = 0; i<4; i++){

                System.out.println("oi");

        } */

        // System.out.print("Seu nome é " + nome + ", sua idade é " + idade + " anos, " );

         /*
        if(idade >18){
            //System.out.print("Seu nome é " + nome + ", sua idade é " + idade + " anos." );
            System.out.println("você é maior de idade.");
        } else {
            System.out.println("você é menor de idade.");
        }
        */

    }
}
