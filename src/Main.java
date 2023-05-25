import edu.rafael.Carro;
import edu.rafael.Moto;
import edu.rafael.Veiculo;

public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        carro.setModelo("Fiesta 1.6");
        carro.setMarca("Ford");
        carro.setCor("Prata");
        carro.setAnoFabricacao(2013);
        System.out.println(carro);
        carro.ligar();
        carro.acelerar();
        carro.frear();
        carro.desligar();

        Veiculo moto = new Moto();
        moto.setModelo("CG Titan 160");
        moto.setMarca("Honda");
        moto.setCor("Preta");
        moto.setAnoFabricacao(2023);
        System.out.println(moto);
        moto.ligar();
        moto.acelerar();
        moto.frear();
        moto.desligar();
    }
}