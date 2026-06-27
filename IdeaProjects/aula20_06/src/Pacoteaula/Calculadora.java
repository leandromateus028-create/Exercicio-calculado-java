package Pacoteaula;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n1, n2, resultado;
        int opcao;
        opcao = 0;



        while (opcao != 5) {
            System.out.println("1 -Soma 2 - Subtração 3 - Miltiplicação - 4 -  Divisão - 5 - Sair ");
            opcao = leia.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Digite o primeiro numero");
                    n1 = leia.nextInt();
                    System.out.println("Digite o segundo numero");
                    n2 = leia.nextInt();
                    resultado = n1 + n2;
                    System.out.println(resultado);
                    break;
                case 2:
                    System.out.println("Digite o primeiro numero");
                    n1 = leia.nextInt();
                    System.out.println("Digite o segundo numero");
                    n2 = leia.nextInt();
                    resultado = n1 - n2;
                    System.out.println(resultado);

                    break;
                case 3:
                    System.out.println("Digite o primeiro numero");
                    n1 = leia.nextInt();
                    System.out.println("Digite o segundo numero");
                    n2 = leia.nextInt();
                    resultado = n1 * n2;
                    System.out.println(resultado);

                    break;
                case 4:
                    System.out.println("Digite o primeiro numero");
                    n1 = leia.nextInt();
                    System.out.println("Digite o segundo numero");
                    n2 = leia.nextInt();
                    resultado = n1 / n2;
                    System.out.println(resultado);

                    break;


                default:
                    System.out.println("Encerrando");

                    break;


            }
        }

    }
}
