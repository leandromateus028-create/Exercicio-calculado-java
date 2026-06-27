package Pacoteaula;

import com.sun.istack.internal.NotNull;

import java.util.Scanner;

public class Separador {
    public static void main(String[] args) {

         Scanner leia = new Scanner(System.in);

         String nome;
         int idade;

        System.out.println("Qual seu nome?");
        nome = leia.nextLine();
        System.out.println("Qual sua idade?");
        idade = leia.nextInt();

       Verificador(idade);





    }
    /*
    public static void Verificador(int idade){
        if (idade >=18){
            System.out.println("Maior de Idade!");
        } else {
            System.out.println("Menor de Idade!");
        }
    }
    */

    public static  @NotNull String Verificador(int idade){
        if (idade >=18){
            return "Maior de Idade!";
        } else {
            return "Menor de Idade!";
        }
    }

}
