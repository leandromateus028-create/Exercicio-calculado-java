package Fabrica;

public class executar {
    public static void main(String[] args) {

        // Objeto (Instanciando uma classe dentro de outra)
        Carro carro1 = new Carro("Chevrolet", "Corsa ", "Branco"  );

        Moto moto1 = new Moto("Honda", "Hornet", "Vermelho");

        carro1.acelerar();
        moto1.acelerar();

        carro1.setModelo("x1");
        carro1.setMarca("BMW");
        carro1.setCor("Azul");

        moto1.setModelo("Z900");
        moto1.setMarca("kawasaki");
        moto1.setCor("Branco");

        System.out.println();
        carro1.acelerar();
        moto1.acelerar();


    }
}
