public class CarroEletrico extends Veiculo {
    int autonomiaBateria;

    @Override
    public void mover() {
        System.out.println("Carro elétrico movendo-se silenciosamente");
    }

    @Override
    public void abastecer() {
        System.out.println("Recarregando bateria em posto de carga rápida");
    }
}