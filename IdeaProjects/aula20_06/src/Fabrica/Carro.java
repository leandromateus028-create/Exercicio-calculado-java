package Fabrica;

public class Carro extends Veiculo {

    public Carro(String marca, String modelo, String cor){
       super(marca, modelo,cor);
    }

    @Override
    public void acelerar(){
        System.out.println("O carro "+ getModelo() + " da marca " + getMarca() +  " com a cor " + getCor() + " esta acelerando");
    }
}
