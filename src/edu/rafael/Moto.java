package edu.rafael;

public class Moto extends Veiculo{
    @Override
    public void ligar() {
        System.out.println("Moto ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Moto desligada");
    }

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Moto freando");
    }

    @Override
    public String toString() {
        return "\nMoto{" +
                "modelo='" + getModelo() + '\'' +
                ", marca='" + getMarca() + '\'' +
                ", cor=" + getCor() + '\'' +
                ", anoFabricacao=" + getAnoFabricacao() +
                "}";
    }
}
