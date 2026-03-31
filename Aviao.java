public class Aviao extends Veiculo {
    float altitudeMax;

    @Override
    public void mover() {
        System.out.println("Avião voando a " + velocidade + " km/h e " + altitudeMax + " metros");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo com querosene de aviação");
    }
}