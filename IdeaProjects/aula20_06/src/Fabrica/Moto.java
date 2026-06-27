package Fabrica;

public class Moto extends Veiculo {

    public Moto(String marca, String modelo, String cor){
        super(marca,modelo,cor);
    }

    @Override
    public void acelerar(){
        System.out.println("A moto "+ getModelo() + " da marca " + getMarca() +  " com a cor " + getCor() + " esta acelerando");
    }
}
