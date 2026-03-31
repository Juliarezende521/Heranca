public class Pleno extends Desenvolvedor {
    private int projeEntr; //qtde de projetos entregues

    public Pleno() {
        super(); //chama construtor
    }

    public Pleno(String nome, String linguagem, float salarioBase, int projeEntr) {
        super(nome, linguagem, salarioBase);
        this.projeEntr = projeEntr;
    }

    public int getProjeEntr() {
        return projeEntr;
    }

    public void setProjeEntr(int projeEntr) {
        this.projeEntr = projeEntr;
    }

    @Override
    public String toString() {
        return "Pleno{" +
                super.toString() +
                "projeEntr=" + projeEntr +
                '}';
    }
    @Override
    public void codar(){
        System.out.println("Pleno desenvolvendo codigo e fazendo Code Review");
    }
    @Override
    public float calcularBonus(){
        return super.calcularBonus()+ this.salarioBase * 0.15f;
    }
}
