public class Teste {
    public static void main(String[] args) {

        Veiculo v;

        Aviao aviao = new Aviao();
        aviao.velocidade = 800;
        aviao.altitudeMax = 10000;

        CarroEletrico carro = new CarroEletrico();

        v = aviao;
        v.mover();

        v = carro;
        v.mover();
    }
}