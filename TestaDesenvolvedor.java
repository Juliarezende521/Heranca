import java.util.ArrayList;

public class TestaDesenvolvedor {

    public static void exibir(Desenvolvedor camaleao){
        camaleao.codar();
        System.out.println(camaleao.toString() + " Bonus: " + camaleao.calcularBonus());
    }

    public static void main(String[] args){

        Junior jr1 = new Junior("Fulano", "Java", 4000, "Beltrano");
        Pleno pl1 = new Pleno("Beltrano", "Java", 6000, 5);
        Senior sr1 = new Senior("Ciclano", "Java", 8000, 2000);


        exibir(jr1);
        exibir(pl1);
        exibir(sr1);


        Desenvolvedor[] devs = new Desenvolvedor[4];

        devs[0] = jr1;
        devs[1] = pl1;
        devs[2] = sr1;
        devs[3] = new Desenvolvedor("Base", "Java", 3000);

        for (Desenvolvedor d : devs) {
            d.codar();
            System.out.println("Bonus: " + d.calcularBonus());
            System.out.println(d);
            System.out.println("----------------");
        }


        ArrayList<Desenvolvedor> empresa = new ArrayList<>();
        empresa.add(jr1);
        empresa.add(pl1);
        empresa.add(sr1);
    }
}
