package edu.rafael;

public class Carro extends Veiculo{
    @Override
    public void ligar() {
        System.out.println("Carro ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Carro desligado");
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Carro freando");
    }

    @Override
    public String toString() {
        return "\nCarro{" +
                "modelo='" + getModelo() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", cor=" + getCor() + '\'' +
                ", anoFabricacao=" + getAnoFabricacao() +
                "}";
    }
}
